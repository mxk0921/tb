package com.alibaba.security.client.smart.core.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EvalResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String errorMsg;
    public boolean hit;
    public boolean success;
    public String traceInfo;

    public EvalResult() {
    }

    public boolean success() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4550b0e", new Object[]{this})).booleanValue();
        }
        return this.success;
    }

    public EvalResult(boolean z, boolean z2, String str) {
        this(z, z2, str, null);
    }

    public EvalResult(boolean z, boolean z2, String str, String str2) {
        this.hit = z;
        this.success = z2;
        this.errorMsg = str;
        this.traceInfo = str2;
    }
}
