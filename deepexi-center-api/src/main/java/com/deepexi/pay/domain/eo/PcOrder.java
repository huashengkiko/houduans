package com.deepexi.pay.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc pc_order
* @author admin
*/
//@ApiModel(description = "订单")
public class PcOrder{

// @ApiModelProperty(value = "id")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "订单号")
    @TableField(value = "`order_id`")
    private String orderId;
// @ApiModelProperty(value = "订单金额")
    @TableField(value = "`Order_Amount`")
    private Integer  orderAmount;
// @ApiModelProperty(value = "优惠金额")
    @TableField(value = "`discount_mount`")
    private Integer  discountMount;
// @ApiModelProperty(value = "应支付金额")
    @TableField(value = "`payment_amount`")
    private Integer  paymentAmount;
// @ApiModelProperty(value = "订单状态")
    @TableField(value = "`order_status`")
    private String orderStatus;
// @ApiModelProperty(value = "支付时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`pay_time`")
    private Date payTime;
// @ApiModelProperty(value = "支付账号")
    @TableField(value = "`pay_account`")
    private String payAccount;
// @ApiModelProperty(value = "签收状态")
    @TableField(value = "`sign_status`")
    private String signStatus;
// @ApiModelProperty(value = "签收人")
    @TableField(value = "`signer`")
    private String signer;
// @ApiModelProperty(value = "签收时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField(value = "`sign_time`")
    private Date signTime;
// @ApiModelProperty(value = "订单状态 0正常1异常")
    @TableField(value = "`pay_status`")
    private Integer  payStatus;
// @ApiModelProperty(value = "企业")
    @TableField(value = "`enterprise_id`")
    private String enterpriseId;
// @ApiModelProperty(value = "收获地址ID")
    @TableField(value = "`address_id`")
    private String addressId;
// @ApiModelProperty(value = "配送方式")
    @TableField(value = "`dispatching_way`")
    private String dispatchingWay;
// @ApiModelProperty(value = "配送时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`dispatching_time`")
    private Date dispatchingTime;
// @ApiModelProperty(value = "逻辑删除")
    @TableLogic
    @TableField(value = "`dr`")
    private Integer  dr;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`CREATED_BY`")
    private String createdBy;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`CREATED_TIME`")
    private Date createdTime;
// @ApiModelProperty(value = "更新人")
    @TableField(value = "`UPDATED_BY`")
    private String updatedBy;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`UPDATED_TIME`")
    private Date updatedTime;
// @ApiModelProperty(value = "支付方式")
    @TableField(value = "`pay_way`")
    private String payWay;
// @ApiModelProperty(value = "订单类型1.寄售订单 0.非寄售订单")
    @TableField(value = "`type`")
    private Integer  type;

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setOrderId(String orderId){
    this.orderId = orderId;
    }

    public String getOrderId(){
    return this.orderId;
    }

    public void setOrderAmount(Integer  orderAmount){
    this.orderAmount = orderAmount;
    }

    public Integer  getOrderAmount(){
    return this.orderAmount;
    }

    public void setDiscountMount(Integer  discountMount){
    this.discountMount = discountMount;
    }

    public Integer  getDiscountMount(){
    return this.discountMount;
    }

    public void setPaymentAmount(Integer  paymentAmount){
    this.paymentAmount = paymentAmount;
    }

    public Integer  getPaymentAmount(){
    return this.paymentAmount;
    }

    public void setOrderStatus(String orderStatus){
    this.orderStatus = orderStatus;
    }

    public String getOrderStatus(){
    return this.orderStatus;
    }

    public void setPayTime(Date payTime){
    this.payTime = payTime;
    }

    public Date getPayTime(){
    return this.payTime;
    }

    public void setPayAccount(String payAccount){
    this.payAccount = payAccount;
    }

    public String getPayAccount(){
    return this.payAccount;
    }

    public void setSignStatus(String signStatus){
    this.signStatus = signStatus;
    }

    public String getSignStatus(){
    return this.signStatus;
    }

    public void setSigner(String signer){
    this.signer = signer;
    }

    public String getSigner(){
    return this.signer;
    }

    public void setSignTime(Date signTime){
    this.signTime = signTime;
    }

    public Date getSignTime(){
    return this.signTime;
    }

    public void setPayStatus(Integer  payStatus){
    this.payStatus = payStatus;
    }

    public Integer  getPayStatus(){
    return this.payStatus;
    }

    public void setEnterpriseId(String enterpriseId){
    this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseId(){
    return this.enterpriseId;
    }

    public void setAddressId(String addressId){
    this.addressId = addressId;
    }

    public String getAddressId(){
    return this.addressId;
    }

    public void setDispatchingWay(String dispatchingWay){
    this.dispatchingWay = dispatchingWay;
    }

    public String getDispatchingWay(){
    return this.dispatchingWay;
    }

    public void setDispatchingTime(Date dispatchingTime){
    this.dispatchingTime = dispatchingTime;
    }

    public Date getDispatchingTime(){
    return this.dispatchingTime;
    }

    public void setDr(Integer  dr){
    this.dr = dr;
    }

    public Integer  getDr(){
    return this.dr;
    }

    public void setCreatedBy(String createdBy){
    this.createdBy = createdBy;
    }

    public String getCreatedBy(){
    return this.createdBy;
    }

    public void setCreatedTime(Date createdTime){
    this.createdTime = createdTime;
    }

    public Date getCreatedTime(){
    return this.createdTime;
    }

    public void setUpdatedBy(String updatedBy){
    this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
    return this.updatedBy;
    }

    public void setUpdatedTime(Date updatedTime){
    this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime(){
    return this.updatedTime;
    }

    public void setPayWay(String payWay){
    this.payWay = payWay;
    }

    public String getPayWay(){
    return this.payWay;
    }

    public void setType(Integer  type){
    this.type = type;
    }

    public Integer  getType(){
    return this.type;
    }


}

