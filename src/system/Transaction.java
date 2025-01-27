package system;

public class Transaction {
    //Fields
    //***********************

    int transactionID;
    int date;
    int amount;
    String sender;
    String reciever;

    // Constructor
    //***********************

    public Transaction(int transactionID, int date, int amount, String sender, String reciever) {
        this.transactionID = transactionID;
        this.date = date;
        this.amount = amount;
        this.sender = sender;
        this.reciever = reciever;
    }

    // Methods
    //***********************

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", date=" + date +
                ", amount=" + amount +
                ", sender='" + sender +
        ", reciever='" + reciever  +
        '}';
    }
}
