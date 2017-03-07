package com.txw.Interface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tangxiewen on 2017/3/3.
 */
@FeignClient("compute-service")
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET,value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
