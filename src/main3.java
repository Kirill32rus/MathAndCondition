import java.util.Scanner;

public class main3 {


    public static void main(String[] args) {

        int employee1,employee2,employee3,difference,maxSalary,minSalary;

        Scanner input =new Scanner(System.in);

        System.out.print("Зарплата первого сотрудника" );
        employee1= input.nextInt();
        System.out.print("Зарплата второго сотрудника" );
        employee2= input.nextInt();
        System.out.print("Зарплата третьего сотрудника");
        employee3= input.nextInt();



        if (employee1>employee2 && employee1>employee3 ){
            maxSalary = employee1;
            System.out.println("Зарплата первого сотрудника больше" );
        }
        else if (employee2>employee3){
            maxSalary=employee2;
            System.out.println("Зарплата второго сотрудника больше");
        }
        else {
            maxSalary=employee3;
            System.out.println("Зарплата третьего сотрудника больше");
        }





        if (employee1 < employee2 && employee1 < employee3 ) {
            minSalary = employee1;
            System.out.println("Зарплата первого сотрудника меньше" );
        }
        else if (employee2<employee3){
            minSalary =employee2;
            System.out.println("Зарплата второго сотрудника меньше");
        }
        else {
            minSalary=employee3;
            System.out.println("Зарплата третьего сотрудника меньше");
        }

        difference=maxSalary-minSalary;
        System.out.println("Больше на"+difference);




    }
}
