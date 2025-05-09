package com.loc;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fl extends r {

    /* renamed from: a  reason: collision with root package name */
    Map<String, String> f5703a = null;
    Map<String, String> b = null;
    String c = "";
    byte[] d = null;
    private String e = null;

    @Override // com.loc.bt
    public final Map<String, String> a() {
        return this.f5703a;
    }

    @Override // com.loc.bt
    public final String b() {
        return this.c;
    }

    @Override // com.loc.r, com.loc.bt
    public final String c() {
        return !TextUtils.isEmpty(this.e) ? this.e : super.c();
    }

    @Override // com.loc.bt
    public final byte[] d() {
        return this.d;
    }

    @Override // com.loc.bt
    public final Map<String, String> e() {
        return this.b;
    }

    public final void a(Map<String, String> map) {
        this.f5703a = map;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void a(byte[] bArr) {
        this.d = bArr;
    }

    public final void b(Map<String, String> map) {
        this.b = map;
    }
}
