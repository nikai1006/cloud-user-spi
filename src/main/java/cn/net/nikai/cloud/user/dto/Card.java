package cn.net.nikai.cloud.user.dto;

import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 * cloud-user-spi cn.net.nikai.cloud.user.dto
 *
 * @author nikai
 * @unignore
 */
@ApiModel(value = "银行卡", description = "银行卡模型定义，详细定义了卡的全部内容", parent = User.class)
public class Card implements Serializable {

    private static final long serialVersionUID = 993491107111027592L;
    /**
     * id
     *
     * @required TRUE
     * @primary AUTO_INCREMENT
     */
    @NotNull
    private Long id;

    /**
     * 名字
     */
    private String name;
    /**
     * 电话号码
     *
     * @min 8
     * @max 20
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

    public Card() {
    }

    public Card(Long id, String name, String tel, String company, Boolean free, String type) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.company = company;
        this.free = free;
        this.type = type;
    }

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
