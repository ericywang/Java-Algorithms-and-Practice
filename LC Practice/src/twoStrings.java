public class Main
{
	public static void main(String[] args) {
	    int p = 2;
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("byeeee", "world"));
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
