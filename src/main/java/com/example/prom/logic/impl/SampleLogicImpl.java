package com.example.prom.logic.impl;

import org.springframework.stereotype.Component;

import com.example.prom.logic.SampleLogic;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SampleLogicImpl implements SampleLogic {

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public String getValue(String key) {

        String retValue = null;

        switch (key) {
            case "1":
                retValue = "one \n";
                log.info("the value is " + retValue);
                break;
            case "2":
                retValue = "two \n";
                log.info("the value is " + retValue);
                break;
            case "3":
                retValue = "three \n";
                log.info("the value is " + retValue);
                break;
            default:
                // 意図的にNPEを起こしたい
                retValue.length();
        }

        return retValue;
    }

}
