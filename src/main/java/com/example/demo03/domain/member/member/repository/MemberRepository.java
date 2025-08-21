package com.example.demo03.domain.member.member.repository;

import com.example.demo03.domain.member.member.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Optional<Member> findByUsername(String username);
}
