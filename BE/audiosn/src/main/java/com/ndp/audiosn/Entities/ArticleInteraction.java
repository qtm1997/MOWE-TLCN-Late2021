package com.ndp.audiosn.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_article_interaction")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticleInteraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "col_article_id")
    private Integer id;

    @Column(name = "col_comment_score")
    private Float commentScore;

    @Column(name = "col_vote_score")
    private Float voteScore;
}
