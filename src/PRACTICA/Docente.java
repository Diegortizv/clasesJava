package PRACTICA;

public final class Docente extends Empleado{
    public Docente(String nombre, String apellido, int dia, int mes, int anho, String plaza, int hIJ, int mIJ, int hFJ, int mFJ, String materia){
        super(nombre, apellido, dia, mes, anho, plaza, hIJ, mIJ,hFJ,mFJ);
        Materias materiaDocente = Materias.valueOf(materia.toUpperCase());
        this.materia = materiaDocente.getNombre();
        this.creditos_materia = materiaDocente.getCreditos();

    }

    public String getMateria(){
        return "La materia que dicta es "+materia+" y tiene "+creditos_materia+" créditos\n";
    }

    private String materia;
    private int creditos_materia;
}
