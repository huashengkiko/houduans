package com.deepexi.pay.domain.dto;

import com.deepexi.pay.domain.eo.PcWxCheckinActivityInfo;
import java.util.Collection;
import java.util.List;

/**
* @desc pc_wx_checkin_activity_info
* @author admin
*/
public class PcWxCheckinActivityInfoDto extends PcWxCheckinActivityInfo{

public PcWxCheckinActivityInfoDto(){};

public PcWxCheckinActivityInfoDto(PcWxCheckinActivityInfo eo) {
    this.setId(eo.getId());
    this.setActivityCode(eo.getActivityCode());
    this.setActivityCity(eo.getActivityCity());
    this.setActivityName(eo.getActivityName());
    this.setActivityStartTime(eo.getActivityStartTime());
    this.setActivityEndTime(eo.getActivityEndTime());
    this.setActivityPushTitle(eo.getActivityPushTitle());
    this.setActivityPushContent(eo.getActivityPushContent());
    this.setActivityPushPicUrl(eo.getActivityPushPicUrl());
    this.setActivityPushPicMediaId(eo.getActivityPushPicMediaId());
    this.setActivityPushContentUrl(eo.getActivityPushContentUrl());
    this.setActivityAdminAccount(eo.getActivityAdminAccount());
    this.setActivityAdminPassword(eo.getActivityAdminPassword());
    this.setCreatedAt(eo.getCreatedAt());
    this.setCreatedBy(eo.getCreatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setDr(eo.getDr());
}
}

