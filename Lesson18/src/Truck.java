public class Truck extends Car{
    public Truck() {
    }

    public Truck(String mark, Double engineVolume, Integer maxSpeed) {
        super(mark, engineVolume, maxSpeed);
    }

    public void move() {
        System.out.println("Грузовик движется со скоростью " + super.getMaxSpeed());
    }
}
