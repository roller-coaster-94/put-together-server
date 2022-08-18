package kr.co.puttogether.assembly.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ASSEMBLY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Assembly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
}
