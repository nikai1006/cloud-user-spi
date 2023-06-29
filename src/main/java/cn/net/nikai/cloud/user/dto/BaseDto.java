package cn.net.nikai.cloud.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 *     基础dto
 * </pre>
 *
 * @author nikai
 * @version 1.0.0
 * @date 2023/2/28
 * @since 1.0.0
 * @unignore
 */
public class BaseDto implements Serializable {

    private static final long serialVersionUID = -5763852596715047185L;
    /**
     * 编号
     * @primary
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
