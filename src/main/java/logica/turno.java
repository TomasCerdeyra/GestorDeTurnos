
package logica;

/**
 *
 * @author Juan Cruz
 */
import java.util.ArrayList;
import java.util.List;
import logica.paciente.Pacientes;

public class turno {
     public static List<Turnos> listaTurnos = new ArrayList<>();
      
     public class Turnos{
        Pacientes paciente = new Pacientes();
         private String horario;
         private String dia;
         private String anio;
         private String mes;
         private String dni;
         
   

       
    public Turnos (String horario, String dia, String mes, String anio, Pacientes dni){
        
        this.horario = horario;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.dni = paciente.getDni();
     
    }
   
  
    public String getHorario() {
            return horario;
        }

        public void setHorario(String horario) {
            this.horario = horario;
        }

        public String getDia() {
            return dia;
        }

        public void setDia(String dia) {
            this.dia = dia;
        }

        public String getMes() {
            return mes;
        }

        public void setMes(String mes) {
            this.mes = mes;
        }

        public String getAnio() {
            return anio;
        }

        public void setAnio(String anio) {
            this.anio = anio;
        }
        public String getDni(){
            return paciente.getDni();
        }
        public void setDni(Pacientes paciente){
            this.dni = paciente.getDni();
        }
    }
}
