package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum LogLevel {
    OFF("off", 8, 7),
    WTF("wtf", 7, 7),
    TLOG("tlog", 6, 6),
    ERROR("error", 5, 6),
    WARN("warn", 4, 5),
    INFO("info", 3, 4),
    DEBUG("debug", 2, 3),
    VERBOSE("verbose", 1, 2),
    ALL("all", 0, 2);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String name;
    public int priority;
    public int value;

    LogLevel(String str, int i, int i2) {
        this.name = str;
        this.value = i;
        this.priority = i2;
    }

    public static /* synthetic */ Object ipc$super(LogLevel logLevel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/utils/LogLevel");
    }

    public static LogLevel valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogLevel) ipChange.ipc$dispatch("3f4f3cb3", new Object[]{str});
        }
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public int compare(LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea589dd5", new Object[]{this, logLevel})).intValue();
        }
        return this.value - logLevel.value;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.priority;
    }

    public int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
