package PRACTICA;

public class Testeo {
    public static void main(String[] args) {
        Docente[] lista_docentes = new Docente[5];
        lista_docentes[0] = new Docente("Diego","Ortiz",31,10,2000,"Chiclayo",8,0,16,30, "alg");
        lista_docentes[1] = new Docente("Adrian","Ortiz",24,07,2003,"Piura",6,45,13,15, "Gav");
        lista_docentes[2] = new Docente("Maria","Vera",24,05,1966,"Lima",14,45,19,30, "ics");
        lista_docentes[3] = new Docente("Marco","Tulio",3,2,1993,"Cajamarca",7,0,19,30, "ivu");
        lista_docentes[4] = new Docente("Daniel","Camacho",26,9,1985,"Trujillo",8,0,16,30, "gft");

        for(Docente e: lista_docentes){
            System.out.println(e.getDescripcion()+e.getMateria());
        }
    }
}
