package com.taobao.android.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum WeexEventTarget {
    WINDOW_TARGET(0),
    DOCUMENT_TARGET(1),
    BODY_TARGET(2),
    WEEX_TARGET(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mTarget;

    WeexEventTarget(int i) {
        this.mTarget = i;
    }

    public static WeexEventTarget convertWeexEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexEventTarget) ipChange.ipc$dispatch("7a05758", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return WINDOW_TARGET;
        }
        if (i == 1) {
            return DOCUMENT_TARGET;
        }
        if (i == 2) {
            return BODY_TARGET;
        }
        if (i != 3) {
            return WINDOW_TARGET;
        }
        return WEEX_TARGET;
    }

    public static /* synthetic */ Object ipc$super(WeexEventTarget weexEventTarget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/WeexEventTarget");
    }

    public static WeexEventTarget valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexEventTarget) ipChange.ipc$dispatch("7c75479b", new Object[]{str});
        }
        return (WeexEventTarget) Enum.valueOf(WeexEventTarget.class, str);
    }

    public int getEventTarget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e795ed8f", new Object[]{this})).intValue();
        }
        return this.mTarget;
    }
}
