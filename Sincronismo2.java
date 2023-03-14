public class Sincronismo2 {
    static double saldo = 1000;
    static final double vrsaque = 300;
    public static void main(String[] args){
        System.out.println("Saldo Inicial R$: "+saldo);
        Saques[] saque = new Saques[5];
        for(int i=0; i<5; i++){
            saque[i] = new Saques(String.valueOf(i+1));
            saque[i].start();
        }
        try {
            for (int i=0; i<5; i++){
                saque[i].join();
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Saldo final: " +saldo);
        }
    }
    class Saques extends Thread{
        String nome2;
        public Saques(String nome){
            super(nome);
            nome2 = nome;
        }
        public void run() {
            EfetuaSaque(nome2);
        }
        private static synchronized void EfetuaSaque(String nome2){
            if(Sincronismo2.vrsaque <= Sincronismo2.saldo){
                try{
                    sleep(5);
                }
                catch (InterruptedException iex){
                    iex.printStackTrace();
                    return;
                }
            }
            Sincronismo2.saldo = Sincronismo2.saldo - Sincronismo2.vrsaque;
            System.out.println("Saque N.: "+nome2+ "Saldo Atualizado: " +Sincronismo2.saldo);
        }
    }
}
