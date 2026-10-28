
/* Module and purpose:
 * JanelaJogo - apresenta a interface grafica
 * do jogo Ilha do Tesouro.
 *
 * Student name/number and implemented contributions:
 * Abdnego Quiala - 30015280:
 * implementacao do prototipo inicial da janela.
 *
 * Collaborator/reviewer and contribution:
 * Pedro Cubi - 30016324:
 * responsavel pela evolucao da interface grafica,
 * botoes e testes de interacao.
 * Vasco Coelho - 30016314:
 * responsavel pela futura integracao visual
 * das regras e casas especiais.
 *
 * AI assistance:
 * ChatGPT - apoio na implementacao inicial
 * e explicacao de Java Swing; ver AI_USE.md.
 */



package jogo;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class JanelaJogo extends JFrame {

    private final Jogo jogo;
    private final JPanel tabuleiro;
    private final JLabel mensagem;
    private final Random random;

    public JanelaJogo() {

        jogo = new Jogo(new String[]{
                "Ana", "Bruno", "Carlos"
        });

        random = new Random();

        setTitle("Ilha do Tesouro");
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel(
                "ILHA DO TESOURO",
                SwingConstants.CENTER
        );

        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        add(titulo, BorderLayout.NORTH);

        tabuleiro = new JPanel(
                new GridLayout(5, 6, 5, 5)
        );

        add(tabuleiro, BorderLayout.CENTER);

        JPanel painelInferior = new JPanel(
                new GridLayout(2, 1, 5, 5)
        );

        mensagem = new JLabel(
                "Turno: " + jogo.getJogadorAtual().getNome(),
                SwingConstants.CENTER
        );

        JButton botaoDado = new JButton("Lançar dado");

        botaoDado.addActionListener(e -> {

            String nome = jogo.getJogadorAtual().getNome();

            int dado = random.nextInt(6) + 1;

            jogo.jogar(dado);

            if (jogo.isTerminado()) {

                mensagem.setText(
                        nome + " lançou " + dado
                                + " e venceu!"
                );

                botaoDado.setEnabled(false);

            } else {

                mensagem.setText(
                        nome + " lançou " + dado
                                + " | Próximo: "
                                + jogo.getJogadorAtual().getNome()
                );
            }

            atualizarTabuleiro();
        });

        painelInferior.add(mensagem);
        painelInferior.add(botaoDado);

        add(painelInferior, BorderLayout.SOUTH);

        atualizarTabuleiro();
    }

    private void atualizarTabuleiro() {

        tabuleiro.removeAll();

        for (int casa = 1; casa <= 30; casa++) {

            String texto = "<html><center>" + casa;

            if (casa == 30) {
                texto += "<br>TESOURO";
            }

            for (Jogador jogador : jogo.getJogadores()) {

                if (jogador.getPosicao() == casa) {
                    texto += "<br>" + jogador.getNome();
                }
            }

            texto += "</center></html>";

            JLabel celula = new JLabel(
                    texto,
                    SwingConstants.CENTER
            );

            celula.setOpaque(true);

            if (casa == 30) {
                celula.setBackground(
                        new Color(255, 220, 120)
                );
            } else {
                celula.setBackground(
                        new Color(225, 240, 225)
                );
            }

            celula.setBorder(
                    BorderFactory.createLineBorder(
                            Color.GRAY)
            );

            tabuleiro.add(celula);
        }

        tabuleiro.revalidate();
        tabuleiro.repaint();
    }
}
