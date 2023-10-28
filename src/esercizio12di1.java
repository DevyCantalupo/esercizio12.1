public class esercizio12di1 {
    public static void stop(int a ){
        for(int i = 0; i <= a; i++){
            if(i == 5){
                System.out.println("Stop");
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        stop(10);
    }
}
