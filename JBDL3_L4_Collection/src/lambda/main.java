package lambda;

public class main {

    public static void main(String[] args) {
       // Calculator calculator = new CalculatorImpl();
      /*  Calculator calculator =  new Calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };*/

        Calculator calculator = (a, b)->a+b;


        System.out.println(calculator.add(2,3));

    }
}
