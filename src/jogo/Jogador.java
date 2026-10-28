
/* Module and purpose: Jogador - representa um participante
 * e guarda a sua posição no tabuleiro.
 * Student name/number and implemented contributions:
 * (Abdnego Quiala - 30015280) - implementação da classe Jogador.
 * Collaborator/reviewer and contribution:
 * Ainda sem revisão de outro membro.
 * AI assistance: ChatGPT - apoio à implementação
 * e explicação do código; ver AI_USE.md.
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
