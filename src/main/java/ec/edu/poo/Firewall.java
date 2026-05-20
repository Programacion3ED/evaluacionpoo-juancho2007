package ec.edu.poo;

public class Firewall extends ActivoDigital {

    private int reglasActivas;

    public Firewall(String codigo, String nombre, int nivelRiesgo,
                    boolean parcheAplicado, int reglasActivas) {
        super(codigo, nombre, nivelRiesgo, parcheAplicado);
        this.reglasActivas=reglasActivas;
        // TODO: completar constructor
    }

    public int getReglasActivas() {
        // TODO: completar
        return reglasActivas;
    }

    public void setReglasActivas(int reglasActivas) {
        this.reglasActivas=reglasActivas;
        // TODO: completar
    }
}
