package kr.co.puttogether.essay.domain;

import kr.co.puttogether.common.domain.BaseEntity;
import kr.co.puttogether.member.domain.Member;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "essay")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Essay extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "essay_id", unique = true, nullable = false)
    private Long id;

    // 연관관계 매핑
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Member.class)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(length = 1, nullable = false)
    private String status;

    @Column(nullable = false)
    private Integer viewCount;

    private LocalDateTime deletedDate;

    @Column(length = 1, nullable = false)
    private String isDeleted;

    @Builder
    public Essay(String title, String content, String status, Integer viewCount, LocalDateTime deletedDate, String isDeleted) {
        this.title = title;
        this.content = content;
        this.status = status;
        this.viewCount = viewCount;
        this.deletedDate = deletedDate;
        this.isDeleted = isDeleted;
    }

    // 연관관계 설정
    public void setMember(Member member) {
        this.member = member;
    }
}
