package file;

import sun.util.BuddhistCalendar;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-27
 */
public class FileIo {
    public static void main(String[] args) throws IOException {
        File file =new File("a.txt");
        file.createNewFile();
        FileOutputStream out = new FileOutputStream(file);
        for (int i = 0; i <20 ; i++) {
            String str="XXX  "+i+"\n";
            out.write(str.getBytes());
        }
        out.close();




        StringBuilder sb = new StringBuilder();
        String s;
        BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
        while ((s=br.readLine())!=null){
            sb.append(s+"\n");
        }
        br.close();
        System.out.println(sb.toString());


    }
}
