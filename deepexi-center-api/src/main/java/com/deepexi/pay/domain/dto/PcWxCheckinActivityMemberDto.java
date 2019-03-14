package com.deepexi.pay.domain.dto;

import com.deepexi.pay.domain.eo.PcWxCheckinActivityMember;
import java.util.Collection;
import java.util.List;

/**
* @desc pc_wx_checkin_activity_member
* @author admin
*/
public class PcWxCheckinActivityMemberDto extends PcWxCheckinActivityMember{

public PcWxCheckinActivityMemberDto(){};

public PcWxCheckinActivityMemberDto(PcWxCheckinActivityMember eo) {
    this.setId(eo.getId());
    this.setActivityId(eo.getActivityId());
    this.setMemberId(eo.getMemberId());
    this.setActivityCode(eo.getActivityCode());
    this.setOpenId(eo.getOpenId());
    this.setSignIn(eo.getSignIn());
    this.setQrcode(eo.getQrcode());
    this.setCreatedAt(eo.getCreatedAt());
    this.setCreatedBy(eo.getCreatedBy());
    this.setUpdatedAt(eo.getUpdatedAt());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setDr(eo.getDr());
}
}

