import java.util.Scanner;

public class Leaders3 {
    public static int countPairs (String s, int[] num){
        char [] c = s.toCharArray();
        int firstG = s.indexOf("G");
        int firstH = s.indexOf("H");
        boolean g = false;
        boolean h = false;

        int L = 0;
        int l=0;

        if(num[firstG] >= s.lastIndexOf("G")){
            c[firstG] = 'L';
            g = true;
            L++;
        }
        if(num[firstH] >= s.lastIndexOf("H")){
            c[firstH] = 'l';
            h = true;
            l++;
        }

        for(int k = 0; k<c.length; k++){
            if(c[k] == 'G' && h){
                if(num[k] > firstH && k<firstH){
                    L++;
                }
            }
            else if(c[k] == 'H' && g){
                if(num[k] > firstG && k<firstG){
                    l++;
                }
            }
        }

        int pairs = l*L;

        return pairs;
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = Integer.parseInt(in.nextLine());

        String s = in.nextLine();
        int[] e = new int[n];

        String[] nums = in.nextLine().split(" ");
        for(int i = 0; i<nums.length; i++){
            e[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(countPairs(s, e));
    }
}