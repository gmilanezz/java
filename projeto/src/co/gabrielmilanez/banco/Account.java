package co.gabrielmilanez.banco;

public class Account {

    private static final int MAX_length = 12;

    private String ag;
    private String cc;
    private String name;

    private double balance;

    private Log logger;

    public Account(String ag, String cc, String name){
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }

        public void setName(String name){
            if(name.length()> MAX_length){
                this.name = name.substring(0, MAX_length);
            } else{
                this.name = name;
            }

    }

        public void deposit(double value){
            balance += value;
            logger.out("depósito de: R$" + value + ". Sua conta agora é de R$ " + balance);
        }

        public boolean withDraw(double value){
            if (value > balance){
                return false;
            } else {
                balance -= value;
                logger.out("saque de: R$" + value + "Sua conta agora é de R$ " + balance);
                return true;
            }
        }

        public double getBalance(){
        return balance;
    }

        @Override
        public String toString(){
            String result = "A conta " + this.name + " " + this.ag + " / " + this.cc + "possui: R$" + balance;
            return result;
        }
}
