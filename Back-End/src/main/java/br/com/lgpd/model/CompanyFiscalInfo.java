package br.com.lgpd.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyFiscalInfo {

    private String tipoInscricaoEstabelecimento;
    private String identificadorFiscal; // substitui cnpjCpf
    private String numeroCEI;
    private String caepf;
    private String tipoCaepf;
    private String cno;
    private String ieIdentidade;
    private String inscricaoMunicipal;
    private String regNaJuntaComercial;
    private String orgaoDoRegistro;

    @Temporal(TemporalType.DATE)
    private Date dataRegistro;

    private String codigoCNAE;
    private String cnaePreponderante;
    private String bancoDepositoFGTS;
}
