package com.deepexi.pay.service;

import com.deepexi.pay.domain.eo.PcOrder;
import com.deepexi.pay.domain.dto.PcOrderDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * pc_order
 */
public interface PcOrderService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<PcOrder> findPage(PcOrder eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<PcOrder> findAll(PcOrder eo);

    /**
      获取详情
    * @return
    */
    PcOrder detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,PcOrder eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(PcOrder eo);

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