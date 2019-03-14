package com.deepexi.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.pay.domain.eo.PcOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  PcOrderMapper extends BaseMapper<PcOrder> {

    List<PcOrder> findList(@Param("eo")  PcOrder eo);

    int deleteByIds(@Param("ids") List<String> ids);

}