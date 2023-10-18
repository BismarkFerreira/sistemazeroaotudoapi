package br.com.bismarkjob.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bismarkjob.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
