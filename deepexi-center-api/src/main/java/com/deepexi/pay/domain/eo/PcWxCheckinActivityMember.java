package com.deepexi.pay.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc pc_wx_checkin_activity_member
* @author admin
*/
//@ApiModel(description = "微信周年庆活动会员参与表")
public class PcWxCheckinActivityMember{

// @ApiModelProperty(value = "主键ID")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "活动所属Id")
    @TableField(value = "`activity_id`")
    private String activityId;
// @ApiModelProperty(value = "会员所属id")
    @TableField(value = "`member_id`")
    private String memberId;
// @ApiModelProperty(value = "活动编码")
    @TableField(value = "`activity_code`")
    private String activityCode;
// @ApiModelProperty(value = "会员在微信上的openID")
    @TableField(value = "`open_id`")
    private String openId;
// @ApiModelProperty(value = "是否已签到(0:未签到 1:已签到)")
    @TableField(value = "`sign_in`")
    private Boolean signIn;
// @ApiModelProperty(value = "签到二维码")
    @TableField(value = "`qrcode`")
    private String qrcode;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`created_at`")
    private Date createdAt;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`created_by`")
    private String createdBy;
// @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`updated_at`")
    private Date updatedAt;
// @ApiModelProperty(value = "修改人")
    @TableField(value = "`updated_by`")
    private String updatedBy;
// @ApiModelProperty(value = "删除标识(0:未删除 1:已删除)")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setActivityId(String activityId){
    this.activityId = activityId;
    }

    public String getActivityId(){
    return this.activityId;
    }

    public void setMemberId(String memberId){
    this.memberId = memberId;
    }

    public String getMemberId(){
    return this.memberId;
    }

    public void setActivityCode(String activityCode){
    this.activityCode = activityCode;
    }

    public String getActivityCode(){
    return this.activityCode;
    }

    public void setOpenId(String openId){
    this.openId = openId;
    }

    public String getOpenId(){
    return this.openId;
    }

    public void setSignIn(Boolean signIn){
    this.signIn = signIn;
    }

    public Boolean getSignIn(){
    return this.signIn;
    }

    public void setQrcode(String qrcode){
    this.qrcode = qrcode;
    }

    public String getQrcode(){
    return this.qrcode;
    }

    public void setCreatedAt(Date createdAt){
    this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
    return this.createdAt;
    }

    public void setCreatedBy(String createdBy){
    this.createdBy = createdBy;
    }

    public String getCreatedBy(){
    return this.createdBy;
    }

    public void setUpdatedAt(Date updatedAt){
    this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt(){
    return this.updatedAt;
    }

    public void setUpdatedBy(String updatedBy){
    this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
    return this.updatedBy;
    }

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }


}

