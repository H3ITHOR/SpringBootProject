package Heitor.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Heitor.demo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
