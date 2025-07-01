public class SkipACharacter {
    public static void main(String[] args) {
        System.out.println(skip("baccdah"));

    }
    static void skip(String p,String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = un.charAt(0);
        if(ch == 'a'){
            skip(p,un.substring(1));
        }else{
            skip(p+ch,un.substring(1));
        }

    }

    static String skip(String un){
        if(un.isEmpty()){
            return "";
        }
        char ch = un.charAt(0);
        if(ch == 'a'){
             return skip(un.substring(1));
        }else{
            return ch + skip(un.substring(1));
        }

    }
}
