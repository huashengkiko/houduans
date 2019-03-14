package com.deepexi.pay.service;

import com.deepexi.pay.domain.eo.PcWxCheckinActivityInfo;
import com.deepexi.pay.domain.dto.PcWxCheckinActivityInfoDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * pc_wx_checkin_activity_info
 */
public interface PcWxCheckinActivityInfoService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<PcWxCheckinActivityInfo> findPage(PcWxCheckinActivityInfo eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<PcWxCheckinActivityInfo> findAll(PcWxCheckinActivityInfo eo);

    /**
      获取详情
    * @return
    */
    PcWxCheckinActivityInfo detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,PcWxCheckinActivityInfo eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(PcWxCheckinActivityInfo eo);

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