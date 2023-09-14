package com.study.board.Repository;

import com.study.board.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
