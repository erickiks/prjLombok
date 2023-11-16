package com.erick.limbok.prjLombok.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import com.erick.limbok.prjLombok.entities.Usuario;

	public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	}

