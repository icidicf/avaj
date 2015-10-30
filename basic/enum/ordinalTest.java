import java.util.*;

enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {return ordinal() +1;}
}

public class ordinalTest {
    public static void main(String[] args) {
        Ensemble one =  Ensemble.SOLO;
        System.out.println("num is " + one.numberOfMusicians());
        }
    }
