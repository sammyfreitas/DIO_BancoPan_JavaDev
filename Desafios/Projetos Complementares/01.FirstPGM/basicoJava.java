public class basicoJava {
    public static void main(String[] args){
        byte idade = 30;
        short ano = 2021;
        int cep = 21515488;
        long cpf = 15887999886L;
        final float PI = 3.14F;
        double salario = 2589.45;
        String nomeCompleto = "Anthony Freitas";
        boolean sexoMasculino = true;

        int a = 12;
        int b = 11;

        if (a > b) {
            System.out.println("A é maior que B");
        } else {
            System.out.println("B é maior que A");
        }

        String nome1 = "ANTHONY";
        String nome2 = "SAMUEL";

        System.out.println(nome1.equals(nome2));
    }
}