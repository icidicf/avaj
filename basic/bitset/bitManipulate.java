import java.util.*;

class bitCollection{
    int setBit(int num, int i) {
        return num | (1 << i);
    }
}
public class bitManipulate
{
    public static void main(String args[])
    {
        bitCollection bc = new bitCollection();
        int n = 0;
        int i = 4;
        System.out.println("set bit 4 of 0 is " + bc.setBit(n,i));
        
    }
}
