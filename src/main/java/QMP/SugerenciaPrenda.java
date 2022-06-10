package ar.edu.utn.frba.dds.QMP;

import static java.util.Objects.requireNonNull;

public class SugerenciaPrenda {
    public Prenda prenda;
    public boolean estaAceptada = false;

    SugerenciaPrenda(Prenda prenda){
        this.prenda = requireNonNull(prenda,"Por favor agregar una prenda");
    }

    public void aceptarSugerencia(){
        this.estaAceptada = true;
    }

    public void rechazarSugerencia(){
        this.estaAceptada = false;
    }
}
