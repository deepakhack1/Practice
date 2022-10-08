package DesignATM;

public enum TransactionType {

    CASH_WITHDRAWAL,
    BALANCE_CHECK,
    PRINT_STATEMENT;

    public static void showAllTransactionTypes(){

        for(TransactionType type: TransactionType.values()){
            System.out.println(type.name());
        }
    }
}
