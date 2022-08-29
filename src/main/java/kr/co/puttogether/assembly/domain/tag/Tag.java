package kr.co.puttogether.assembly.domain.tag;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TAG")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String is_deleted;
}
