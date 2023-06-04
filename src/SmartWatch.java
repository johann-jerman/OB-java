public class SmartWatch extends  SmartDevise{
    long price;
    public SmartWatch(){
        super();
    }
    public SmartWatch(String model, long price){
        super(model);
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
