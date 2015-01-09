package com.dyack.kopilka.entity;

public class UserDEVCOLIBRI {

    private String login;
    private String password;

    public UserDEVCOLIBRI(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserDEVCOLIBRI() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
