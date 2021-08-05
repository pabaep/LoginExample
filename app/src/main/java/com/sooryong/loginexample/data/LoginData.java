package com.sooryong.loginexample.data;

import com.google.gson.annotations.SerializedName;

public class LoginData {
    @SerializedName("email")
    String email;

    @SerializedName("password")
    String password;

    public LoginData(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
