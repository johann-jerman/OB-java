public class SmartPhone extends  SmartDevise {
    int price;
    public SmartPhone(){}
    public SmartPhone(String model, int price){
        super(model);
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
