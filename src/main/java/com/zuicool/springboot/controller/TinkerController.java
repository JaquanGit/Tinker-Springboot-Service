package com.zuicool.springboot.controller;

import com.zuicool.springboot.bean.Tinker;
import com.zuicool.springboot.bean.result.ReturnData;
import com.zuicool.springboot.service.ITinkerService;
import com.zuicool.springboot.util.ReturnDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ApiService/tinker")
public class TinkerController {

    @Autowired
    private ITinkerService tinkerService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ReturnData getTinkerList() {
        return ReturnDataUtil.getReturnData(tinkerService.getTinkerList());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ReturnData post(@ModelAttribute Tinker tinker) {
        return ReturnDataUtil.getReturnData(tinkerService.post(tinker));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ReturnData delete(@PathVariable int id) {
        return ReturnDataUtil.getReturnData(tinkerService.delete(id));
    }

    @RequestMapping(value = "/find/{productType}/version/{version}/patchVersion/{patchVersion}", method = RequestMethod.GET)
    public ReturnData find(@PathVariable String productType, @PathVariable String version, @PathVariable String patchVersion) {
        return ReturnDataUtil.getReturnData(tinkerService.find(productType, version, patchVersion));
    }
}
