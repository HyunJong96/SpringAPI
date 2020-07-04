package com.hyunjong.admin.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor //기본 생성자 자동추가
@Entity // DB의 테이블과 매칭될 클래스
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함된다.
    public Posts(String title,String content,String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
