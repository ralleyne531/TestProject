import java.util.*;
public class TestClass {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        Random Randy = new Random();
        int One = (int)Math.round(Math.random() * 0 + 10);
        int Two = (int)Math.round(Math.random() * 0 + 10);
        System.out.println("Choose A Number To Add To The Sum Of Two Random Numbers Between One and Ten");
        int selection = Input.nextInt();
        int Next = Apple(selection);
        System.out.println(One+Two);
    }
    public static int Apple(int number){
        int Selection = number;
        return Selection;
    }
}
