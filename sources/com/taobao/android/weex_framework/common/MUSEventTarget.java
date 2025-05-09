package com.taobao.android.weex_framework.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum MUSEventTarget {
    MUS_WINDOW_TARGET(0),
    MUS_DOCUMENT_TARGET(1),
    MUS_BODY_TARGET(2),
    MUS_WEEX_TARGET(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int target;

    MUSEventTarget(int i) {
        this.target = i;
    }

    public static /* synthetic */ Object ipc$super(MUSEventTarget mUSEventTarget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/common/MUSEventTarget");
    }

    public static MUSEventTarget valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSEventTarget) ipChange.ipc$dispatch("46cfcf62", new Object[]{str});
        }
        return (MUSEventTarget) Enum.valueOf(MUSEventTarget.class, str);
    }

    public int getMUSEventTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77f22270", new Object[]{this})).intValue();
        }
        return this.target;
    }
}
