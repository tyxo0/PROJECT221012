import java.util.Scanner;
import java.util.Vector;


public class Q12 {
    public static void main(String[] args) {
        Vector<Word> v = new Vector<Word>();
        Scanner scanner = new Scanner(System.in);
        int inp;
        v.add(new Word("painting", "그림"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("society", "사회"));
        v.add(new Word("human", "인간"));
        v.add(new Word("doll", "인형"));
        v.add(new Word("deal", "거래"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("error", "오류"));
        v.add(new Word("clear", "성공"));
        v.add(new Word("milk", "우유"));
        
        while(true){
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>>");
            inp = scanner.nextInt();
            if(inp ==3) break;

            if(inp ==1){
                System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
                System.out.println("현재 " +v.size() +"개의 단어가 들어있습니다.");
                
                while(true){
                
                    int intArr[] = new int[4];
                    for(int i =0; i<4; i++){
                        intArr[i] = (int)(Math.random()*(v.size()));
                        for(int j =0; j<i; j++){
                            if(intArr[j] == intArr[i] && i!=0){
                                i-= 1;
                                break;
                            }
                        }
                    }
        
                    int rnd =(int)(Math.random()*4);
                    System.out.println(v.elementAt(intArr[rnd]).eng + "?");
                    
                                    
                    for(int i =0; i<4; i++){
                        System.out.print("(" + (i+1) + ") " + v.elementAt(intArr[i]).kor + " ");    
                    }
        
                    System.out.print(":>");
                    inp = scanner.nextInt();
                    if(inp == -1)   break;
        
                    if(inp-1 == rnd )
                        System.out.println("Excellent !!");
                    else
                        System.out.println("No. !!");
                }
            }
            else if(inp ==2){
                System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                scanner.nextLine();
                while(true){
                    
                    System.out.print("영어 한글입력 >> ");
                    String str= scanner.nextLine();
                    
                    if(str.equals("그만")) break;
                    String strArr[] = str.split(" ");
                    v.add(new Word(strArr[0], strArr[1]));
                    
                }
            }
        }
            
        System.out.println("\"명품영어\"를 종료합니다...");
        scanner.close();
    }
}
