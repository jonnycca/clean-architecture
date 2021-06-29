package br.com.cleanproject.repository;

import br.com.cleanproject.mapper.UserDataMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<UserDataMapper, String> {
}
