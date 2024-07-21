public class shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x=50;
        System.out.println(x);//everytime now x would be local var
        System.out.println(shadowing.x);//if forcefully want to access shadowed var x
    }
    
}
