import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT GRADE CALCULATOR");
        System.out.println("Enter your marks below:-");
        
        System.out.print("English:- ");
        int m1=sc.nextInt();
        
        System.out.print("Mathematics:- ");
        int m2=sc.nextInt();
        
        System.out.print("Physics:- ");
        int m3=sc.nextInt();
        
        System.out.print("Chemistry:- ");
        int m4=sc.nextInt();

        float sum=m1+m2+m3+m4;
        System.out.println("Total marks obtained is:- "+sum);
        
        float avgp=sum/4;
        System.out.println("Average percentage is:- "+avgp);

        if(avgp>=90){
            System.out.println("Your grade is :- A+");
        }
        else if(avgp>=80){
            System.out.println("Your grade is :- A");
        }
        else if(avgp>=70){
            System.out.println("Your grade is :- B+");
        }
        else if(avgp>=60){
            System.out.println("Your grade is :- B");
        }
        else if(avgp>=50){
            System.out.println("Your grade is :- C+");
        }
        else if(avgp>=40){
            System.out.println("Your grade is :- C");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("THANK YOU");
    }
}