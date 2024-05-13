package br.univille.projfso2024a.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projfso2024a.entity.Destino;

public class DestinatarioRepository {
    
@Repository
public interface DestinoRepository 
        extends JpaRepository<Destino,Long>{
    
}
}
