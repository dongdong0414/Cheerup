package com.example.Cheerup.service.lmpl;

import com.example.Cheerup.domain.Member;
import com.example.Cheerup.dto.MemberSaveRequestDTO;
//import com.example.Cheerup.dto.MemberResponseDTO;
import com.example.Cheerup.repository.MemberRepository;
import com.example.Cheerup.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public List<MemberResponseDTO> findMembers() {
        List<Member> all = memberRepository.findAll();
        List<MemberResponseDTO> members = new ArrayList<>();

        for (Member member: all) {
            MemberResponseDTO build = MemberResponseDTO.builder()
                    .member(member)
                    .build();
            members.add(build);
        }

        return members;
    }
}

