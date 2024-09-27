public class FizzFuzz {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            if ((i+1)%3 == 0 && (i+1)%5 == 0){
                System.out.println("fizzbuzz");
                continue;
            }else if ((i+1)%3 == 0){
                System.out.println("fizz");
                continue;
            } else if ((i+1)%5 == 0){
                System.out.println("buzz");
                continue;
            }
            System.out.println(i+1);
        }
    }
}