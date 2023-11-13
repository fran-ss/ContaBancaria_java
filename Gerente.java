package agencia;

public class Gerente extends Funcionario {
    private int senha = 123;
    private int numerodoFuncionarioGerenciados;

    public boolean autenticar(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido");
            return true;
        } else {
            System.out.println("Acesso Negado");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return this.salario * 0.15;
    }

    int getSenha() {
        return this.senha;

    }

}