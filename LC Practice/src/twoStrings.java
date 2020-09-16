public class Main
{
	public static void main(int p, String[] args) {
	    
	    for(int x = 0; x < p*2; x+=2){
	        System.out.println(twoStrings(args[x], args[x+1]));
	    }
    }
    
    public static String twoStrings(String s1, String s2) {
        int[] arraySet = new int[26];
        for(char c: s1.toCharArray()){
            arraySet[c - 'a']++;
        }
        
        for(char c: s2.toCharArray()){
            if(arraySet[c - 'a'] > 0) return "YES";
        }

        return "NO";
	}
}
