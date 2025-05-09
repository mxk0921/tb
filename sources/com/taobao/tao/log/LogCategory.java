package com.taobao.tao.log;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.logger.EventLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum LogCategory {
    CodeLog("CodeLog", 1),
    TraceEventLog("TraceEventLog", 2),
    SceneLog("SceneLog", 3),
    PageLog("PageLog", 4),
    EventLog(EventLogger.TAG, 5),
    MetricLog("MetricLog", 6),
    SpanLog("SpanLog", 7);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int index;
    private String name;

    LogCategory(String str, int i) {
        this.name = str;
        this.index = i;
    }

    public static /* synthetic */ Object ipc$super(LogCategory logCategory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/LogCategory");
    }

    public static LogCategory valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogCategory) ipChange.ipc$dispatch("3db1ad15", new Object[]{str});
        }
        return (LogCategory) Enum.valueOf(LogCategory.class, str);
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
        LogCategory[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46b1d505", new Object[]{new Integer(i)});
        }
        for (LogCategory logCategory : values()) {
            if (logCategory.getIndex() == i) {
                return logCategory.name;
            }
        }
        return null;
    }
}
