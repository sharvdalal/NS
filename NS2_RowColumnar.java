
import java.util.*;
public class NS2_RowColumnar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter plain text: ");
        String plain = in.nextLine();

        System.out.println("Enter key: ");
        String key = in.nextLine();

        int col = key.length();

        int row = 0;

        if(plain.length() % key.length() == 0){
            row = plain.length() / key.length();
        }
        else{
            row = plain.length() / key.length() + 1;
        }

        System.out.println(row + " " + col);

        char[][] arr = new char[row][col];

        int ch = 65;
        int index = 0;
        

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(index < plain.length()){

                
                arr[i][j] = plain.charAt(index);
                index++;
                }
                else{
                    arr[i][j] = (char) ch;
                    ch++;
                }
            }
            
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        HashMap<Character, Integer> map = new HashMap<>();
       
        for (int i = 0; i < key.length(); i++) {
            map.put(key.charAt(i), i+1);
        }
        System.out.println(map);

        char[] charArray = key.toCharArray();

        Arrays.sort(charArray);

        int count = 0;

        String encrypt = "";

        while(count != key.length()){

            for (int i = 0; i < row; i++) {
            int temp = map.get(charArray[count]);
            System.out.println(temp);

                encrypt = encrypt + arr[i][temp - 1];
             
            }

            count++;
        }

        System.out.println(encrypt);


            // Decryption Algorithm


           









    }
    
}
