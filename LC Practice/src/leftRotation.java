public class Main
{
	public static void main(int d, String[] args) {
	    
	    leftRotation(args, d);
	    
    }
    
    public static void leftRotation(int [] n, int d) {
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
            System.out.println(x);
	}
}
