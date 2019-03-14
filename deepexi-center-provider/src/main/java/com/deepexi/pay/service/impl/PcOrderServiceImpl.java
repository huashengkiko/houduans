package com.deepexi.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.pay.domain.eo.PcOrder;
import com.deepexi.pay.service.PcOrderService;
import com.deepexi.pay.mapper.PcOrderMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class PcOrderServiceImpl implements PcOrderService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PcOrderMapper pcOrderMapper;

    @Override
    public PageBean<PcOrder> findPage(PcOrder eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<PcOrder> pages =  pcOrderMapper.findList(eo);
        return new PageBean<PcOrder>(pages);
    }

    @Override
    public List<PcOrder> findAll(PcOrder eo) {
        List<PcOrder> list = pcOrderMapper.findList(eo);
        return list;
    }
    @Override
    public PcOrder detail(String pk) {
        PcOrder eo = pcOrderMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,PcOrder eo) {
        PcOrder old = pcOrderMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = pcOrderMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(PcOrder eo) {
        int result = pcOrderMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = pcOrderMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = pcOrderMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}