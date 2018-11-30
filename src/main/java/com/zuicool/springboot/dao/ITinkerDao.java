package com.zuicool.springboot.dao;

import com.zuicool.springboot.bean.Tinker;

import java.util.List;

public interface ITinkerDao {
    List<Tinker> getTinkerList();
    int post(Tinker tinker);
    int delete(int id);
    Tinker find(String productType, String version, String patchVersion);
}
