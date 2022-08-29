package kr.co.puttogether.essay.controller.dto;

import kr.co.puttogether.essay.domain.Essay;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EssayRequest {

    private Long id;

    private String title;

    @Builder
    public EssayRequest(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public static Essay to(EssayRequest essayRequest) {
        return Essay.builder()
                .title(essayRequest.getTitle())
                .build();
    }
}
