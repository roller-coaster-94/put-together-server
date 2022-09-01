package kr.co.puttogether.essay;

import kr.co.puttogether.essay.domain.Essay;
import kr.co.puttogether.essay.domain.EssayRepository;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class EssayRepositoryTest {

    @Autowired
    EssayRepository essayRepository;

    @After(value = "에세이 레포지토리 단위테스트 종료")
    public void cleanup() {
        essayRepository.deleteAll();
    }

    @Test
    public void 에세이_저장_불러오기() {
        // given
        String title = "테스트 에세이 제목";
        String content = "테스트 에세이 본문";
        String status = "N";
        Integer viewCount = 0;
        LocalDateTime deletedDate = null;
        String isDeleted = "N";

        essayRepository.save(Essay.builder()
                .title(title)
                .content(content)
                .status(status)
                .viewCount(viewCount)
                .deletedDate(deletedDate)
                .isDeleted(isDeleted)
                .build()
        );

        // when
        List<Essay> essayList = essayRepository.findAll();

        // then
        Essay essay = essayList.get(0);
        Assertions.assertAll(
                () -> assertEquals(essay.getTitle(), title),
                () -> assertEquals(essay.getContent(), content),
                () -> assertEquals(essay.getStatus(), status),
                () -> assertEquals(essay.getViewCount(), viewCount),
                () -> assertEquals(essay.getDeletedDate(), deletedDate),
                () -> assertEquals(essay.getIsDeleted(), isDeleted)
        );
    }
}
