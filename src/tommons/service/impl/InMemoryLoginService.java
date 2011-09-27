/**
 * User: Tomofumi Kitano <tomofumikitano@gmail.com>
 * Date: 2011/07/07/
 */
package tommons.service.impl;

import tommons.service.LoginService;
import tommons.utils.PasswordUtils;

import java.util.HashMap;
import java.util.Map;

public class InMemoryLoginService implements LoginService {

    static final String TEST_USERNAME = "tkitano";
    static final String TEST_PASSWORD = "tkitano";

    Map<String, String> map;

    public InMemoryLoginService() {
        this.map = new HashMap<String, String>();
        map.put(TEST_USERNAME, PasswordUtils.encrypt(TEST_PASSWORD));
    }

    @Override
    public LoginStatus login(String login, String password) {
        if (map.containsKey(login) && PasswordUtils.encrypt(password).equals(map.get(login))) {
            return LoginStatus.SUCCESS;
        } else {
            return LoginStatus.FAIL;
        }
    }
}