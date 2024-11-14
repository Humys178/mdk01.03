import java.util.Scanner;

public class zadanie2
{

    public static void main(String[] args)
    {
       int a,b;
       while (true)
       {
            a = (int) (Math.random() * 10);
            Scanner sc = new Scanner(System.in);
           System.out.println("введите код");
            b=sc.nextInt();
            if(a==b) break;
            if (a != b) continue;
        }
        System.out.println("полёт прерван возвращаюсь на землю");

    }
}
