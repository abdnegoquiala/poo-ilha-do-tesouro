
/* Module and purpose: Main - ponto de entrada do jogo.
 * Student name/number and implemented contributions:
 * (Abdnego Quiala - 30015280) - implementação inicial.
 * Collaborator/reviewer and contribution:
 * Nenhuma revisão registada nesta versão.
 * AI assistance: ChatGPT - explicação e exemplo inicial;
 * ver AI_USE.md.
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
