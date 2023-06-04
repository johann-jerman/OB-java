public class SmartDevise {
    String model;
    public SmartDevise(){}

    public SmartDevise(String model){
        this.model = model;
    }

    @Override
    public String toString() {
        return "SmartDevise{" +
                "model='" + model + '\'' +
                '}';
    }
}
