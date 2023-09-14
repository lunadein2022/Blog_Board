package com.study.board.Service;

import com.study.board.Entity.Board;
import com.study.board.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @Override
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    @Override
    public Board getBoardById(int boardId) {
        return boardRepository.findById(boardId).orElse(null);
    }

    @Override
    public void saveBoard(Board board) {
        boardRepository.save(board);
    }

    @Override
    public void updateBoard(Board board) {
        saveBoard(board);
    }

    @Override
    public void deleteBoard(int boardId) {
        boardRepository.deleteById(boardId);
    }

}