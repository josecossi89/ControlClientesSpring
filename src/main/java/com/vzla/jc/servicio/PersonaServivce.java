
package com.vzla.jc.servicio;

import com.vzla.jc.domain.Persona;
import java.util.List;

public interface PersonaServivce {
    
    public List<Persona> listarPersonas();
    
    public void guardar (Persona persona);
    
    public void eliminar (Persona persona);
    
    public Persona encontrarPersona (Persona persona);
    
}
