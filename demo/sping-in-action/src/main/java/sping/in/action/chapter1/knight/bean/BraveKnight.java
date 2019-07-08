/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package sping.in.action.chapter1.knight.bean;

import org.springframework.beans.factory.InitializingBean;
import sping.in.action.chapter1.knight.bean.Knight;
import sping.in.action.chapter1.knight.bean.Quest;

/**
 *
 * @author 谢朓
 * @version $Id: BraveKnight, v 0.1 2018-12-27 下午2:04 谢朓 Exp $ 
 */
public class BraveKnight implements Knight, InitializingBean {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }

    public void init() {
        System.out.println("Custom init done...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Callback afterPropertiesSet done...");
    }
}
