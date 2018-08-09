package lt.baltictalents.lecture2.car;

/**
 * Sukurti public klase CarMain su main methodu
 * <p>
 * po ja tame paciame faile sukurti klase Car su laukais:
 * String gearBox;
 * int maxSpeed;
 * <p>
 * sukurti get ir set metodus Car klaseje, kurie keistu
 * ir grazintu lauku reiksmes atitinkamai
 * <p>
 * setGearBox
 * setMaxSpeed
 * <p>
 * getGearbox()
 * getMaxSpeed()
 * <p>
 * sukurti Car klases konstruktorius su abiem parametrais, be parametru,
 * su vienu parametru (2 konstruktoriai)
 * <p>
 * <p>
 * Uzdavinys:
 * prideti klaseje Car laukeli name, kuriame bus saugomas automobilio pavadinimas
 * <p>
 * sukurti masyva is 5 skirtingu automobiliu
 * automobiliai gali tureti gearBox reiksme "manual" arba "automatic"
 * maxSpeed gali buti tik teigiamas skaicius
 * <p>
 * atspausdinti automobilio pavadinima su dydziausiu greiciu
 * suskaiciuoti automobilius ir atspasdinti kiek turi automatine ir mechanine pavaru deze
 */

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Toyota";
        car1.gearBox = "manual";
        car1.maxSpeed = 180;

        Car car2 = new Car();
    }
}

class Car {
    String name;
    String gearBox;
    int maxSpeed;

    public Car(String gearBox, int maxSpeed) {
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    public Car(String gearBox) {
        this.gearBox = gearBox;
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car() {
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
}