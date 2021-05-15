public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    /**
     * Constructor
     * @param newCardholder A reference to a Person object.
     * @param limit A reference to a Money object.
     */

    public CreditCard(Person newCardholder,Money limit){
        owner = newCardholder;
        balance = new Money(0);
        creditLimit = new Money(limit);
    }

    /**
     * The getBalance method
     * @return A Money object containing the balance
     */
    public Money getBalance(){
        return new Money(balance);
    }

    /**
     * The getCreditLimit method
     * @return A Money object containing the credit limit
     */
    public Money getCreditLimit(){ return new Money(creditLimit);}

    /**
     * The getPersonals method
     * @return A String containing the information about the owners
     */
    public String getPersonals(){return owner.toString();}

    /**
     * The charge method
     * @param amount A reference to a Money object containing the charge amount.
     */
    public void charge(Money amount){
        Money temp = new Money(balance.add(amount));

        if (temp.compareTo(creditLimit)>0)
            System.out.println("Exceeds credit limit");
        else
        {
            balance = temp;
            System.out.println("Charge: " + amount);
        }
    }

    public void payment(Money amount)
    {
        balance = balance.subtract(amount);
        System.out.println("Payment: " +amount);
    }
}
