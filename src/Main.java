import java.util.Scanner;

public class Main
{
    public static void problemOne()
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num >= 0)
        {
            System.out.println("Positive.");
        }
        else
        {
            System.out.println("Negative.");
        }
    }

    public static void problemTwo()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x: ");
        float x = scan.nextFloat();
        System.out.println("Enter y: ");
        float y = scan.nextFloat();
        System.out.println(Math.min(x,y));
    }

    public static void problemThree()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter of the 1st rider: ");
        String letter1 = scan.nextLine();
        System.out.println("Enter the letter of the 2nd rider: ");
        String letter2 = scan.nextLine();
        System.out.println("Enter the distance of the 1st rider: ");
        float x1 = scan.nextFloat();
        System.out.println("Enter the distance of the 2nd rider: ");
        float x2 = scan.nextFloat();
        System.out.println("Enter the velocity of the 1st rider: ");
        float v1 = scan.nextFloat();
        System.out.println("Enter the velocity of the 2nd rider: ");
        float v2 = scan.nextFloat();

        double t1 = x1 / v1, t2 = x2 / v2;
        double min_time = Math.min(t1,t2);
        if (t1 == min_time)
        {
            System.out.println("Rider " + letter1 + " has the minimum time of " + t1);
        }

        else if (t2 == min_time)
        {
            System.out.println("Rider " + letter2 + " has the minimum time of " + t2);
        }

        else
        {
            System.out.println("Both riders' time arrivals are equal.");
        }


    }

    public static void problemFour()
    {
        double total = 0;
        double single_price = 1.2; //מחיר לקרטיב יחיד
        double few_price = 1; //שקל על כל כמות שמעל קרטיב אחד
        double box_price = 50; // קופסה זה 54 קרטיבים
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of popsicles you'd like to buy: ");
        int amount = scan.nextInt();
        if(amount >= 1)
        {
            if(amount == 1)
            {
                total = 1.2;
            }
            else if (amount > 1)
            {
                if (amount > 54)
                {
                    total = 50 * (amount / 54);
                    amount %= 54;
                    if (amount > 1)
                    {
                        total += amount;
                    }
                    else
                    {
                        total += 1.2;
                    }

                    amount = 0;
                }

                else
                {
                    total += amount;
                    amount = 0;
                }

            }

        }

        else{
            System.out.println("Invalid value.");
        }

        System.out.println("Total is: " + total + " shekels.");

    }

    public static void main(String[] args) {
        // problemOne();
        // problemTwo();
        // problemThree();
        // problemFour();
    }
}