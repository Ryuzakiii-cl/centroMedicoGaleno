/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Criiiis
 */
public class Usuarios {
    private int id;
    private String nombre;
    private String apellido;
    private String rut;
    private String direccion;
    private String telefono;
    private String correo;
    private String rol;
    private String especialidad;

    public Usuarios() {
    }

    public Usuarios(int id, String nombre, String apellido, String rut, String direccion, String telefono, String correo, String rol, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.rol = rol;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", rol=" + rol + ", especialidad=" + especialidad + '}';
    }

   
    
    
    
    public class Medico extends Usuarios {
    // Atributos y métodos específicos para médicos
    }

    public class Secretaria extends Usuarios {
    // Atributos y métodos específicos para secretarias
    }

    public class Paciente extends Usuarios {
    // Atributos y métodos específicos para pacientes
    }
    
    
}//fin clase
