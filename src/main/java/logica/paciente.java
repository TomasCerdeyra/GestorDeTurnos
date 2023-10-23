/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class paciente {
    private static List<Pacientes> listaPacientes = new ArrayList<>();
    private static class Pacientes {

        private String nombre;
        private String Apellido;
        private String telefono;
        private int dni;
        private String ObraSocial;
        private String fecha;
        private String hora;        

        public Pacientes(String nombre, String Apellido,String telefono, int dni, String obraSocial, String fecha, String hora) {
            this.nombre = nombre;
            this.Apellido = Apellido;       
            this.telefono = telefono;
            this.dni = dni;
            this.ObraSocial = obraSocial;
            this.fecha = fecha;
            this.hora = hora;
        }

        public String getNombre() {
            return nombre;
        }
         public String getApellido() {
            return Apellido;
        }

        public String getTelefono() {
            return telefono;
        }

        public int getdni() {
            return dni;
        }
         public String getObraSocial() {
            return ObraSocial;
        }
         public String getFecha() {
            return fecha;
        }
         public String getHora() {
            return hora;
        }
        //+++
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }
       
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        public void setDni (int dni){
            this.dni = dni;
        }
         public void setObraSocial (String obraSocial){
            this.ObraSocial = obraSocial;
        }
          public void setFecha (String fecha){
            this.fecha = fecha;
            
        }
           public void setHora (String hora){
            this.hora = hora;
        }

    }
}
