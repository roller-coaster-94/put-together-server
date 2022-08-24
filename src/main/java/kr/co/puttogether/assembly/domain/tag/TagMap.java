package kr.co.puttogether.assembly.domain.tag;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TAG_MAP")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class TagMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long essay_id;

    private Long tag_id;
}
