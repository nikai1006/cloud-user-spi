package cn.net.nikai.cloud.user.dto;

import java.io.Serializable;

/**
 * cloud-user-spi cn.net.nikai.cloud.user.dto
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 17:20 2018/8/4
 * @Modified By:
 */
public class Card implements Serializable {
    private static final long serialVersionUID = 993491107111027592L;
    /**
     * id
     */
    private Long id;

    /**
     * 名字
     */
    private String name;
    /**
     * 电话号码
     */
    private String tel;

    /**
     * 公司
     */
    private String company;

    /**
     * 是否免费
     */
    private Boolean free;

    /**
     * 卡类型
     */
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", company='" + company + '\'' +
                ", free=" + free +
                ", type='" + type + '\'' +
                '}';
    }
}
