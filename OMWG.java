import java.util.Scanner;
 
class tp {
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            
            int n = in.nextInt();
            int m =in.nextInt();
            
            System.out.println(2 * n * m - n - m);
        }
        
    }
    
} 
