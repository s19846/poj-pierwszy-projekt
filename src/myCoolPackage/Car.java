package myCoolPackage;

class Car {
    private String brand;
    private String model;
    private boolean isNew;
    private int mileage;
    private double price;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isNew() {
        return isNew;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    Car(String brand, String model, boolean isNew, int mileage, double price) {
        this.brand = brand;
        this.model = model;
        this.isNew = isNew;
        this.mileage = mileage;
        this.price = price;
    }

    void printCarParameters() {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Nowy: " + isNew);
        System.out.println("Przebieg: " + mileage);
        System.out.println("Cena: " + price);
    }
}
