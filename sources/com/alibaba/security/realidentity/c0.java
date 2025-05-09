package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class c0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract int a();

    public abstract String b();

    public abstract byte[] c();

    public abstract int d();

    public abstract int e();

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (a() > 0) {
            return true;
        }
        return false;
    }
}
