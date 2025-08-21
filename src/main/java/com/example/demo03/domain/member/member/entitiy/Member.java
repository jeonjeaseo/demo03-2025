package com.example.demo03.domain.member.member.entitiy;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Member {
    @Id // DB에서 PrimaryKey로 설정
    @GeneratedValue(strategy = IDENTITY) // Auto_increment 설정
    private Long id; // Long은 null이 들어갈 수 있음, long은 not null
    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    private LocalDateTime modifyDate;
    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
}