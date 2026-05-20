package ec.edu.poo;

public class GestorActivos {

    public final int MAX_ACTIVOS = 10;

    private ActivoDigital[] activos;
    private int contador;

    public GestorActivos() {
        activos = new ActivoDigital[10];
        contador = 0;
    // TODO: inicializar arreglo y contador
    }

    public void reiniciar() {

        activos = new ActivoDigital[10];
        contador = 0;

    // TODO: reiniciar arreglo y contador
    }

    public boolean registrarActivo(ActivoDigital activo) {
        if (contador >= 10){
            return false;
        }

        for (int i = 0; i < contador; i++) {
            if (activos[i].getCodigo().equals(activo.getCodigo())) {
                return false;
            }
        }

        activos[contador] = activo;
        contador++;

        return true;

    // TODO: registrar si hay espacio y si el código no existe
    }

    public ActivoDigital buscarPorCodigo(String codigo) {

        for (int i = 0; i < contador; i++) {
            if (activos[i].getCodigo().equals(codigo)) {
                return activos[i];
            }
        }

    // TODO: búsqueda secuencial por código
        return null;
    }

    public int contarActivosCriticos() {

        int cantidad = 0;

        for (int i = 0; i < contador; i++) {
            if (activos[i].getNivelRiesgo() >= 8) {
                cantidad++;
            }
        }

    // TODO: contar activos con nivelRiesgo >= 8
        return cantidad;
    }

    public double calcularPromedioRiesgo() {

        if (contador == 0) {
            return 0;
        }

        int suma = 0;

        for (int i = 0; i < contador; i++) {
            suma += activos[i].getNivelRiesgo();
        }

    // TODO: calcular promedio de riesgo
        return (double) suma / contador;
    }

    public boolean aplicarParcheActivo(String codigo) {

        ActivoDigital activo = buscarPorCodigo(codigo);

        if (activo != null) {
            activo.setParcheAplicado(true);
            return true;
        }

    // TODO: buscar activo y cambiar parcheAplicado a true
        return false;
    }

    public int obtenerCantidadActivos() {
        return contador;
    }

    public ActivoDigital[] obtenerActivos() {
        return activos;
    }
}