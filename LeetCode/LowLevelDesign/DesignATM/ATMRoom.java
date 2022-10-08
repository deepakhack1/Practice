package DesignATM;

import java.util.Scanner;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String args[]) {

        int pin;
        int operation;
        int cashWithdrawl;


        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
        System.out.println("enter pin value");
        Scanner sc = new Scanner(System.in);
        pin = sc.nextInt();
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card,pin);
        System.out.println("1. CASH WITHDRWAL \n2. BALANCE_CHECK \n3.PRINT_STATEMENT");
        operation = sc.nextInt();
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.card, operation);
        System.out.println("kitne paise nikalna chahta hai");
        cashWithdrawl = sc.nextInt();
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, cashWithdrawl);
        atmRoom.atm.printCurrentATMStatus();


    }

    private void initialize() {

        //create ATM
        atm = ATM.getATMObject();
        atm.setAtmBalance(3500, 1,2,5);

        //create User
        this.user = createUser();
    }

    private User createUser(){

        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){

        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {

        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.balance = 3000;

        return bankAccount;

    }

}
