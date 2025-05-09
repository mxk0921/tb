package com.ut.mini.behavior.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum LogicalType {
    AND("and"),
    OR("or");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;

    LogicalType(String str) {
        this.value = str;
    }

    public static LogicalType getLogicalType(String str) {
        LogicalType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogicalType) ipChange.ipc$dispatch("fbc28faa", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return AND;
        }
        for (LogicalType logicalType : values()) {
            if (logicalType.getValue().equals(str)) {
                return logicalType;
            }
        }
        return AND;
    }

    public static /* synthetic */ Object ipc$super(LogicalType logicalType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/data/LogicalType");
    }

    public static boolean isLogicalType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9829512e", new Object[]{str})).booleanValue();
        }
        if (AND.getValue().equals(str) || OR.getValue().equals(str)) {
            return true;
        }
        return false;
    }

    public static LogicalType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogicalType) ipChange.ipc$dispatch("9ca276a5", new Object[]{str});
        }
        return (LogicalType) Enum.valueOf(LogicalType.class, str);
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
