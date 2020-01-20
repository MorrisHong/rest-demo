package me.gracelove.restapidemo.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.gracelove.restapidemo.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
@Slf4j
public class BoardController {

    private final BoardService boardService;

    @GetMapping("")
    public ResponseEntity<Page<Board>> list() {
        log.info("board");

        boardService.findAll();



    }
}
