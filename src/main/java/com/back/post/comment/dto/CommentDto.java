package com.back.post.comment.dto;

import com.back.post.comment.entity.Comment;

import java.time.LocalDateTime;

public record CommentDto(
        int id,
        String content,
        LocalDateTime createDate,
        LocalDateTime modifyDate
)
{
    public CommentDto(Comment comment){
        this(
                comment.getId(),
                comment.getContent(),
                comment.getCreateDate(),
                comment.getModifyDate()
        );
    }
}
