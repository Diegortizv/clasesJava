package PRACTICA;

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Empleado extends Persona{

    public Empleado(String nombre, String apellido, int dia, int mes, int anho, String plaza, int hIJ, int mIJ, int hFJ, int mFJ){
        super(nombre, apellido, dia, mes, anho);
        id = id + aumento_id;
        aumento_id++;
        this.plaza = plaza;
        GregorianCalendar calendar = new GregorianCalendar(0,0,0,hIJ,mIJ);
        SimpleDateFormat formatHora = new SimpleDateFormat("HH:mm");
        inicio_jornada = formatHora.format(calendar.getTime());
        calendar.clear();
        calendar.set(0,0,0,hFJ,mFJ);
        fin_jornada = formatHora.format(calendar.getTime());
    }

    public int getId(){
        return id;
    }

    public String getDescripcion(){
        return "Datos del empleado "+getNombre()+" "+getApellido()+":\nEdad:"+getEdad()+"\nFecha de nacimiento:"+getFecha_nacimiento()+"\nID:"+id+"\nPlaza:"+plaza+"\nInicio de jornada:"+inicio_jornada+"\nFin de jornada:"+fin_jornada+"\n";
    }

    private int id;
    private String plaza;
    private String inicio_jornada;
    private String fin_jornada;
    private static int aumento_id = 1;
}
