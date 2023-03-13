package br.edu.hendrick.minhathread;

public class Teste {
    public static void main(String[] args) {

        JavaThread thread = new JavaThread("Thread #1", 900);
        JavaThread thread2 = new JavaThread("Thread #2", 600);
        JavaThread thread3 = new JavaThread("Thread #3", 300);

    }

}
