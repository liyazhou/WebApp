/**
 * User: Tomofumi Kitano <tomofumikitano@gmail.com>
 * Date: 2011/07/07/
 */
package tommons.service;

public interface LoginService {

    enum LoginStatus {
        SUCCESS, FAIL
    }

    public LoginStatus login(String login, String password);
}
