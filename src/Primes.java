public class Primes{
    //Точка входа. Перебираем числа от 2 до 101
    public static void main(String[] args)
    {
        for (int i = 2; i < 101; i++)
        {

            if (isPrime(i))
            {
                System.out.println(i);
            }

        }
    }

    //Проверка на простоту
    public static boolean isPrime(int n)
    {
        for(int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}