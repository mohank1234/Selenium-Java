public class PrimeNumbers
{
    public static void prime()
    {
        int n=3;
        if(n%2==0)
        {
            System.out.println("3 is not primenumber");
        }
        else
        {
            System.out.println("3 isprimenumber");
        }
    }
    // find primenumbers
    public static void findpm()
    {
        int count =100;
        for (int i=2;i<count;i++)
        {
            boolean isprime =true;
            for (int j=2;j<Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isprime=false;
                    break;
                }
            }
            if(isprime)
            {
                System.out.println(i);
            }
        }
    }


    public static void main(String args[])
    {
        prime();
        findpm();
    }
}