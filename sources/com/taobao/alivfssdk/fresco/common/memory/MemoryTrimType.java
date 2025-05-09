package com.taobao.alivfssdk.fresco.common.memory;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum MemoryTrimType {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackground(1.0d),
    OnAppBackgrounded(1.0d);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final double mSuggestedTrimRatio;

    MemoryTrimType(double d) {
        this.mSuggestedTrimRatio = d;
    }

    public static /* synthetic */ Object ipc$super(MemoryTrimType memoryTrimType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/fresco/common/memory/MemoryTrimType");
    }

    public static MemoryTrimType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MemoryTrimType) ipChange.ipc$dispatch("7ffab209", new Object[]{str});
        }
        return (MemoryTrimType) Enum.valueOf(MemoryTrimType.class, str);
    }

    public double getSuggestedTrimRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ab87591", new Object[]{this})).doubleValue();
        }
        return this.mSuggestedTrimRatio;
    }
}
