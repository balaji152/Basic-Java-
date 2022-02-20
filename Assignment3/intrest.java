public class intrest {
    public static void main(String[] args) {
        double  P = 1000; // P =Principal amount

        double  r = 10;   //  r  =Annual interest rate

        double  n = 2;  //  n =Term of loan, in years

        double t = 1; //   t=Number of years interest is applied

        double Si = ( P * r * n) / 100; // si = simple intrest

        double Ci = P * (Math.pow((1 + r/100), (t * n))) - P;




        System.out.println("Principal: " + P);
        System.out.println("Interest Rate: " + r);
        System.out.println("Time Duration: " + n);
        System.out.println("Simple Interest: " + Si);
        System.out.println("Compound Interest: "+ Ci);
    }
}
    