import java.util.*;

public class NS4_PolyAlpha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter message: ");
        String plain = in.nextLine();

        plain = plain.toUpperCase();

        System.out.println("Enter key: ");
        String key = in.nextLine();
        key = key.toUpperCase();

        String tempKey = "";

        if(key.length() != plain.length()){

            for(int i = 0; i < plain.length(); i++){
                tempKey = tempKey + key.charAt(i % key.length());
            }
        }
        key = tempKey;

        String encrypt = "";

        for (int i = 0; i < plain.length(); i++) {
            int x = (plain.charAt(i) + key.charAt(i)) % 26 + 'A';
           encrypt = encrypt + (char)x; 
        }

        System.out.println(key);
        System.out.println(encrypt);


        //Decrypt

        String decrypt = "";

        for (int i = 0; i < encrypt.length(); i++) {
            int x = (encrypt.charAt(i) - key.charAt(i) + 26) % 26 + 'A';
            System.out.println(x);
            decrypt = decrypt + (char)(x);
        }

        System.out.println("Decrypted message : "+ decrypt);



    
        
    }
}
