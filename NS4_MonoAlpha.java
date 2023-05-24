import java.util.HashMap;
import java.util.Scanner;

public class NS4_MonoAlpha{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String message = in.nextLine();

        String normal = "abcdefghijklmnopqrstuvwxyz";
        String coded = "qwertyuiopasdfghjklzxcvbnm";
        char[] normalArray = normal.toCharArray();
        char[] codedArray = coded.toCharArray();

        System.out.println(normalArray);
        System.out.println(codedArray);

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < codedArray.length; i++) {
            map.put(normalArray[i], codedArray[i]);
        }

        String encrypt = "";

        for(int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);

            encrypt = encrypt + map.get(ch);
        }

        System.out.println(encrypt);

        //Decrypt
        String decrypt = "";

        HashMap<Character, Character> revMap = new HashMap<>();

        for (int i = 0; i < codedArray.length; i++) {
            revMap.put(codedArray[i], normalArray[i]);
        }

        for(int i = 0; i < encrypt.length(); i++){
            decrypt = decrypt + revMap.get(encrypt.charAt(i));
        }

        System.out.println(decrypt);
        
    }
    
}