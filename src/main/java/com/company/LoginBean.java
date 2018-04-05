package com.company;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;
import com.company.util.SessionUtils;

public class LoginBean {
  private String username;
  private String password;

  public String validateUsernamePassword() throws IOException{
      if(username.trim().equals("admin") && password.trim().equals("admin")){
          HttpSession session=SessionUtils.getSession();
          return "admin";
      } else {
          FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_WARN,"Incorrect Username and Password","Please enter correct username and Password "));
          return "login";
      }
  }

  public String login(){
      return "logout";
  }

  public String logout(){
      return "login";
  }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
