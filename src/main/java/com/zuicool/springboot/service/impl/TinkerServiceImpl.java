package com.zuicool.springboot.service.impl;

import com.zuicool.springboot.bean.Tinker;
import com.zuicool.springboot.dao.ITinkerDao;
import com.zuicool.springboot.service.ITinkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TinkerServiceImpl implements ITinkerService {

    @Autowired
    private ITinkerDao tinkerDao;

    @Override
    public List<Tinker> getTinkerList() {
        return tinkerDao.getTinkerList();
    }

    @Override
    public int post(Tinker tinker) {
        return tinkerDao.post(tinker);
    }

    @Override
    public int delete(int id) {
        return tinkerDao.delete(id);
    }

    @Override
    public Tinker find(String productType, String version, String patchVersion) {
        return tinkerDao.find(productType, version, patchVersion);
    }
}
