import java.util.Scanner;

public class Main {

    static int recursiveMinus(int n,int count){
        System.out.print(n+" ");

        if(n<=0){
            for(int i = n+5; i <= (count * 5) + n; i += 5){
                System.out.print(i+" ");
            }
            return n;
        }
        return recursiveMinus(n-5,count+1);
    }

    public static void main(String[] args) {
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n=scan.nextInt();

        System.out.print("Çıktısı: ");
        recursiveMinus(n,count);

    }
}