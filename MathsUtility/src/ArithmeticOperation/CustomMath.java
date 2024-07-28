package ArithmeticOperation;

public class CustomMath {

    public int max(int num1, int num2){
        return num1>num2?num1:num2;
    }

    public int min(int num1, int num2){
        return num1>num2?num2:num1;
    }

    public int sum(int... num){
        int sum = 0;
        for (int val:num){
            sum = sum+val;
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
