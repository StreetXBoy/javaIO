import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-01
 */

//打什么输出什么

public class IOstream {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while (true){
            str=br.readLine();
            if(str.equals("END")) break;
            System.out.println(str);
        }

    }
}
