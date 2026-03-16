package Immutability;

public final class ImmutableMoney {

    private final int amount;
    private final String currency;

    public ImmutableMoney(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }

    public ImmutableMoney addMoney (int money){
        return new ImmutableMoney(money+amount,"INR");
    }


    public ImmutableMoney subMoney(int money){
        return new ImmutableMoney(amount-money,"INR");

    }

    public String toString(){
        return currency+" "+ amount;
    }
}
