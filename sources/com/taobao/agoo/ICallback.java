package com.taobao.agoo;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ICallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f6169a;

    static {
        t2o.a(343933279);
    }

    public abstract void onFailure(String str, String str2);

    public abstract void onSuccess();
}
