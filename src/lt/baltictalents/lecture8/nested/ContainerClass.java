package lt.baltictalents.lecture8.nested;

class ContainerClass {

    class InnerClass {
        void hello() {
            System.out.println("Inner");
        }
    }

    static class InnerStaticClass {
        void hello() {
            System.out.println("Inner static");
        }
    }
}
