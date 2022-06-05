package com.example.demo.src.post.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostPostsReq {
    private int userIdx;
    private String content;
    private List<PostImgsUrlReq> postImgUrls;

    public int getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(int userIdx) {
        this.userIdx = userIdx;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<PostImgsUrlReq> getPostImgUrls() {
        return postImgUrls;
    }

    public void setPostImgUrls(List<PostImgsUrlReq> postImgUrls) {
        this.postImgUrls = postImgUrls;
    }
}
