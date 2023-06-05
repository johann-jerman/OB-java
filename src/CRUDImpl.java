import java.util.List;

public interface CRUDImpl {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
