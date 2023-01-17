public class Aventureiro {
   private double danoRecebido;
   private double defesa;
   private double danoRealizado;
   private double bonusDano;

    public double getDanoRecebido() {
        return danoRecebido;
    }

    public void setDanoRecebido(double danoRecebido) {
        this.danoRecebido = danoRecebido;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getDanoRealizado() {
        return danoRealizado;
    }

    public void setDanoRealizado(double danoRealizado) {
        this.danoRealizado = danoRealizado;
    }

    public double getBonusDano() {
        return bonusDano;
    }

    public void setBonusDano(double bonusDano) {
        this.bonusDano = bonusDano;
    }

    public double calcularDanoRecebido(){
        return Batalha.calcularDanoRecebido(this.danoRecebido, this.bonusDano, this.defesa);
    }

    public double calcularDanoRealizado(){
        return Batalha.calcularDanoRealizado(this.danoRealizado, this.bonusDano);
    }
}
