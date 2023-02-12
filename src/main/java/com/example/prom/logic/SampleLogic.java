package com.example.prom.logic;

import org.springframework.stereotype.Component;

/**
 * サンプルロジックのインターフェースです。
 * 
 */
@Component
public interface SampleLogic {

    /**
     * 入力されたキーに対して、DBからバリューを取得します。
     * 
     * @param key
     * @return
     */
    String getValue(String key);
}
