package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h0 extends c0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f2728a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;

    public h0(byte[] bArr, int i, int i2, int i3, int i4, float f) {
        this.f2728a = bArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
    }

    public static /* synthetic */ Object ipc$super(h0 h0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/h0");
    }

    @Override // com.alibaba.security.realidentity.c0
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return this.e;
    }

    @Override // com.alibaba.security.realidentity.c0
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.security.realidentity.c0
    public byte[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[]{this});
        }
        return this.f2728a;
    }

    @Override // com.alibaba.security.realidentity.c0
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return this.c;
    }

    @Override // com.alibaba.security.realidentity.c0
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
