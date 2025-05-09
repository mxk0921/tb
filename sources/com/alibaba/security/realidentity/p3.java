package com.alibaba.security.realidentity;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p3 implements p2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final p2 f2784a;

    public p3(Context context) {
        this.f2784a = k3.a(context);
    }

    @Override // com.alibaba.security.realidentity.p2
    public void a(r2 r2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33f47d2", new Object[]{this, r2Var});
        }
    }

    @Override // com.alibaba.security.realidentity.p2
    public void a(int i, int i2, int i3, int i4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9450f2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str});
            return;
        }
        s.a().b();
        this.f2784a.a(i, i2, i3, i4, str);
    }

    @Override // com.alibaba.security.realidentity.p2
    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else {
            this.f2784a.a(bArr);
        }
    }

    @Override // com.alibaba.security.realidentity.p2
    public void a(q2 q2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f58ca3", new Object[]{this, q2Var, new Boolean(z)});
            return;
        }
        s.a().c();
        this.f2784a.a(q2Var, z);
    }
}
