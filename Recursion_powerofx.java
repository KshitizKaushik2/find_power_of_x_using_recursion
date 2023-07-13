public class Recursion_powerofx {

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xn1 = power(x,n-1);
        // int xfinal = x * xn1;
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
