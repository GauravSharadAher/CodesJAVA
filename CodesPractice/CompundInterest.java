package CodesPractice;

import java.util.Scanner;

public class CompundInterest {
    int p,n;
    double interest,r;

    public void cI(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter principle Amount");
        p=in.nextInt();
        System.out.println("Enter rate of interest");
        r=in.nextDouble();
        System.out.println("Enter number of year");
        n=in.nextInt();
        double r1= (1+(r/100));
        double pov= Math.pow(r1,n);

        System.out.println(p*pov-p);

    }

    public static void main(String[] args) {
        CompundInterest c=new CompundInterest();
        c.cI();
    }
}
