package ch4;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-08-29 7:54 下午
 **/
public class TestWhoLoad {

    public static void main(String[] args) {
        // 正在使用的类加载器: jdk.internal.loader.ClassLoaders$AppClassLoader@69d0a
        ClassLoader c = TestWhoLoad.class.getClassLoader();
        // AppClassLoader 的类加载器是 PlatformClassLoader，即平台类加载器
        ClassLoader c1 = c.getParent();
        // PlatformClassLoader 的父加载器是 Bootstrap。它是使用 C++ 来实现的，返回 null
        ClassLoader c2 = c1.getParent();

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        // 通过以下代码可以查看 Bootstrap 所有已经加载的类库
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }
    }
}/*
jdk8 output:
sun.misc.Launcher$AppClassLoader@18b4aac2
sun.misc.Launcher$ExtClassLoader@61bbe9ba
null

jdk11 output:
jdk.internal.loader.ClassLoaders$AppClassLoader@7c53a9eb
jdk.internal.loader.ClassLoaders$PlatformClassLoader@2752f6e2
null
*/
