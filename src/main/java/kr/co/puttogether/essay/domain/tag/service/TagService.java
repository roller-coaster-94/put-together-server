package kr.co.puttogether.essay.domain.tag.service;

import kr.co.puttogether.essay.domain.tag.TagMapRepository;
import kr.co.puttogether.essay.domain.tag.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TagService {

    private final TagRepository tagRepository;

    private final TagMapRepository tagMapRepository;
}
