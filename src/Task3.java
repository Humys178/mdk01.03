import java.util.Arrays;
import java.util.Scanner;

public class Task3
{

        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            String[] arr1 = new String[25];

            for (int a=0;a< arr1.length;a++)
            {
                System.out.println(" введите фильм если вы закончили введите выход: ");
                String user = sc.nextLine();
                if(( user.equalsIgnoreCase("EXIT" ))  || ( user.equalsIgnoreCase("ВЫХОД" ))) break;
                arr1[a] = user;
            }
            System.out.println(Arrays.toString(arr1));
        }

}
