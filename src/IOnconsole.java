import java.io.Console;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-01
 */
public class IOnconsole {
    public static void main(String[] args) {
        Console console=System.console();
        if (console==null){
            throw  new IllegalStateException("Console is not used!!");
        }
        String str=null;
        while (true){
            str=console.readLine("Please Input: ");
            if("END".equals(str)) break;
            System.out.println(str);
        }
    }
}
