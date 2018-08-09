package lt.baltictalents.lecture2.zmogus;

class ClassMain {
    public static void main(String[] args) {
        Zmogus zmogusVar1 = new Zmogus("Darius");

        Zmogus zmogusVar2 = new Zmogus("Jonas");

        System.out.println("var1: " + zmogusVar1.vardas);
        System.out.println("var2: " + zmogusVar2.vardas);

        zmogusVar1 = zmogusVar2;
        System.out.println();
        System.out.println("var1: " + zmogusVar1.vardas);
        System.out.println("var2: " + zmogusVar2.vardas);

        zmogusVar1.vardas += 1; // zmogusVar1.vardas = zmogusVar1.vardas + 1;

        System.out.println();
        System.out.println("var1: " + zmogusVar1.vardas);
        System.out.println("var2: " + zmogusVar2.vardas);

        zmogusVar2.vardas = "Bevardis";

        System.out.println();
        System.out.println("var1: " + zmogusVar1.vardas);
        System.out.println("var2: " + zmogusVar2.vardas);
    }
}

