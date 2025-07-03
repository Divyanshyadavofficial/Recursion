public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        letters("","12");
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
}
