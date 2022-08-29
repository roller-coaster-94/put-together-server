package kr.co.puttogether.member.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRequest {

    private String id;

    @Builder
    public MemberRequest(String id) {
        this.id = id;
    }
}
