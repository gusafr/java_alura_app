public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        boolean acompanhado = true;
        System.out.println(acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infezlimente não pode entrar");
        }

    }
}
