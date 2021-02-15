package PRACTICA;

public enum Materias {

    ALG("ALGEBRA LINEAL", 5),
    GAV("GEOMETRIA ANALITICA Y VECTORIAL",6),
    ICS("INTRODUCCION AL CALCULO SUPERIOR",6),
    GFT("GEOMETRIA FUNDAMENTAL Y TRIGONOMETRIA",5),
    IVU("INTRODUCCION A LA VIDA UNIVERSITARIA",4);

    private Materias(String nombre, int creditos){
        this.nombre =nombre;
        this.creditos = creditos;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCreditos(){
        return creditos;
    }

    private String nombre;
    private int creditos;
}
