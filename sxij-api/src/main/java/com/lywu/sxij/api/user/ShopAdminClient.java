package com.lywu.sxij.api.user;

import com.lywu.sxij.fallback.user.ShopAdminHystrixClientFallbackFactory;
import com.lywu.sxij.result.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: WuYL
 * @Description: 提供操作 ShopAdmin 的 api
 * @Date: Create in 2017/10/29 17:10
 * @Modified By:
 */
@FeignClient(name = "sxij-web", fallbackFactory = ShopAdminHystrixClientFallbackFactory.class)
public interface ShopAdminClient {

    /**
     * 分页查询管理员
     * @param id 管理员 ID
     * @return
     */
    @GetMapping("/user/shopadmin/selectWithPage/{id}")
    Result selectShopAdminWithPage(@PathVariable("id") Long id);

}
