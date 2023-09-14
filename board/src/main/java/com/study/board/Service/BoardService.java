package com.study.board.Service;

import com.study.board.Entity.Board;

import java.util.List;

public interface BoardService {
    List<Board> getAllBoards();

    Board getBoardById(int boardId);

    void saveBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(int boardId);

}