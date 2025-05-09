package com.taobao.android.stdpop.api;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum PopGravity {
    BOTTOM("bottom"),
    LEFT("left"),
    RIGHT("right"),
    TOP("top"),
    CENTER("center");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String value;

    PopGravity(String str) {
        this.value = str;
    }

    public static /* synthetic */ Object ipc$super(PopGravity popGravity, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/stdpop/api/PopGravity");
    }

    public static PopGravity valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("4f57498c", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(PopGravity.class, str);
        }
        return (PopGravity) valueOf;
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }

    public final void setValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
            return;
        }
        ckf.g(str, "<set-?>");
        this.value = str;
    }
}
