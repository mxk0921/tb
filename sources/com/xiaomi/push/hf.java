package com.xiaomi.push;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hf extends hh {

    /* renamed from: a  reason: collision with root package name */
    private a f14923a;

    /* renamed from: a  reason: collision with other field name */
    private final Map<String, String> f1094a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14924a = new a("get");
        public static final a b = new a("set");
        public static final a c = new a("result");
        public static final a d = new a("error");
        public static final a e = new a("command");

        /* renamed from: a  reason: collision with other field name */
        private String f1095a;

        private a(String str) {
            this.f1095a = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = f14924a;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = b;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = d;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = c;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = e;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        public String toString() {
            return this.f1095a;
        }
    }

    public hf() {
        this.f14923a = a.f14924a;
        this.f1094a = new HashMap();
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a */
    public Bundle mo761a() {
        Bundle a2 = super.mo761a();
        a aVar = this.f14923a;
        if (aVar != null) {
            a2.putString("ext_iq_type", aVar.toString());
        }
        return a2;
    }

    @Override // com.xiaomi.push.hh
    public String b() {
        return null;
    }

    public hf(Bundle bundle) {
        super(bundle);
        this.f14923a = a.f14924a;
        this.f1094a = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f14923a = a.a(bundle.getString("ext_iq_type"));
        }
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a  reason: collision with other method in class */
    public a mo761a() {
        return this.f14923a;
    }

    @Override // com.xiaomi.push.hh
    /* renamed from: a */
    public String mo761a() {
        String str;
        StringBuilder sb = new StringBuilder("<iq ");
        if (j() != null) {
            sb.append("id=\"" + j() + "\" ");
        }
        if (l() != null) {
            sb.append("to=\"");
            sb.append(hs.a(l()));
            sb.append("\" ");
        }
        if (m() != null) {
            sb.append("from=\"");
            sb.append(hs.a(m()));
            sb.append("\" ");
        }
        if (k() != null) {
            sb.append("chid=\"");
            sb.append(hs.a(k()));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f1094a.entrySet()) {
            sb.append(hs.a(entry.getKey()));
            sb.append("=\"");
            sb.append(hs.a(entry.getValue()));
            sb.append("\" ");
        }
        if (this.f14923a == null) {
            str = "type=\"get\">";
        } else {
            sb.append("type=\"");
            sb.append(mo761a());
            str = "\">";
        }
        sb.append(str);
        String b = b();
        if (b != null) {
            sb.append(b);
        }
        sb.append(o());
        hl a2 = a();
        if (a2 != null) {
            sb.append(a2.m762a());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    public void a(a aVar) {
        if (aVar == null) {
            aVar = a.f14924a;
        }
        this.f14923a = aVar;
    }

    public synchronized void a(Map<String, String> map) {
        this.f1094a.putAll(map);
    }
}
