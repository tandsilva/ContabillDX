package br.com.lgpd.service;
import br.gov.esocial.schema.ESocial;
import br.gov.esocial.schema.ESocial.EvtInfoEmpregador;

import br.com.lgpd.model.Company;
import br.gov.esocial.schema.TIdePeriodo;
import br.gov.esocial.schema.TInfoCadastro;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EsocialXmlService {

    public void gerarXmlS1000(Company company) throws Exception {
        ESocial esocial = new ESocial();
        ESocial.EvtInfoEmpregador evento = new ESocial.EvtInfoEmpregador();
        evento.setId("ID" + company.getCnpj());

        // preencher IdeEmpregador
        ESocial.EvtInfoEmpregador.IdeEmpregador ideEmp = new ESocial.EvtInfoEmpregador.IdeEmpregador();
        ideEmp.setTpInsc((byte)1);
        ideEmp.setNrInsc(company.getCnpj());
        evento.setIdeEmpregador(ideEmp);

        // preencher InfoEmpregador
        ESocial.EvtInfoEmpregador.InfoEmpregador infoEmp = new ESocial.EvtInfoEmpregador.InfoEmpregador();
        ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao inclusao = new ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao();

        TIdePeriodo periodo = new TIdePeriodo();
        periodo.setIniValid("2025-08");
        periodo.setFimValid("2026-08");

        TInfoCadastro cadastro = new TInfoCadastro();
        cadastro.setNmRazao(company.getName());
        cadastro.setClassTrib(company.getPerfilEmpresa().getClassificacaoTributaria());

        inclusao.setIdePeriodo(periodo);
        inclusao.setInfoCadastro(cadastro);
        infoEmp.setInclusao(inclusao);
        evento.setInfoEmpregador(infoEmp);

        esocial.setEvtInfoEmpregador(evento);

        // gerar XML
        JAXBContext context = JAXBContext.newInstance(ESocial.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(esocial, new File("saida_S1000.xml"));
    }
}
