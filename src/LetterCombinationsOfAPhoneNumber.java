import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        letters("","12");
        System.out.println();
        System.out.println(letters1("","12"));
        int result = lettersCount("","12");
        System.out.println(result);
    }
    static void letters(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';//this will convert '2' into 2
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            letters(p+ch,up.substring(1));
        }
        
    }

    static ArrayList<String> letters1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list1= new ArrayList<>();
        int digit = up.charAt(0)-'0';//this will convert '2' into 2
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
             list1.addAll(letters1(p+ch,up.substring(1)));

        }
        return list1;
    }

    static int lettersCount(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0)-'0';//this will convert '2' into 2
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            count = count + lettersCount(p+ch,up.substring(1));
        }
        return count;
    }
}
