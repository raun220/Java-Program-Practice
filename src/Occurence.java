public class Occurence {
    public static void main(){
        String str = "Black cat";

        int count =1;
        for(int i=0; i<str.length();i++){
            for(int j=i+1; j<str.length(); i++){
                char curr = str.charAt(j);
                char prev = str.charAt(j-1);
                if(curr == prev){
                    
                }
            }
        }
    }

}
