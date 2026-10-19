public class ConvertLettersToUppercase {

    public static String toUppercase(String str){
        StringBuilder uppercaseString = new StringBuilder();
        uppercaseString.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i+1 < str.length()){
                uppercaseString.append(' ');
                i++;
                uppercaseString.append(Character.toUpperCase(str.charAt(i)));
            }else {
                uppercaseString.append(str.charAt(i));
            }
        }
        return uppercaseString.toString();
    }

    static void main(String[] args) {
        String str = "hi, i am likhon lz";
        System.out.println(toUppercase(str));
    }
}
