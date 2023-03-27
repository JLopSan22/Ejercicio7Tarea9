package daw.programacion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lugar lugar1 = new Lugar(1, "Calle 123", "Almería", "Almería");
        Empleado empleado1 = new Empleado("Pepe", "Pérez", "González", "Panadero");
        Empleado empleado2 = new Empleado("Jose", "Sánchez", "Lopez", "Mecánico");
        ArrayList<Empleado> empleadosProyecto = new ArrayList<>();
        empleadosProyecto.add(empleado1);
        empleadosProyecto.add(empleado2);
        Proyecto proyecto1 = new Proyecto(LocalDate.of(2019,12,12), LocalDate.of(2022,05,31), "Proyecto número 1", empleadosProyecto, lugar1);
        Empleado empleado3 = new Empleado("Luis", "Sánchez", "Lopez", "Banquero");
    }
}