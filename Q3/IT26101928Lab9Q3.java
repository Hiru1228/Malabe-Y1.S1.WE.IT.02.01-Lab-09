public class IT26101928Lab9Q3 {

    // add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // square - multiply number by itself
    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        // i. (3*4 + 5*7)^2 = (12 + 35)^2 = 47^2 = 2209
        int part1 = multiply(3, 4); // 12
        int part2 = multiply(5, 7); // 35
        int sum1 = add(part1, part2); // 47
        int result1 = square(sum1); // 2209

        // ii. (4+7)^2 + (8+3)^2 = 121 + 121 = 242
        int sumA = add(4, 7); // 11
        int sqA = square(sumA); // 121

        int sumB = add(8, 3); // 11
        int sqB = square(sumB); // 121

        int result2 = add(sqA, sqB); // 242

        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + result2);
    }
}