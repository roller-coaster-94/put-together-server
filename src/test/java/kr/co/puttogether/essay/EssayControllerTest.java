package kr.co.puttogether.essay;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.puttogether.essay.controller.EssayController;
import kr.co.puttogether.essay.controller.dto.EssayRequest;
import kr.co.puttogether.essay.service.EssayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(EssayController.class)
public class EssayControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EssayService essayService;

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

        // when
        mockMvc.perform(post("/essay")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(essayRequest)))
                .andExpect(status().isOk());

        // then
        verify(essayService).saveEssay(any());
    }

    @Test
    public void 에세이_조회_테스트() throws Exception {
        // given
        Long essayId = 1L;

        // when
        mockMvc.perform(get("/essay/" + essayId.toString()))
                .andExpect(status().isOk());

        // then
        verify(essayService).selectEssay(essayId);
    }

    @Test
    public void 에세이_삭제_테스트() throws Exception {
        // given
        Long essayId = 1L;

        // when
        mockMvc.perform(delete("/essay/" + essayId.toString()))
                .andExpect(status().isOk());

        // then
        verify(essayService).deleteEssay(essayId);
    }
}
