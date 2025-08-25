package br.com.lgpd.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDTO {

    private Long id;
    private String name;
    private String cnpj;

    // Campos legados (se ainda estiver usando diretamente)
    private String tipoInscricaoEstabelecimento;
    private String cnpjCpf;
    private String numeroCEI;
    private String caepf;
    private String tipoCaepf;
    private String cno;
    private String ieIdentidade;
    private String inscricaoMunicipal;
    private String regNaJuntaComercial;
    private String orgaoDoRegistro;
    private Date dataRegistro;
    private String codigoCNAE;
    private String cnaePreponderante;
    private String bancoDepositoFGTS;

    // Novo modelo modular
    private CompanyFiscalInfoDTO fiscalInfo;

    // Relacionamento com PerfilEmpresa
    private Long perfilEmpresaId;

    // Construtor personalizado para uso simples
    public CompanyDTO(Long id, String name, String cnpj) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
    }
}
