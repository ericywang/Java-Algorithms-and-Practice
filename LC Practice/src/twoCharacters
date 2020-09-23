public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println(leftRotation(10, "beabeefeab"));
	    System.out.println(leftRotation(6, "aaaaaa"));
	    
    }
    
    public static int leftRotation(int length, String s) {
        int[][] numMatrix = new int[26][26];
        char[][] charMatrix = new char[26][26];
        int max = 0;

        for(int i = 0; i < length; i++){
            for(int j = 0; j < 26; j++){
                if(charMatrix[s.charAt(i) - 'a'][j] == s.charAt(i)){
                    numMatrix[s.charAt(i) - 'a'][j] = -1;
                }
                else{
                    charMatrix[s.charAt(i) - 'a'][j] = s.charAt(i);
                    if(numMatrix[s.charAt(i) - 'a'][j] == -1) continue;
                    else{
                        numMatrix[s.charAt(i) - 'a'][j]++;
                    }
                }

                if(charMatrix[j][s.charAt(i) - 'a'] == s.charAt(i)){
                    numMatrix[j][s.charAt(i) - 'a'] = -1;
                }
                else{
                    charMatrix[j][s.charAt(i) - 'a'] = s.charAt(i);
                    if(numMatrix[j][s.charAt(i) - 'a'] == -1) continue;
                    else{
                        numMatrix[j][s.charAt(i) - 'a']++;
                    }
                }
            }
        }

        for(int x = 0; x < 26; x++){
            for(int y = 0; y < 26; y++){
                max = Math.max(numMatrix[x][y], max);
            }
        }
        return max;  
	}
}
