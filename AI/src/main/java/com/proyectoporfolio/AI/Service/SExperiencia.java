
package com.proyectoporfolio.AI.Service;

import com.proyectoporfolio.AI.Entity.Experiencia;
import com.proyectoporfolio.AI.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
      return rExperiencia.findAll();
    }
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    public void save (Experiencia experiencia){
        rExperiencia.save(experiencia);
    }
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }
    public boolean existsByNombre(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }

    public boolean existsByNombreE(String nombreE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
