package com.liuyang.ucenter.user.rpc.fallback;

import com.liuyang.ucenter.user.pojo.Result;
import com.liuyang.ucenter.user.rpc.BusinessService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class BusinessServiceFallbackService implements FallbackFactory<BusinessService> {
    @Override
    public BusinessService create(Throwable cause) {
        return new BusinessService() {
            @Override
            public Result<String> getBusinessByUser(Integer userId) {
                if (cause != null) {
                    System.out.println("error ");
                    cause.printStackTrace();
                } else {
                    System.out.println("error is null");
                }
                return null;
            }
        };
    }
}
