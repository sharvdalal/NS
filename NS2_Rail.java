import java.util.*;
public class NS2_Rail{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Plain text: ");
        String plainText = in.nextLine();

        int depth = 2;

        int arrSize1 = 0;
        int arrSize2 = 0;

        if(plainText.length() % 2 == 0){

            arrSize1 = plainText.length() / 2;
            arrSize2 = plainText.length() / 2;
            
        }
        else{
            arrSize1 = plainText.length() / 2 + 1;
            arrSize2 = plainText.length()/2;
        }

        char[] arr1 = new char[arrSize1];
        char[] arr2 = new char[arrSize2];
        int index = 0;
        int i1 = 0;
        int i2 = 0;
        
        for(int i = 0; i < plainText.length(); i++){
            if(i % 2 == 0) {
                arr1[i1] = plainText.charAt(i);
                i1++;
            }
            else{
                arr2[i2] = plainText.charAt(i);
                i2++;
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        String encrypt = "";

        for (int i = 0; i < arr1.length; i++) {
            encrypt = encrypt + arr1[i];
            
        }

        for (int i = 0; i < arr2.length; i++) {
            encrypt = encrypt + arr2[i];
        }

        System.out.println("Encrypted Text: " + encrypt);
       
        int index1 = 0;
        int index2 = 0; 
        int a = 0; 
        int b = 0;

        if(encrypt.length() % 2 == 0){
            index1 = (encrypt.length() / 2);
            index2 = encrypt.length() / 2;
            a = 0;
            b = index1;

        }
        else{
            index1 = (encrypt.length() / 2) + 1;
            index2 = encrypt.length() / 2;
            a = 0;
            b = index1;

        }

        String decrypt = "";
        int check = 0;
        while(a != index1 && b != index2){

            if(check % 2 == 0){
                decrypt = decrypt + encrypt.charAt(a);
                a++;
                check++;
            }
            else{
                decrypt = decrypt + encrypt.charAt(b);
                b++;
                check++;
            }

        }
        System.out.println( "Decrypted TEXT: "+ decrypt);

        

                
    }
}