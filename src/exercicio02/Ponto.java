package exercicio02;

public class Ponto {
    public double x;
    public double y;

    public double calcularDist(Ponto p){
        double d = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return d;
    }

    public double calcularDistAteOrigem(){
        double distancia;
        Ponto origem = new Ponto();
        distancia = calcularDist(origem);
        return distancia;
    }
    public String formatarPonto(){
        return "("+ x + "," + y + ")";
    }

    public static Ponto maisProximoDaOrigem(Ponto p1, Ponto p2){
        double dist1 = p1.calcularDistAteOrigem();
        double dist2 = p2.calcularDistAteOrigem();
        if(dist1 < dist2){
            return p1;
        } else{
            return p2;
        }

    }



}
