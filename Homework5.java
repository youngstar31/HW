public class Homework5 {

    public static void evenNumbers() {

        int b = 11;
        while (b >= 0) {
            b--;
            if (b == 5)
            {
                break;
            }

            if (b % 2 == 0) {

                System.out.println(b);

            }


        }


    }

    public static void main(String[] args) {
        evenNumbers();

    }

}
