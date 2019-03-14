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
* @desc pc_wx_checkin_activity_info
* @author admin
*/
//@ApiModel(description = "微信周年庆活动信息表")
public class PcWxCheckinActivityInfo{

// @ApiModelProperty(value = "主键ID")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "活动编码")
    @TableField(value = "`activity_code`")
    private String activityCode;
// @ApiModelProperty(value = "活动举办城市")
    @TableField(value = "`activity_city`")
    private String activityCity;
// @ApiModelProperty(value = "活动名称")
    @TableField(value = "`activity_name`")
    private String activityName;
// @ApiModelProperty(value = "活动开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`activity_start_time`")
    private Date activityStartTime;
// @ApiModelProperty(value = "活动结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`activity_end_time`")
    private Date activityEndTime;
// @ApiModelProperty(value = "活动推送标题")
    @TableField(value = "`activity_push_title`")
    private String activityPushTitle;
// @ApiModelProperty(value = "活动推送内容")
    @TableField(value = "`activity_push_content`")
    private String activityPushContent;
// @ApiModelProperty(value = "活动推送图片Url")
    @TableField(value = "`activity_push_pic_url`")
    private String activityPushPicUrl;
// @ApiModelProperty(value = "活动推送封面图片位于微信服务器的标识")
    @TableField(value = "`activity_push_pic_media_id`")
    private String activityPushPicMediaId;
// @ApiModelProperty(value = "活动内容跳转链接")
    @TableField(value = "`activity_push_content_url`")
    private String activityPushContentUrl;
// @ApiModelProperty(value = "活动工作人员登录账号")
    @TableField(value = "`activity_admin_account`")
    private String activityAdminAccount;
// @ApiModelProperty(value = "活动工作人员登录密码")
    @TableField(value = "`activity_admin_password`")
    private String activityAdminPassword;
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

    public void setActivityCode(String activityCode){
    this.activityCode = activityCode;
    }

    public String getActivityCode(){
    return this.activityCode;
    }

    public void setActivityCity(String activityCity){
    this.activityCity = activityCity;
    }

    public String getActivityCity(){
    return this.activityCity;
    }

    public void setActivityName(String activityName){
    this.activityName = activityName;
    }

    public String getActivityName(){
    return this.activityName;
    }

    public void setActivityStartTime(Date activityStartTime){
    this.activityStartTime = activityStartTime;
    }

    public Date getActivityStartTime(){
    return this.activityStartTime;
    }

    public void setActivityEndTime(Date activityEndTime){
    this.activityEndTime = activityEndTime;
    }

    public Date getActivityEndTime(){
    return this.activityEndTime;
    }

    public void setActivityPushTitle(String activityPushTitle){
    this.activityPushTitle = activityPushTitle;
    }

    public String getActivityPushTitle(){
    return this.activityPushTitle;
    }

    public void setActivityPushContent(String activityPushContent){
    this.activityPushContent = activityPushContent;
    }

    public String getActivityPushContent(){
    return this.activityPushContent;
    }

    public void setActivityPushPicUrl(String activityPushPicUrl){
    this.activityPushPicUrl = activityPushPicUrl;
    }

    public String getActivityPushPicUrl(){
    return this.activityPushPicUrl;
    }

    public void setActivityPushPicMediaId(String activityPushPicMediaId){
    this.activityPushPicMediaId = activityPushPicMediaId;
    }

    public String getActivityPushPicMediaId(){
    return this.activityPushPicMediaId;
    }

    public void setActivityPushContentUrl(String activityPushContentUrl){
    this.activityPushContentUrl = activityPushContentUrl;
    }

    public String getActivityPushContentUrl(){
    return this.activityPushContentUrl;
    }

    public void setActivityAdminAccount(String activityAdminAccount){
    this.activityAdminAccount = activityAdminAccount;
    }

    public String getActivityAdminAccount(){
    return this.activityAdminAccount;
    }

    public void setActivityAdminPassword(String activityAdminPassword){
    this.activityAdminPassword = activityAdminPassword;
    }

    public String getActivityAdminPassword(){
    return this.activityAdminPassword;
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

