package kr.co.puttogether.assembly.controller.dto;

import kr.co.puttogether.assembly.domain.Assembly;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AssemblyResponse {

    private Long id;

    private String title;

    @Builder
    public AssemblyResponse(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public static AssemblyResponse from(Assembly assembly) {
        return AssemblyResponse.builder()
                .id(assembly.getId())
                .title(assembly.getTitle())
                .build();
    }
}
