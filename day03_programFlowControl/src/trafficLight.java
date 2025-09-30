public class trafficLight {
    public static void main(String[] args) {
        light();
    }

    public static void light() {
        boolean red = false;
        boolean yellow = false;
        boolean green = true;

        if(red){
            System.out.println("dont go");
        } else if (yellow) {
            System.out.println("please wait");
        } else if (green) {
            System.out.println("go go go");
        }else System.out.println("light error");
    }
}
