package com.cn.truth.dataobject;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class NewsInfo {

    @Id
    /** 新闻Id */
    private Integer newsId;

    /** 新闻类型 默认0为待辟谣， 1为已辟谣 */
    private Integer newsType;

    /** 新闻链接 */
    private String newsUrl;

    /** 新闻上传时间 */
    private Date newsCreateTime;

    /** 新闻辟谣时间 */
    private Date newsUpdateTime;
}
