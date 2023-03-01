package cn.net.nikai.cloud.user.dto;

import java.io.Serializable;

public class BusinessDto extends BaseDto implements Serializable {

    private static final long serialVersionUID = -2626628004543775313L;

    /**
     * 商业内容
     */
    private String content;

    /**
     * 备注
     */
    private String tag;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
