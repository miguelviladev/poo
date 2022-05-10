package aula08.exec1;

public class Exec1 {

    // Criação da agência de aluguer de veículos
    private static EmpresaAluguer empresa = new EmpresaAluguer("Transportes Manolo", "4100-077", "geral@manolo.pt");
    // Criar veículos da frota da agência
    private static PesadoMercadorias pesado1 = new PesadoMercadorias("1111A", "Fiat", "Palio", 150, 1, 2.0f, 10.0f);
    private static PesadoPassageiros pesado2 = new PesadoPassageiros("44444", "Volvo", "PS-C", 150, 1, 2.0f, 50);
    private static Motociclo motociclo1 = new Motociclo("12345", "Yamaha", "Fazer", 150, "desportivo");
    private static Motociclo motociclo2 = new Motociclo("54321", "Delim", "Southern", 120, "estrada");
    private static LigeiroPassageiros ligeiro1 = new LigeiroPassageiros("12345", "Mercedes", "NS", 150, 1, 7.0f);
    private static Taxi ligeiro2 = new Taxi("12345", "Mercedes", "NS", 150, 1, 123442);

    public static void main(String[] args) {
        // Adicionar veículos à frota da agência
        empresa.addVeiculo(pesado1);
        empresa.addVeiculo(pesado2);
        empresa.addVeiculo(motociclo1);
        empresa.addVeiculo(motociclo2);
        empresa.addVeiculo(ligeiro1);
        empresa.addVeiculo(ligeiro2);
        // Ver quilometragens
        printQuilometragens();
        // Fazer trajetos
        pesado1.trajeto(500);
        pesado1.trajeto(100);
        pesado1.trajeto(100);
        pesado1.trajeto(1000);
        pesado1.trajeto(100);
        pesado1.trajeto(1000);
        pesado1.trajeto(10000);
        pesado1.trajeto(10000);
        pesado1.trajeto(100);
        pesado2.trajeto(1000);
        motociclo1.trajeto(500);
        motociclo2.trajeto(1000);
        ligeiro1.trajeto(15000);
        ligeiro2.trajeto(1000);
        // Ver quilometragens
        printQuilometragens();
        // Veiculo com mais quilometros percorridos
        printVeiculoMaisPercorrido();
    }

    public static void printQuilometragens() {
        System.out.println("============================================");
        for (Veiculo veiculo : empresa.getFrota()) {
            System.out.println("Quilometragem de " + veiculo.getMatricula() + ": "+ veiculo.distanciaTotal());
        }
    }

    public static void printVeiculoMaisPercorrido() {
        System.out.println("============================================");
        int maior_distancia = 0;
        Veiculo veiculo_mais_percorrido = null;
        for (Veiculo veiculo : empresa.getFrota()) {
            if (veiculo.distanciaTotal() > maior_distancia) {
                maior_distancia = veiculo.distanciaTotal();
                veiculo_mais_percorrido = veiculo;
            }
        }
        System.out.println("O veículo com mais quilometros percorridos é: " + veiculo_mais_percorrido.getMatricula());
    }
}