package com.hfo.Capstone.models.DTO;

import com.hfo.Capstone.models.DTO.LoginFormDTO;

public class RegisterFormDTO extends LoginFormDTO {

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}
