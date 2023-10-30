import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner veiculo = new Scanner(System.in);

                // Criando os objetos de guincho
                Guincho guinchoCorrenteGancho = new Guincho("Caminhão de corrente e gancho", 2.00);
                Guincho guinchoReboqueIntegrado = new Guincho("Caminhão de reboque integrado", 10.00);
                Guincho guinchoPlataforma = new Guincho("Caminhão guincho de plataforma", 5.00);

                // Criando os objetos de veículo
                Veiculo carro = new Veiculo("Carro", "Novo");
                Veiculo miniVan = new Veiculo("MiniVan", "Quebrado");
                Veiculo onibus = new Veiculo("Ônibus", "Novo");
                Veiculo caminhao = new Veiculo("Caminhão", "Quebrado");

                // Simulação de orçamento de guincho
                double distanciaCC = 5.00; // C para C (e vice-versa): 5 km
                double distanciaAB = 8.00; // A para B (e vice-versa): 8 km
                double distanciaCA = 10.00; // C para A (e vice-versa): 10 km
                double distanciaCB = 15.00; // C para B (e vice-versa): 15 km

                double custoDeslocamentoCarro = guinchoCorrenteGancho.calcularCustoDeslocamento(distanciaCC);
                double custoDeslocamentoMiniVan = guinchoCorrenteGancho.calcularCustoDeslocamento(distanciaCC);
                double custoDeslocamentoOnibus = guinchoReboqueIntegrado.calcularCustoDeslocamento(distanciaCA);
                double custoDeslocamentoCaminhao = guinchoReboqueIntegrado.calcularCustoDeslocamento(distanciaCA);

                System.out.println("-------Orçamento Guincho------");
                System.out.println("Custo de deslocamento para o Carro: R$" + custoDeslocamentoCarro);
                System.out.println("Custo de deslocamento para a MiniVan: R$" + custoDeslocamentoMiniVan);
                System.out.println("Custo de deslocamento para o Ônibus: R$" + custoDeslocamentoOnibus);
                System.out.println("Custo de deslocamento para o Caminhão: R$" + custoDeslocamentoCaminhao);
                System.out.println("Qual veículo deseja deslocar?");
                String tipo = veiculo.nextLine();
                System.out.println("Qual o estado do veículo?");
                String estadoConservacao = veiculo.nextLine();
                System.out.println("Qual o tipo de guincho?");
                String tipoGuincho = veiculo.nextLine();

                double custoDeslocamento = 0.0;

                switch (tipoGuincho) {
                    case "Caminhão de corrente e gancho":
                        custoDeslocamento = guinchoCorrenteGancho.calcularCustoDeslocamento(distanciaCC);
                        break;
                    case "Caminhão de reboque integrado":
                        custoDeslocamento = guinchoReboqueIntegrado.calcularCustoDeslocamento(distanciaCA);
                        break;
                    case "Caminhão guincho de plataforma":
                        custoDeslocamento = guinchoPlataforma.calcularCustoDeslocamento(distanciaCB);
                        break;
                    default:
                        System.out.println("Tipo de guincho inválido!");
                        return;
                }

                System.out.println("Custo de deslocamento para o veículo " + tipo + " com estado " + estadoConservacao + ": R$" + custoDeslocamento);
            }
        }

