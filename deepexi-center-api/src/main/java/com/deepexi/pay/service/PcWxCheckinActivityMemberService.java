package com.deepexi.pay.service;

import com.deepexi.pay.domain.eo.PcWxCheckinActivityMember;
import com.deepexi.pay.domain.dto.PcWxCheckinActivityMemberDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * pc_wx_checkin_activity_member
 */
public interface PcWxCheckinActivityMemberService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<PcWxCheckinActivityMember> findPage(PcWxCheckinActivityMember eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<PcWxCheckinActivityMember> findAll(PcWxCheckinActivityMember eo);

    /**
      获取详情
    * @return
    */
    PcWxCheckinActivityMember detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,PcWxCheckinActivityMember eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(PcWxCheckinActivityMember eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(String pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(String...pk);
}