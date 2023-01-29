import java.util.Scanner;

public class MooOperations {
    public static int operations(String s){
        if(s.indexOf("MOO")!=-1){
            return s.length()-3;
        }
        else if(s.indexOf("MOM")!=-1){
            return s.length()-2;
        }
        else if(s.indexOf("OOO")!=-1){
            return s.length()-2;
        }
        else if(s.indexOf("OOM")!=-1){
            return s.length()-1;
        }
        return -1;
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = Integer.parseInt(in.nextLine());
        String moos[] = new String[n];

        for(int i = 0; i<n; i++){
            moos[i] = in.nextLine();
        }

        for(int j = 0; j<n; j++){
            System.out.println(operations(moos[j]));
        }
    }
}