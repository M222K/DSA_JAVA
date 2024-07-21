import java.util.Arrays;

public class funprac {
    public static void main(String[] args) {
        multiple("mahak","john","max","georgia");
        intfun(23,3455,5587387,763);
    }


static void multiple (String...s){
    System.out.println(Arrays.toString(s));
}
static void intfun(int...v){
    System.out.println(Arrays.toString(v));
}
}