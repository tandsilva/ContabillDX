package br.com.lgpd.model;

import jakarta.persistence.*;
import lombok.*;

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
