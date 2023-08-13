import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonitoramentoLogsAWS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> eventosPorServico = new HashMap<>();
        String maiorServico = null;
        String menorServico = null;

        // Solicita ao usuário a quantidade de logs a serem inseridos
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a entrada de int

        // Loop para processar cada log
        for (int i = 0; i < quantidadeLogs; i++) {
            String linhaLog = scanner.nextLine();
            String[] partes = linhaLog.split(",");

            // Verifica se o log tem pelo menos 3 partes (data, serviço, mensagem)
            if (partes.length >= 3) {
                String servico = partes[1];
                int eventosServico = eventosPorServico.getOrDefault(servico, 0) + 1;
                eventosPorServico.put(servico, eventosServico);
                // Atualiza o maior serviço com base na contagem de eventos

                if (maiorServico == null || eventosServico > eventosPorServico.get(maiorServico)) {
                    maiorServico = servico;
                }

                // Atualiza o menor serviço com base na contagem de eventos
                if (menorServico == null || eventosServico < eventosPorServico.get(menorServico)) {
                    menorServico = servico;
                }
            }
        }

        // Imprime a contagem de eventos por serviço
        System.out.println("Eventos por servico:");

        for (Map.Entry<String, Integer> entry : eventosPorServico.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // Imprime o maior e o menor serviço
        System.out.println("Maior:" + maiorServico);
        System.out.println("Menor:" + menorServico);
        scanner.close();
    }
}
