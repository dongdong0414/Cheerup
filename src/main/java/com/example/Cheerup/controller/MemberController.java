package com.example.Cheerup.controller;

import com.example.Cheerup.Validator.CheckEmailValidator;
import com.example.Cheerup.dto.MemberResponseDTO;
import com.example.Cheerup.dto.MemberSaveRequestDTO;
import com.example.Cheerup.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

//import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;
    private final CheckEmailValidator checkEmailValidator;

    /**
     * 회원 목록 조회
     * @param model
     * @return 회원 목록 페이지
     */
    @GetMapping("/members")
    public String members(Model model) {
        List<MemberResponseDTO> members = memberService.findMembers();
        model.addAttribute("members", members);

        return "/members/memberList";
    }
}

