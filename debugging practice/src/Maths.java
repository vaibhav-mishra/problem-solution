public class Maths {
    public static int add(int x, int y){
        return x + y;
    }

    public static int multiple(int x, int y){
        int mul = 0;
        for (int i = 0; i < x; i++) {
            mul = add(mul, y);
        }
        return mul;
    }

    public static void main(String[] args){
        int sum;
        multiple(4,5);
    }
}
