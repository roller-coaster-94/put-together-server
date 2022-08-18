package kr.co.puttogether.assembly.controller;

import kr.co.puttogether.assembly.service.AssemblyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/assembly")
public class AssemblyController {

    private final AssemblyService assemblyService;
}
