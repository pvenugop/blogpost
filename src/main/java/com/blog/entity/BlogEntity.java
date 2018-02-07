package com.blog.entity;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "BLOG")
public class BlogEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="BLOG_ID")
    private Integer blog_id;

    @Column(name="BLOG_TITLE")
    private String title;

    @Column(name="BLOG_CONTENT")
    private String content;

    @Column(name="BLOG_STATUS")
    private String status;

    @Column(name="IMAGE")
    @Lob
    @Basic(fetch =FetchType.LAZY)
    private Blob image;

    @Column(name="DATE")
    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp date;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private UserEntity editor;

    public Integer getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(Integer blog_id) {
        this.blog_id = blog_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public UserEntity getEditor() {
        return editor;
    }

    public void setEditor(UserEntity editor) {
        this.editor = editor;
    }
}
