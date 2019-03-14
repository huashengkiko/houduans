package com.deepexi.pay.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.pay.service.PcWxCheckinActivityInfoService;
import com.deepexi.pay.domain.eo.PcWxCheckinActivityInfo;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/微信周年庆活动信息表", description = "$desc")
@RestController
@RequestMapping("/api/v1/pcWxCheckinActivityInfos")
public class  PcWxCheckinActivityInfoController {

    @Autowired
    private PcWxCheckinActivityInfoService pcWxCheckinActivityInfoService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(PcWxCheckinActivityInfo eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(pcWxCheckinActivityInfoService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(PcWxCheckinActivityInfo eo) {
        return new Payload(pcWxCheckinActivityInfoService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(pcWxCheckinActivityInfoService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改PcWxCheckinActivityInfo")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody PcWxCheckinActivityInfo eo) {
     eo.setId(pk);
     return new Payload(pcWxCheckinActivityInfoService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建PcWxCheckinActivityInfo", notes = "创建PcWxCheckinActivityInfo")
    public Payload create(@RequestBody PcWxCheckinActivityInfo eo) {
        return new Payload(pcWxCheckinActivityInfoService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除PcWxCheckinActivityInfo", notes = "根据id删除PcWxCheckinActivityInfo")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(pcWxCheckinActivityInfoService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除PcWxCheckinActivityInfo", notes = "根据id批量删除PcWxCheckinActivityInfo")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(pcWxCheckinActivityInfoService.delete(ids));
    }

}