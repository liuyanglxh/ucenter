package com.liuyang.ucenter.user.rpc;

import com.liuyang.ucenter.user.pojo.Result;
import com.liuyang.ucenter.user.rpc.fallback.BusinessServiceFallbackService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "business", fallbackFactory = BusinessServiceFallbackService.class)
public interface BusinessService {

    @RequestMapping(value = "api/business/v1/by-user/{userId}", method = RequestMethod.GET)
    Result<String> getBusinessByUser(@PathVariable("userId") Integer userId);
}
