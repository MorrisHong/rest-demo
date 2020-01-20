package me.gracelove.restapidemo.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void findAll() {
        boardRepository.findAll()
    }
}
