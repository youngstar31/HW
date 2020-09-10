public class Homework2 {

    public static double shopping(int price, double discountAmount){
        double discountedPrice = price * discountAmount;
        double finalPrice = price - discountedPrice;

        return finalPrice;

    }

    public static void main(String[] args) {
        System.out.println(shopping(220,.15));

    }



}






