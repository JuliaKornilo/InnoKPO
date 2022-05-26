package kpo.lab1.task3;

/**
 * Класс для хранения пароля.
 */
public class Authorization {

    private final String password;

    public Authorization(String password) {
        this.password = password;
    }

    /**
     *
     * @param password - пароль на проверку.
     * @return true если пароль верный, false - если нет
     */
    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
}
