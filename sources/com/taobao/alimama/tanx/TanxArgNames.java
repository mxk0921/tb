package com.taobao.alimama.tanx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum TanxArgNames {
    UT_ARGS("utArgs"),
    MONITOR_ARGS("monitorArgs"),
    MACRO_ARGS("macroArgs");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String key;

    TanxArgNames(String str) {
        this.key = str;
    }

    public static /* synthetic */ Object ipc$super(TanxArgNames tanxArgNames, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/tanx/TanxArgNames");
    }

    public static TanxArgNames valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TanxArgNames) ipChange.ipc$dispatch("c74bc787", new Object[]{str});
        }
        return (TanxArgNames) Enum.valueOf(TanxArgNames.class, str);
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.key;
    }
}
