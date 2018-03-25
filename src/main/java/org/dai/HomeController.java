package org.dai;


import java.util.Set;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")      
    public String index(Model model) {
        Msg msgadmin = new Msg("管理员标题", "管理员内容", "额外信息，只对管理员显示");
        model.addAttribute("msgadmin", msgadmin);
        Msg msguser = new Msg("用户标题", "用户内容", "额外信息，只对用户显示");
        model.addAttribute("msguser", msguser);
        //alert("登录失败！");
        return "index";
           
    	/*System.out.println("根据不同的用户显示不同的网页");
        Set<String> roles = AuthorityUtils
        		.authorityListToSet(SecurityContextHolder.getContext()
        	     .getAuthentication().getAuthorities());
        if(roles.contains("ROLE_ADMIN")){
        	System.out.println("admin");        	
            return "admin";
          }
        else if(roles.contains("ROLE_USER")){
        	System.out.println("user");
            return "user";
          } 
        else   
        {
        	System.out.println("error");
        	return "error";
        }*/
    }
}