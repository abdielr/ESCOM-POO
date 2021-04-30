package Complejos;

public class Complejos {
        private double real, imag;

        public Complejos(double real, double imag) {
                this.real = real;
                this.imag = imag;
        }

        public Complejos suma(Complejos C1){
                Complejos aux = new Complejos(real + C1.real, imag + C1.imag);
                return aux;
        }
        public Complejos resta(Complejos C1){
                Complejos aux = new Complejos(real - C1.real, imag - C1.imag);
                return aux;
        }
        public Complejos multi(Complejos C1){
                Complejos aux = new Complejos(real * C1.real-imag * C1.imag, real * C1.imag-imag * C1.real);
                return aux;
        }
        public Complejos divi(Complejos C1){
                Complejos aux = new Complejos((real*C1.real + imag*C1.imag)/(Math.pow(C1.real, 2)+ Math.pow(C1.imag, 2)), (imag*C1.real - real*C1.imag)/(Math.pow(C1.real, 2) + Math.pow(C1.imag, 2)));
                return aux;
        }
        public double modulo (){
                double aux = Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
                return aux;
        }
        public void esIgual(Complejos C1){
                if(real == C1.real && imag == C1.imag){
                        System.out.println("Los dos numeros son Iguales");
                }
                else{
                        System.out.println("Los dos numeros no son Iguales");
                }
        }
        public void imprimir(){
                System.out.println("El resultado es: " + real + "+" + imag + "i" );
        }
        public void setReal(double real) {
                this.real = real;
        }
        public void setImaginario (double imag){
                this.imag = imag;
        }
        public double getReal(){
                return real;
        }
        public double getImaginario(){
                return imag;
        }
}


                
