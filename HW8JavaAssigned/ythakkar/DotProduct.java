import java.util.Random;

public class DotProduct implements Command{


    public static Random rando = new Random( );
    private double arr1[ ];
    private double arr2[ ];
    private double result = 0;
    private int length;

    public DotProduct(int numElements) {
        arr1 = new double[numElements];
        for (int i=0; i<arr1.length; i++) {
            arr1[i] = rando.nextDouble();
        }
        arr2 = new double[numElements];
        for (int i=0; i<arr2.length; i++) {
            arr2[i] = rando.nextDouble();
        }
        result = 0;
        length = arr1.length;
    }

    public void execute(){
        for (int i=0; i<length; i++) {
            result += arr1[i] * arr2[i];
        }
    }

    public String identify(){
        return "inner product on arrays of length " + arr1.length + " the result is " + result;
    }
}
