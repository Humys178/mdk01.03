import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("введите ваше любимое число");
        a = sc.nextInt();
        if (a==7)
        {
            System.out.println("это мое тоже счасливое число");
        }
        if (a==13)
        {
            System.out.println("это несчасливое число");
        }
        if (a==24)
        {
            System.out.println("это несчасливое число");
        }
        if (a<7)
        {
            System.out.println(a + "для вас счасливое число ");
        }
        if ((a>7) & (a<13))
        {
            System.out.println(a+"для вас счасливое число ");
        }
        if ((a>13) & (a<24))
        {
            System.out.println(a+"для вас счасливое число ");
        }
        if (a>24)
        {
            System.out.println(a+" для вас счасливое число ");
        }
    }
}