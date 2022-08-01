
package com.proyectoporfolio.AI.Security.Repository;

import com.proyectoporfolio.AI.Security.Entity.Rol;
import com.proyectoporfolio.AI.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
