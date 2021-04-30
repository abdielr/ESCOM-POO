package Banco;

public class Banco {
        private float saldo;

        public Banco (float saldo) {
                this.saldo = saldo;
        }
        public void Deposito(float depos) {
                this.saldo = this.saldo + depos;
                System.out.println("Nuevo saldo es: "+ saldo);
        }
        public void Consulta() {
                System.out.println("Su saldo es: "+ saldo);
        }
        public void Retiro(float ret){
                if(saldo-ret < 0){
                        System.out.println("No puedes sacar tanto dinedo, solo tienes:  "+ saldo);
                }
                else{
                        saldo = saldo-ret;
                        System.out.println("Gracias por retirar, ahora tiene de saldo:  "+ saldo);
                }
        }
        
}


                
