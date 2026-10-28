
/* Module and purpose:
 * Jogo - gere jogadores, turnos,
 * movimentos e vitoria.
 *
 * Student name/number and implemented contributions:
 * Abdnego Quiala - 30015280:
 * implementacao inicial da classe Jogo,
 * movimentacao e controlo dos turnos.
 *
 * Collaborator/reviewer and contribution:
 * Vasco Coelho - 30016314:
 * responsavel pela futura integracao
 * das casas especiais e regras do tabuleiro.
 * Pedro Cubi - 30016324:
 * responsavel pela integracao do jogo
 * com a interface grafica.
 *
 * AI assistance:
 * ChatGPT - apoio na implementacao
 * e explicacao do codigo; ver AI_USE.md.
 */

package jogo;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private final List<Jogador> jogadores;
    private int turnoAtual;
    private boolean terminado;
    private String vencedor;

    public Jogo(String[] nomes) {

        if (nomes == null || nomes.length < 2 || nomes.length > 4) {
            throw new IllegalArgumentException(
                    "O jogo precisa de 2 a 4 jogadores.");
        }

        jogadores = new ArrayList<>();

        for (String nome : nomes) {
            jogadores.add(new Jogador(nome));
        }

        turnoAtual = 0;
        terminado = false;
        vencedor = "";
    }

    public List<Jogador> getJogadores() {
        return new ArrayList<>(jogadores);
    }

    public Jogador getJogadorAtual() {
        return jogadores.get(turnoAtual);
    }

    public boolean isTerminado() {
        return terminado;
    }

    public String getVencedor() {
        return vencedor;
    }

    public boolean jogar(int dado) {

        if (terminado || dado < 1 || dado > 6) {
            return false;
        }

        Jogador jogador = getJogadorAtual();

        int novaPosicao = jogador.getPosicao() + dado;

        if (novaPosicao <= 30) {
            jogador.moverPara(novaPosicao);
        }

        if (jogador.getPosicao() == 30) {
            terminado = true;
            vencedor = jogador.getNome();
            return true;
        }

        turnoAtual = (turnoAtual + 1) % jogadores.size();

        return true;
    }
}
