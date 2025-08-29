package br.com.lgpd.powerbi;


import br.com.lgpd.model.Company;
import br.com.lgpd.powerbi.PowerBIClient;
import br.com.lgpd.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PowerBIService {

    private final PowerBIClient powerBIClient;
    private final CompanyRepository companyRepository;

    public PowerBIService(PowerBIClient powerBIClient, CompanyRepository companyRepository) {
        this.powerBIClient = powerBIClient;
        this.companyRepository = companyRepository;
    }

    public void enviarTodasEmpresasParaPowerBIEmLote() {
        List<Company> empresas = companyRepository.findAll();
        List<Map<String, Object>> payloadLote = new ArrayList<>();

        for (Company empresa : empresas) {
            Map<String, Object> registro = new HashMap<>();
            registro.put("nome", empresa.getName());
            registro.put("cnpj", empresa.getCnpj());

            if (empresa.getPerfilEmpresa() != null) {
                registro.put("perfil", empresa.getPerfilEmpresa().getDescricao());
                registro.put("porte", empresa.getPerfilEmpresa().getPorteEmpresa());
            } else {
                registro.put("perfil", "N/A");
                registro.put("porte", "N/A");
            }

            payloadLote.add(registro);
        }

        Map<String, Object> payloadFinal = new HashMap<>();
        payloadFinal.put("rows", payloadLote);

        powerBIClient.enviarDados(payloadFinal);
    }
}

