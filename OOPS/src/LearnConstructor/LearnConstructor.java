package LearnConstructor;

public class LearnConstructor {

    //Let's create the constructor
    LearnConstructor(){

    }

     LearnConstructor LearnConstructor(){
        return new LearnConstructor();
    }
}
