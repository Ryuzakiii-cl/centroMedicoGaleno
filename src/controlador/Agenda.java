/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

public class Agenda {
    private String rutPaciente;
    private String nombreMed;
    private String rutMed;
    private String especialidad;
    private String fecha;
    private String status;
    private int valorConsulta;

    public Agenda() {
    }

    public Agenda(String rutPaciente, String nombreMed, String rutMed, String especialidad, String fecha, String status, int valorConsulta) {
        this.rutPaciente = rutPaciente;
        this.nombreMed = nombreMed;
        this.rutMed = rutMed;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.status = status;
        this.valorConsulta = valorConsulta;
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

    public String getRutMed() {
        return rutMed;
    }

    public void setRutMed(String rutMed) {
        this.rutMed = rutMed;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public String toString() {
        return "Agenda{" + "rutPaciente=" + rutPaciente + ", nombreMed=" + nombreMed + ", rutMed=" + rutMed + ", especialidad=" + especialidad + ", fecha=" + fecha + ", status=" + status + ", valorConsulta=" + valorConsulta + '}';
    }

   
    
    

        
}//fin clase
