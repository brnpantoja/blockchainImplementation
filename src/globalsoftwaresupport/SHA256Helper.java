package globalsoftwaresupport;

import java.security.MessageDigest;

public class SHA256Helper {

    public static String generateHash(String data) {
        try {

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));

            // acabar com os valores hexadecimais e não bytes
            StringBuffer hexadecimalString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);
                // preenchimento
                if (hexadecimal.length() == 1) hexadecimalString.append('0');
                hexadecimalString.append(hexadecimal);
            }
            return hexadecimalString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
