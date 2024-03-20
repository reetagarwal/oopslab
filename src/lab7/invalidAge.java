package lab7;

//wap in java to create a user defined exception - invalid age exception with the following conditon.
//I. if a person's age is less than 18, then throw invalid age exception with a message: you aren't eligible
// to vote,otherwise if a person's age is greater than 18 then display you are eligible to vote.

class invalidAge extends Exception{
    invalidAge(String s){
        super(s);
    }
}
class AgeError{
    static void validate(int age)throws invalidAge {
        if(age<18)
            throw new invalidAge("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String[] args){
        try{
            validate(13);
        }catch(Exception m){
            System.out.println("Exception occured: "+m);
        }
    }
}
