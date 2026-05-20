package ec.edu.poo;

public class ActivoDigital {

    private String codigo;
    private String nombre;
    private int nivelRiesgo;
    private boolean parcheAplicado;

    public ActivoDigital(String codigo, String nombre, int nivelRiesgo, boolean parcheAplicado) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.nivelRiesgo=nivelRiesgo;
        this.parcheAplicado=parcheAplicado;
        // TODO: completar constructor

    }

    public String getCodigo() {
        // TODO: completar
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo=codigo;
        // TODO: completar
    }

    public String getNombre() {
        // TODO: completar
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
        // TODO: completar
    }

    public int getNivelRiesgo() {
        // TODO: completar
        return nivelRiesgo;
    }

    public void setNivelRiesgo(int nivelRiesgo) {
        this.nivelRiesgo=nivelRiesgo;
        // TODO: completar
    }

    public boolean isParcheAplicado() {
        // TODO: completar
        return parcheAplicado;
    }

    public void setParcheAplicado(boolean parcheAplicado) {
        this.parcheAplicado=parcheAplicado;
        // TODO: completar
    }
}
