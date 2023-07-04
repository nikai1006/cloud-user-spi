package cn.net.nikai.cloud.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;
import java.math.BigDecimal;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;

/**
 * cloud-user-spi cn.net.nikai.cloud.user.dto
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 0:23 2018/12/21
 * @Modified By:
 * @unignore
 */
@ApiModel(description = "订单详情")
public class Order {

    @ApiModelProperty(value = "订单编号", notes = "订单详细编码", extensions = {
        @Extension(properties = {@ExtensionProperty(name = "passwd", value = "hello-nikai"),
            @ExtensionProperty(name = "username", value = "admin")})})
    private Long id;

    @ApiModelProperty(value = "类型", notes = "订单类型")
    private Integer type;

    @ApiModelProperty(value = "名称")
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(.[a-zA-Z0-9_-]+)+$", flags = {Flag.CANON_EQ,
        Flag.CASE_INSENSITIVE, Flag.UNICODE_CASE}, message = "校验失败", groups = {String.class,
        Character.class}, payload = {
        Payload.class})
    private String name;

    @ApiModelProperty(value = "订单总价")
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + id +
            ", type=" + type +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
