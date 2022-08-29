package kr.co.puttogether.member.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberResponse {

    private String id;

    @Builder
    public MemberResponse(String id) {
        this.id = id;
    }
}
