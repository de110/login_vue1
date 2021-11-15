package com.example.loginvue1.Controller;

// import com.example.loginvue1.Domain.Member;
import com.example.loginvue1.Dto.MemberDto;
import com.example.loginvue1.Service.MemberService;
import lombok.AllArgsConstructor;
// import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    @GetMapping("/")
    public String index() {
        return "/vue/home/index";
        // return "/vue/index";

    }

    @GetMapping("/member/signup")
    public String signupForm(Model model) {
        model.addAttribute("member", new MemberDto());
        return "/vue/member/signupForm";
    }

    @PostMapping("/member/signup")
    public String signup(MemberDto memberDto) {
        memberService.signUp(memberDto);
        return "redirect:/";
    }

    @GetMapping("/member/login")
    public String login() {
        return "/vue/member/loginForm";
        // return "/vue/index";

    }

    // @GetMapping("/vue")
    // public String vue() {
    // // return "/vue/member/loginForm";
    // return "/vue/index";

    // }
}