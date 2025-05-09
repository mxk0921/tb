package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z extends c0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f2911a;
    public a0 b;
    public byte[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public byte[] h;

    public z(a0 a0Var, byte[] bArr, int i, int i2, int i3) {
        this.b = a0Var;
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f2911a = a0Var.g0;
    }

    public static /* synthetic */ Object ipc$super(z zVar, String str, Object... objArr) {
        if (str.hashCode() == 95609329) {
            return new Boolean(super.f());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/z");
    }

    @Override // com.alibaba.security.realidentity.c0
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            return a0Var.f2649a ? 1 : 0;
        }
        return 0;
    }

    @Override // com.alibaba.security.realidentity.c0
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        a0 a0Var = this.b;
        if (a0Var == null) {
            return null;
        }
        return a0Var.t0;
    }

    @Override // com.alibaba.security.realidentity.c0
    public byte[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.alibaba.security.realidentity.c0
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return this.e;
    }

    @Override // com.alibaba.security.realidentity.c0
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // com.alibaba.security.realidentity.c0
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.g == 1002) {
            return false;
        }
        return super.f();
    }

    public a0 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a0) ipChange.ipc$dispatch("68e50003", new Object[]{this});
        }
        return this.b;
    }

    public byte[] h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b4130dce", new Object[]{this});
        }
        return this.h;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else {
            this.h = bArr;
        }
    }
}
