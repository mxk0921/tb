package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hg extends hh {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14925a;
    private String b;

    /* renamed from: b  reason: collision with other field name */
    private boolean f1096b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    public hg() {
        this.b = null;
        this.c = null;
        this.f14925a = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.f1096b = false;
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a */
    public Bundle mo761a() {
        Bundle a2 = super.mo761a();
        if (!TextUtils.isEmpty(this.b)) {
            a2.putString("ext_msg_type", this.b);
        }
        String str = this.d;
        if (str != null) {
            a2.putString("ext_msg_lang", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            a2.putString("ext_msg_sub", str2);
        }
        String str3 = this.f;
        if (str3 != null) {
            a2.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.g)) {
            a2.putString("ext_body_encode", this.g);
        }
        String str4 = this.c;
        if (str4 != null) {
            a2.putString("ext_msg_thread", str4);
        }
        String str5 = this.h;
        if (str5 != null) {
            a2.putString("ext_msg_appid", str5);
        }
        if (this.f14925a) {
            a2.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.i)) {
            a2.putString("ext_msg_seq", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            a2.putString("ext_msg_mseq", this.j);
        }
        if (!TextUtils.isEmpty(this.k)) {
            a2.putString("ext_msg_fseq", this.k);
        }
        if (this.f1096b) {
            a2.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.l)) {
            a2.putString("ext_msg_status", this.l);
        }
        return a2;
    }

    @Override // com.xiaomi.push.hh
    public String b() {
        return this.b;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.i;
    }

    public String e() {
        return this.j;
    }

    @Override // com.xiaomi.push.hh
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hg hgVar = (hg) obj;
        if (!super.equals(hgVar)) {
            return false;
        }
        String str = this.f;
        if (str == null ? hgVar.f != null : !str.equals(hgVar.f)) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null ? hgVar.d != null : !str2.equals(hgVar.d)) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null ? hgVar.e != null : !str3.equals(hgVar.e)) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null ? hgVar.c != null : !str4.equals(hgVar.c)) {
            return false;
        }
        if (this.b == hgVar.b) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.k;
    }

    public String g() {
        return this.l;
    }

    public String h() {
        return this.d;
    }

    @Override // com.xiaomi.push.hh
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.b;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }

    public void i(String str) {
        this.c = str;
    }

    public void j(String str) {
        this.d = str;
    }

    public hg(Bundle bundle) {
        super(bundle);
        this.b = null;
        this.c = null;
        this.f14925a = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.f1096b = false;
        this.b = bundle.getString("ext_msg_type");
        this.d = bundle.getString("ext_msg_lang");
        this.c = bundle.getString("ext_msg_thread");
        this.e = bundle.getString("ext_msg_sub");
        this.f = bundle.getString("ext_msg_body");
        this.g = bundle.getString("ext_body_encode");
        this.h = bundle.getString("ext_msg_appid");
        this.f14925a = bundle.getBoolean("ext_msg_trans", false);
        this.f1096b = bundle.getBoolean("ext_msg_encrypt", false);
        this.i = bundle.getString("ext_msg_seq");
        this.j = bundle.getString("ext_msg_mseq");
        this.k = bundle.getString("ext_msg_fseq");
        this.l = bundle.getString("ext_msg_status");
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a  reason: collision with other method in class */
    public String mo761a() {
        hl a2;
        StringBuilder sb = new StringBuilder("<message");
        if (p() != null) {
            sb.append(" xmlns=\"");
            sb.append(p());
            sb.append("\"");
        }
        if (this.d != null) {
            sb.append(" xml:lang=\"");
            sb.append(h());
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
        if (!TextUtils.isEmpty(d())) {
            sb.append(" seq=\"");
            sb.append(d());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(e())) {
            sb.append(" mseq=\"");
            sb.append(e());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(f())) {
            sb.append(" fseq=\"");
            sb.append(f());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(g())) {
            sb.append(" status=\"");
            sb.append(g());
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
        if (this.f14925a) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.h)) {
            sb.append(" appid=\"");
            sb.append(c());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(" type=\"");
            sb.append(this.b);
            sb.append("\"");
        }
        if (this.f1096b) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.e != null) {
            sb.append("<subject>");
            sb.append(hs.a(this.e));
            sb.append("</subject>");
        }
        if (this.f != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.g)) {
                sb.append(" encode=\"");
                sb.append(this.g);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(hs.a(this.f));
            sb.append("</body>");
        }
        if (this.c != null) {
            sb.append("<thread>");
            sb.append(this.c);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.b) && (a2 = a()) != null) {
            sb.append(a2.m762a());
        }
        sb.append(o());
        sb.append("</message>");
        return sb.toString();
    }

    public void b(String str) {
        this.i = str;
    }

    public void c(String str) {
        this.j = str;
    }

    public void d(String str) {
        this.k = str;
    }

    public void e(String str) {
        this.l = str;
    }

    public void f(String str) {
        this.b = str;
    }

    public void g(String str) {
        this.e = str;
    }

    public void h(String str) {
        this.f = str;
    }

    @Override // com.xiaomi.push.hh
    public void a(String str) {
        this.h = str;
    }

    public void b(boolean z) {
        this.f1096b = z;
    }

    @Override // com.xiaomi.push.hh
    public void a(String str, String str2) {
        this.f = str;
        this.g = str2;
    }

    public void a(boolean z) {
        this.f14925a = z;
    }
}
