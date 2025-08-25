package br.com.lgpd.Mapper;

import br.com.lgpd.dto.UserRequestDTO;
import br.com.lgpd.dto.UserResponseDTO;
import br.com.lgpd.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserRequestDTO dto) {
        if (dto == null) return null;
        User user = new User();
        user.setFirstName(dto.getFirstName());   // ⬅️ adicionado
        user.setLastName(dto.getLastName());     // ⬅️ adicionado
        user.setEmail(dto.getEmail());
        user.setGender(dto.getGender());         // ⬅️ adicionado
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }

    public UserResponseDTO toDTO(User user) {
        if (user == null) return null;
        return UserResponseDTO.builder()
                .id(user.getId())


                .email(user.getEmail())
                .username(user.getGender())
                .build();
    }
}
