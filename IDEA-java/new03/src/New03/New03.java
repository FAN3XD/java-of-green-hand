package New03;

public class New03 {

    int price = 70;
    int balance;
    int total;

    void showPrompt()
    {
        System.out.println("welcome");
    }

    void insertMoney(int amount)
    {
        balance = balance +amount;
    }

    void showBalance()
    {
        System.out.println(balance);
    }
    void  getFood()
    {
        if (balance>=price)
        {
            System.out.println("here you are");
            balance = balance - price;
            total = total + price;
        }
    }
    public static void main(String[] args) {
        New03 N3 = new New03();


        N3.showPrompt();
        N3.showBalance();
        N3.insertMoney(100);
        N3.getFood();
        N3.showBalance();

    }
}
