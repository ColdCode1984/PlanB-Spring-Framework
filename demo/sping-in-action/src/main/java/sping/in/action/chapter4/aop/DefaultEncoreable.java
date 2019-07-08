/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sping.in.action.chapter4.aop;

/**
 * 默认新增接口实现
 * @author 谢朓
 * @version $Id: DefaultEncoreable, v 0.1 2019-01-02 下午8:50 谢朓 Exp $ 
 */
public class DefaultEncoreable implements Encoreable {

    public void performEncore() {
        System.out.println("default encoreable perform...");
    }
}
