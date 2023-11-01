package logica;

import interfaz.Turnos;
import java.util.ArrayList;
import java.util.List;

public class paciente {

    public static List<Pacientes> listaPacientes = new ArrayList<>();

    public static Pacientes buscarPorDni(String dni) {
        for (Pacientes paciente : listaPacientes) {
            if (paciente.getDni().equals(dni)) {
                return paciente;
            }
        }
        return null;
    }

    public static class Pacientes {

        private String nombre;
        private String Apellido;
        private String telefono;
        private String dni;
        private String ObraSocial;
        private String sexo;
        private String edad;

        public Pacientes(String nombre, String Apellido, String telefono, String dni, String obraSocial, String edad, String sexo) {
            this.nombre = nombre;
            this.Apellido = Apellido;
            this.telefono = telefono;
            this.dni = dni;
            this.ObraSocial = obraSocial;
            this.sexo = sexo;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public String getObraSocial() {
            return ObraSocial;
        }

        public void setObraSocial(String ObraSocial) {
            this.ObraSocial = ObraSocial;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Pacientes{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", telefono=" + telefono + ", dni=" + dni + ", ObraSocial=" + ObraSocial + ", sexo=" + sexo + ", edad=" + edad + '}';
        }

    }
}
