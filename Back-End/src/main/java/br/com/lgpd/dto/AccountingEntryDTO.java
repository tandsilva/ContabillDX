package br.com.lgpd.dto;

// AccountingEntryDTO.java

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountingEntryDTO {
    private Long id;
    private String type;
    private String description;
    private double amount;
    private LocalDate date;
    private Long companyId;
}
