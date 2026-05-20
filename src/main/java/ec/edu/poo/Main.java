package ec.edu.poo;

    public class Main {

        public static void main(String[] args) {

            GestorActivos gestor = new GestorActivos();

            Servidor servidor1 = new Servidor("SRV001", "Servidor Principal", 9, false, "Linux");

            Firewall firewall1 = new Firewall("FW001", "Firewall Central", 7, false, 120);

            Servidor servidor2 = new Servidor("SRV002", "Servidor Backup", 8, false, "Windows Server");

            System.out.println("Registro servidor1: " + gestor.registrarActivo(servidor1));

            System.out.println("Registro firewall1: " + gestor.registrarActivo(firewall1));

            System.out.println("Registro servidor2: " + gestor.registrarActivo(servidor2));


            ActivoDigital encontrado = gestor.buscarPorCodigo("SRV001");

            if (encontrado != null) {
                System.out.println("Activo encontrado: " + encontrado.getNombre());
            }


            System.out.println("Cantidad de activos críticos: " + gestor.contarActivosCriticos());


            System.out.println("Promedio de riesgo: " + gestor.calcularPromedioRiesgo());


            boolean parche = gestor.aplicarParcheActivo("SRV001");

            System.out.println("Parche aplicado: " + parche);


            System.out.println("Estado parche servidor1: " + servidor1.isParcheAplicado());


            System.out.println("Cantidad total de activos: " + gestor.obtenerCantidadActivos());
        }
    }


