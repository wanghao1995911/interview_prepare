package java8.ε¨ζδ»£η;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:wanghao
 * @Date: 2022/3/9
 */
public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public ProxyInvocationHandler() {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(" π§± π§± π§± θΏε₯δ»£ηθ°η¨ε€ηε¨ ");
        return method.invoke(target, args);
    }
}

