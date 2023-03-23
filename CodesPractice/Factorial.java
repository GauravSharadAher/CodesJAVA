package CodesPractice;

import java.util.Scanner;

public class Factorial {
    int num;
//    int factorial=1;


    public String  fact(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number:");
        num = in.nextInt();
        int factorial=1;
        while(num>1){
            factorial=factorial*num;
            num--;
        }
        return ("Factorial is "+ factorial);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.fact());
    }

    public static class Prime {
        int i=23;
        public static void main(String [] args){
            int i=20;
            //int ans=getNumber();
            primeNumber(i);
    //        CodesPractice.Factorial.Prime p= new CodesPractice.Factorial.Prime();
    //        p.getNumber();
    //        p.primeNumber();
        }


          static int getNumber(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int i = sc.nextInt();
            return i;
        }
        static void primeNumber(int i){
            System.out.println();
            if(i==1){
                System.out.println("Not a prime number");
            }

            else if(i==2){
                System.out.println("CodesPractice.Factorial.Prime number");
            }

            else{
                int j=2;
                while(j<Math.sqrt(i)){
                    if(i%j==0){
                        System.out.println("Not a CodesPractice.Factorial.Prime number");
                        break;
                    }
                    j++;
                }
                if(j>Math.sqrt(i)){
                    System.out.println("CodesPractice.Factorial.Prime number");

                }

            }
        }



    }
}
