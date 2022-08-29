package kr.co.puttogether.essay.controller.dto;

import kr.co.puttogether.essay.domain.Essay;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EssayResponse {

    private Long id;

    private String title;

    @Builder
    public EssayResponse(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public static EssayResponse from(Essay essay) {
        return EssayResponse.builder()
                .id(essay.getId())
                .title(essay.getTitle())
                .build();
    }
}
