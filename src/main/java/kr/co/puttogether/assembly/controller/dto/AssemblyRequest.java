package kr.co.puttogether.assembly.controller.dto;

import kr.co.puttogether.assembly.domain.Assembly;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AssemblyRequest {

    private Long id;

    private String title;

    @Builder
    public AssemblyRequest(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public static Assembly to(AssemblyRequest assemblyRequest) {
        return Assembly.builder()
                .title(assemblyRequest.getTitle())
                .build();
    }
}
