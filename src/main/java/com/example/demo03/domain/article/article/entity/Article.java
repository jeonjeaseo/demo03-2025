package com.example.demo03.domain.article.article.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id // DB에서 PrimaryKey로 설정
    @GeneratedValue(strategy = IDENTITY) // Auto_increment 설정
    private Long id; // Long은 null이 들어갈 수 있음, long은 not null
    private String title;
    @Column(columnDefinition = "TEXT")
    private String body;
}
