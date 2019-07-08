/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sping.in.action.chapter4.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*
 * 注意：切面必须首先是一个Spring bean
 */
@Component
@Aspect
public class Audience {

    /** ============== 切点 ============== **/

    @Pointcut("execution(* sping.in.action.chapter4.aop.Performance.perform(..))")
    public void performance() {}

    @Pointcut("execution(* sping.in.action.chapter4.aop.Performance.thanksFor(String))" +
            "&& args(audience)")
    public void thanksFor(String audience) {}

    /** ============== 无参通知 ============== **/

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("silence cell phones...");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("take seats...");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("clap clap clap...");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("demand refund!!!");
    }

    /** ============== 环绕通知 ============== **/
    ///*
    // * 和上述切面方法效果一致
    // */
    //@Around("performance()")
    //public void watchPerformances(ProceedingJoinPoint point) {
    //    try {
    //        System.out.println("silence cell phones...");
    //        System.out.println("take seats...");
    //        point.proceed();
    //        System.out.println("clap clap clap...");
    //    } catch (Throwable e) {
    //        System.out.println("demand refund!!!");
    //    }
    //}

    /** ============== 有参通知============== **/

    @Before("thanksFor(audience)")
    public void thanks(String audience) {
        System.out.println("thanks for " + audience);
    }
}
