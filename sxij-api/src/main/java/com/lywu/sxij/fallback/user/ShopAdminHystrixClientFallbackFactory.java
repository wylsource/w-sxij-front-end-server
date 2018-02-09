package com.lywu.sxij.fallback.user;

import com.lywu.sxij.api.user.ShopAdminClient;
import com.lywu.sxij.enums.ResultState;
import com.lywu.sxij.result.Result;
import com.lywu.sxij.utils.ResultUtil;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: WuYL
 * @Description: 管理员使用 Hystrix 异常返回类
 * @Date: Create in 2017/10/30 16:36
 * @Modified By:
 */
@Component
public class ShopAdminHystrixClientFallbackFactory implements FallbackFactory<ShopAdminClient>{

    @Override
    public ShopAdminClient create(Throwable throwable) {
        return new ShopAdminClient() {
            @Override
            public Result selectShopAdminWithPage(Long id) {
                return ResultUtil.error(ResultState.RESULT_FALLBACKERROR.getCode(), throwable.getMessage());
            }
        };
    }
}
