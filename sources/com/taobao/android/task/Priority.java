package com.taobao.android.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum Priority {
    UI_TOP,
    UI_NORMAL,
    UI_LOW,
    DEFAULT,
    BG_TOP,
    BG_NORMAL,
    BG_LOW;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Priority priority, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/task/Priority");
    }

    public static Priority valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Priority) ipChange.ipc$dispatch("e4450eb1", new Object[]{str});
        }
        return (Priority) Enum.valueOf(Priority.class, str);
    }
}
