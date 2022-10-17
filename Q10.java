import java.util.Scanner;
import java.util.Vector;

class Shape { // 슈퍼 클래스
    public Shape next; 
    public Shape() {
         next = null; 
    }
    public void draw() { 
        System.out.println("Shape");
    } 
}
class Line extends Shape { 
    public void draw() { // 메소드 오버라이딩 
        System.out.println("Line");
    } 
} 

class Rect extends Shape { 
    public void draw() { // 메소드 오버라이딩 
        System.out.println("Rect");
    } 
}
class Circle extends Shape { public void draw() { // 메소드 오버라이딩
    System.out.println("Circle");
    }
}
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp;
        Vector<Shape> vec = new Vector<Shape>();
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            inp = scanner.nextInt();
            if(inp == 4) break;
            switch(inp){
                case 1:
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                inp = scanner.nextInt();
                switch(inp){
                    case 1:
                        vec.add(new Line());
                        break;
                    case 2:
                        vec.add(new Rect());
                        break;
                    case 3:
                        vec.add(new Circle());
                        break;
                }
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    inp = scanner.nextInt();
                    if(inp >vec.size())
                        System.out.println("삭제할 도형이 없습니다.");
                    else{
                        vec.remove(inp-1);
                    }
                    break;
                case 3:
                    for(int i=0; i< vec.size(); i++){
                        vec.elementAt(i).draw();
                    }
                        
                    break;
            }
        }    
        System.out.println("beauty을 종료합니다.");
        scanner.close();
    }
    
}
