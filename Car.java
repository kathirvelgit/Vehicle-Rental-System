class Car extends Vehicle {

    @Override
    public int calculateRent() {
        return 2000;
    }

    public void showCarType() {
        System.out.println("Car Type : Sedan");
    }
}