package com.taobao.android.upp;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d.a f9878a;

    static {
        t2o.a(404750769);
        t2o.a(404750767);
    }

    public b(d.a aVar) {
        this.f9878a = aVar;
    }

    @Override // com.taobao.android.upp.a
    public d.a get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d.a) ipChange.ipc$dispatch("cd164df", new Object[]{this});
        }
        return this.f9878a;
    }
}
