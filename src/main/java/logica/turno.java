package logica;

import java.util.ArrayList;
import java.util.List;
import logica.paciente.Pacientes;

public class turno {

    public static List<Turnos> listaTurnos = new ArrayList<>();

    public class Turnos {

        Pacientes paciente;
        private String horario;
        private String fecha;
        ;

        public Turnos(String horario, String fecha, Pacientes paciente) {

            this.horario = horario;
            this.fecha = fecha;
            this.paciente = paciente;
        }

        public String getHorario() {
            return horario;
        }

        public void setHorario(String horario) {
            this.horario = horario;
        }

        public Pacientes getPaciente() {
            return paciente;
        }

        public void setPaciente(Pacientes paciente) {
            this.paciente = paciente;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

       

       

       

      
    }
}
