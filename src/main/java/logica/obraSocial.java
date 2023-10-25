package logica;

import java.util.ArrayList;
import java.util.List;
import logica.paciente.Pacientes;

public class obraSocial {

    public static List<ObraSocial> listaObraSocial = new ArrayList<>();

    public obraSocial() {
        listaObraSocial.add(new ObraSocial("A"));
        listaObraSocial.add(new ObraSocial("B"));
        listaObraSocial.add(new ObraSocial("C"));
        listaObraSocial.add(new ObraSocial("D"));
        listaObraSocial.add(new ObraSocial("E"));
    }

    public static class ObraSocial {

        private String nombre;

        public ObraSocial(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    }

}
