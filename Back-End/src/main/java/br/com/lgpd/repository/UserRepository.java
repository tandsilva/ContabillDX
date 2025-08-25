package br.com.lgpd.repository;

import br.com.lgpd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


import br.com.lgpd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // aqui você pode adicionar métodos customizados, ex:
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}
