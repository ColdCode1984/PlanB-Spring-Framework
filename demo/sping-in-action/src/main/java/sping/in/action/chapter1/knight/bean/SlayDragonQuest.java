/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package sping.in.action.chapter1.knight.bean;

import sping.in.action.chapter1.knight.bean.Quest;

import java.io.PrintStream;

/**
 *
 * @author 谢朓
 * @version $Id: SlayDragonQuest, v 0.1 2018-12-27 下午2:02 谢朓 Exp $ 
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking an quest to slay the dragon!");
    }
}
