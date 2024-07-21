import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        multiple(23,44,"mahak","kunal","uday");
        fun(2,34,5,6,7,4,7,234);
    }

    static void multiple(int a,int b,String...s){
        System.out.print(a);
        System.out.print(b);
        System.out.println(Arrays.toString(s));
    }


    static void fun(int... v) {//same type of arguments
        System.out.println(Arrays.toString(v));
    }
}