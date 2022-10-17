import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location{
    
    int logitude;
    int latitude;
    public Location(int x, int y){
        this.logitude = x;
        this.latitude = y;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Location> city = new HashMap<String, Location>();

        System.out.println("도시, 경도, 위도를 입력하세요.");
        
        for(int i =0; i<4; i++){
            String str;
            String strarr[];
            System.out.print(">>");
            str = scanner.nextLine();
            strarr = str.split(", ");
            
            city.put(strarr[0],new Location(Integer.parseInt(strarr[1]), Integer.parseInt(strarr[2])));
        }
        System.out.println("----------------------");

        Set<String> keys = city.keySet();
        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            String name = it.next();
            Location  loca = city.get(name);
            System.out.println(name +" " + loca.logitude  + " " + loca.latitude);
        }
        System.out.println("----------------------");

        String tempstr;
        while(true){
            System.out.print("도시 이름 >> ");
            tempstr = scanner.nextLine();
            if(tempstr.equals("그만"))
                break;
            
            Location location = city.get(tempstr);
            if(location == null){
                System.out.println(tempstr + "는 없습니다.");
            }
            else{
                System.out.println(tempstr + " " +location.logitude + " " + location.latitude);
            }
        }
        scanner.close();
    }   
}
