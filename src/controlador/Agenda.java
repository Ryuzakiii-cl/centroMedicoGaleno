/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

public class Agenda {
    private String rutPaciente;
    private String nombreMed;
    private String especialidad;
    private String status;
    private String fecha;

    public Agenda() {
    }

    public Agenda(String rutPaciente, String nombreMed, String especialidad, String status, String fecha) {
        this.rutPaciente = rutPaciente;
        this.nombreMed = nombreMed;
        this.especialidad = especialidad;
        this.status = status;
        this.fecha = fecha;
    }

    public String getRutPaciente() {
        return rutPaciente;
    }

    public void setRutPaciente(String rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Agenda{" + "rutPaciente=" + rutPaciente + ", nombreMed=" + nombreMed + ", especialidad=" + especialidad + ", status=" + status + ", fecha=" + fecha + '}';
    }
    
    
    


    
}//fin clase
