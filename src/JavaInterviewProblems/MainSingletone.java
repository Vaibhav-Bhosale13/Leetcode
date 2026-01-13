package JavaInterviewProblems;

public class MainSingletone {
    public static void main(String[] args) {

        Singletone singletone= Singletone.getInstance();
        System.out.println(singletone);

        Singletone singletone1= Singletone.getInstance();

        System.out.println(singletone1);
    }
}
