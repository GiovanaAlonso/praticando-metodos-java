public class Mensagem {

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Bom dia!");
            case 13, 14, 15, 16, 17 -> System.out.println("Boa tarde!");
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> System.out.println("Boa noite!");
            default -> System.out.println("Horário inválido");
        }

    }
}
