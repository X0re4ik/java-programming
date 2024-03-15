package lr2;


interface IReplenish {
    public void replenish(float value);
}

interface ITakeOff {
    public void takeOff(float value);
}

class BankAccount implements ITakeOff, IReplenish {
    private String _owner;
    private float _deposit;
    
    public BankAccount(String owner, float deposit) {
        this._owner = owner;
        this._deposit = deposit;
    }

    String getOwner() {
        return this._owner;
    }
    
    public void replenish(float value) {
        this._deposit += value;
    }
    
    public void takeOff(float value) {
        this._deposit -= value;
    }
    
    
    public float getBalance() {
        return this._deposit;
    }
}


public class Example7
{
	public static void main(String[] args) {

        BankAccount bank = new BankAccount("Антон", 452_654);
        bank.replenish(10_834);
        bank.takeOff(323_343);
        System.out.println(bank.getBalance());
    }
}