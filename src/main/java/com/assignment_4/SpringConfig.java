package com.assignment_4;

public class SpringConfig {
    private String url;
    private String userNam;
    private String password;

    public SpringConfig(String url, String userNam, String password) {
        this.url = url;
        this.userNam = userNam;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SpringConfig{" + "url='" + url + '\'' + ", userNam='" + userNam + '\'' + ", password='" + password + '\'' + '}';
    }
}
