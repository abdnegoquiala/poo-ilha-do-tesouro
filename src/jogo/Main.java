
/* Module and purpose:
 * Main - ponto de entrada do jogo Ilha do Tesouro.
 *
 * Student name/number and implemented contributions:
 * Abdnego Quiala - 30015280:
 * implementacao inicial do ponto de entrada.
 *
 * Collaborator/reviewer and contribution:
 * Pedro Cubi - 30016324:
 * responsavel pela futura evolucao
 * da inicializacao da interface grafica.
 * Vasco Coelho - 30016314:
 * responsavel pela integracao futura
 * das regras do tabuleiro.
 *
 * AI assistance:
 * ChatGPT - apoio na implementacao
 * e explicacao do codigo; ver AI_USE.md.
 */


package jogo;

public class Main {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {
            JanelaJogo janela = new JanelaJogo();
            janela.setVisible(true);
        });

    }
}
