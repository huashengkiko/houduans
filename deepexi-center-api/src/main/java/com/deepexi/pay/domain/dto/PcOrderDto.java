package com.deepexi.pay.domain.dto;

import com.deepexi.pay.domain.eo.PcOrder;
import java.util.Collection;
import java.util.List;

/**
* @desc pc_order
* @author admin
*/
public class PcOrderDto extends PcOrder{

public PcOrderDto(){};

public PcOrderDto(PcOrder eo) {
    this.setId(eo.getId());
    this.setOrderId(eo.getOrderId());
    this.setOrderAmount(eo.getOrderAmount());
    this.setDiscountMount(eo.getDiscountMount());
    this.setPaymentAmount(eo.getPaymentAmount());
    this.setOrderStatus(eo.getOrderStatus());
    this.setPayTime(eo.getPayTime());
    this.setPayAccount(eo.getPayAccount());
    this.setSignStatus(eo.getSignStatus());
    this.setSigner(eo.getSigner());
    this.setSignTime(eo.getSignTime());
    this.setPayStatus(eo.getPayStatus());
    this.setEnterpriseId(eo.getEnterpriseId());
    this.setAddressId(eo.getAddressId());
    this.setDispatchingWay(eo.getDispatchingWay());
    this.setDispatchingTime(eo.getDispatchingTime());
    this.setDr(eo.getDr());
    this.setCreatedBy(eo.getCreatedBy());
    this.setCreatedTime(eo.getCreatedTime());
    this.setUpdatedBy(eo.getUpdatedBy());
    this.setUpdatedTime(eo.getUpdatedTime());
    this.setPayWay(eo.getPayWay());
    this.setType(eo.getType());
}
}

