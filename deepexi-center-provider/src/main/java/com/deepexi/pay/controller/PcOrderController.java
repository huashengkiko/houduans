package com.deepexi.pay.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.pay.service.PcOrderService;
import com.deepexi.pay.domain.eo.PcOrder;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/订单", description = "$desc")
@RestController
@RequestMapping("/api/v1/pcOrders")
public class  PcOrderController {

    @Autowired
    private PcOrderService pcOrderService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(PcOrder eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(pcOrderService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(PcOrder eo) {
        return new Payload(pcOrderService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(pcOrderService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改PcOrder")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody PcOrder eo) {
     eo.setId(pk);
     return new Payload(pcOrderService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建PcOrder", notes = "创建PcOrder")
    public Payload create(@RequestBody PcOrder eo) {
        return new Payload(pcOrderService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除PcOrder", notes = "根据id删除PcOrder")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(pcOrderService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除PcOrder", notes = "根据id批量删除PcOrder")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(pcOrderService.delete(ids));
    }

}