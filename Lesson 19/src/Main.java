public class Main {
    public static void main(String args[]) {
        Sedan sedan = new Sedan("Lada", 1.6, 300);
        sedan.signal();
        sedan.move();

        Truck truck = new Truck("Volvo", 2.0, 200);
        truck.signal();
        truck.move();

        Electro electro = new Electro("Tesla", null, 350);
        electro.signal();
        electro.move();

        Car car = new Car("cvcv", null, 3323);
    }
}
