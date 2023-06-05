import java.util.ArrayList;
import java.util.List;

public class CRUD implements CRUDImpl {

    private List<Empleado> empleados = new ArrayList<>();


    @Override
    public void save(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> findAll() {
        return empleados;
    }

    @Override
    public void delete(Empleado empleado) {
        empleados.remove(empleado);
    }

}
