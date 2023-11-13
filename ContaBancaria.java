public class ContaBancaria {
     public static void main(String[] args) {
        Conta c = new Conta(); 
        c.limite = 50.0;
        c.saldo = 200.0;
        try{
            c.saca(300.0);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
        Conta a = new Conta(); 
        a.limite = 50.0;
        a.saldo = 200.0;
        try{
            a.deposita(-300.0);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}

    
