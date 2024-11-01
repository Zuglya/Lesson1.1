public class Sedan extends Car{
    public Sedan() {
    }

    public Sedan(String mark, Double engineVolume, Integer maxSpeed) {
        super(mark, engineVolume, maxSpeed);
    }

    public void move() {

        System.out.println("Седан движется со скоростью " + super.getMaxSpeed());
    }
}
