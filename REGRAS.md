# Ilha do Tesouro — Regras do Jogo

**Unidade curricular:** Programação Orientada a Objectos  
**Universidade:** Universidade Autónoma de Lisboa  
**Ano letivo:** 2026/2027  
**Projeto:** Jogo de tabuleiro em Java Swing

## 1. Objetivo

Ilha do Tesouro é um jogo de tabuleiro em que 2 a 4 exploradores competem para chegar ao tesouro escondido na última casa de uma ilha.

O primeiro jogador a alcançar a casa 30 vence.

## 2. Tabuleiro

O percurso é composto por 30 casas numeradas de 1 a 30, com a posição inicial 0.

O tabuleiro é apresentado numa grelha de 5 linhas e 6 colunas.

Existem três tipos principais de casas:

- **Normais:** o jogador permanece na posição alcançada.
- **Avanço:** transportam o jogador para uma posição mais adiantada.
- **Recuo:** transportam o jogador para uma posição anterior.

A casa 30 representa o tesouro e a vitória.

## 3. Mapa das casas especiais

| Casa | Efeito | Destino |
|---|---|---|
| 4 | Avanço | 8 |
| 10 | Recuo | 6 |
| 12 | Avanço | 16 |
| 19 | Recuo | 14 |
| 21 | Avanço | 25 |
| 27 | Recuo | 23 |

Todas as restantes casas entre 1 e 29 são normais.

## 4. Jogadores

O jogo permite de 2 a 4 participantes.

Cada jogador possui um nome e uma posição própria.

Todos começam na posição 0.

Os jogadores podem ocupar a mesma casa, sem expulsar ou movimentar os outros participantes.

## 5. Turnos e dado

Os jogadores realizam jogadas pela ordem em que foram registados.

Em cada turno, o jogador lança um dado com um valor entre 1 e 6.

Na versão completa, o jogo disponibilizará dois modos:

- **Manual:** o utilizador introduz o valor do dado.
- **Aleatório:** o programa gera um valor entre 1 e 6.

Os dois modos utilizarão as mesmas regras de movimento.

Uma entrada inválida será rejeitada sem alterar a posição dos jogadores ou a ordem dos turnos.

## 6. Movimentação

O valor do dado é somado à posição atual.

Se o movimento ultrapassar a casa 30, o jogador permanece onde estava, mas o turno é consumido.

Se terminar numa casa especial, o efeito dessa casa é aplicado.

Os efeitos não são aplicados em cadeia: apenas a primeira casa especial alcançada pela jogada ativa o seu efeito.

## 7. Vitória e fim do jogo

O primeiro jogador a chegar exatamente à casa 30 vence.

Para impedir jogos intermináveis, a versão final terá um limite de 100 turnos no total.

Se ninguém chegar à casa 30 até esse limite, vence o jogador que estiver mais avançado. Se vários jogadores partilharem a posição mais alta, o resultado será um empate entre esses jogadores.

Após o fim da partida, não serão aceites novas jogadas. O utilizador poderá reiniciar ou sair.

## 8. Estado da implementação de outubro

O protótipo de outubro contém:

- Janela gráfica em Java Swing.
- Tabuleiro com 30 casas.
- Três jogadores de demonstração.
- Movimentação através de dado aleatório.
- Alternância de turnos.
- Rejeição de valores de dado fora do intervalo 1–6 na lógica do jogo.
- Regra de ultrapassagem da casa 30.
- Deteção de vitória ao chegar à casa 30.

**Funcionalidades planeadas para novembro e dezembro:**

- Configuração de 2 a 4 jogadores na interface.
- Introdução manual do dado.
- Efeitos das casas especiais.
- Limite de turnos e empate.
- Botões de reinício e saída.
- Testes automáticos completos.
- Melhorias visuais e imagem artística final.

Este documento descreve as regras propostas para o jogo completo e distingue-as das funcionalidades já implementadas no protótipo inicial.