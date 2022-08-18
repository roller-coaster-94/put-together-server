package kr.co.puttogether.assembly.service;

import kr.co.puttogether.assembly.domain.AssemblyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AssemblyService {

    private final AssemblyRepository assemblyRepository;
}
