package kr.co.puttogether.assembly.controller;

import kr.co.puttogether.assembly.controller.dto.AssemblyRequest;
import kr.co.puttogether.assembly.service.AssemblyService;
import kr.co.puttogether.core.ApiResult;
import kr.co.puttogether.common.dto.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/assembly")
public class AssemblyController extends ApiResult {

    private final AssemblyService assemblyService;

    @PostMapping
    public ResponseEntity<Response> insertAssembly(
            @Valid @RequestBody AssemblyRequest assemblyRequest) {
        return response(assemblyService.insertAssembly(assemblyRequest));
    }
}
