package com.cos.security1.controller;

import com.cos.security1.model.User;
import com.cos.security1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class IndexController {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping({ "", "/" })
    @ResponseBody
    public String index() {
        return "index";
    }
    @GetMapping("/user")
    @ResponseBody
    public String user(){
        return "user";
    }
    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "admin";
    }
    @GetMapping("/manager")
    @ResponseBody
    public String manager(){
        return "manager";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }
    @GetMapping("/joinForm")
    public String joinForm(){
        return "joinForm";
    }
    @PostMapping("/join")
    public String join(User user){
        log.info(String.valueOf(user));
        user.setRole("ROLE_USER");
        String rawPassword=user.getPassword();
        String encPassword=bCryptPasswordEncoder.encode(rawPassword);
        user.setPassword(encPassword);
        userRepository.save(user);
        return "redirect:/loginForm";
    }
    @Secured("ROLE_ADMIN")
    @GetMapping("/info")
    public @ResponseBody String info(){
        return "개인 정보";
    }
    @PreAuthorize("hasRole('ROLE_MANAGER')or hasRole('ROLE_USER')")
    @GetMapping("/data")
    public @ResponseBody String data(){
        return "개인 정보";
    }


}
