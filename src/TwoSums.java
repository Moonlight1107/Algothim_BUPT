import java.util.Scanner;

public class TwoSums {

    public static int sum(int a,int b){
        if(b==0){
            return a;
        }
        else {
            return sum(a^b,(a&b)<<1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b=scanner.nextInt();
        Integer c=sum(a,b);
        System.out.println(c.toString());
    }
}
