package com.taobao.android.tbuprofen.log;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum TBPLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mLevel;

    TBPLogLevel(int i) {
        this.mLevel = i;
    }

    public static /* synthetic */ Object ipc$super(TBPLogLevel tBPLogLevel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbuprofen/log/TBPLogLevel");
    }

    public static TBPLogLevel valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPLogLevel) ipChange.ipc$dispatch("6211b7ce", new Object[]{str});
        }
        return (TBPLogLevel) Enum.valueOf(TBPLogLevel.class, str);
    }
}
