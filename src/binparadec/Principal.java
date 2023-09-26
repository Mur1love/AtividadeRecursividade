package binparadec;

public class Principal {

    public static void main(String[] args) {
        
        String bin = "0100";

        int dec = binParaDec(bin);

        System.out.println("O número decimal é: " + dec);


    }

    private static int binParaDec(String bin) {
        return binParaDecRecursivo(bin, bin.length() - 1);
    }

    private static int binParaDecRecursivo(String bin, int i) {
        if (i < 0) {
            return 0;
        }
        
        char bitAtual = bin.charAt(i);

        if(bitAtual == '0' || bitAtual == '1') {
            int bitValor = bitAtual - '0';
            int potencia = bin.length() - 1 - i;
            int decValor = bitValor * (int) Math.pow(2, potencia);

            return decValor + binParaDecRecursivo(bin, i - 1);
        } else {
            throw new IllegalArgumentException("Não é um numero binario");
        }
        

    }

    
    
    
}
