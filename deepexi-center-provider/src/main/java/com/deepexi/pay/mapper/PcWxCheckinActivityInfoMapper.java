package com.deepexi.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.pay.domain.eo.PcWxCheckinActivityInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  PcWxCheckinActivityInfoMapper extends BaseMapper<PcWxCheckinActivityInfo> {

    List<PcWxCheckinActivityInfo> findList(@Param("eo")  PcWxCheckinActivityInfo eo);

    int deleteByIds(@Param("ids") List<String> ids);

}