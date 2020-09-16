package Clock01;

public class Clock01 {
    private int value = 0;
    private int limit = 0;

    public Clock01(int limit){
        this.limit = limit;
    }

    public void increase(){
        value++;
        if(value == limit)
        {
            value = 0;
        }
    }

    public int getValue(){
        return  value;
    }

    public static void main(String[] args) {
        Clock01 hour= new Clock01(24);

        while (true)
        {
            hour.increase();
            System.out.println(hour.getValue());
        }

    }
}
