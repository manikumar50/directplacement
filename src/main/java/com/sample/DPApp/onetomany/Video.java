package com.sample.DPApp.onetomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Video
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String videoTitle;

    @OneToMany(mappedBy = "video")
    private List<Comment> comments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Video() {
    }

    public Video(Integer id, String videoTitle, List<Comment> comments) {
        this.id = id;
        this.videoTitle = videoTitle;
        this.comments = comments;
    }
}
