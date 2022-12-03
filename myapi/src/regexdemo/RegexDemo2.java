package regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        String regexName = "\\w{4,16}";

        String regexId1 = "[1-9]\\d{16}(\\d|X|x)";


        String regexId2 = "[1-9]\\d{5}(18|19|20|21)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])\\d{3}[\\dx]";
        System.out.println("530103199612070317".matches(regexId2));
    }
}
