package com.hanergy.out.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Du Ronghong
 * @since 2019-11-26
 */
@TableName("sys_user")
@ApiModel(value="SysUser对象", description="")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "0:女")
    private String sex;

    @ApiModelProperty(value = "用户的属性 1-编制 2-兼职")
    private String status;

    @ApiModelProperty(value = "部门ID")
    private Integer orgid;

    @ApiModelProperty(value = "岗位ID")
    private String stationid;

    private String email;

    @ApiModelProperty(value = "身份证号")
    private String idcard;

    @ApiModelProperty(value = "是否是管理员")
    private String isAdmin;

    private Long sort;

    private String mobile;

    @ApiModelProperty(value = "操作员")
    private Integer operate;

    @ApiModelProperty(value = "添加时间")
    @TableField("addTime")
    private Date addTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private Date updateTime;

    @ApiModelProperty(value = "储存的登录token用于异步登录判断")
    @TableField("accessToken")
    private String accessToken;

    @ApiModelProperty(value = "0正常 1删除 2离职")
    @TableField("opStatus")
    private Integer opStatus;

    @ApiModelProperty(value = "主要的角色id")
    @TableField("mainRoleId")
    private Integer mainRoleId;

    @ApiModelProperty(value = "上级不参与分成")
    @TableField("isDivide")
    private Integer isDivide;

    @ApiModelProperty(value = "远程控制机器")
    @TableField("remoteControl")
    private Integer remoteControl;

    @ApiModelProperty(value = "在补线后台展示所有设备")
    @TableField("addLineShowAllDevice")
    private Integer addLineShowAllDevice;

    @ApiModelProperty(value = "网页端登陆的accessToken")
    @TableField("accessTokenWeb")
    private String accessTokenWeb;

    @ApiModelProperty(value = "离职时间")
    @TableField("leaveDate")
    private Date leaveDate;

    @ApiModelProperty(value = "合伙人合作电话")
    @TableField("coopTel")
    private String coopTel;

    @ApiModelProperty(value = "运维后台查看线下设备")
    @TableField("seeOfflineDevice")
    private Integer seeOfflineDevice;

    @ApiModelProperty(value = "合伙人数据统计是否显示总营收")
    @TableField("isShowTotalIncome")
    private Integer isShowTotalIncome;

    @ApiModelProperty(value = "不参与特殊激励 0-否 1-是")
    @TableField("isNetReward")
    private Integer isNetReward;

    @ApiModelProperty(value = "用户头像")
    private String image;

    @ApiModelProperty(value = "是否是二级合伙人组长")
    @TableField("isSPHeader")
    private Integer isSPHeader;

    @ApiModelProperty(value = "微信公众号的openId")
    @TableField("wxGZHOpenId")
    private String wxGZHOpenId;

    @ApiModelProperty(value = "账户是否被锁住 0-否 1-是")
    @TableField("lockStatus")
    private Integer lockStatus;

    @ApiModelProperty(value = "职位表id")
    @TableField("positionId")
    private Integer positionId;

    @ApiModelProperty(value = "sys_country 表主键")
    @TableField("countryId")
    private Integer countryId;

    @ApiModelProperty(value = "语言zh:中文 en：英语 ja：日语")
    private String language;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }
    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Integer getOperate() {
        return operate;
    }

    public void setOperate(Integer operate) {
        this.operate = operate;
    }
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public Integer getOpStatus() {
        return opStatus;
    }

    public void setOpStatus(Integer opStatus) {
        this.opStatus = opStatus;
    }
    public Integer getMainRoleId() {
        return mainRoleId;
    }

    public void setMainRoleId(Integer mainRoleId) {
        this.mainRoleId = mainRoleId;
    }
    public Integer getIsDivide() {
        return isDivide;
    }

    public void setIsDivide(Integer isDivide) {
        this.isDivide = isDivide;
    }
    public Integer getRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(Integer remoteControl) {
        this.remoteControl = remoteControl;
    }
    public Integer getAddLineShowAllDevice() {
        return addLineShowAllDevice;
    }

    public void setAddLineShowAllDevice(Integer addLineShowAllDevice) {
        this.addLineShowAllDevice = addLineShowAllDevice;
    }
    public String getAccessTokenWeb() {
        return accessTokenWeb;
    }

    public void setAccessTokenWeb(String accessTokenWeb) {
        this.accessTokenWeb = accessTokenWeb;
    }
    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }
    public String getCoopTel() {
        return coopTel;
    }

    public void setCoopTel(String coopTel) {
        this.coopTel = coopTel;
    }
    public Integer getSeeOfflineDevice() {
        return seeOfflineDevice;
    }

    public void setSeeOfflineDevice(Integer seeOfflineDevice) {
        this.seeOfflineDevice = seeOfflineDevice;
    }
    public Integer getIsShowTotalIncome() {
        return isShowTotalIncome;
    }

    public void setIsShowTotalIncome(Integer isShowTotalIncome) {
        this.isShowTotalIncome = isShowTotalIncome;
    }
    public Integer getIsNetReward() {
        return isNetReward;
    }

    public void setIsNetReward(Integer isNetReward) {
        this.isNetReward = isNetReward;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public Integer getIsSPHeader() {
        return isSPHeader;
    }

    public void setIsSPHeader(Integer isSPHeader) {
        this.isSPHeader = isSPHeader;
    }
    public String getWxGZHOpenId() {
        return wxGZHOpenId;
    }

    public void setWxGZHOpenId(String wxGZHOpenId) {
        this.wxGZHOpenId = wxGZHOpenId;
    }
    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }
    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        "id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", name=" + name +
        ", sex=" + sex +
        ", status=" + status +
        ", orgid=" + orgid +
        ", stationid=" + stationid +
        ", email=" + email +
        ", idcard=" + idcard +
        ", isAdmin=" + isAdmin +
        ", sort=" + sort +
        ", mobile=" + mobile +
        ", operate=" + operate +
        ", addTime=" + addTime +
        ", updateTime=" + updateTime +
        ", accessToken=" + accessToken +
        ", opStatus=" + opStatus +
        ", mainRoleId=" + mainRoleId +
        ", isDivide=" + isDivide +
        ", remoteControl=" + remoteControl +
        ", addLineShowAllDevice=" + addLineShowAllDevice +
        ", accessTokenWeb=" + accessTokenWeb +
        ", leaveDate=" + leaveDate +
        ", coopTel=" + coopTel +
        ", seeOfflineDevice=" + seeOfflineDevice +
        ", isShowTotalIncome=" + isShowTotalIncome +
        ", isNetReward=" + isNetReward +
        ", image=" + image +
        ", isSPHeader=" + isSPHeader +
        ", wxGZHOpenId=" + wxGZHOpenId +
        ", lockStatus=" + lockStatus +
        ", positionId=" + positionId +
        ", countryId=" + countryId +
        ", language=" + language +
        "}";
    }
}
