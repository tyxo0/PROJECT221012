import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> arrayList = new ArrayList<Character>();
        char ch;
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i =0; i<6; i++){
            ch = scanner.next().charAt(0);
            arrayList.add(ch);
        }
        int sum= 0;
        for(int i=0; i<6; i++){
            switch(arrayList.get(i)){
                case 'A':
                    sum+=4;
                    break;
                case 'B':
                    sum+=3;
                    break;
                case 'C':
                    sum+=2;
                    break;
                case 'D':
                    sum+=1;
                    break;
                case 'F':
                    sum+=0;
                    break;
            }
                
        }
        System.out.println(sum/(double)6);
        scanner.close();
    }
}
