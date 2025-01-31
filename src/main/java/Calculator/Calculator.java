package Calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(String numbers) {
        String[] parts = numbers.split(",");
        int sum = 0;

        for (String num : parts) {
            sum += Integer.parseInt(num.trim());
        }
        return sum;
    }

    public int add(int[] numbers){
        int sum =0;
        for (int num : numbers){
            sum += num;
        }
        return sum;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        return a/b;
    }
}
