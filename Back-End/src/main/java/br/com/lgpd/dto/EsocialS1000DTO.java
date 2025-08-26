package br.com.lgpd.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EsocialS1000DTO {
    private String cnpj;
    private String nomeEmpresa;
    private String classificacaoTributaria;
    private String iniValid;
    private String fimValid;
}
