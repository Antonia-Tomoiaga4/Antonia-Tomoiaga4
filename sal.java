import java.math.BigInteger;
import java.util.*;


public class sal{

    public static void main(String[] args) {

        String numar = "100";
        int nrTransformat = Integer.parseInt(numar);

        System.out.println(nrTransformat);

        String nrRetransformat = Integer.toString(nrTransformat);
        System.out.println(nrRetransformat);

        String nrDec = "7.21";
        double nrNat = Double.parseDouble(nrDec);
        System.out.println(nrNat);

        String nrDecRetransf = Double.toString(nrNat);
        System.out.println(nrDecRetransf + "\n");


        byte valMax = Byte.MAX_VALUE;
        System.out.println(valMax);
        System.out.println((byte) (valMax + 2));
        System.out.println((++valMax));
        System.out.println((byte) (valMax + 2) + "\n");


        byte valMin = Byte.MIN_VALUE;
        System.out.println(valMin);
        System.out.println((byte) (valMin - 1) + "\n\n");

        int nrIntMax = Integer.MAX_VALUE;
        System.out.println(nrIntMax);
        System.out.println((int) (nrIntMax + 1) + "\n\n");


        float nrFloatMax = Float.MAX_VALUE;
        float nrFloatMax1 = 2.5f;

        System.out.println(nrFloatMax * nrFloatMax1);


        float nrTest1 = 2.17634664f;
//        double nrDoubleCast = (double)(nrTest1);
        double nrDoubleCast1 = 2.928453633;

        System.out.println(nrTest1);
//        System.out.println(nrDoubleCast );
        System.out.println(nrDoubleCast1);

        double nrDoubleCast2 = 2.1028736463666354554;
        System.out.println(nrDoubleCast2 + "\n\n");


        float nrFloatMIN = Float.MIN_VALUE;
        float nrFloatMax2 = Float.MAX_VALUE;

        System.out.println(nrFloatMIN * nrFloatMax2);

        int zerImp = 123;
        try {
            System.out.println(zerImp / 0);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

//        System.out.println(0 / 0);
//        System.out.println(nrFloatMax2 / nrFloatMax2);

        float nrNeg = -2.75f;
        System.out.println(nrNeg / 0);

        float nrPoz = 2.75f;
        System.out.println(nrPoz / 0);
        System.out.println(nrNeg / 0 + nrPoz / 0);
        System.out.println((nrNeg / 0) * (nrPoz / 0));

//        boolean nr1 = 1;
//        boolean nr = Boolean.parseBoolean("1");
//        System.out.println(nr);

        int nr_c = (int)(nrPoz);
        System.out.println(nr_c);

        BigInteger nr1 = new BigInteger("1");
        BigInteger sum = new BigInteger("0");

        for(int i = 0; i < 64; i++)
        {
            sum = sum.add(nr1);
            nr1 = nr1.multiply(BigInteger.valueOf(2));
        }

        System.out.println(sum);

        nr1 = BigInteger.valueOf(2);
        sum = BigInteger.valueOf(0);

        for(int i = 0; i < 64; i++)
        {
            sum = sum.add(nr1.pow(i));
        }
        System.out.println(sum);


        Scanner in = new Scanner(System.in);

        System.out.println("nume: ");
        String nume = in.nextLine();
        System.out.println(nume);

        System.out.println("intreg: ");
        int nr7 = in.nextInt();
        System.out.println(nr7);

        System.out.println("real: ");
        float nr8 = in.nextFloat();
        System.out.println(nr8);

        in.close();

    }
}
