package As_51_atividades;

    import java.util.Scanner;
    public class Questao_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite algum número inteiro N:");
        int N = scanner.nextInt();

        int divisoesTotais = 0;
        System.out.println("Números primos entre 1 e " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
                divisoesTotais++;
            }
        }
        System.out.println("\nTotal de divisões executadas: " + divisoesTotais);

        scanner.close();
    }
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}