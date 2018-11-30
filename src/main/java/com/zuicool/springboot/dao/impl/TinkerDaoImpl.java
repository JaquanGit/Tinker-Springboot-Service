package com.zuicool.springboot.dao.impl;

import com.zuicool.springboot.bean.Tinker;
import com.zuicool.springboot.dao.ITinkerDao;
import com.zuicool.springboot.util.TinkerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TinkerDaoImpl implements ITinkerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Tinker> getTinkerList() {
        String sql = "select * from tinker";
        return jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(Tinker.class));
    }

    @Override
    public int post(Tinker tinker) {
        String sql = "insert into tinker(version, patchVersion) value (?, ?);";
        return jdbcTemplate.update(sql, tinker.getVersion(), tinker.getPatchVersion());
    }

    @Override
    public int delete(int id) {
        String sql = "delete from tinker where id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public Tinker find(String productType, String version, String requestPatchVersion) {
        String sql = "select min(patchVersion) from tinker where productType = ? and version = ? and patchVersion > ?";
        String patchVersion = jdbcTemplate.queryForObject(sql, new Object[]{productType, version, requestPatchVersion}, String.class);
        return TinkerUtil.GetTinkerByPatchVersion(productType, version, patchVersion);
    }
}
