package br.edu.hendrick.minhathread;

public class JavaThread extends Thread {

    private String nome;
    private int tempo;

    JavaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {

        try {

            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " Contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " Terminou a execução");
    }
}
