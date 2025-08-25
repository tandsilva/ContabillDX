package br.com.lgpd.controller;

import br.com.lgpd.Mapper.UserMapper;
import br.com.lgpd.dto.UserRequestDTO;
import br.com.lgpd.dto.UserResponseDTO;

import br.com.lgpd.model.User;
import br.com.lgpd.repository.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO dto){
        try {
            User user = userMapper.toEntity(dto);
            User savedUser = userService.createUser(user);
            return new ResponseEntity<>(userMapper.toDTO(savedUser), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable("id") Long userId){
        try {
            User user = userService.getUserById(userId);
            if (user == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(userMapper.toDTO(user));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        List<UserResponseDTO> dtoList = users.stream()
                .map(userMapper::toDTO)
                .toList();
        return ResponseEntity.ok(dtoList);
    }

    @PutMapping("{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable("id") Long userId,
                                                      @RequestBody UserRequestDTO dto){
        User user = userMapper.toEntity(dto);
        user.setId(userId);
        User updatedUser = userService.updateUser(user);
        return ResponseEntity.ok(userMapper.toDTO(updatedUser));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
}
