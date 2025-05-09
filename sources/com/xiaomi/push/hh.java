package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class hh {

    /* renamed from: a  reason: collision with other field name */
    public static final DateFormat f1097a;

    /* renamed from: a  reason: collision with other field name */
    public long f1099a;

    /* renamed from: a  reason: collision with other field name */
    private hl f1100a;

    /* renamed from: a  reason: collision with other field name */
    private List<he> f1101a;

    /* renamed from: a  reason: collision with other field name */
    private final Map<String, Object> f1102a;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    /* renamed from: a  reason: collision with root package name */
    protected static final String f14926a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: b  reason: collision with other field name */
    private static String f1098b = null;
    private static String c = hs.a(5) + "-";
    private static long b = 0;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f1097a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(pg1.ATOM_EXT_UTC));
    }

    public hh() {
        this.d = f1098b;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f1101a = new CopyOnWriteArrayList();
        this.f1102a = new HashMap();
        this.f1100a = null;
    }

    public static synchronized String i() {
        String sb;
        synchronized (hh.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c);
            long j = b;
            b = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    public static String q() {
        return f14926a;
    }

    /* renamed from: a */
    public Bundle mo761a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.d)) {
            bundle.putString("ext_ns", this.d);
        }
        if (!TextUtils.isEmpty(this.g)) {
            bundle.putString("ext_from", this.g);
        }
        if (!TextUtils.isEmpty(this.f)) {
            bundle.putString("ext_to", this.f);
        }
        if (!TextUtils.isEmpty(this.e)) {
            bundle.putString("ext_pkt_id", this.e);
        }
        if (!TextUtils.isEmpty(this.h)) {
            bundle.putString("ext_chid", this.h);
        }
        hl hlVar = this.f1100a;
        if (hlVar != null) {
            bundle.putBundle("ext_ERROR", hlVar.a());
        }
        List<he> list = this.f1101a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (he heVar : this.f1101a) {
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

    /* renamed from: a  reason: collision with other method in class */
    public abstract String m759a();

    public synchronized Collection<String> b() {
        if (this.f1102a == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f1102a.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hh hhVar = (hh) obj;
        hl hlVar = this.f1100a;
        if (hlVar == null ? hhVar.f1100a != null : !hlVar.equals(hhVar.f1100a)) {
            return false;
        }
        String str = this.g;
        if (str == null ? hhVar.g != null : !str.equals(hhVar.g)) {
            return false;
        }
        if (!this.f1101a.equals(hhVar.f1101a)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null ? hhVar.e != null : !str2.equals(hhVar.e)) {
            return false;
        }
        String str3 = this.h;
        if (str3 == null ? hhVar.h != null : !str3.equals(hhVar.h)) {
            return false;
        }
        Map<String, Object> map = this.f1102a;
        if (map == null ? hhVar.f1102a != null : !map.equals(hhVar.f1102a)) {
            return false;
        }
        String str4 = this.f;
        if (str4 == null ? hhVar.f != null : !str4.equals(hhVar.f)) {
            return false;
        }
        String str5 = this.d;
        String str6 = hhVar.d;
        if (str5 != null) {
            if (str5.equals(str6)) {
                return true;
            }
        } else if (str6 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.d;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str5 = this.h;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode = (((((i10 + i5) * 31) + this.f1101a.hashCode()) * 31) + this.f1102a.hashCode()) * 31;
        hl hlVar = this.f1100a;
        if (hlVar != null) {
            i6 = hlVar.hashCode();
        }
        return hashCode + i6;
    }

    public String j() {
        if ("ID_NOT_AVAILABLE".equals(this.e)) {
            return null;
        }
        if (this.e == null) {
            this.e = i();
        }
        return this.e;
    }

    public String k() {
        return this.h;
    }

    public String l() {
        return this.f;
    }

    public String m() {
        return this.g;
    }

    public String n() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String o() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hh.o():java.lang.String");
    }

    public String p() {
        return this.d;
    }

    public hh(Bundle bundle) {
        this.d = f1098b;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f1101a = new CopyOnWriteArrayList();
        this.f1102a = new HashMap();
        this.f1100a = null;
        this.f = bundle.getString("ext_to");
        this.g = bundle.getString("ext_from");
        this.h = bundle.getString("ext_chid");
        this.e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f1101a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                he a2 = he.a((Bundle) parcelable);
                if (a2 != null) {
                    this.f1101a.add(a2);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f1100a = new hl(bundle2);
        }
    }

    public he a(String str) {
        return a(str, null);
    }

    public void k(String str) {
        this.e = str;
    }

    public void l(String str) {
        this.h = str;
    }

    public void m(String str) {
        this.f = str;
    }

    public void n(String str) {
        this.g = str;
    }

    public void o(String str) {
        this.i = str;
    }

    public he a(String str, String str2) {
        for (he heVar : this.f1101a) {
            if (str2 == null || str2.equals(heVar.b())) {
                if (str.equals(heVar.m754a())) {
                    return heVar;
                }
            }
        }
        return null;
    }

    public hl a() {
        return this.f1100a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized Object m758a(String str) {
        Map<String, Object> map = this.f1102a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized Collection<he> m760a() {
        if (this.f1101a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f1101a));
    }

    public void a(he heVar) {
        this.f1101a.add(heVar);
    }

    public void a(hl hlVar) {
        this.f1100a = hlVar;
    }
}
