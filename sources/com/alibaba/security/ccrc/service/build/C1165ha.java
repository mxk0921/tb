package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.ha  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1165ha<F, S> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public F f2595a;
    public S b;

    public C1165ha(F f, S s) {
        this.f2595a = f;
        this.b = s;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1165ha.class != obj.getClass()) {
            return false;
        }
        C1165ha haVar = (C1165ha) obj;
        if (!C1180n.a(this.f2595a, haVar.f2595a)) {
            return false;
        }
        return C1180n.a(this.b, haVar.b);
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        F f = this.f2595a;
        if (f == null) {
            i = 0;
        } else {
            i = f.hashCode();
        }
        S s = this.b;
        if (s != null) {
            i2 = s.hashCode();
        }
        return i2 ^ i;
    }
}
