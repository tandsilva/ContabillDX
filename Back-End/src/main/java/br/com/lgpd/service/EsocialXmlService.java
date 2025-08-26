package br.com.lgpd.service;

import br.com.lgpd.model.Company;
import br.gov.esocial.schema.ESocial;
import br.gov.esocial.schema.TIdePeriodo;
import br.gov.esocial.schema.TInfoCadastro;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.util.JAXBSource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.StringWriter;

@Service
public class EsocialXmlService {

    public ESocial gerarEventoS1000(Company company) {
        ESocial esocial = new ESocial();
        ESocial.EvtInfoEmpregador evento = new ESocial.EvtInfoEmpregador();
        evento.setId("ID" + company.getCnpj());

        // IdeEmpregador
        ESocial.EvtInfoEmpregador.IdeEmpregador ideEmp = new ESocial.EvtInfoEmpregador.IdeEmpregador();
        ideEmp.setTpInsc((byte) 1); // CNPJ
        ideEmp.setNrInsc(company.getCnpj());
        evento.setIdeEmpregador(ideEmp);

        // InfoEmpregador
        ESocial.EvtInfoEmpregador.InfoEmpregador infoEmp = new ESocial.EvtInfoEmpregador.InfoEmpregador();
        ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao inclusao =
                new ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao();

        TIdePeriodo periodo = new TIdePeriodo();
        periodo.setIniValid("2025-08");
        periodo.setFimValid("2026-08");

        TInfoCadastro cadastro = new TInfoCadastro();
        cadastro.setNmRazao(company.getName());
        cadastro.setClassTrib(company.getPerfilEmpresa().getClassificacaoTributaria());
        // Adicione mais campos conforme necessário

        inclusao.setIdePeriodo(periodo);
        inclusao.setInfoCadastro(cadastro);
        infoEmp.setInclusao(inclusao);
        evento.setInfoEmpregador(infoEmp);

        esocial.setEvtInfoEmpregador(evento);
        return esocial;
    }

    public String converterParaXml(ESocial esocial) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ESocial.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter writer = new StringWriter();
        marshaller.marshal(esocial, writer);
        return writer.toString();
    }

    public void salvarXmlEmArquivo(ESocial esocial, String caminhoArquivo) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ESocial.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(esocial, new File(caminhoArquivo));
    }
}
