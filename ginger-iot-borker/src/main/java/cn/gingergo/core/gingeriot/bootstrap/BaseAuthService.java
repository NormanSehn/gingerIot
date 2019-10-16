package cn.gingergo.core.gingeriot.bootstrap;

/**
 * 权限校验
 **/
public interface BaseAuthService {

    boolean  authorized(String username, String password);

}
