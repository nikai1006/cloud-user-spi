package cn.net.nikai.cloud.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 公司信息VO
 *
 * @author chenfanglin
 * @date: 2018年7月19日 下午4:13:09
 * @unignore
 */
public class CompanyBase {

    /**
     * 公司id
     */
//	@JsonSerialize(using = LongJsonSerializer.class)
//	@JsonDeserialize(using = LongJsonDeserializer.class)
    private Long companyId;
    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 公司简称
     */
    private String shortName;

    /**
     * 所属城市
     */
    private String companyCity;

    /**
     * 公司联系方式
     */
    private String companyTel;

    /**
     * 公司行业
     */
    private String companyIndustry;

    /**
     * 经度
     */
    private BigDecimal companyLat;

    /**
     * 纬度
     */
    private BigDecimal companyLng;

    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 公司logo
     */
    private String companyLogo;

    /**
     * 公司组织结构代码
     */
    private String orgCode;

    /**
     * 企业管理名称
     */
    private String adminName;

    /**
     * 可开通的最大雷达数量
     */
    private Integer maxRadarNum;

    /**
     * 可开通的最大门店数量
     */
    private Integer maxStoreNum;

    /**
     * 公司背景图
     */
    private String backImage;

    /**
     * 公司状态
     */
    private Integer companyStatus;

    /**
     * 企业类型0企业版,1门店版
     */
    private Integer companyType;

    /**
     * 过期时间
     */
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date expireTime;

    /**
     * 创建时间
     */
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public BigDecimal getCompanyLat() {
        return companyLat;
    }

    public void setCompanyLat(BigDecimal companyLat) {
        this.companyLat = companyLat;
    }

    public BigDecimal getCompanyLng() {
        return companyLng;
    }

    public void setCompanyLng(BigDecimal companyLng) {
        this.companyLng = companyLng;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public Integer getMaxStoreNum() {
        return maxStoreNum;
    }

    public void setMaxStoreNum(Integer maxStoreNum) {
        this.maxStoreNum = maxStoreNum;
    }

    public Integer getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
    }

    public CompanyBase() {
    }

    public CompanyBase(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getMaxRadarNum() {
        return maxRadarNum;
    }

    public void setMaxRadarNum(Integer maxRadarNum) {
        this.maxRadarNum = maxRadarNum;
    }

    public String getBackImage() {
        return backImage;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CompanyBase [companyId=").append(companyId).append(", loginName=").append(loginName)
            .append(", companyName=").append(companyName).append(", password=").append(password)
            .append(", shortName=").append(shortName).append(", companyCity=").append(companyCity)
            .append(", companyTel=").append(companyTel).append(", companyIndustry=").append(companyIndustry)
            .append(", companyLat=").append(companyLat).append(", companyLng=").append(companyLng)
            .append(", companyAddress=").append(companyAddress).append(", companyLogo=").append(companyLogo)
            .append(", orgCode=").append(orgCode).append(", adminName=").append(adminName).append(", maxRadarNum=")
            .append(maxRadarNum).append(", maxStoreNum=").append(maxStoreNum).append(", backImgage=")
            .append(backImage).append(", companyStatus=").append(companyStatus).append(", companyType=")
            .append(companyType).append(", expireTime=").append(expireTime).append(", createTime=")
            .append(createTime).append(", updateTime=").append(updateTime).append("]");
        return builder.toString();
    }

}
