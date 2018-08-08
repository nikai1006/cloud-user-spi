package cn.net.nikai.cloud.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * cloud-user-spi cn.net.nikai.cloud.user.dto
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 17:56 2018/8/4
 * @Modified By:
 */
public class Friend implements Serializable{
    private static final long serialVersionUID = -1510197852310149126L;

    /**
     * 编号
     * @required TRUE
     */
    private Integer id;


    /**
     * 姓名
     */
    private String name;

    /**
     * 家庭住址
     */
    private String address;

    /**
     * 生日
     */
    private Date brithday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", brithday=" + brithday +
                '}';
    }
}
