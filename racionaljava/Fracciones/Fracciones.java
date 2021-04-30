package Fracciones;

public class Fracciones {
        private int num, den;

        public Fracciones suma(Fracciones F1){
                if(F1.num == 0){
                        Fracciones aux = new Fracciones(num, den);
                        return aux;
                }
                else if(num == 0){
                        Fracciones aux = new Fracciones(F1.num, F1.den);
                        return aux;
                }
                else{
                        Fracciones aux = new Fracciones(num*F1.den + den*F1.num, F1.den*den);
                        return aux;
                }
                
        }
        public Fracciones resta(Fracciones F1){
                if(F1.num == 0){
                        Fracciones aux = new Fracciones(num, den);
                        return aux;
                }
                else if(num == 0){
                        Fracciones aux = new Fracciones(-1*F1.num, F1.den);
                        return aux;
                }
                else{
                        Fracciones aux = new Fracciones(num*F1.den - den*F1.num, F1.den*den);
                        return aux;
                }
                
        }
        public Fracciones(int num, int den) {
                this.num = num;
                this.den = den;
        }

        public void setNumerador(int num) {
                this.num = num;
        }
        public void setDenominador (int den){
                this.den = den;
        }
        public int getNumerador(){
                return num;
        }
        public int getDenominador(){
                return den;
        }
}


                
