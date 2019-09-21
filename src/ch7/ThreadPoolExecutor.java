package ch7;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-09 15:56
 **/
public class ThreadPoolExecutor {

    public ThreadPoolExecutor(
            // corePoolSize表示常驻核心线程数。
            int corePoolSize,
            // 表示线程池能够容纳同时执行的最大线程数
            int maximumPoolSize,
            long keepAliveTime,
            TimeUnit unit,
            BlockingQueue<Runnable> workQueue,
            ThreadFactory threadFactory,
            RejectedExecutionHandler handler) {
        if (corePoolSize < 0 ||
            // maximumPoolSize 必须大于或等于 1 也要大于或等于 corePoolSize （第一处）
            maximumPoolSize <= 0 ||
            maximumPoolSize < corePoolSize ||
            keepAliveTime < 0)
            throw new IllegalArgumentException();
        // （第 2 处）
        if (workQueue == null || threadFactory == null || handler == null)
            throw new NullPointerException();
        // 其他代码...
    }
}
