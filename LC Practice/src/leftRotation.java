public class Main
{
	public static void main(String[] args) {
	    
	    leftRotation(5, 4);
	    leftRotation(10, 1);
	    leftRotation(12, 0);
    }
    
    public static void leftRotation(int arraySize, int d) {
        int[] n = new int[arraySize];
        for(int num = 0; num < arraySize; num++){
            n[num] = num+1;
        }
        for(int x = 0; x < d/2; x++){
            int temp = n[x];
            n[x] = n[d- 1 -x];
            n[d- 1 -x] = temp;
        }
        for(int x = d; x < n.length /2; x++){
            int temp = n[x];
            n[x] = n[n.length - 1 -x];
            n[n.length - 1 -x] = temp;
        }
        for(int x = 0; x < n.length /2; x++){
            int temp = n[x];
            n[x] = n[n.length - 1 -x];
            n[n.length - 1 -x] = temp;
        }
        for(int x: n)
            System.out.print(x+ " ");
        System.out.println();
	}
}
