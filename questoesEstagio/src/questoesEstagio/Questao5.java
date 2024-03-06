package questoesEstagio;
import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma string para inverter: ");
        String original = scanner.nextLine();
        String invertida = inverterString(original);
        System.out.println("String invertida: " + invertida);
        
        
    }

  
    public static String inverterString(String original) {
        char[] caracteres = original.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            
            inicio++;
            fim--;
        }
        
        String invertida = new String(caracteres);
        return invertida;
    }
}
