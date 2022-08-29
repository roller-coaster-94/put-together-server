package kr.co.puttogether.essay.domain;

import kr.co.puttogether.common.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ESSAY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Essay extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Builder
    public Essay(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
