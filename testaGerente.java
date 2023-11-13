package agencia;

public class testaGerente {
    public static void main(String[] args) {
       Gerente gerente = new Gerente();
       gerente.setNome("João Fernandes");
       gerente.autenticar(234);
        System.out.println(gerente.getNome());
        System.out.println(gerente.autenticar(234));
    }
}
