
package br.conta;

/**
 *
 * @author Carlos
 */
public class Conta {
    private float saldo;


public void pegarSaldo(){
        this.getSaldo();
}

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

public void depositar(){
  
}

public void retirar(){
    
}

public void atualizaSaldo(){
    System.out.println("Saldo: " + this.saldo);
        
    
}

    

}