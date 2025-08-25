package br.com.lgpd.Mapper;

import br.com.lgpd.dto.CompanyDTO;
import br.com.lgpd.dto.CompanyFiscalInfoDTO;
import br.com.lgpd.model.Company;
import br.com.lgpd.model.CompanyFiscalInfo;
import br.com.lgpd.model.PerfilEmpresa;

public class CompanyMapper {

    public static CompanyDTO toDTO(Company company) {
        return CompanyDTO.builder()
                .id(company.getId())
                .name(company.getName())
                .cnpj(company.getCnpj())
                .fiscalInfo(toFiscalInfoDTO(company.getFiscalInfo()))
                .perfilEmpresaId(company.getPerfilEmpresa() != null ? company.getPerfilEmpresa().getId() : null)
                .build();
    }

    public static Company toEntity(CompanyDTO dto, PerfilEmpresa perfilEmpresa) {
        return Company.builder()
                .id(dto.getId())
                .name(dto.getName())
                .cnpj(dto.getCnpj())
                .fiscalInfo(toFiscalInfoEntity(dto.getFiscalInfo()))
                .perfilEmpresa(perfilEmpresa)
                .build();
    }

    private static CompanyFiscalInfoDTO toFiscalInfoDTO(CompanyFiscalInfo info) {
        if (info == null) return null;
        return CompanyFiscalInfoDTO.builder()
                .tipoInscricaoEstabelecimento(info.getTipoInscricaoEstabelecimento())
                .identificadorFiscal(info.getIdentificadorFiscal())
                .numeroCEI(info.getNumeroCEI())
                .caepf(info.getCaepf())
                .tipoCaepf(info.getTipoCaepf())
                .cno(info.getCno())
                .ieIdentidade(info.getIeIdentidade())
                .inscricaoMunicipal(info.getInscricaoMunicipal())
                .regNaJuntaComercial(info.getRegNaJuntaComercial())
                .orgaoDoRegistro(info.getOrgaoDoRegistro())
                .dataRegistro(info.getDataRegistro())
                .codigoCNAE(info.getCodigoCNAE())
                .cnaePreponderante(info.getCnaePreponderante())
                .bancoDepositoFGTS(info.getBancoDepositoFGTS())
                .build();
    }

    private static CompanyFiscalInfo toFiscalInfoEntity(CompanyFiscalInfoDTO dto) {
        if (dto == null) return null;
        return CompanyFiscalInfo.builder()
                .tipoInscricaoEstabelecimento(dto.getTipoInscricaoEstabelecimento())
                .identificadorFiscal(dto.getIdentificadorFiscal())
                .numeroCEI(dto.getNumeroCEI())
                .caepf(dto.getCaepf())
                .tipoCaepf(dto.getTipoCaepf())
                .cno(dto.getCno())
                .ieIdentidade(dto.getIeIdentidade())
                .inscricaoMunicipal(dto.getInscricaoMunicipal())
                .regNaJuntaComercial(dto.getRegNaJuntaComercial())
                .orgaoDoRegistro(dto.getOrgaoDoRegistro())
                .dataRegistro(dto.getDataRegistro())
                .codigoCNAE(dto.getCodigoCNAE())
                .cnaePreponderante(dto.getCnaePreponderante())
                .bancoDepositoFGTS(dto.getBancoDepositoFGTS())
                .build();
    }
}
