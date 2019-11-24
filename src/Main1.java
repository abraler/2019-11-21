
import java.util.*;

public class Main1{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String a=in.nextLine();
            String []b=a.split(" ");
            Queue<Integer> queue=new LinkedList<>();//保存数组的队列

            Stack<Integer>m=new Stack<>();
            Stack<Integer>o=new Stack<>();//保存需要交换的数据段

            Stack<Integer>oo=new Stack<>();//保存经过几次交换的的数据

            Queue<Integer> Rqueue=new LinkedList<>();//保存每一次完成交换的数据

            for (int i = 0; i <b.length ; i++) {
               queue.add(Integer.valueOf(b[i]));
            }//将String变为int，并保存在queue中
            int g=queue.poll();//出queue队列的第一个，判断循环几次
            for (int i = 0; i <g ; i++) {//循环
                int p= 2*queue.poll();//判断后面几个需要排序
                int f=queue.poll();//判断需要几次交换
                for (int j = 0; j <f ; j++) {
                    int l = p;
                    while (l > p / 2) {
                        if (j == 0) {
                            m.push(queue.poll());
                            l--;
                        } else {
                            m.push(oo.pop());
                            l--;
                        }
                    }
                    while (l > 0) {
                        if (j == 0) {
                            o.push(queue.poll());
                            l--;
                        } else {
                            o.push(oo.pop());
                            l--;
                        }
                    }
                    while (!m.empty()) {
                        oo.push(o.pop());
                        oo.push(m.pop());
                    }
                    while (!oo.empty() && j == f - 1) {
                        System.out.print(oo.pop());
                        if(oo.size()!=0){
                            System.out.print(" ");
                        }

                    }
                    if(oo.empty()){
                        System.out.println();
                    }
                }


            }
        }

    }
}