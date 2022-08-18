package kr.co.puttogether.user.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserRequest {

    private String id;

    @Builder
    public UserRequest(String id) {
        this.id = id;
    }
}
