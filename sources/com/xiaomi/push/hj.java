package com.xiaomi.push;

import android.os.Bundle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hj extends hh {

    /* renamed from: a  reason: collision with root package name */
    private int f14927a;

    /* renamed from: a  reason: collision with other field name */
    private a f1103a;

    /* renamed from: a  reason: collision with other field name */
    private b f1104a;
    private String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public hj(Bundle bundle) {
        super(bundle);
        this.f1104a = b.available;
        this.b = null;
        this.f14927a = Integer.MIN_VALUE;
        this.f1103a = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.f1104a = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f14927a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f1103a = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a */
    public Bundle mo761a() {
        Bundle a2 = super.mo761a();
        b bVar = this.f1104a;
        if (bVar != null) {
            a2.putString("ext_pres_type", bVar.toString());
        }
        String str = this.b;
        if (str != null) {
            a2.putString("ext_pres_status", str);
        }
        int i = this.f14927a;
        if (i != Integer.MIN_VALUE) {
            a2.putInt("ext_pres_prio", i);
        }
        a aVar = this.f1103a;
        if (!(aVar == null || aVar == a.available)) {
            a2.putString("ext_pres_mode", aVar.toString());
        }
        return a2;
    }

    public hj(b bVar) {
        this.f1104a = b.available;
        this.b = null;
        this.f14927a = Integer.MIN_VALUE;
        this.f1103a = null;
        a(bVar);
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a  reason: collision with other method in class */
    public String mo761a() {
        StringBuilder sb = new StringBuilder("<presence");
        if (p() != null) {
            sb.append(" xmlns=\"");
            sb.append(p());
            sb.append("\"");
        }
        if (j() != null) {
            sb.append(" id=\"");
            sb.append(j());
            sb.append("\"");
        }
        if (l() != null) {
            sb.append(" to=\"");
            sb.append(hs.a(l()));
            sb.append("\"");
        }
        if (m() != null) {
            sb.append(" from=\"");
            sb.append(hs.a(m()));
            sb.append("\"");
        }
        if (k() != null) {
            sb.append(" chid=\"");
            sb.append(hs.a(k()));
            sb.append("\"");
        }
        if (this.f1104a != null) {
            sb.append(" type=\"");
            sb.append(this.f1104a);
            sb.append("\"");
        }
        sb.append(">");
        if (this.b != null) {
            sb.append("<status>");
            sb.append(hs.a(this.b));
            sb.append("</status>");
        }
        if (this.f14927a != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f14927a);
            sb.append("</priority>");
        }
        a aVar = this.f1103a;
        if (!(aVar == null || aVar == a.available)) {
            sb.append("<show>");
            sb.append(this.f1103a);
            sb.append("</show>");
        }
        sb.append(o());
        hl a2 = a();
        if (a2 != null) {
            sb.append(a2.m762a());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    public void a(int i) {
        if (i < -128 || i > 128) {
            throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
        }
        this.f14927a = i;
    }

    public void a(a aVar) {
        this.f1103a = aVar;
    }

    public void a(b bVar) {
        if (bVar != null) {
            this.f1104a = bVar;
            return;
        }
        throw new NullPointerException("Type cannot be null");
    }

    @Override // com.xiaomi.push.hh
    public void a(String str) {
        this.b = str;
    }
}
