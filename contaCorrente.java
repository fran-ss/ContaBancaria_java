import agencia.Conta;

public class contaCorrente extends Conta{
     
    @Override
    public void saca(double valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo Indisponível!");
        } else {
            this.saldo = this.saldo - valor;
        }
    }

    /**
     *
     * @param valor
     */
    @Override
    public void deposita(double valor){
    if (valor <0){
     throw new IllegalArgumentException("Tente colocar um valor positivo!");
    }else{
            this.saldo = this.saldo + valor;
        
    }
    }

    
}
