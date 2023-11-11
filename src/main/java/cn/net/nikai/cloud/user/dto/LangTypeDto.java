package cn.net.nikai.cloud.user.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;

/**
 * 基础类型dto测试模型<br> Java中有八大基本类型，boolean、byte、short、int、long、float、double、char。 其包装类分别为Boolean、Byte、Integer、Long、Float、Double、Character
 *
 * @author nikai
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel(value = "基础类型测试dto", description = "Java中有八大基本类型，boolean、byte、short、int、long、float、double、char。 其包装类分别为Boolean、Byte、Integer、Long、Float、Double、Character")
public class LangTypeDto {

    /**
     * 主键
     *
     * @primary
     */
    @ApiModelProperty(value = "住建", name = "id", required = true, extensions = {
        @Extension(properties = {@ExtensionProperty(name = "passwd", value = "hello-nikai"),
            @ExtensionProperty(name = "username", value = "admin")})})
    private long id;

    /**
     * 包装类型主键
     */
    @ApiParam(value = "包装类型主键", name = "id", required = true, allowableValues = "range[100, 100000000)")
    private Long idW;
    /**
     * 年龄
     *
     * @min 0
     * @deault 3
     */
    @ApiModelProperty(value = "年龄", name = "age", required = true, notes = "swagger测试用属性描述：年龄", allowableValues = "range[1,200]", allowEmptyValue = false, hidden = false, dataType = "java.lang.Integer")
    private int age;
    /**
     * 包装类型年龄
     *
     * @min 0
     * @deault 4
     */
    @ApiParam(value = "包装类型年龄", name = "ageW", required = false, allowableValues = "2,3,4")
    private Integer ageW;
    /**
     * 是否工作
     *
     * @default true
     */
    private boolean work;
    /**
     * 包装类型是否工作
     *
     * @deault false
     */
    private Boolean workW;
    /**
     * 身高
     *
     * @min 0
     */
    private double height;
    /**
     * 包装类型身高
     *
     * @min 0
     */
    private Double heightW;
    /**
     * 朋友数量
     *
     * @min 0
     */
    private short friends;

    /**
     * 包装类型朋友数量
     *
     * @min 0
     */
    private Short friendsW;

    /**
     * 体重
     */
    private float weight;

    /**
     * 包装类型体重
     */
    private Float weightW;
    /**
     * 姓
     */
    private char firtName;
    /**
     * 包装类型姓
     */
    private Character firtNameW;
    /**
     * 内存
     */
    private byte memory;
    /**
     * 包装类型内存
     */
    private Byte memeoryW;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getIdW() {
        return idW;
    }

    public void setIdW(Long idW) {
        this.idW = idW;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAgeW() {
        return ageW;
    }

    public void setAgeW(Integer ageW) {
        this.ageW = ageW;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    public Boolean getWorkW() {
        return workW;
    }

    public void setWorkW(Boolean workW) {
        this.workW = workW;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Double getHeightW() {
        return heightW;
    }

    public void setHeightW(Double heightW) {
        this.heightW = heightW;
    }

    public short getFriends() {
        return friends;
    }

    public void setFriends(short friends) {
        this.friends = friends;
    }

    public Short getFriendsW() {
        return friendsW;
    }

    public void setFriendsW(Short friendsW) {
        this.friendsW = friendsW;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Float getWeightW() {
        return weightW;
    }

    public void setWeightW(Float weightW) {
        this.weightW = weightW;
    }

    public char getFirtName() {
        return firtName;
    }

    public void setFirtName(char firtName) {
        this.firtName = firtName;
    }

    public Character getFirtNameW() {
        return firtNameW;
    }

    public void setFirtNameW(Character firtNameW) {
        this.firtNameW = firtNameW;
    }

    public byte getMemory() {
        return memory;
    }

    public void setMemory(byte memory) {
        this.memory = memory;
    }

    public Byte getMemeoryW() {
        return memeoryW;
    }

    public void setMemeoryW(Byte memeoryW) {
        this.memeoryW = memeoryW;
    }
}
