//Thread usando prioridade
public class QuatroThreads {
    public static void main(String[] args){
        Classe1 T1 = new Classe1();
        T1.setPriority(1);
        Classe2 T2 = new Classe2();
        T2.setPriority(5);
        Classe3 T3 = new Classe3();
        T3.setPriority(8);
        Classe4 T4 = new Classe4();
        T4.setPriority(10);

        T4.start();
        T3.start();
        T2.start();
        T1.start();
    }
}
class Classe1 extends Thread {
    public void run(){
        System.out.println("Classe 1");
    }
}
class Classe2 extends Thread {
    public void run(){
        System.out.println("Classe 2");
    }
}
class Classe3 extends Thread {
    public void run(){
        System.out.println("Classe 3");
    }
}
class Classe4 extends Thread {
    public void run(){
        System.out.println("Classe 4");
    }
}
