package kr.co.puttogether.essay.service;

import kr.co.puttogether.common.exception.ModelNotFoundException;
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
    public EssayResponse saveEssay(EssayRequest essayRequest) {
        Essay essay = essayRequest.toEssay();
        return EssayResponse.from(essayRepository.save(essay));
    }

    public EssayResponse selectEssay(Long essayId) {
        Essay essay = essayRepository.findById(essayId).orElseThrow(
                () -> new ModelNotFoundException(ModelNotFoundException.ESSAY_NOT_FOUND));
        return EssayResponse.from(essay);
    }

    public Long deleteEssay(Long essayId) {
        Essay essay = essayRepository.findById(essayId).orElseThrow(
                () -> new ModelNotFoundException(ModelNotFoundException.ESSAY_NOT_FOUND));
        essayRepository.delete(essay);
        return essayId;
    }
}
