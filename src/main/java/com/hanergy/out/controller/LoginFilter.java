package com.hanergy.out.controller;

import com.hanergy.out.entity.SysUser;
import com.hanergy.out.service.ISysUserService;
import com.hanergy.out.util.CurrentUserConstants;
import com.hanergy.out.util.R;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

@Component
public class LoginFilter extends ZuulFilter {
    Logger log = LoggerFactory.getLogger(LoginFilter.class);

    public final static String ACCESS_TOKEN = "access_token";

    @Autowired
    private ISysUserService sysUserService;

    /**
     * 过滤器类型： 前置过滤器
     * @return
     */
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    /**
     * 过滤器顺序，越小越先执行
     * @return
     */

    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 过滤器是否生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        // 配置过滤器不生效的api地址
        if ("/apigateway/order/api/v1/order/save".equalsIgnoreCase(request.getRequestURI())){
            return false;
        }
        return false;
    }

    /**
     * 业务逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext =  RequestContext.getCurrentContext();
        HttpServletRequest  request = requestContext.getRequest();

        // 判断是否存在令牌信息，如果存在，则允许登录
        String accessToken = request.getHeader(ACCESS_TOKEN);
        if (null == accessToken || "".equals(accessToken)) {
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        } else {
            // 验证token是否存在
            SysUser sysUser = sysUserService.findByAccessToken(accessToken);
            if (sysUser == null){
                requestContext.setSendZuulResponse(false);
                requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            } else {
                request.setAttribute(CurrentUserConstants.CURRENT_USER,sysUser);
            }
        }
        return R.error(-1,"没有权限");
    }
}
