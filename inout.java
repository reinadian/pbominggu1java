import java.util.Scanner;

public class inout{
    public static void main(String[] args){
        String s;
        Scanner in = new Scanner(System.in);
        s=in.next();
        System.out.println("Nilai s dengan next() : "+s);
        s=in.nextLine();
        System.out.println("Nilai s dengan nextLine() : "+s);
    }
}