package Test2.tasks;
interface myInterface {
    void myMethod(String s);
}
public class LambdaExpression {
    public static void main(String[] args) {
        // normal anonymous class
        myInterface normal = new myInterface() {
            public void myMethod(String s) {
                System.out.println("Hello, " + s);
            }
        };
        normal.myMethod("world");

        // using a lambda expression
        myInterface lambda = (s) -> System.out.println("Hello, " + s);
        lambda.myMethod("world");
    }
}


