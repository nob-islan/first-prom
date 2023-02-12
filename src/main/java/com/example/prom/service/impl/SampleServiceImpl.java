package com.example.prom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prom.logic.SampleLogic;
import com.example.prom.service.SampleService;

/**
 * サンプルサービスの実装クラスです。
 * 
 */
@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleLogic sampleLogic;

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public String greet() {

        return "Good bye, Prometheus! \n";
    }

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public String getValue(String key) {

        // ロジックを読んでバリューを取得
        String retValue = sampleLogic.getValue(key);

        return retValue;
    }
}
