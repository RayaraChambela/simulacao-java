public class SimulacaoCaixaSupermercado {
    private int numeroCaixas;
    private int numeroClientes;
    private double mediaTempoAtendimentoPorCliente;
    private double desvioPadraoTempoAtendimentoPorCliente;

    private static final double TEMPO_MINIMO_ATENDIMENTO = 0.1;

    private final java.util.Random rng = new java.util.Random(42); //final = não pode ser apontada para um novo objeto

    public void setNumeroCaixas(int n) { this.numeroCaixas = n; }
    public void setNumeroClientes(int n) { this.numeroClientes = n; }
    public void setMediaTempoAtendimentoPorCliente(double mu) {
        this.mediaTempoAtendimentoPorCliente = mu;
    }
    public void setDesvioPadraoTempoAtendimentoPorCliente(double sigma) {
        this.desvioPadraoTempoAtendimentoPorCliente = sigma;
    }

    private double tempoAtendimentoNormalTruncado() {
        double z = rng.nextGaussian();
        double s = mediaTempoAtendimentoPorCliente + desvioPadraoTempoAtendimentoPorCliente * z;

        return (s < TEMPO_MINIMO_ATENDIMENTO) ? TEMPO_MINIMO_ATENDIMENTO : s;
    }

    public double simular() {
    double soma = 0.0;
    for (int i = 0; i < numeroClientes; i++) {
    soma += tempoAtendimentoNormalTruncado();
    }
    double mediaUmCaixa = soma /numeroClientes;
    return mediaUmCaixa / Math.max(1, numeroCaixas);
    }

}
