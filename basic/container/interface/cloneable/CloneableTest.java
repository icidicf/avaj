public class CloneableTest {
 
    public static void main(String[] args) {
        Person p = new Person("Sam");
        Person pClone = p.clone(); // Can you do this, if clone method in Person class is not public
        System.out.println(pClone.getName());
    }
}
