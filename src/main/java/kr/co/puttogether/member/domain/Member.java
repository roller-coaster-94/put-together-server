package kr.co.puttogether.member.domain;

import kr.co.puttogether.common.domain.BaseEntity;
import kr.co.puttogether.essay.domain.Essay;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(length = 15, nullable = false)
    private String name;

    @Column(length = 320, nullable = false)
    private String email;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Essay> essayList = new ArrayList<>();

    @Builder
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
