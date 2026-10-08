//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("       SISTEMA DE QUIZ - FUTEBOL MUNDIAL            ");
        System.out.println("====================================================");
        System.out.println("Júlio cesar da cruz almeida");
        System.out.println("Brenno pimenta");
        System.out.println("UNIFAN");
        System.out.println("CURSO: Engenharia de Software " +
                "");
        System.out.println("====================================================\n");

        System.out.println("Pressione ENTER para iniciar o Quiz...");
        scanner.nextLine();

        List<Questao> listaQuestoes = new ArrayList<>();

        listaQuestoes.add(new Questao("1) Qual país venceu a Copa do Mundo de 2022?",
                new String[]{"A) Brasil", "B) França", "C) Argentina", "D) Alemanha"}, 'C'));

        listaQuestoes.add(new Questao("2) Quem é o maior artilheiro da história das Copas do Mundo?",
                new String[]{"A) Pelé", "B) Miroslav Klose", "C) Ronaldo Fenômeno", "D) Lionel Messi"}, 'B'));

        listaQuestoes.add(new Questao("3) Qual clube europeu possui mais títulos da UEFA Champions League?",
                new String[]{"A) Barcelona", "B) Milan", "C) Liverpool", "D) Real Madrid"}, 'D'));

        listaQuestoes.add(new Questao("4) Em qual ano o Brasil conquistou o seu primeiro título da Copa do Mundo?",
                new String[]{"A) 1958", "B) 1962", "C) 1970", "D) 1950"}, 'A'));

        listaQuestoes.add(new Questao("5) Qual jogador é conhecido pelo apelido de 'Bruxo'?",
                new String[]{"A) Neymar Jr", "B) Ronaldinho Gaúcho", "C) Rivaldo", "D) Kaká"}, 'B'));

        listaQuestoes.add(new Questao("6) Qual destes times brasileiros NUNCA foi rebaixado para a Série B (até 2025)?",
                new String[]{"A) São Paulo", "B) Palmeiras", "C) Vasco da Gama", "D) Internacional"}, 'A'));

        listaQuestoes.add(new Questao("7) Quem foi o vencedor da Bola de Ouro (Ballon d'Or) de 2023?",
                new String[]{"A) Erling Haaland", "B) Kylian Mbappé", "C) Cristiano Ronaldo", "D) Lionel Messi"}, 'D'));

        listaQuestoes.add(new Questao("8) Qual país sediou a Copa do Mundo de 2010?",
                new String[]{"A) Alemanha", "B) África do Sul", "C) Japão e Coreia", "D) Brasil"}, 'B'));

        listaQuestoes.add(new Questao("9) Qual estádio é conhecido como o 'Templo do Futebol' no Brasil?",
                new String[]{"A) Mineirão", "B) Morumbi", "C) Maracanã", "D) Allianz Parque"}, 'C'));

        listaQuestoes.add(new Questao("10) Quem é o maior artilheiro da história da Seleção Brasileira (pelas contas da FIFA)?",
                new String[]{"A) Pelé", "B) Neymar", "C) Romário", "D) Zico"}, 'B'));

        listaQuestoes.add(new Questao("11) Quantas substituições normais são permitidas por time em uma partida oficial atualmente?",
                new String[]{"A) 3", "B) 4", "C) 5", "D) 6"}, 'C'));

        listaQuestoes.add(new Questao("12) Qual time inglês é conhecido pela alcunha de 'Os Diabos Vermelhos'?",
                new String[]{"A) Liverpool", "B) Arsenal", "C) Chelsea", "D) Manchester United"}, 'D'));

        listaQuestoes.add(new Questao("13) Qual jogador marcou o famoso gol de mão conhecido como 'La Mano de Dios'?",
                new String[]{"A) Diego Maradona", "B) Lionel Messi", "C) Pelé", "D) Cristiano Ronaldo"}, 'A'));

        listaQuestoes.add(new Questao("14) Qual é a periodicidade da realização da Copa do Mundo de futebol masculino?",
                new String[]{"A) De 2 em 2 anos", "B) De 3 em 3 anos", "C) De 4 em 4 anos", "D) De 5 em 5 anos"}, 'C'));

        listaQuestoes.add(new Questao("15) Qual clube brasileiro é conhecido como o 'Imortal'?",
                new String[]{"A) Internacional", "B) Grêmio", "C) Atlético Mineiro", "D) Fluminense"}, 'B'));

        int totalAcertos = 0;
        int totalQuestoes = listaQuestoes.size();

        for (Questao q : listaQuestoes) {
            q.exibirQuestao();
            char respostaUsuario = scanner.next().trim().toUpperCase().charAt(0);

            while (respostaUsuario != 'A' && respostaUsuario != 'B' && respostaUsuario != 'C' && respostaUsuario != 'D') {
                System.out.print("Opção inválida! Digite apenas A, B, C ou D: ");
                respostaUsuario = scanner.next().trim().toUpperCase().charAt(0);
            }

            if (respostaUsuario == q.getRespostaCorreta()) {
                System.out.println("-> Resposta CORRETA! ⚽");
                totalAcertos++;
            } else {
                System.out.println("-> Resposta INCORRETA! ❌ A alternativa certa era: " + q.getRespostaCorreta());
            }
        }

        double porcentagemAcertos = ((double) totalAcertos / totalQuestoes) * 100;

        System.out.println("\n====================================================");
        System.out.println("                FIM DO QUIZ!                        ");
        System.out.println("====================================================");
        System.out.println("Quantidade de acertos: " + totalAcertos + " de " + totalQuestoes);
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", porcentagemAcertos) + "%");
        System.out.println("====================================================");
        System.out.println("Muito obrigado por participar do nosso Quiz de Futebol!");
        System.out.println("Bons estudos em Algoritmos e Linguagem de Programação II!");
        System.out.println("====================================================");

        scanner.close();
    }
}