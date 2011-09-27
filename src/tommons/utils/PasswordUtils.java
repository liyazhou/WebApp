/**
 * User: Tomofumi Kitano <tomofumikitano@gmail.com>
 * Date: 2011/07/07/
 */
package tommons.utils;

import org.springframework.util.DigestUtils;

public class PasswordUtils {

    public static String encrypt(String originalPassword) {
        return DigestUtils.md5DigestAsHex(originalPassword.getBytes());
    }
}
