package kr.co.puttogether.essay.domain.tag.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TagRequest {

    private String id;

    @Builder
    public TagRequest(String id) {
        this.id = id;
    }
}
