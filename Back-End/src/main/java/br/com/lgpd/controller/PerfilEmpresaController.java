package br.com.lgpd.controller;


import br.com.lgpd.dto.PerfilEmpresaDTO;
import br.com.lgpd.service.PerfilEmpresaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/perfis-empresa")
@RequiredArgsConstructor
public class PerfilEmpresaController {

    private final PerfilEmpresaService perfilEmpresaService;

    @GetMapping
    public ResponseEntity<List<PerfilEmpresaDTO>> getAll() {
        return ResponseEntity.ok(perfilEmpresaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerfilEmpresaDTO> getById(@PathVariable Long id) {
        return perfilEmpresaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PerfilEmpresaDTO> create(@Valid @RequestBody PerfilEmpresaDTO dto) {
        return ResponseEntity.ok(perfilEmpresaService.save(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PerfilEmpresaDTO> update(@PathVariable Long id, @Valid @RequestBody PerfilEmpresaDTO dto) {
        return ResponseEntity.ok(perfilEmpresaService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        perfilEmpresaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
