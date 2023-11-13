/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author Laboratório
 */
public class Conta {
    double saldo;
    /*Agencia agencia;*/
    double limite;

   /*  public Conta(Agencia agencia) {
        this.agencia = agencia;
    }
    */

    /*void transfere(Conta destino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência inválido.");
            return;
        }

        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
            return;
        }

        this.saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferência de " + valor + " realizada com sucesso para a conta da agência " + destino.agencia.getNumero());
    }
    void deposita (double valor){
        this.saldo += valor; 
    }*/

    public void saca (double valor ){
        if(valor>this.saldo){
            throw new IllegalArgumentException("Saldo Indisponível!");
        }else{
            this.saldo = this.saldo - valor;
        }
    }
    
    public void deposita(double valor){
    if (valor <0){
     throw new IllegalArgumentException("Tente colocar um valor positivo!");
    }else{
            this.saldo = this.saldo + valor;
        
    }
    }
}


