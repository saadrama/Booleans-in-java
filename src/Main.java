public class Main {
    public static void main(String[] args) {
        System.out.println("BOOLEANS");
        // A boolean type is declared with the boolean keyword aand can only take the values true or false.
        boolean isJavaFun=true;
        boolean isFisTasty=false;
        System.out.println(isJavaFun);
        System.out.println(isFisTasty);

        //boolean expression
        // a booleann expression returns a boolean value: true or false
        int a=7;
        int b=9;
        System.out.println(a > b);
        int c=10;
        System.out.println(c == 10);
        System.out.println(10 == 16);
        int myAge=15;
        int votingAge=18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote");
        } else{
            System.out.println("Not old enough to vote");
        }
    }
}