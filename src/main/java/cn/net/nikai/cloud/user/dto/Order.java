package cn.net.nikai.cloud.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * cloud-user-spi cn.net.nikai.cloud.user.dto
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 0:23 2018/12/21
 * @Modified By:
 */
@ApiModel(description = "订单详情")
public class Order {

    @ApiModelProperty(value = "订单编号",notes = "订单详细编码")
    private Long id;

    @ApiModelProperty(value = "类型",notes = "订单类型")
    private Integer type;

    @ApiModelProperty(value = "名称")
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
