public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício - Calculadora");
        Calculadora.somar(6, 8);
        Calculadora.subtrair(85, 42);
        Calculadora.multiplicar(12, 3.4d);
        Calculadora.dividir(20, 1.4d);

        //Mensagem
        System.out.println("Exercício - Mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(23);

        //Empréstimo
        System.out.println("Exercício - Empréstimo");
        Emprestimo.calcularValorFinal(5000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularValorFinal(1200, Emprestimo.getTresParcelas());
        Emprestimo.calcularValorFinal(2300, 4);

    }
}
