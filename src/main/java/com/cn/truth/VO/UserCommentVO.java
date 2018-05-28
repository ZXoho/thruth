package com.cn.truth.VO;

import lombok.Data;

import java.util.Date;

/** 用户查看自己评论历史数据返回类 */
@Data
public class UserCommentVO {

    /** 新闻Id */
    private Integer newsId;

    /** 评论Id */
    private Integer commentId;

    /** 评论内容 */
    private String comment;

    /** 评论时间 */
    private Date commentCreateTime;


}
