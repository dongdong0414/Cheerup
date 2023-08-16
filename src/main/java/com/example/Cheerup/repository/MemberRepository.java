package com.example.Cheerup.repository;

import com.example.Cheerup.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface MemberRepository extends JpaRepository<Member, Long> {
        /**
         *
         * @param email 회원 이메일
         * @return
         */
        boolean existsByEmail(String email);
}
