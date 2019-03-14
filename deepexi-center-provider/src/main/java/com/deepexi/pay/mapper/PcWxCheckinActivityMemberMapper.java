package com.deepexi.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.pay.domain.eo.PcWxCheckinActivityMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  PcWxCheckinActivityMemberMapper extends BaseMapper<PcWxCheckinActivityMember> {

    List<PcWxCheckinActivityMember> findList(@Param("eo")  PcWxCheckinActivityMember eo);

    int deleteByIds(@Param("ids") List<String> ids);

}