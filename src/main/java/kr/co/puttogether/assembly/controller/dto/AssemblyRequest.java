package kr.co.puttogether.assembly.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AssemblyRequest {

    private String id;

    @Builder
    public AssemblyRequest(String id) {
        this.id = id;
    }
}
