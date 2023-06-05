import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static CRUDImpl CRUD = new CRUD();
    public static void main(String[] args) {
        Empleado alan = new Empleado("alan", "sanchez");
        Empleado miguel = new Empleado("miguel", "sanchez");

        CRUD.save(alan);
        CRUD.save(miguel);

        List<Empleado> empleados = CRUD.findAll();
        System.out.println(empleados);

        CRUD.delete(miguel);
        System.out.println(empleados);

    }
}