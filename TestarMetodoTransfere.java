/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author Laboratório
 */
public class TestarMetodoTransfere {
    public static void main(String[] args) {
        Agencia a = new Agencia(1234);
        Conta origem = new Conta(a);
        origem.saldo = 1000;
        Conta destino = new Conta(a);
        destino.saldo = 1000;

        origem.transfere(destino, 500);

        // Imprimir saldos após a transferência
        System.out.println("Saldo da conta de origem: " + origem.saldo);
        System.out.println("Saldo da conta de destino: " + destino.saldo);
      
    }
}