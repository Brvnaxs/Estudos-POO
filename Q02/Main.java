package Q02;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso01 = new Ingresso(5.50f);
        IngressoVip ingressoVip01 = new IngressoVip(5.50f, 2.50f);
        System.out.println("O valor do ingresso comum é: "+ingresso01.getValor());
        System.out.println("O valor do ingresso vip é: "+ingressoVip01.ImprimeValorTotal());
        System.out.println("A diferença de valor é: "+ingressoVip01.getValorAdicional());
    }
}
