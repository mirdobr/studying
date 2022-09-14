public class Nataha
{
    public static void main(String[] args)
    {
        System.out.println(test(4, 7 , 0));
    }

    private static String test (int a, int b, int c)
    {
        double discriminant = (b * b) - (4 * a * c);
        String result = "no roots";
        if(discriminant > 0)
        {
            double root = Math.sqrt(discriminant);
            double x1 = (- b + root) / (2 * a);
            double x2 = (- b - root) / (2 * a);
            result = "the roots are " + x1 + " and " + x2;
        }
        else if (discriminant == 0)
        {
            double x = (- b) / (2 * a);
            result = "the root is " + x;
        }
        return result;
    }
}