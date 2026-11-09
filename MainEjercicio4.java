public class MainEjercicio4 {

    public static void probarVehiculo(Vehiculo v) {
        v.encender(); // Comportamiento común

        // Verificación de tipo y Downcasting seguro
        if (v instanceof Auto) {
            Auto auto = (Auto) v;
            auto.abrirBaul();
        } else if (v instanceof Moto) {
            Moto moto = (Moto) v;
            moto.hacerPique();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vehiculo miAuto = new Auto();
        Vehiculo miMoto = new Moto();
        Vehiculo vehiculoGenérico = new Vehiculo();

        probarVehiculo(miAuto);
        probarVehiculo(miMoto);
        probarVehiculo(vehiculoGenérico);
    }
}