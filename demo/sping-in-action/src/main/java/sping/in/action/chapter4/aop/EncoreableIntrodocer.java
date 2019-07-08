/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sping.in.action.chapter4.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * 为sping.in.action.chapter4.aop.Performance子类以非侵入方式引入新方法
 *
 * @author 谢朓
 * @version $Id: EncoreableIntrodocer, v 0.1 2019-01-02 下午8:48 谢朓 Exp $ 
 */
@Component
@Aspect
public class EncoreableIntrodocer {

    @DeclareParents(value = "sping.in.action.chapter4.aop.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
