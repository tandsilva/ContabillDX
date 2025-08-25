package br.com.lgpd.dto;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PerfilEmpresaDTO {
    private Long id;
    private String codigo;
    private String descricao;
    private String porteEmpresa;
    private String classificacaoTributaria;
    private String tipoIdentificadorRAIS;
    private String naturezaJuridica;
    private String tipoTributacaoINSS;
    private boolean cooperativa;
    private boolean construtora;
    private String integracaoFolha;
    private boolean entidadeEducativa;
    private boolean empresaTrabalhoTemporario;
    private String codigoFPAS;
    private double inssParteEmpresa;
    private String codigoOutrasEntidades;
    private double taxaOutrasEntidades;
}
