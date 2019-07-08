/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sping.in.action.chapter4.aop;

import org.springframework.stereotype.Component;

/**
 *
 * @author 谢朓
 * @version $Id: MyPerform, v 0.1 2019-01-02 下午7:42 谢朓 Exp $ 
 */
@Component
public class MyPerformance implements Performance {

    public void perform() {
        System.out.println("my perform...");
    }

    public void thanksFor(String audience) {
        System.out.println(audience + ", you are my heart!");
    }

}
