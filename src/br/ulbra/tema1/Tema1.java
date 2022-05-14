package br.ulbra.tema1;

/**
 *
 * @author Priscila Butzke
 */
public class Tema1 {

    public Tema1() {
    }

    double n1, n2, n3;
    double a, b, c,s;
    double delta, x1, x2;
    double k, xi, xii, yi, yii;

    public double ma(double n1, double n2, double n3) {
        double res = ((n1 + n2 + n3) / 3);

        return res;
    }

    public double mp(double n1, double n2, double n3) {
        double res = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

        return res;
    }

    public double mh() {
        double res = 2 / (1 / n1 + 1 / n2);
        return res;
    }

    public double s(double a, double b, double c) {
        double res = ((a + b + c) / 2);
        return res;
    }

    public double a() {
        double a1 = (s * (s - a) * (s - b) * (s - c));
        double res = (Math.sqrt(a1));
        return res;
    }

    public double ep() {
        
        double res = k*Math.pow(xi, 2) / 2;
        
        return res;
    }
    

    public String calcularB() {
        double delta = b * b -4 * a * c;
       
            if (delta < 0) {
               return ("Delta não tem raiz");
            }else if(a == 0){
                return ("Não é possivel dividir por zero");
            } else 
                x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
                 return ("x1= " + x1 + "\n x2= "+ x2);
            
    }
    
    public double d(){
        
        double res = Math.sqrt(Math.pow(xii - xi,2) + Math.pow(yii - yi,2));
        return res;
    }
}
