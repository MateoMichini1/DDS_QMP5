package ar.edu.utn.frba.dds.QMP;

import java.util.HashSet;
import java.util.Set;


public class Usuario {
    // que pueda almacenar su tipo de guardarropas [guardarropasDeViaje,guardarropasDeEntrCasa]
    public Set guardarropas = new HashSet<Guardarropa>();

    void compartiGuardarropas(Usuario usuario, Guardarropa guardarropa){
        usuario.agregarGuardarropas(guardarropa);
    }

    public void proponerPrendaAOtorGuardarropas(Usuario usuario, Prenda prenda, Guardarropa guardarropa) throws Exception {
        if(usuario.guardarropas.contains(guardarropa)){
            guardarropa.agregarPrendaSugerida(prenda);
        } else {
            throw new Exception("El usuario no tiene ese guardarropas guardado");
        }
    }

    public void agregarGuardarropas(Guardarropa guardarropa){
        this.guardarropas.add(guardarropa);
    }
}
