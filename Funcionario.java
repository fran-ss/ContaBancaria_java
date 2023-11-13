package agencia;

public class Funcionario {
    protected String nome ;
    protected String CPF ;
    protected String RG ;
    protected double salario;
    

    public double getBonificacao(){
        return this.salario * 0.10;
    }
    void setNome (String nome){
        this.nome = nome;

    }
    void setsalario(){
        this.salario = salario;
    }
     String getNome(){
        return this.nome;
        
    }    
}
