package kr.co.puttogether.essay.controller;

import kr.co.puttogether.common.dto.Response;
import kr.co.puttogether.core.ApiResult;
import kr.co.puttogether.essay.controller.dto.EssayRequest;
import kr.co.puttogether.essay.service.EssayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/essay")
public class EssayController extends ApiResult {

    private final EssayService essayService;

    @PostMapping
    public ResponseEntity<Response> insertEssay(
            @Valid @RequestBody EssayRequest essayRequest) {
        return response(essayService.insertEssay(essayRequest));
    }
}
