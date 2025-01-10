package org.springbootdeveloper.Test;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔티티로 지정, 예약어로 테이블 생성에 제한이 생긴다면 (name = "")으로 새로 생성해주면 됨
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 자동 생성
@AllArgsConstructor
public class Member {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 기본키를 자동으로 1씩 증가(auto increment)
    @Column(name = "member_id", updatable = false)
    private Long id;

    @Column(name = "member_name", nullable = false) // null을 허용 x
    private String name;

    // 수정 메소드
    public void changeName(String name) {
        this.name = name;
    }

}
