package kr.co.puttogether.essay.controller;

import kr.co.puttogether.common.dto.Response;
import kr.co.puttogether.core.ApiResult;
import kr.co.puttogether.essay.controller.dto.EssayRequest;
import kr.co.puttogether.essay.service.EssayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/essay")
public class EssayController extends ApiResult {

    private final EssayService essayService;

    @PostMapping
    public ResponseEntity<Response> insertEssay(
            @Valid @RequestBody EssayRequest essayRequest) {
        return response(essayService.saveEssay(essayRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> selectEssay(
            @PathVariable("id") Long essayId) {
        return response(essayService.selectEssay(essayId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteEssay(
            @PathVariable("id") Long essayId) {
        return response(essayService.deleteEssay(essayId));
    }
}
