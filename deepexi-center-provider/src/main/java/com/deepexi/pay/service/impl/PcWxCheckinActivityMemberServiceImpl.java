package com.deepexi.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.pay.domain.eo.PcWxCheckinActivityMember;
import com.deepexi.pay.service.PcWxCheckinActivityMemberService;
import com.deepexi.pay.mapper.PcWxCheckinActivityMemberMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class PcWxCheckinActivityMemberServiceImpl implements PcWxCheckinActivityMemberService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PcWxCheckinActivityMemberMapper pcWxCheckinActivityMemberMapper;

    @Override
    public PageBean<PcWxCheckinActivityMember> findPage(PcWxCheckinActivityMember eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<PcWxCheckinActivityMember> pages =  pcWxCheckinActivityMemberMapper.findList(eo);
        return new PageBean<PcWxCheckinActivityMember>(pages);
    }

    @Override
    public List<PcWxCheckinActivityMember> findAll(PcWxCheckinActivityMember eo) {
        List<PcWxCheckinActivityMember> list = pcWxCheckinActivityMemberMapper.findList(eo);
        return list;
    }
    @Override
    public PcWxCheckinActivityMember detail(String pk) {
        PcWxCheckinActivityMember eo = pcWxCheckinActivityMemberMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,PcWxCheckinActivityMember eo) {
        PcWxCheckinActivityMember old = pcWxCheckinActivityMemberMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = pcWxCheckinActivityMemberMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(PcWxCheckinActivityMember eo) {
        int result = pcWxCheckinActivityMemberMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = pcWxCheckinActivityMemberMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = pcWxCheckinActivityMemberMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}