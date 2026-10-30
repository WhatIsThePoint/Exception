public class AppelMethod {
    public void method1() {
        this.method2();
    }

    public void method2() {
        this.method1();
    }

    public static void main(String[] args) {
        AppelMethod appel = new AppelMethod();

        try {
            appel.method1();
        } catch (StackOverflowError error) {
            System.out.println("The recursive calls exhausted the stack.");
        }
    }
}
