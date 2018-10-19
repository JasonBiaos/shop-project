package com.mircle.api.service.impl;

import com.mircle.api.service.TestApiService;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestApiServiceImpl implements TestApiService{
    @Override
    public Map<String, Object> test(Integer id, String name) {
        Map<String, Object> result = new HashMap<>();
        result.put("errorCode", "200");
        result.put("errorMsg", "success");
        result.put("data",new String[]{"123456","5646546",id + "",name});
        return result;
    }
}
