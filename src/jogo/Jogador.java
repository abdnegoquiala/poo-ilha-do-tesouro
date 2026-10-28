
/* Module and purpose:
 * Jogador - representa um participante
 * e guarda a sua posicao no tabuleiro.
 *
 * Student name/number and implemented contributions:
 * Abdnego Quiala - 30015280:
 * implementacao inicial da classe Jogador.
 *
 * Collaborator/reviewer and contribution:
 * Vasco Coelho - 30016314:
 * colaboracao prevista na integracao das regras.
 * Pedro Cubi - 30016324:
 * colaboracao prevista na integracao com a interface.
 *
 * AI assistance:
 * ChatGPT - apoio na implementacao e explicacao
 * do codigo; ver AI_USE.md.
 */

package jogo;

public class Jogador {

    private String nome;
    private int posicao;

    public Jogador(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        this.nome = nome.trim();
        this.posicao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public boolean moverPara(int novaPosicao) {

        if (novaPosicao < 0 || novaPosicao > 30) {
            return false;
        }

        this.posicao = novaPosicao;
        return true;
    }
}
