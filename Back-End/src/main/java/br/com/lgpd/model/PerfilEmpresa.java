package br.com.lgpd.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "company_profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PerfilEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo; // Ex: "8"
    private String descricao; // Ex: "Empresário (Individual) MEI"
    private String porteEmpresa; // Ex: "4"
    private String classificacaoTributaria; // Ex: "1 CNPJ"
    private String tipoIdentificadorRAIS; // Ex: "1 CNPJ"
    private String naturezaJuridica; // Ex: "5 Micro Empreendedor Individual - MEI"
    private String tipoTributacaoINSS; // Ex: "1 Contribuição Substitutiva Integralmente"
    private boolean cooperativa;
    private boolean construtora;
    private String integracaoFolha; // Ex: "Não Aplicável"
    private boolean entidadeEducativa;
    private boolean empresaTrabalhoTemporario;
    private String codigoFPAS; // Ex: "515"
    private double inssParteEmpresa; // Ex: 20.00
    private String codigoOutrasEntidades; // Ex: "0000"
    private double taxaOutrasEntidades; // Ex: 0.00
}
