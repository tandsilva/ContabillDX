package br.com.lgpd.repository;



import br.com.lgpd.model.AccountingEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface AccountingEntryRepository extends JpaRepository<AccountingEntry, Long> {

    List<AccountingEntry> findByCompanyId(Long companyId);

    @Query("SELECT SUM(e.amount) FROM AccountingEntry e WHERE e.company.id = :companyId AND e.type = 'RECEITA'")
    double sumRevenueByCompany(Long companyId);

    @Query("SELECT SUM(e.amount) FROM AccountingEntry e WHERE e.company.id = :companyId AND e.type = 'DESPESA'")
    double sumExpenseByCompany(Long companyId);
}
