package com.alipay.sdk.util;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class H5PayResultModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f4538a;
    public String b;

    public String getResultCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30496759", new Object[]{this});
        }
        return this.b;
    }

    public String getReturnUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78c16730", new Object[]{this});
        }
        return this.f4538a;
    }

    public void setResultCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcd0b3d", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setReturnUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a93aae", new Object[]{this, str});
        } else {
            this.f4538a = str;
        }
    }
}
