public class App {
    public static void main(String[] args) throws Exception {
        int valor1 = 18;
        int valor2 = 20;
        char operacao = '+';

        switch (operacao) {
            case '+':
                System.out.println("Soma" + (valor1 + valor2));
                break;
            case '-':
                System.out.println("Subtração" + (valor1 - valor2));
                break;
            case '*':
                System.out.println("Multiplicação" + (valor1 * valor2));
                break;
            case '/':
                 System.out.println("Divisão" + (valor1 / valor2));
                break;
            default:
                 System.out.println(" Operação inválida. ");
                 break;
        }
        
    }
}
