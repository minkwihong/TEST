public class TestMain {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 0 ; i <= 100;i++){
            sum += i ;
            if(i % 10 == 0 && i > 0) System.out.println(i - 9 + " ~ "+ i + " = " + sum);
        }

    }
}
