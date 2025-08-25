package br.com.lgpd.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequestDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String username; // <--- obrigatório se você quer usar getUsername()
    private String password; // opcional se for login/autenticação
}