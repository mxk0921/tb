package com.taobao.android.ultronx.base;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CPointer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f9875a;

    static {
        t2o.a(939524098);
    }

    public CPointer(long j) {
        this.f9875a = j;
    }

    public static native void _deleteCPointer(long j);

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        _deleteCPointer(this.f9875a);
    }
}
