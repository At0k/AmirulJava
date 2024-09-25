public class StringBuilderOne {
    

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Word");
        sb.insert(5, ",");
        sb.delete(5, 6);
        sb.reverse();

        System.out.println(sb.toString());
    }
}
