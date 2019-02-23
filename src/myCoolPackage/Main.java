package myCoolPackage;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Subaru",
                "BRZ",
                true,
                45,
                109000
        );
        car.printCarParameters();
    }
}
