import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int a = 10;
    int c = 25 ;
    int d = 45 ;

    System.out.println (a);
    System.out.println (c);
    System.out.println (d);

int sum = a + c ;
System.out.println (sum);

int sub = a - c ;
int mul = a * c ;
int div = a /c ;

System.out.println (sub);
System.out.println (mul);
System.out.println (div);

double a1 = 10.2 ;// дроби
double a2 = 15.3 ;
double sum1  = a1 + a2 ;
System.out.println (sum1) ;

float a3 = 10.2f ;
float a4 = 15.3f ;
float sum2 = a3 + a4 ;
System.out.println(sum2);

boolean trueVar = true;
boolean falseVar = false;

char digit = '1' ;// целое число
String digits = "1234556" ;

boolean sumBool = true && false ;// логическое и (1) && ,,логическое или (0) ||
boolean antiTrueVar = !trueVar ;

String str1 = "world" ;
String str2 = "hellow" ;
String str3 = str1 + " " + str2 ;//пробел между строками (не слитное написанте )
System.out.println (str3);

System.out.println (a1 + " " + str3);

        int calculetion = (1 + 2) * 3 * (4 + 8);

System.out.println (calculetion);


         System.out.print("Vvedite vozrast:");//прописывает в консоли введите возраст и возраст на одной строке
        Scanner sc = new Scanner(System.in);//для считывания с консоли
int age = sc.nextInt( ) ;//чтобы в консоли прописывать числа

        if (age >= 18 && age < 25)
        {
            System.out.println("продать можно предъяви документы");
        }
        else if (age >= 25 && age < 65)
        {
            System.out.println("продаем");
        }
else if (age >= 65 && age > 100)
        {
            System.out.println("с лекарствами");
        }
else
        {
            System.out.println("нельзя");
        }










    }
}