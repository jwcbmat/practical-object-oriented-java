public class StockCalculator {
    public static void main(String[] args) {
        double Java8Book = 59.90;
        double TDDBook = 59.90;

        double soma = Java8Book + TDDBook;

        int count = 0;

//       while(count < 35) {
//           double bookValue = 59.90;
//           soma = soma + bookValue;
//           count = count + 1;
//       }

        for (int i = 0; i < 35; i++) {
            soma += 59.90;
        }

        System.out.println("O total em estoque é " + soma);

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom!");
        }
    }
}