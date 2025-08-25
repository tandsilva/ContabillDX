package br.com.lgpd.service;


import br.com.lgpd.dto.PerfilEmpresaDTO;
import br.com.lgpd.Mapper.PerfilEmpresaMapper;
import br.com.lgpd.model.PerfilEmpresa;
import br.com.lgpd.repository.PerfilEmpresaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PerfilEmpresaService {

    private final PerfilEmpresaRepository perfilEmpresaRepository;

    public List<PerfilEmpresaDTO> findAll() {
        return perfilEmpresaRepository.findAll()
                .stream()
                .map(PerfilEmpresaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<PerfilEmpresaDTO> findById(Long id) {
        return perfilEmpresaRepository.findById(id)
                .map(PerfilEmpresaMapper::toDTO);
    }

    @Transactional
    public PerfilEmpresaDTO save(PerfilEmpresaDTO dto) {
        PerfilEmpresa perfil = PerfilEmpresaMapper.toEntity(dto);
        return PerfilEmpresaMapper.toDTO(perfilEmpresaRepository.save(perfil));
    }

    @Transactional
    public PerfilEmpresaDTO update(Long id, PerfilEmpresaDTO dto) {
        PerfilEmpresa existing = perfilEmpresaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Perfil não encontrado"));

        PerfilEmpresa updated = PerfilEmpresaMapper.toEntity(dto);
        updated.setId(existing.getId());

        return PerfilEmpresaMapper.toDTO(perfilEmpresaRepository.save(updated));
    }

    @Transactional
    public void delete(Long id) {
        perfilEmpresaRepository.deleteById(id);
    }
}
