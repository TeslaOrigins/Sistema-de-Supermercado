/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_supermercado;

import java.security.Key;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Matheus Lourenço
 */
public class CriptografaSenha {
    private static final String ALGO = "AES";
    private static final byte[] keyValue = new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };
//    public static final String SECRET_KEY = "0QTW{dP>ZpSZ7e}l";
//    public static final String SALT = "nO}R!q@p[.B{So>i";
//    
//    public static String encryptPasswd(String passwdToEncrypt, String secret) {
//        try{
//            byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//            IvParameterSpec ivspec = new IvParameterSpec(iv);
//
//            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
//            KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
//            SecretKey tmp = factory.generateSecret(spec);
//            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
//
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
//            return Base64.getEncoder().encodeToString(cipher.doFinal(passwdToEncrypt.getBytes("UTF-8")));
//        } catch (Exception e) {
//            System.out.println("Error while encrypting: " + e.toString());
//        }
//        return null;
//    }
//    
//    public static String decryptPasswd(String passwdToEncrypt, String secret) {
//        try{
//            byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//            IvParameterSpec ivspec = new IvParameterSpec(iv);
//
//            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
//            KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
//            SecretKey tmp = factory.generateSecret(spec);
//            SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
//
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
//            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivspec);
//            return new String(cipher.doFinal(Base64.getDecoder().decode(passwdToEncrypt)));
//        } catch (Exception e) {
//            System.out.println("Error while decrypting: " + e.toString());
//        }
//        return null;
//    }
    public static String encrypt(String Data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
        return encryptedValue;
    }
    
    public static String decrypt(String encryptedData) throws Exception {

        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        String decordedValue = new BASE64Decoder().decodeBuffer(encryptedData).toString().trim();
        System.out.println("This is Data to be Decrypted" + decordedValue);
        return decordedValue;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
    }
}
