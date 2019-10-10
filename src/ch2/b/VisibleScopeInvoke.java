package ch2.b;

import ch2.a.VisibleScope;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-10-10 22:46
 **/
public class VisibleScopeInvoke extends VisibleScope {
    public static void main(String[] args) {
        VisibleScope visibleScope = new VisibleScope();
        visibleScope.publicMethod();

        VisibleScopeInvoke visibleScopeInvoke = new VisibleScopeInvoke();
        visibleScopeInvoke.publicMethod();
        visibleScopeInvoke.protectedMethod();
    }
}