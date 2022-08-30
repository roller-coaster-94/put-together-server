package kr.co.puttogether.essay.service;

import kr.co.puttogether.essay.controller.dto.EssayRequest;
import kr.co.puttogether.essay.controller.dto.EssayResponse;
import kr.co.puttogether.essay.domain.Essay;
import kr.co.puttogether.essay.domain.EssayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class EssayService {

    private final EssayRepository essayRepository;

    @Transactional
    public EssayResponse insertEssay(EssayRequest essayRequest) {
        Essay essay = essayRequest.toEssay();
        return EssayResponse.from(essayRepository.save(essay));
    }
}
