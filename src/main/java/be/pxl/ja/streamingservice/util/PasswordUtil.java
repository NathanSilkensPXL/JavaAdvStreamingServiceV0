package be.pxl.ja.streamingservice.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtil {

    private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";
    private static final String ALGORITHM = "MD5";

    public static int calculateStrength(String password) {
        return 5;
    }

    public static String encodePassword(String password) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        messageDigest.update(password.getBytes(), 0, password.
                length());
        return new BigInteger(1, messageDigest.digest()).toString(16);
    }

    public static boolean isValid(String providedPassword, String
            securedPassword) {
        return encodePassword(providedPassword).equals(
                securedPassword);
    }
}
