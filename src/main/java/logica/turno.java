package logica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import logica.paciente.Pacientes;

public class turno {

    public static List<Turnos> listaTurnos = new ArrayList<>();

    public static boolean buscarPorFecha(String fecha, String hora) {
        for (Turnos turno : listaTurnos) {
            if (turno.getFecha().equals(fecha) && turno.getHorario().equals(hora)) {
                return true;
            }
        }
        return false;
    }

    public static Turnos buscarPorFechayHora(String fecha, String hora) {
        for (Turnos turno : listaTurnos) {
            if (turno.getFecha().equals(fecha) && turno.getHorario().equals(hora)) {
                return turno;
            }
        }
        return null; // Retorna null si no se encuentra ningún paciente con el DNI dado
    }

    public static class Turnos {

        paciente.Pacientes paciente;
        private String horario;
        private String fecha;

        public Turnos(String horario, String fecha, paciente.Pacientes paciente) {
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

        @Override
        public String toString() {
            return "Turnos{" + "paciente=" + paciente + ", horario=" + horario + ", fecha=" + fecha + '}';
        }
    }
}
