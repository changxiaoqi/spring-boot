package com.cxq.springboot.annotation;

import org.apache.ibatis.javassist.NotFoundException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

/**
 * 解决终端保存问题：需要特定参数：
 * String terminals,
 * String delTerminals
 * Created by 李国勇 on 2019/4/4.
 */
@Aspect
@Component
public class CityAspectJ implements Ordered {

    /**
     * 环绕通知：解决终端保存问题：需要特定参数：
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("@annotation(com.cxq.springboot.annotation.CityAnno)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        // 类对象
        Class<?> clazz = Class.forName(point.getTarget().getClass().getName());
        //参数值集合
        Object[] args = point.getArgs();
        //获取参数名称和值

        String name = point.getSignature().getName();

        Method method = clazz.getDeclaredMethod(name);

        Parameter[] parameters = method.getParameters();

        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

//        Map<String, String> nameAndArgs = this.getFieldNameWithValues(this.getClass(), clazz.getName(), point.getSignature().getName(), args);
//        System.out.println(nameAndArgs.toString());

        Object o = point.proceed(args);

        return o;
    }

    /**
     * @param cls
     * @param clazzName
     * @param methodName
     * @param args
     * @return
     * @throws NotFoundException
     */
    private Map<String, String> getFieldNameWithValues(Class cls, String clazzName, String methodName, Object[] args) throws NotFoundException {
        Map<String, String> map = new HashMap<>(2);

//        ClassPool pool = ClassPool.getDefault();
//        ClassClassPath classPath = new ClassClassPath(cls);
//        pool.insertClassPath(classPath);
//
//        CtClass cc = pool.get(clazzName);
//        CtMethod cm = cc.getDeclaredMethod(methodName);
//        MethodInfo methodInfo = cm.getMethodInfo();
//        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
//        LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);
//        if (attr == null) {
//            // exception
//        }
//        // String[] paramNames = new String[cm.getParameterTypes().length];
//        int pos = Modifier.isStatic(cm.getModifiers()) ? 0 : 1;
//        for (int i = 0; i < cm.getParameterTypes().length; i++) {
//            if (Objects.equals(SA_UP_TERMINALS, attr.variableName(i + pos))
//                    || Objects.equals(DEL_TERMINALS, attr.variableName(i + pos))) {
//                map.put(attr.variableName(i + pos), args[i].toString());//paramNames即参数名
//            }
//        }

        //Map<>
        return map;
    }

    @Override
    public int getOrder() {
        return 90;
    }
}
