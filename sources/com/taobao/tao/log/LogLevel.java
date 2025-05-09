package com.taobao.tao.log;

import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum LogLevel {
    ALL("ALL", 0),
    V("V", 0),
    D(TLogTracker.LEVEL_DEBUG, 1),
    I(TLogTracker.LEVEL_INFO, 2),
    W("W", 3),
    E("E", 4),
    F(UTConstant.Args.UT_SUCCESS_F, 5),
    N("N", 6),
    L("L", 6);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int index;
    private String name;

    LogLevel(String str, int i) {
        this.name = str;
        this.index = i;
    }

    public static /* synthetic */ Object ipc$super(LogLevel logLevel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/LogLevel");
    }

    public static LogLevel valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogLevel) ipChange.ipc$dispatch("aeff021f", new Object[]{str});
        }
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.index;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public static String getName(int i) {
        LogLevel[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46b1d505", new Object[]{new Integer(i)});
        }
        for (LogLevel logLevel : values()) {
            if (logLevel.getIndex() == i) {
                return logLevel.name;
            }
        }
        return null;
    }
}
