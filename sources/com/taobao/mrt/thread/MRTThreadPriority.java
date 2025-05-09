package com.taobao.mrt.thread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum MRTThreadPriority {
    LOW("low", 8),
    HIGH("high", 10);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String name;
    private final int threadPriority;

    MRTThreadPriority(String str, int i) {
        this.name = str;
        this.threadPriority = i;
    }

    public static /* synthetic */ Object ipc$super(MRTThreadPriority mRTThreadPriority, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/thread/MRTThreadPriority");
    }

    public static MRTThreadPriority valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTThreadPriority) ipChange.ipc$dispatch("70ed81bf", new Object[]{str});
        }
        return (MRTThreadPriority) Enum.valueOf(MRTThreadPriority.class, str);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public int getThreadPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83c2913e", new Object[]{this})).intValue();
        }
        return this.threadPriority;
    }
}
