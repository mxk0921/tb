package com.loc;

import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ee {

    /* renamed from: a  reason: collision with root package name */
    public String f5664a;
    public long b = 0;
    public long c = 0;
    public double d = vu3.b.GEO_NOT_SUPPORT;
    public double e = vu3.b.GEO_NOT_SUPPORT;
    public double f = vu3.b.GEO_NOT_SUPPORT;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public boolean j = false;

    public ee(String str) {
        this.f5664a = str;
    }

    public final double a(ee eeVar) {
        if (eeVar != null) {
            return ep.a(this.e, this.d, eeVar.e, eeVar.d);
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }
}
