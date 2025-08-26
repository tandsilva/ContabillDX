package br.com.lgpd.Mapper;

import br.com.lgpd.dto.EsocialS1000DTO;
import br.com.lgpd.model.Company;
import org.springframework.stereotype.Component;

@Component
public class EsocialS1000Mapper {

    public EsocialS1000DTO fromCompany(Company company) {
        return EsocialS1000DTO.builder()
                .cnpj(company.getCnpj())
                .nomeEmpresa(company.getName())
                .classificacaoTributaria(company.getPerfilEmpresa().getClassificacaoTributaria())
                .iniValid("2025-08")
                .fimValid("2026-08")
                .build();
    }
}
