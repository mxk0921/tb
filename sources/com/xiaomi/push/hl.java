package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hl {

    /* renamed from: a  reason: collision with root package name */
    private int f14931a;

    /* renamed from: a  reason: collision with other field name */
    private String f1107a;

    /* renamed from: a  reason: collision with other field name */
    private List<he> f1108a;
    private String b;
    private String c;
    private String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14932a = new a("internal-server-error");
        public static final a b = new a("forbidden");
        public static final a c = new a("bad-request");
        public static final a d = new a("conflict");
        public static final a e = new a("feature-not-implemented");
        public static final a f = new a("gone");
        public static final a g = new a("item-not-found");
        public static final a h = new a("jid-malformed");
        public static final a i = new a("not-acceptable");
        public static final a j = new a("not-allowed");
        public static final a k = new a("not-authorized");
        public static final a l = new a("payment-required");
        public static final a m = new a("recipient-unavailable");
        public static final a n = new a("redirect");
        public static final a o = new a("registration-required");
        public static final a p = new a("remote-server-error");
        public static final a q = new a("remote-server-not-found");
        public static final a r = new a("remote-server-timeout");
        public static final a s = new a("resource-constraint");
        public static final a t = new a("service-unavailable");
        public static final a u = new a("subscription-required");
        public static final a v = new a("undefined-condition");
        public static final a w = new a("unexpected-request");
        public static final a x = new a("request-timeout");

        /* renamed from: a  reason: collision with other field name */
        private String f1109a;

        public a(String str) {
            this.f1109a = str;
        }

        public String toString() {
            return this.f1109a;
        }
    }

    public hl(int i, String str, String str2, String str3, String str4, List<he> list) {
        this.f14931a = i;
        this.f1107a = str;
        this.c = str2;
        this.b = str3;
        this.d = str4;
        this.f1108a = list;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f1107a;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f14931a);
        String str2 = this.c;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.b;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<he> list = this.f1108a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (he heVar : this.f1108a) {
                Bundle a2 = heVar.a();
                if (a2 != null) {
                    i++;
                    bundleArr[i] = a2;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.b;
        if (str != null) {
            sb.append(str);
        }
        sb.append(f7l.BRACKET_START_STR);
        sb.append(this.f14931a);
        sb.append(f7l.BRACKET_END_STR);
        if (this.d != null) {
            sb.append(" ");
            sb.append(this.d);
        }
        return sb.toString();
    }

    public hl(Bundle bundle) {
        this.f1108a = null;
        this.f14931a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f1107a = bundle.getString("ext_err_type");
        }
        this.b = bundle.getString("ext_err_cond");
        this.c = bundle.getString("ext_err_reason");
        this.d = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f1108a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                he a2 = he.a((Bundle) parcelable);
                if (a2 != null) {
                    this.f1108a.add(a2);
                }
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m762a() {
        StringBuilder sb = new StringBuilder("<error code=\"");
        sb.append(this.f14931a);
        sb.append("\"");
        if (this.f1107a != null) {
            sb.append(" type=\"");
            sb.append(this.f1107a);
            sb.append("\"");
        }
        if (this.c != null) {
            sb.append(" reason=\"");
            sb.append(this.c);
            sb.append("\"");
        }
        sb.append(">");
        if (this.b != null) {
            sb.append("<");
            sb.append(this.b);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.d != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.d);
            sb.append("</text>");
        }
        for (he heVar : m763a()) {
            sb.append(heVar.d());
        }
        sb.append("</error>");
        return sb.toString();
    }

    public hl(a aVar) {
        this.f1108a = null;
        a(aVar);
        this.d = null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized List<he> m763a() {
        List<he> list = this.f1108a;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    private void a(a aVar) {
        this.b = aVar.f1109a;
    }
}
