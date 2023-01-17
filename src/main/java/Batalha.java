public class Batalha {

    public static String formulaDanoRecebido = "dano * bonus - defesa";
    public static String formulaDanoCausado = "dano * 2 * bonus";

    public static double calcularDanoRecebido(double dano, double bonus, double defesa){
        String expressao;
        expressao = formulaDanoRecebido.replace("dano", Double.toString(dano));
        expressao = expressao.replace("bonus", Double.toString(bonus));
        expressao = expressao.replace("defesa", Double.toString(defesa));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

    public static double calcularDanoRealizado(double dano, double bonus){
        String expressao;
        expressao = formulaDanoCausado.replace("dano", Double.toString(dano));
        expressao = expressao.replace("bonus", Double.toString(bonus));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
