import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();//输入N
            Map<Integer,Integer> map=new HashMap<>();
            while(a>0){
                int b=in.nextInt();
                if(map.containsKey(b)){
                    map.put(b,map.get(b)+1);
                }else{
                    map.put(b,1);
                }
                a--;
            }
            int c=in.nextInt();
            if(map.containsKey(c)){
                System.out.println(map.get(c));
            }else{
                System.out.println("0");
            }
        }
    }
}