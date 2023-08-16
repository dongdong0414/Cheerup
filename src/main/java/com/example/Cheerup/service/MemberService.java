package com.example.Cheerup.service;

import com.example.Cheerup.dto.MemberSaveRequestDTO;
//import com.example.Cheerup.dto.MemberResponseDTO;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Map;
public interface MemberService {
    List<MemberResponseDTO> findMembers();
    Map<String, String> validateHandling(Errors errors);

    Long join(MemberSaveRequestDTO memberSaveRequestDTO);
}
