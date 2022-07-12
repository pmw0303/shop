package com.shop.repository;

import com.shop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 아이디 분실하면 이메일로 찾기
    Member findByEmail(String email);
}
