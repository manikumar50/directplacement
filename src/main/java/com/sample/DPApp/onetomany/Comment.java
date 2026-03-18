package com.sample.DPApp.onetomany;

import jakarta.persistence.*;

@Entity
public class Comment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String commentTxt;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentTxt() {
        return commentTxt;
    }

    public void setCommentTxt(String commentTxt) {
        this.commentTxt = commentTxt;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Comment() {
    }

    public Comment(Integer id, String commentTxt, Video video) {
        this.id = id;
        this.commentTxt = commentTxt;
        this.video = video;
    }
}
