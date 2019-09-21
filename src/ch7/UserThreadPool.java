package ch7;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-09-09 16:01
 **/
public class UserThreadPool {
    public static void main(String[] args) {
        // 缓存队列设置固定长度为空2，为了快速触发 rejectHandler
        BlockingQueue queue = new LinkedBlockingDeque(2);
        // 假设外部任务线程的来源由机房 1 和机房 2 的混合调用
        //UserThreadFactory f1 = new UserThreadFactory(" 第 1 机房");

    }
}
