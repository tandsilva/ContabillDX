package br.com.lgpd.service;

import br.com.lgpd.dto.CompanyDTO;
import br.com.lgpd.Mapper.CompanyMapper;
import br.com.lgpd.model.Company;
import br.com.lgpd.model.PerfilEmpresa;
import br.com.lgpd.repository.CompanyRepository;
import br.com.lgpd.repository.PerfilEmpresaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final PerfilEmpresaRepository perfilEmpresaRepository;

    public List<CompanyDTO> findAll() {
        return companyRepository.findAll()
                .stream()
                .map(CompanyMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<CompanyDTO> findById(Long id) {
        return companyRepository.findById(id)
                .map(CompanyMapper::toDTO);
    }

    public Optional<CompanyDTO> findByCnpj(String cnpj) {
        return companyRepository.findByCnpj(cnpj)
                .map(CompanyMapper::toDTO);
    }

    @Transactional
    public CompanyDTO save(CompanyDTO dto) {
        PerfilEmpresa perfil = perfilEmpresaRepository.findById(dto.getPerfilEmpresaId())
                .orElseThrow(() -> new RuntimeException("PerfilEmpresa não encontrado"));

        Company company = CompanyMapper.toEntity(dto, perfil);
        Company saved = companyRepository.save(company);
        return CompanyMapper.toDTO(saved);
    }

    @Transactional
    public CompanyDTO update(Long id, CompanyDTO dto) {
        Company existing = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa não encontrada"));

        PerfilEmpresa perfil = perfilEmpresaRepository.findById(dto.getPerfilEmpresaId())
                .orElseThrow(() -> new RuntimeException("PerfilEmpresa não encontrado"));

        Company updated = CompanyMapper.toEntity(dto, perfil);
        updated.setId(existing.getId());

        return CompanyMapper.toDTO(companyRepository.save(updated));
    }

    @Transactional
    public void delete(Long id) {
        companyRepository.deleteById(id);
    }
}
