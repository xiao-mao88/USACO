import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {
    public static int countPairs (String s, int[] num){

        int gCount = 0;
        int hCount = 0;
        char [] c = s.toCharArray();

        for(int n = 0; n<s.length(); n++){
            if(c[n] == 'G'){
                gCount++;
            }
            else{
                hCount++;
            }
        }
        int g = 0;
        int h = 0;
        int L = 0;
        int l = 0;

        ArrayList<String> str;

        //checking for all names in list
        for(int i = 0; i<c.length; i++){
            for(int j = i; j<=num[i]-1; j++){
                if(c[i] == 'G'){
                    g++;
                    if(g == gCount){
                        c[i] = 'L';
                        L++;
                    }
                }
                else{
                    h++;
                    if(h == hCount){
                        c[i] = 'l';
                        l++;
                    }
                }
            }
        }

        //checking for leaders in list
        for(int k = 0; k<c.length; k++){
            for(int m = k; m<=num[k]-1; m++){
                if(c[k] == 'G' && c[m] == 'l'){
                    L++;
                }
                else if(c[k] == 'H' && c[m] == 'L'){
                        l++;
                }
            }
        }

        int pairs = l*L;
        return pairs;
    }

    public static void main (String[] args){
        String test1 = "GHHG";
        int [] num1 = {2, 4, 3, 4};
        System.out.println(countPairs(test1, num1));

        String test2 = "GGH";
        int [] num2 = {2, 3, 3};
        System.out.println(countPairs(test2, num2));
    }
}
