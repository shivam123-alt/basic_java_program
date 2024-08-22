public class str_palendrome {
    public static void main(String[] args) {
        int i;
        String str1="";
        char ch;
        String str="mom";
        int len=str.length();
        for(i=len-1;i>=0;i--){
            ch=str.charAt(i);
            str1 +=ch;
        }
        if(str.equals(str1)){
            System.out.println("palendrome");
        }
        else{
            System.out.println("Not palendrome.");
        }
    }
}
