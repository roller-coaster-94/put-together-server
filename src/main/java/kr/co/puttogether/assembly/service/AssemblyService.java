package kr.co.puttogether.assembly.service;

import kr.co.puttogether.assembly.controller.dto.AssemblyRequest;
import kr.co.puttogether.assembly.controller.dto.AssemblyResponse;
import kr.co.puttogether.assembly.domain.Assembly;
import kr.co.puttogether.assembly.domain.AssemblyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AssemblyService {

    private final AssemblyRepository assemblyRepository;

    @Transactional
    public AssemblyResponse insertAssembly(AssemblyRequest assemblyRequest) {
        Assembly assembly = AssemblyRequest.to(assemblyRequest);
        return AssemblyResponse.from(assemblyRepository.save(assembly));
    }
}
