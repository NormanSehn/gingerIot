package cn.gingergo.core.gingeriot;

import cn.gingergo.core.gingeriot.bootstrap.BaseAuthService;
import org.springframework.stereotype.Service;



@Service
public class DefaultAutoService implements BaseAuthService {
    @Override
    public boolean authorized(String username, String password) {
        return true;
    }
}
