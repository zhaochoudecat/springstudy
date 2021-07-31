package com.example.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by zhaochoudecat on 2021/7/31
 */
public class AfterLog  implements AfterReturningAdvice {

    /**
     * @param returnValue  返回值 the value returned by the method, if any
     * @param method      被调用的方法 method being invoked
     * @param args        被调用的方法的对象的参数 arguments to the method
     * @param target     被调用的目标对象  target of the method invocation. May be {@code null}.
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+target.getClass().getName()+"的"
                + method.getName() + "方法： 返回值" + returnValue);
    }
}
