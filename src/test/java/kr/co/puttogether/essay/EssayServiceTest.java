package kr.co.puttogether.essay;

import kr.co.puttogether.essay.controller.dto.EssayRequest;
import kr.co.puttogether.essay.controller.dto.EssayResponse;
import kr.co.puttogether.essay.domain.Essay;
import kr.co.puttogether.essay.domain.EssayRepository;
import kr.co.puttogether.essay.service.EssayService;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class EssayServiceTest {

    @Mock
    private EssayRepository essayRepository;

    @InjectMocks
    private EssayService essayService;

    @After(value = "에세이 서비스 단위테스트 종료")
    public void cleanup() {
        essayRepository.deleteAll();
    }

    @Test
    public void 에세이_삽입_테스트() throws Exception {
        // given
        String title = "테스트 에세이 제목";
        String content = "테스트 에세이 본문";
        String status = "N";
        Integer viewCount = 0;
        LocalDateTime deletedDate = null;
        String isDeleted = "N";

        EssayRequest essayRequest = EssayRequest.builder()
                .title(title)
                .content(content)
                .status(status)
                .viewCount(viewCount)
                .deletedDate(deletedDate)
                .isDeleted(isDeleted)
                .build();

        Essay fakeEssay = essayRequest.toEssay();

        // mocking
        given(essayRepository.save(any()))
                .willReturn(fakeEssay);

        // when
        EssayResponse essayResponse = essayService.saveEssay(essayRequest);

        // then
        Assertions.assertAll(
                () -> assertEquals(essayRequest.getTitle(), essayResponse.getTitle())
        );
    }

    @Test
    public void 에세이_조회_테스트() throws Exception {
        // given
        String title = "테스트 에세이 제목";
        String content = "테스트 에세이 본문";
        String status = "N";
        Integer viewCount = 0;
        LocalDateTime deletedDate = null;
        String isDeleted = "N";

        EssayRequest essayRequest = EssayRequest.builder()
                .title(title)
                .content(content)
                .status(status)
                .viewCount(viewCount)
                .deletedDate(deletedDate)
                .isDeleted(isDeleted)
                .build();

        Essay fakeEssay = essayRequest.toEssay();

        Long EssayId = 1L;

        // mocking
        given(essayRepository.findById(any()))
                .willReturn(Optional.ofNullable(fakeEssay));

        // when
        EssayResponse essayResponse = essayService.selectEssay(EssayId);

        // then
        Assertions.assertAll(
                () -> assertEquals(essayRequest.getTitle(), essayResponse.getTitle())
        );
    }

    @Test
    public void 에세이_삭제_테스트() throws Exception {
        // given
        String title = "테스트 에세이 제목";
        String content = "테스트 에세이 본문";
        String status = "N";
        Integer viewCount = 0;
        LocalDateTime deletedDate = null;
        String isDeleted = "N";

        EssayRequest essayRequest = EssayRequest.builder()
                .title(title)
                .content(content)
                .status(status)
                .viewCount(viewCount)
                .deletedDate(deletedDate)
                .isDeleted(isDeleted)
                .build();

        Essay fakeEssay = essayRequest.toEssay();

        Long EssayId = 1L;

        // mocking
        given(essayRepository.findById(any()))
                .willReturn(Optional.ofNullable(fakeEssay));

        // when
        Long deletedEssayId = essayService.deleteEssay(EssayId);

        // then
        Assertions.assertAll(
                () -> assertEquals(EssayId, deletedEssayId)
        );
    }
}
