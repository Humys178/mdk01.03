import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        int[][] arr1 = new int[3][11];
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("введите сумму кредита под ставку 20% в месяц");
            a = sc.nextInt();
            if(a<0)
            {
                System.out.println("введите число коректно");
                continue;
            }
            for (int i = 1; i < 4; i++)
            {
                for (int j = 1; j < 13; j++)
                {
                    while (true) {
                        System.out.println("введите взнос");
                        b = sc.nextInt();
                        if (b < 0) {
                            System.out.println("вветите коректно сумму взноса");
                            continue;
                        } else {
                            break;
                        }

                    }
                    a = a - b + a * 20 / 100;
                    arr1[i][j] = b;
                    if (a < 0) {
                        a = a * -1;
                        System.out.println("вы переплотили" + a);
                    }
                    if (a > 0) {
                        System.out.println("вы должны с учётом процентов " + a);
                    }
                    c=3-i;
                    d=12-j;
                    if((c==0)&(d==0))
                    {
                        System.out.println("время кредита истекло");
                        if (a < 0) {
                            a = a * -1;
                            System.out.println("вы переплотили " + a+" средства вернуться в течении времени");
                        }
                        if (a > 0) {
                            System.out.println("вы должны с учётом процентов " + a+" через 3 дня придут коллеги и заберут ваше имущество");
                        }
                    }
                    System.out.println("до конца кредита осталось "+c+" года "+d+" месяцев");
                }
            }
        }
    }
}
