package cn.gingergo.core.gingeriot.pool;

import java.util.concurrent.ScheduledFuture;

/**
 **/
@FunctionalInterface
public interface Scheduled {

    ScheduledFuture<?> submit(Runnable runnable);
}
