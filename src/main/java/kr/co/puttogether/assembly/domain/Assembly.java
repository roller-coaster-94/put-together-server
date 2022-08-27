package kr.co.puttogether.assembly.domain;

import kr.co.puttogether.assembly.controller.dto.AssemblyRequest;
import kr.co.puttogether.common.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ASSEMBLY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Assembly extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Builder
    public Assembly(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
