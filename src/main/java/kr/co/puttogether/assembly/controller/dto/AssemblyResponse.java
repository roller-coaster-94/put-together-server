package kr.co.puttogether.assembly.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AssemblyResponse {

    private String id;

    @Builder
    public AssemblyResponse(String id) {
        this.id = id;
    }
}
