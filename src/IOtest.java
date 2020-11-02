import java.util.Scanner;

/**
 * @author 重新做人idea基础学习
 * @date 2020-11-01
 */
public class IOtest {
    public static void main(String[] args) {
        //基本是scanner 加 system in  输出是sout
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        //nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
        //
        //next（）会自动消去有效字符前的空格，只返回输入的字符，不能得到带空格的字符串。
        //
        //（简单点说，next我只要字，nextLine我啥都要）
        String b=scanner.next();
        String c=scanner.nextLine();
        System.out.println(a+b+c);
        //result://1 432432423             4324234234324324
                //1432432423             4324234234324324
    }
}
