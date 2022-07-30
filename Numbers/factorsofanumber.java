package Numbers;

public class factorsofanumber {
    static void Divisor(int n)
    {
        for (int i=1;i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    System.out.print(" "+ i);

                else // Otherwise print both
                    System.out.print(i+" " + n/i + " " );
            }
        }
    }
    public static void main(String args[])
    {   int n = 14;
        System.out.print("Factors of " + n + " are: ");
        Divisor(n);;
    }
}

//Intuition: When we thoroughly see the factors of a natural number, they always lie in pairs. For if ‘n’ is divisible by any number ‘i’ then it will also be divisible by its quotient of n/i.