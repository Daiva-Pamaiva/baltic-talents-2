package lt.baltictalents.lecture1;

class IntroMain {
    public static void main(String[] args) {
        short shortVariable = 0;
        int intVariable = 1;
        long longVariable = 12L;

        intVariable = shortVariable;
        shortVariable = (short) intVariable;

        double doubleVariable = 2.0;
        float floatVariable = 2.0F;
        floatVariable = 3.0f;
        floatVariable = (float) 4.5;

        char charVariable = 'a';
        String stringVariable = "abc";

        boolean booleanVariable = true;

        String str = "" + intVariable + " " + longVariable + " " + booleanVariable;

        System.out.println(str);

        double c = 2;
        c = c * 2;
        c *= 2;

        int a = 10 / 3;
        int b = 10 % 3;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        preAndPostIncrementing();
    }

    private static void preAndPostIncrementing() {
        int a = 8;
        a++; // a=a+1; 9
        ++a; // 10
        int x = a-- + 2; // a=10, x=12, a=9
        int y = ++a * 2; // a=10, y=20, a=10
        System.out.println("a=" + a);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
