public class Compra {
    private String description;
    private  double valor;

    public Compra(String description, double valor) {
        this.description = description;
        this.valor = valor;
    }

    public String getDescription() {
        return description;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra:" +
                "description:'" + description + '\'' +
                ", valor:" + valor +
                '}';
    }
}
