public class Empleado {
    String name;
    String lastname;


    public Empleado(){}

    public Empleado(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
