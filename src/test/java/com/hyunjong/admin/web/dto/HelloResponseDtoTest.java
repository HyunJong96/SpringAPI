package com.hyunjong.admin.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given : 클래스에 생성자로 주입될 값 선언, 테스트 기반 환경 구축 단계
        String name = "test";
        int amount = 1000;

        //when : 클래스 생성 및 초기화, 테스트 하고자 하는 행위 선언
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
