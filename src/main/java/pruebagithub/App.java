package pruebagithub;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	int resultado=Sumar(12,3);
        System.out.println( "La suma es "+resultado );
	
    }
    public static int Sumar( int a, int b )
    {
	int c=a+b;
        return c;
    }
}
