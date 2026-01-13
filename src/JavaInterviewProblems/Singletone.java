package JavaInterviewProblems;

// create a singletone class in java using Lazy initialization
public class Singletone {

    private static  Singletone instance;
    private Singletone(){}

    public static synchronized Singletone getInstance(){

        if(instance==null){
            instance=new Singletone();
        }
        return instance;
    }


}
