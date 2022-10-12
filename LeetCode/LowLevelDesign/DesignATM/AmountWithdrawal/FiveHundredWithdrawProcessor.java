package DesignATM.AmountWithdrawal;


import DesignATM.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor{

    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor){
        super(nextCashWithdrawProcessor);

    }

    public void withdraw(ATM atm, int remainingAmount){



        int required =  remainingAmount/500;   //5
        int balance = remainingAmount%500;     //300

        if(required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(required);
        }
        else if(required > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
            balance = balance + (required-atm.getNoOfFiveHundredNotes()) * 500; //2800
        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }
    }
}
