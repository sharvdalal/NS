import java.util.*;

public class NS3_Ceaser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a string for encryption using Caesar Cipher: ");

        String plain = sc.nextLine();
        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");
        int shift = sc.nextInt();

        String encrypt = "";

        for (int i = 0; i < plain.length() ; i++) {

            if(Character.isUpperCase(plain.charAt(i))){
                char ch = (char) ((plain.charAt(i) + shift - 'A') % 26 + 'A');
                encrypt = encrypt + ch;
            }
            else{
                char ch = (char) ( (plain.charAt(i) + shift - 'a') % 26 + 'a');
                encrypt = encrypt + ch;
            }
            
        }

        System.out.println(encrypt);

        //Decrypt

       // Decrypt
String decrypt = "";

for (int i = 0; i < encrypt.length(); i++) {
    if (Character.isUpperCase(encrypt.charAt(i))) {
        char ch = (char) ((encrypt.charAt(i) - shift - 'A' + 26) % 26 + 'A');
        decrypt = decrypt + ch;
    } else {
        char ch = (char) ((encrypt.charAt(i) - shift - 'a' + 26) % 26 + 'a');
        decrypt = decrypt + ch;
    }
}

System.out.println("Decrypted data: " + decrypt);





    }
    
}
