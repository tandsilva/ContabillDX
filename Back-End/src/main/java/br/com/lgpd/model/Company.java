package br.com.lgpd.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "companies", uniqueConstraints = {
        @UniqueConstraint(columnNames = "cnpj")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String cnpj;

    // Novos campos baseados na imagem
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

    @Temporal(TemporalType.DATE)
    private Date dataRegistro;

    private String codigoCNAE;
    private String cnaePreponderante;
    private String bancoDepositoFGTS;

    // Relacionamentos
    @OneToMany(mappedBy = "company")
    private List<Employee> employees;

    @OneToMany(mappedBy = "company")
    private List<AccountingEntry> entries;
    @ManyToOne
    @JoinColumn(name = "perfil_empresa_id")
    private PerfilEmpresa perfilEmpresa;
    @Embedded
    private CompanyFiscalInfo fiscalInfo;

}
