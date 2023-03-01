package cn.net.nikai.cloud.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * @ignore
 */
public class Wife {

    /**
     * @primary AUTO_INCREMENT
     */
    @JsonFormat(shape = Shape.NUMBER)
    private String id;
    /**
     * @required
     * @max 30
     */
    private String name;

    /**
     * @min 0
     */
    private Double weight;

    /**
     * @min 0
     */
    private Double height;

    /**
     * 年龄
     *
     * @max 130
     * @min 20
     */
    private Integer age;

    /**
     * 别名
     *
     * @min 3
     */
    private String alias;

    public Wife() {
    }

    public Wife(String id, String name, Double weight, Double height, Integer age, String alias) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
