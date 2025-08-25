package br.com.lgpd.dto;


import lombok.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyFiscalInfoDTO {
    private String tipoInscricaoEstabelecimento;
    private String identificadorFiscal;
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
}
