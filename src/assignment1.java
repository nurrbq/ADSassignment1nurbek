
import java.util.Scanner;

public class assignment1 {
    //Time and space complexity are O(n)
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMin(arr, n - 1);
        return Math.min(arr[n - 1], min);
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minimum = findMin(arr, arr.length);
        System.out.println(minimum);
    }
    //time complexity is O(n) and the space complexity is O(n)
    public static double findAvg(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        double averaga = findAvg(arr, n - 1) * (n - 1);
        return (averaga + arr[n - 1]) / n;
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double avgofarr = findAvg(arr, arr.length);
        System.out.println(avgofarr);
    }
    //the time complexity is O(n) and the space complexity is O(n)
    public static int findPrime(int n, int m) {
        if (n <= 1) {
            return 0;
        }
        if (m == 1) {
            return 1;
        }
        if (n % m == 0) {
            return 0;
        }
        return findPrime(n,m-1);
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = findPrime(n,n/2);
        if (answer==1) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
    //the time complexity is O(n) and the space complexity is O(n)
    public static int findfactorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * findfactorial(n-1);
    }
    public static void task4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = findfactorial(n);
        System.out.println( n+ "! = " + fact );
    }
    //the time complexity is O(2^n) and the space complexity is O(n).
    public static int findFibonacci (int n) {
        if (n < 2) {
            return n;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }


    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFibonacci(n));
    }
    //the time complexity is O(n) and the space complexity is O(n)
    public static int findPower(int a, int n){
        if (a == 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        return a * findPower(a, n-1);
    }
    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findPower(a, n));
    }
    //the time complexity is O(n * n!) and the space complexity is O(n).
    public static void findPermutations(char[] arr, int a, int b) {
        if (a == b) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
            return;
        }
        for (int i = a; i <= b; i++) {
            char temp = arr[a];
            arr[a] = arr[i];
            arr[i] = temp;
            findPermutations(arr, a + 1, b);

            temp = arr[a];
            arr[a] = arr[i];
            arr[i] = temp;
        }
    }
    public static void task7() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();
        findPermutations(arr, 0, arr.length - 1);
    }
    //the time complexity is O(n) and the space complexity is O(n)
    public static boolean findDigits(char[] arr, int n) {
        if (arr.length == 0) {
            return false;
        }
        if (n == arr.length) {
            return true;
        }
        if (!Character.isDigit(arr[n])) {
            return false;
        }
        return findDigits(arr, n + 1);
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();         
        char[] arr = input.toCharArray();      

        if (findDigits(arr, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    //the time complexity is O(2^n) and the space complexity is O(n).
    public static int findBinomial(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return findBinomial(n - 1, k) + findBinomial(n - 1, k - 1);
    }
    public static void task9() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findBinomial(n, k));
    }
    //the time and space complexity of the algorithm are O(log(min(a, b))).
    public static int findAlgorithm(int a, int b){
        if(a==b){
            return 1;
        }
        if (b==0){
            return a;
        }
        return findAlgorithm(b, a%b);
    }
    public static void task10() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findAlgorithm(a,b));
    }
}
