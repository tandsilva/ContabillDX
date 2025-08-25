package br.com.lgpd.Mapper;
import br.com.lgpd.dto.PerfilEmpresaDTO;
import br.com.lgpd.model.PerfilEmpresa;

public class PerfilEmpresaMapper {

    public static PerfilEmpresaDTO toDTO(PerfilEmpresa perfil) {
        return PerfilEmpresaDTO.builder()
                .id(perfil.getId())
                .codigo(perfil.getCodigo())
                .descricao(perfil.getDescricao())
                .porteEmpresa(perfil.getPorteEmpresa())
                .classificacaoTributaria(perfil.getClassificacaoTributaria())
                .tipoIdentificadorRAIS(perfil.getTipoIdentificadorRAIS())
                .naturezaJuridica(perfil.getNaturezaJuridica())
                .tipoTributacaoINSS(perfil.getTipoTributacaoINSS())
                .cooperativa(perfil.isCooperativa())
                .construtora(perfil.isConstrutora())
                .integracaoFolha(perfil.getIntegracaoFolha())
                .entidadeEducativa(perfil.isEntidadeEducativa())
                .empresaTrabalhoTemporario(perfil.isEmpresaTrabalhoTemporario())
                .codigoFPAS(perfil.getCodigoFPAS())
                .inssParteEmpresa(perfil.getInssParteEmpresa())
                .codigoOutrasEntidades(perfil.getCodigoOutrasEntidades())
                .taxaOutrasEntidades(perfil.getTaxaOutrasEntidades())
                .build();
    }

    public static PerfilEmpresa toEntity(PerfilEmpresaDTO dto) {
        return PerfilEmpresa.builder()
                .id(dto.getId())
                .codigo(dto.getCodigo())
                .descricao(dto.getDescricao())
                .porteEmpresa(dto.getPorteEmpresa())
                .classificacaoTributaria(dto.getClassificacaoTributaria())
                .tipoIdentificadorRAIS(dto.getTipoIdentificadorRAIS())
                .naturezaJuridica(dto.getNaturezaJuridica())
                .tipoTributacaoINSS(dto.getTipoTributacaoINSS())
                .cooperativa(dto.isCooperativa())
                .construtora(dto.isConstrutora())
                .integracaoFolha(dto.getIntegracaoFolha())
                .entidadeEducativa(dto.isEntidadeEducativa())
                .empresaTrabalhoTemporario(dto.isEmpresaTrabalhoTemporario())
                .codigoFPAS(dto.getCodigoFPAS())
                .inssParteEmpresa(dto.getInssParteEmpresa())
                .codigoOutrasEntidades(dto.getCodigoOutrasEntidades())
                .taxaOutrasEntidades(dto.getTaxaOutrasEntidades())
                .build();
    }
}
