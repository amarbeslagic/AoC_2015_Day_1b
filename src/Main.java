import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_1b.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String s = br.readLine();

        int countOpen = 0;
        int countClose = 0;
        int floor = 0;

        for(int i=0; i<s.length(); i++){
            //char ch = s.charAt(i);
            if(s.charAt(i) == '('){
                countOpen++;
                floor = countOpen - countClose;
                if(floor == -1){
                    System.out.println("Position is: " + (i+1));
                    break;
                }
            }
            else{
                countClose++;
                floor = countOpen - countClose;
                if(floor == -1){
                    System.out.println("Position is: " + (i+1));
                    break;
                }
            }
        }

        floor = countOpen - countClose;

        System.out.println(floor);
    }
}