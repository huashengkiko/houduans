package com.deepexi.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.pay.domain.eo.PcWxCheckinActivityInfo;
import com.deepexi.pay.service.PcWxCheckinActivityInfoService;
import com.deepexi.pay.mapper.PcWxCheckinActivityInfoMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class PcWxCheckinActivityInfoServiceImpl implements PcWxCheckinActivityInfoService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PcWxCheckinActivityInfoMapper pcWxCheckinActivityInfoMapper;

    @Override
    public PageBean<PcWxCheckinActivityInfo> findPage(PcWxCheckinActivityInfo eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<PcWxCheckinActivityInfo> pages =  pcWxCheckinActivityInfoMapper.findList(eo);
        return new PageBean<PcWxCheckinActivityInfo>(pages);
    }

    @Override
    public List<PcWxCheckinActivityInfo> findAll(PcWxCheckinActivityInfo eo) {
        List<PcWxCheckinActivityInfo> list = pcWxCheckinActivityInfoMapper.findList(eo);
        return list;
    }
    @Override
    public PcWxCheckinActivityInfo detail(String pk) {
        PcWxCheckinActivityInfo eo = pcWxCheckinActivityInfoMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,PcWxCheckinActivityInfo eo) {
        PcWxCheckinActivityInfo old = pcWxCheckinActivityInfoMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = pcWxCheckinActivityInfoMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(PcWxCheckinActivityInfo eo) {
        int result = pcWxCheckinActivityInfoMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = pcWxCheckinActivityInfoMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = pcWxCheckinActivityInfoMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}