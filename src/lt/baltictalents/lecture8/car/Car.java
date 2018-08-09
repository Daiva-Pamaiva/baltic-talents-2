package lt.baltictalents.lecture8.car;

class Car implements Comparable<Car> {
    private String name;
    private String gearBox;
    private int maxSpeed;

    public Car(String name, String gearBox, int maxSpeed) {
        this.name = name;
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car anotherCar) {
        return this.getName().compareTo(anotherCar.getName());
    }

    public Car(String gearBox) {
        this.gearBox = gearBox;
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {// manual arba automatic | equals
        if (gearBox.equals("manual") || gearBox.equals("automatic")) {
            this.gearBox = gearBox;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }
}