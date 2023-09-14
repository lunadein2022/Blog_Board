package com.study.board.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

@Entity
@Table(name = "board")
@Getter
@Setter
@Accessors(chain = true)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq")
    @SequenceGenerator(name = "board_seq", sequenceName = "board_seq", allocationSize = 1)
    @Column(name = "board_idx")
    private int boardIdx;

    @Column(name = "board_name")
    private String boardName;

    @Column(name = "board_title")
    private String boardTitle;

    @Column(name = "board_content")
    private String boardContent;

    @Column(name = "board_date")
    private Date boardDate;

    @Column(name = "board_hit")
    private int boardHit;

    @PrePersist //글 생성시마다 onCreate도 실행됨
    protected void onCreate() {
        boardDate = new Date();
    }

}
