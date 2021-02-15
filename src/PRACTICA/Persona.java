package PRACTICA;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.LocalDate;

public abstract class Persona {

    public Persona(String nombre, String apellido, int dia, int mes, int anho){
        this.nombre = nombre;
        this.apellido = apellido;
        GregorianCalendar calendar = new GregorianCalendar(anho, mes-1,dia);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        fecha_nacimiento = formatDate.format(calendar.getTime());
        LocalDate fechaNac = LocalDate.of(anho,mes,dia);
        LocalDate now = LocalDate.now();
        Period diferencia = Period.between(fechaNac, now);
        edad = diferencia.getYears();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getFecha_nacimiento(){
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(int edad, int dia, int mes, int anho){
        GregorianCalendar calendar = new GregorianCalendar(anho, mes-1,dia);
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        fecha_nacimiento = formatDate.format(calendar.getTime());
    }

    public abstract String getDescripcion();

    private String nombre;
    private String apellido;
    private int edad;
    private String fecha_nacimiento;
}
