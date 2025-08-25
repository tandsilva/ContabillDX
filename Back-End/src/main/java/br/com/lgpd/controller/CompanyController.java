package br.com.lgpd.controller;

// CompanyController.java

import br.com.lgpd.dto.CompanyDTO;
import br.com.lgpd.model.Company;
import br.com.lgpd.service.AccountingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/companies")
@AllArgsConstructor
public class CompanyController {

    private final AccountingService accountingService;

    @PostMapping
    public ResponseEntity<CompanyDTO> create(@RequestBody CompanyDTO dto) {
        Company company = new Company();
        company.setName(dto.getName());
        company.setCnpj(dto.getCnpj());
        Company saved = accountingService.createCompany(company);
        return ResponseEntity.ok(new CompanyDTO(saved.getId(), saved.getName(), saved.getCnpj()));
    }

    @GetMapping
    public ResponseEntity<List<CompanyDTO>> getAll() {
        List<CompanyDTO> list = accountingService.getAllCompanies()
                .stream()
                .map(c -> new CompanyDTO(c.getId(), c.getName(), c.getCnpj()))
                .collect(Collectors.toList());
        return ResponseEntity.ok(list);
    }
}
