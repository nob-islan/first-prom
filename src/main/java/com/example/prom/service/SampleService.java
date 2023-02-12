package com.example.prom.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * サンプルサービスのインターフェースです。
 * 
 */
@Service
@RestController
@RequestMapping("/prom")
public interface SampleService {

    /**
     * 固定メッセージを返すメソッドです。
     * 
     * @return retMessage
     */
    @GetMapping(value = "/greet")
    String greet();

    /**
     * 入力したキーに対してDBからバリューを取得します。
     * 
     * @param key
     * @return
     */
    @PostMapping(value = "/getValue")
    String getValue(String key);

}
