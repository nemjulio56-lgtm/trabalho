public class Questao {
    private String enunciado;
    private String[] alternativas;
    private char respostaCorreta;

    public Questao(String enunciado, String[] alternativas, char respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = Character.toUpperCase(respostaCorreta);
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }

    public void exibirQuestao() {
        System.out.println("\n" + enunciado);
        for (String alternativa : alternativas) {
            System.out.println(alternativa);
        }
        System.out.print("Sua resposta (A, B, C ou D): ");
    }
}
