package br.com.lgpd.dto;



import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;

    // sem senha para não vazar
}