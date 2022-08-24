package kr.co.puttogether.assembly.domain.tag.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TagMapRequest {

    private String id;

    @Builder
    public TagMapRequest(String id) {
        this.id = id;
    }
}
