
# Ilha do Tesouro — Relatório de Outubro

**Unidade curricular:** Programação Orientada a Objectos  
**Universidade:** Universidade Autónoma de Lisboa  
**Ano letivo:** 2026/2027  
**Data:** 29 de outubro de 2026

## Equipa

- Abdnego Quiala — 30015280
- Vasco Coelho — 30016314
- Pedro Cubi — 30016324

## 1. Objetivo

Desenvolver um jogo de tabuleiro em Java, para
2 a 4 jogadores, aplicando os conceitos de
programação orientada a objetos estudados.

## 2. Estado atual

Foi desenvolvido um protótipo com:

- Classes Jogador, Jogo, JanelaJogo e Main.
- Tabuleiro gráfico com 30 casas.
- Três jogadores de demonstração.
- Lançamento aleatório de dado.
- Movimentação e alternância de turnos.
- Validação básica dos movimentos.
- Deteção da vitória ao chegar à casa 30.

As regras estão descritas em REGRAS.md e o
diagrama de classes encontra-se em UML.md.

## 3. Testes realizados

O protótipo foi executado no IntelliJ IDEA.

Foram verificados manualmente:
- A abertura da janela.
- O funcionamento do botão do dado.
- A atualização das posições dos jogadores.
- A alternância dos turnos.
- A rejeição de um valor inválido do dado.

Estes testes são preliminares e ainda
não constituem testes automatizados.

## 4. Distribuição de responsabilidades

Abdnego Quiala:
modelo dos jogadores, movimentação,
turnos e validação.

Vasco Coelho:
regras do tabuleiro, casas especiais
e respetivos testes.

Pedro Cubi:
interface gráfica, interação
e apresentação do jogo.

A implementação inicial do protótipo
foi realizada por Abdnego. A distribuição
acima define as áreas de responsabilidade
para a continuação do projeto.

## 5. Trabalho seguinte

- Implementar avanço e recuo nas casas especiais.
- Permitir escolher os jogadores.
- Implementar lançamento manual do dado.
- Completar as condições de fim de jogo.
- Melhorar a interface gráfica.
- Desenvolver testes adicionais.

## 6. Reflexões individuais

Abdnego Quiala:
Nesta primeira fase, consegui compreender melhor o funcionamento das classes, objetos e métodos em Java. A maior dificuldade foi organizar a lógica do jogo e integrá-la com a interface gráfica. O desenvolvimento do protótipo ajudou-me a consolidar os conhecimentos adquiridos nas aulas.

Vasco Coelho:
Esta primeira etapa permitiu-me compreender melhor a importância de definir as regras e organizar o funcionamento de um jogo antes de implementar todas as funcionalidades. Nas próximas fases, pretendo aprofundar a aplicação destes conceitos na implementação das casas especiais e do tabuleiro.

Pedro Cubi:
Nesta fase inicial, percebi melhor a importância de separar a lógica do jogo da interface gráfica. A utilização de Java Swing representa um desafio interessante e, nas próximas etapas, pretendo aprofundar os meus conhecimentos para melhorar a interação com os jogadores.

## 7. Repositório

https://github.com/abdnegoquiala/poo-ilha-do-tesouro

Versão da entrega:
checkpoint-outubro-2026

## 8. Utilização de IA

Foi utilizado o ChatGPT como apoio à
aprendizagem, implementação e documentação.

O registo encontra-se em AI_USE.md.
