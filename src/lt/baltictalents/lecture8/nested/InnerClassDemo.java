package lt.baltictalents.lecture8.nested;

class InnerClassDemo {
    public static void main(String[] args) {
        // 1
        ContainerClass container = new ContainerClass();
        ContainerClass.InnerClass inner = container.new InnerClass();
        inner.hello();
        // 2
        ContainerClass.InnerClass inner2 = new ContainerClass().new InnerClass();
        inner2.hello();
    }
}
