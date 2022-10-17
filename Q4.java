import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<Integer> v = new Vector<>();
        int tempint;
        
        
        while(true){
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            tempint = scanner.nextInt();
            if(tempint == 0) break;
            v.add(tempint);
            Iterator <Integer> it = v.iterator();    
            int sum=0;
            
            while(it.hasNext()){
                int n = it.next();
                System.out.print(n +" ");
                sum +=n;
            }
                
            System.out.println('\n' + "현재 평균 " + sum/ v.size());
        }
        scanner.close();
    }
}
