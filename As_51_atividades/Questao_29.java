package As_51_atividades;

public class Questao_29 {
    public static void main(String[] args) {

        double[] tabela = new double[50];

        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = (i + 1) * 1.99; 
        }
        System.out.println("Tabela de Preços:");
        for (int i = 0; i < tabela.length; i++) {
            System.out.println((i + 1) + " item(s) - R$" + tabela[i]);
        }
    }
}
