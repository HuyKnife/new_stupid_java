/**************************************************
*	Classname 16050311
*
*	Version information stupid_code ver 2.0
*
*	Date 16-Oct-2018
*
*	Copyright notice
*
*	Modification Logs:
*	DATE	16-Oct-2018
*	
*	AUTHOR	HuyKnife
*	
*	DESCRIPTION Change code to match the convention
*	
***************************************************/

package stupid;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

public class x 
{
    public static void main(String[] arg) 
    {
        int CC = hohoho(arg);
        System.exit(CC);
    }

    public static int hohoho(String uuu[]) 
    {
        try {
            if (uuu.length != 2)
                return -1;
            String ddd = new String(Files.readAllBytes(Paths.get(uuu[1])));                                         //declare ddd
            String bbb = new String(Files.readAllBytes(Paths.get(uuu[0])));                                         //declare bbb
            int kkk = bbb.length();
            if (kkk < 4)
                return -2;
            int RRR = 0;                                                                                            //declare RRR
            float eee = 0;                                                                                          //declare eee
            //loop statement
            for (int aaa = 0; aaa < kkk - 3; aaa++) {
                for (int qqq = 0; qqq < ddd.length() - 4; qqq += 1) {
                    int vOv = 0;
                    for (int CC = 0; CC < 4; CC++) {
                        if (bbb.charAt(aaa + CC) == ddd.charAt(qqq + CC))
                            vOv++;
                    }
                    if (vOv == 4) 
                    {
                        System.out.println("DEBUG:".concat(String.valueOf(aaa) + "," + String.valueOf(qqq)));
                        RRR++;
                        eee += 1;
                    } 
                    else
                        ++RRR;
                }
            }
            System.out.println(String.valueOf(Math.round(eee)).concat("/") + String.valueOf(RRR));                  //print result
            return 1;
        } catch (IOException ex) {
            System.out.println("DEBUG:Error");
            return -3;
        }
    }
}
