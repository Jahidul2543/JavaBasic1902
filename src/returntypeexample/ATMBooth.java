package returntypeexample;

public class ATMBooth {

    public void readAtmCard(String card){
        System.out.println("Read ATM Card" + card);
    }

    public void checkYourBalance(){

    }

    public int moneyWithdrawal(String yourATMCard){

        ATMBooth obj = new ATMBooth();

        readAtmCard(yourATMCard);
        obj.checkYourBalance();

        int transactionAmount = 200;

        return transactionAmount;

    }

    public static void main(String[] args) {

        ATMBooth obj = new ATMBooth();

       int amount =  obj.moneyWithdrawal("Midul T");
       System.out.println(amount);

    }
}
