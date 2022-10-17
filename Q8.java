import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("** 포인트 관리 프로그램입니다. **");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> stu = new HashMap<String, Integer>();
        String inpstr;
        String inpArr[];

        while(true){
            System.out.print("이름과 포인트 입력>> ");
            inpstr = scanner.nextLine();
            if(inpstr.equals("그만"))   break;
            inpArr = inpstr.split(" ");
            
            Set<String> keys = stu.keySet();
            

            if(stu.get(inpArr[0]) == null)
                stu.put(inpArr[0],Integer.parseInt(inpArr[1]));
            else
                stu.put(inpArr[0], stu.get(inpArr[0])+ Integer.parseInt(inpArr[1]));
            
            Iterator<String> it = keys.iterator();
            while(it.hasNext()){
                String tempName = it.next();
                int tempScore = stu.get(tempName);
                System.out.print("(" + tempName + "," + tempScore +")");
            }
            System.out.println();
        }
        scanner.close();
    }
}
