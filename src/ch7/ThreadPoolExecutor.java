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
            /*
                corePoolSize表示常驻核心线程数。
                如果等于0，则任务执行完之后，没有任何请求进入时销毁线程池的线程；
                如果大于0，即使本地任务执行完毕，核心线程也不会被销毁。
                这个值的设置非常关键，设置多大会浪费资源，设置过小会导致线程频繁地创建或销毁。
             */
            int corePoolSize,
            /*
                表示线程池能够容纳同时执行的最大线程数。
                从上方示例代码中的第 1 处来看，必须大于或等于 1 。如果待执行的线程数大于此值，
                需要借助第 5 个参数的帮助，缓存在队列中。如果 maximumPoo!Size 与 corePoo!Size 相等，即是固定大小线程池。
             */
            int maximumPoolSize,
            /*
                keepAliveTime 表示线程池中的线程空闲时间。
                
             */
            long keepAliveTime,
            // TimeUnit 表示时间单位
            TimeUnit unit,
            // workQueue 表示缓存队列
            BlockingQueue<Runnable> workQueue,
            // threadFactory 表示线程工厂
            ThreadFactory threadFactory,
            // 表示执行拒绝策晤的对象
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
