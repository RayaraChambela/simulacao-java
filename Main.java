import java.util.ArrayList;
import java.util.List;

public class Main {

    private static double media(List<Double> xs) {
        double s = 0.0;
        for (double x : xs) s += x;
        return s / xs.size();
    }
    private static double desvioPadrao(List<Double> xs, double m) {
        double s2 = 0.0;
        for (double x : xs) {
            double d = x - m;
            s2 += d * d;
        }
        return Math.sqrt(s2 / (xs.size() - 1));
    }

    private static void rodarCenario(double mu, double sigma, int N, int numSim, int caixas, String rotulo) {
        SimulacaoCaixaSupermercado sim = new SimulacaoCaixaSupermercado();
        sim.setMediaTempoAtendimentoPorCliente(mu);
        sim.setDesvioPadraoTempoAtendimentoPorCliente(sigma);
        sim.setNumeroClientes(N);
        sim.setNumeroCaixas(caixas);

        List<Double> medias = new ArrayList<>();
        for (int i = 0; i < numSim; i++) {
            medias.add(sim.simular());
        }
        double m = media(medias);
        double dp = desvioPadrao(medias, m);
        System.out.printf("%s | caixas=%d | µ=%.2f sigma=%.2f | N=%d | rodadas=%d%n", rotulo, caixas, mu, sigma, N, numSim);
        System.out.printf("   Média: %.3f min | Desvio-padrão das médias: %.3f min%n%n", m, dp);
    }

    public static void main(String... args) {
        final double MU = 5.0;
        final int N = 100;
        final int RODADAS = 1000;

    
        rodarCenario(MU, 0.5, N, RODADAS, 1, "1.");

        rodarCenario(MU, 0.5, N, RODADAS, 1, "2.a)");
        rodarCenario(MU, 0.5, N, RODADAS, 2, "2.b)");
        rodarCenario(MU, 0.5, N, RODADAS, 3, "2.c)");
        rodarCenario(MU, 0.5, N, RODADAS, 10, "2.d)");

        rodarCenario(MU, 0.25, N, RODADAS, 1, "3.a)");
        rodarCenario(MU, 1.00, N, RODADAS, 1, "3.b)");
        rodarCenario(MU, 2.00, N, RODADAS, 1, "3.c)");

    }
}