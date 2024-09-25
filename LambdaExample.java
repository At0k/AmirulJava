import java.util.function.Predicate;

public class LambdaExample {
    
        public static void main(String[] args){
            Predicate<Integer> isGreatThanThen = (num) -> num > 10;
            int number = 15;
            int newNum = 9;

            if (isGreatThanThen.test(number)){
                System.out.println(number + "is greater than 10");
            }else{
                System.out.println(number +"is less than 10");
            }
            if (isGreatThanThen.test(newNum)){
                System.err.println(newNum + "is greater than 10");
            }else{
                System.err.println(newNum + "is less than 10");
            }
        }

}
