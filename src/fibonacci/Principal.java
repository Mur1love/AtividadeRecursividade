package fibonacci;

public class Principal {

    public static void main(String[] args) {

        int nFibonacci = pegarNumeroFibonacci(10);

        System.out.println(nFibonacci);
        
    }

    private static int pegarNumeroFibonacci(int n) {
        if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            return pegarNumeroFibonacci(n - 1) + pegarNumeroFibonacci(n - 2);
        }


    }
    
}
