package Laborator5;

public class J extends I
{
    protected String j;

    public J(String val, X x)
    {
        super(val, x);
        j = "J: " + val;
    }

    public void displayState()
    {
        System.out.println("Current state: " + j);
        System.out.println("Current state: " + x.getX());
        super.displayState();
    }
}
