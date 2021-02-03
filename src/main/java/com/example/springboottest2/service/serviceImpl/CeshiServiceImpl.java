package com.example.springboottest2.service.serviceImpl;

import com.example.springboottest2.dao.CeshiDao;
import com.example.springboottest2.service.CeshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CeshiServiceImpl implements CeshiService {

    @Autowired
    private CeshiDao ceshiDao;

    @Override
    public String query() {
        String i = ceshiDao.query();
        return i;
    }


}
