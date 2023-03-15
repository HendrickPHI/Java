public class Tarefas {
    public static void main(String[] args){
        Tarefas1 T1 = new Tarefas1("Tarefas1");
        T1.setPriority(10);
        Tarefas2 T2 = new Tarefas2("Tarefas2");
        T2.setPriority(1);
        Tarefas3 T3 = new Tarefas3("Tarefas3");
        T3.setPriority(4);

        T1.start();
        T2.start();
        T3.start();
    }
}
class Tarefas1 extends Thread{
    public Tarefas1(String nome){
        super(nome);
    }
    public void run(){
        System.out.println("-- ");
        System.out.println("** ");
        System.out.print("Fluxo do programa \"1\" ");
        System.out.println( );
        String A = getName();
        System.out.println("Nome da Thread = " +A);
        int b = getPriority();
        System.out.println("Uma Thread de Prioridade "+b);
        for(int i=0; i<=10; i++){
            System.out.println("-" +i);
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
class Tarefas2 extends Thread {
    public Tarefas2(String nome){
        super(nome);
    }
    public void run(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Fluxo do Progama \"2\" ");
        System.out.println(" ");
        String A = getName();
        System.out.println("Nome da Thread = "+A);
        int b = getPriority();
        System.out.println("Uma Thread de prioridade "+b);
        for(int i=10; i>=0; i--){
            System.out.println("-" +i);
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
class Tarefas3 extends Thread {
    public Tarefas3(String nome){
        super(nome);
    }
}
