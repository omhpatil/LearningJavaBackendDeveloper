package Java8Features;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}


public class LambdaExpressionExample implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        LambdaExpressionExample example = new LambdaExpressionExample();

        int result = example.add(10, 20);
        System.out.println("Addition using simple method: " + result);


        // ------------------------Using lambda expression--------------------------
        Calculator calculator = (a, b) -> a + b;
        System.out.println("Addition using lambda expression: " + calculator.add(10, 20));

    }
}
