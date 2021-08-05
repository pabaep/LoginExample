package com.sooryong.loginexample.data;

import com.google.gson.annotations.SerializedName;

public class JoinData {
    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    public JoinData(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
