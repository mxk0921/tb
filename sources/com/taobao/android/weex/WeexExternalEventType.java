package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexExternalEventType {
    INVALID(0),
    START(1),
    UPDATE(2),
    END(3),
    CANCEL(4);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mValue;

    WeexExternalEventType(int i) {
        this.mValue = i;
    }

    public static /* synthetic */ Object ipc$super(WeexExternalEventType weexExternalEventType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexExternalEventType");
    }

    public static WeexExternalEventType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexExternalEventType) ipChange.ipc$dispatch("c02ae27d", new Object[]{str});
        }
        return (WeexExternalEventType) Enum.valueOf(WeexExternalEventType.class, str);
    }

    public int value() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d249f56b", new Object[]{this})).intValue();
        }
        return this.mValue;
    }
}
