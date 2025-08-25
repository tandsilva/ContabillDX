package br.com.lgpd.service;

import br.com.lgpd.model.Company;
import br.com.lgpd.model.Employee;
import br.com.lgpd.model.AccountingEntry;
import br.com.lgpd.repository.CompanyRepository;
import br.com.lgpd.repository.EmployeeRepository;
import br.com.lgpd.repository.AccountingEntryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountingService {

    private final CompanyRepository companyRepository;
    private final EmployeeRepository employeeRepository;
    private final AccountingEntryRepository entryRepository;

    // ---------- Empresa / Departamento ----------
    public Company createCompany(Company company) {
        if (companyRepository.existsByCnpj(company.getCnpj())) {
            throw new IllegalArgumentException("Já existe uma empresa cadastrada com este CNPJ: " + company.getCnpj());
        }
        return companyRepository.save(company);
    }

    public Company updateCompany(Company company) {
        Company existing = companyRepository.findById(company.getId())
                .orElseThrow(() -> new IllegalArgumentException("Empresa não encontrada com ID: " + company.getId()));

        // Se o CNPJ foi alterado, verificar duplicidade
        if (!existing.getCnpj().equals(company.getCnpj())
                && companyRepository.existsByCnpj(company.getCnpj())) {
            throw new IllegalArgumentException("CNPJ já cadastrado em outra empresa: " + company.getCnpj());
        }

        return companyRepository.save(company);
    }

    public void deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);
    }

    public Company getCompany(Long companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    // ---------- Funcionário / Servidor ----------
    public Employee addEmployee(Employee employee, Long companyId) {
        Company company = getCompany(companyId);
        if (company != null) {
            employee.setCompany(company);
            return employeeRepository.save(employee);
        }
        return null;
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // ---------- Lançamentos contábeis ----------
    public AccountingEntry recordEntry(AccountingEntry entry) {
        return entryRepository.save(entry);
    }

    public AccountingEntry updateEntry(AccountingEntry entry) {
        return entryRepository.save(entry);
    }

    public void deleteEntry(Long entryId) {
        entryRepository.deleteById(entryId);
    }

    public AccountingEntry getEntry(Long entryId) {
        return entryRepository.findById(entryId).orElse(null);
    }

    public List<AccountingEntry> getEntriesByCompany(Long companyId) {
        return entryRepository.findByCompanyId(companyId);
    }

    public List<AccountingEntry> getAllEntries() {
        return entryRepository.findAll();
    }

    // ---------- Relatórios / Orçamento ----------
    public double getTotalRevenue(Long companyId) {
        return entryRepository.sumRevenueByCompany(companyId);
    }

    public double getTotalExpense(Long companyId) {
        return entryRepository.sumExpenseByCompany(companyId);
    }

    public double getBalance(Long companyId) {
        return getTotalRevenue(companyId) - getTotalExpense(companyId);
    }
}
