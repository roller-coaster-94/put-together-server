package kr.co.puttogether.essay.controller.dto;

import kr.co.puttogether.essay.domain.Essay;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EssayRequest {

    private String title;

    private String content;

    private String status;

    private Integer viewCount;

    private LocalDateTime deletedDate;

    private String isDeleted;

    @Builder
    public EssayRequest(String title, String content, String status, Integer viewCount, LocalDateTime deletedDate, String isDeleted) {
        this.title = title;
        this.content = content;
        this.status = status;
        this.viewCount = viewCount;
        this.deletedDate = deletedDate;
        this.isDeleted = isDeleted;
    }

    public Essay toEssay() {
        return Essay.builder()
                .title(title)
                .content(content)
                .status(status)
                .viewCount(viewCount)
                .deletedDate(deletedDate)
                .isDeleted(isDeleted)
                .build();
    }
}
