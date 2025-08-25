package br.com.lgpd.model;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounting_entries")
public class AccountingEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // RECEITA ou DESPESA
    private String description;
    private double amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
