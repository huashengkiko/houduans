package com.deepexi.pay.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.pay.service.PcWxCheckinActivityMemberService;
import com.deepexi.pay.domain.eo.PcWxCheckinActivityMember;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/微信周年庆活动会员参与表", description = "$desc")
@RestController
@RequestMapping("/api/v1/pcWxCheckinActivityMembers")
public class  PcWxCheckinActivityMemberController {

    @Autowired
    private PcWxCheckinActivityMemberService pcWxCheckinActivityMemberService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(PcWxCheckinActivityMember eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(pcWxCheckinActivityMemberService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(PcWxCheckinActivityMember eo) {
        return new Payload(pcWxCheckinActivityMemberService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(pcWxCheckinActivityMemberService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改PcWxCheckinActivityMember")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody PcWxCheckinActivityMember eo) {
     eo.setId(pk);
     return new Payload(pcWxCheckinActivityMemberService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建PcWxCheckinActivityMember", notes = "创建PcWxCheckinActivityMember")
    public Payload create(@RequestBody PcWxCheckinActivityMember eo) {
        return new Payload(pcWxCheckinActivityMemberService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除PcWxCheckinActivityMember", notes = "根据id删除PcWxCheckinActivityMember")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(pcWxCheckinActivityMemberService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除PcWxCheckinActivityMember", notes = "根据id批量删除PcWxCheckinActivityMember")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(pcWxCheckinActivityMemberService.delete(ids));
    }

}