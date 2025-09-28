public class whichNumberIsBigger {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(max(a , b));
    }

    public static int max(int a, int b) {
        int max;
        if(a > b){
            max = a;
        }
        else {
            max = b;
        }
        return max;
    }

}
