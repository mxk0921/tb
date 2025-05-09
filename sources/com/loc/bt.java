package com.loc;

import android.text.TextUtils;
import com.loc.bo;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class bt {
    private String d;
    private boolean e;
    private boolean f;
    bo.a o;
    int l = 20000;
    int m = 20000;
    Proxy n = null;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5611a = false;
    private int b = 20000;
    private boolean c = true;
    private a g = a.NORMAL;
    private b h = b.FIRST_NONDEGRADE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum a {
        NORMAL(0),
        INTERRUPT_IO(1),
        NEVER(2),
        FIX(3),
        SINGLE(4);
        
        private int f;

        a(int i) {
            this.f = i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum b {
        FIRST_NONDEGRADE(0),
        NEVER_GRADE(1),
        DEGRADE_BYERROR(2),
        DEGRADE_ONLY(3),
        FIX_NONDEGRADE(4),
        FIX_DEGRADE_BYERROR(5),
        FIX_DEGRADE_ONLY(6);
        
        private int h;

        b(int i2) {
            this.h = i2;
        }

        public final int a() {
            return this.h;
        }

        public final boolean b() {
            int i2 = this.h;
            if (i2 == FIRST_NONDEGRADE.h || i2 == NEVER_GRADE.h || i2 == FIX_NONDEGRADE.h) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            int i2 = this.h;
            if (i2 == DEGRADE_BYERROR.h || i2 == DEGRADE_ONLY.h || i2 == FIX_DEGRADE_BYERROR.h || i2 == FIX_DEGRADE_ONLY.h) {
                return true;
            }
            return false;
        }

        public final boolean d() {
            int i2 = this.h;
            if (i2 == DEGRADE_BYERROR.h || i2 == FIX_DEGRADE_BYERROR.h) {
                return true;
            }
            return false;
        }

        public final boolean e() {
            if (this.h == NEVER_GRADE.h) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum c {
        HTTP(0),
        HTTPS(1);
        
        private int c;

        c(int i) {
            this.c = i;
        }
    }

    private static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            if (map.containsKey("platinfo")) {
                return c(map.get("platinfo"));
            }
            return null;
        } catch (Throwable th) {
            as.a(th, "ht", "pnfh");
            return null;
        }
    }

    private String b(String str) {
        byte[] d = d();
        if (d == null || d.length == 0) {
            return str;
        }
        Map<String, String> e = e();
        HashMap<String, String> hashMap = bo.e;
        if (hashMap != null) {
            if (e != null) {
                e.putAll(hashMap);
            } else {
                e = hashMap;
            }
        }
        if (e == null) {
            return str;
        }
        String a2 = br.a(e);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("?");
        stringBuffer.append(a2);
        return stringBuffer.toString();
    }

    public abstract Map<String, String> a();

    public abstract String b();

    public String c() {
        return b();
    }

    public String c_() {
        return "";
    }

    public byte[] d() {
        return null;
    }

    public abstract Map<String, String> e();

    public String g() {
        return "";
    }

    public boolean h() {
        return this.c;
    }

    public final String l() {
        return b(b());
    }

    public final String m() {
        return b(c());
    }

    public final int n() {
        return this.l;
    }

    public final Proxy o() {
        return this.n;
    }

    public final a p() {
        return this.g;
    }

    public final boolean q() {
        return this.f5611a;
    }

    public final void r() {
        this.f5611a = true;
    }

    public final boolean s() {
        return this.f;
    }

    public final bo.a t() {
        return this.o;
    }

    public final b u() {
        return this.h;
    }

    public final int v() {
        return this.b;
    }

    public final void w() {
        this.c = false;
    }

    public final String x() {
        return this.d;
    }

    public final boolean y() {
        return this.e;
    }

    public final String z() {
        String str;
        Throwable th;
        try {
            str = c_();
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.f5611a) {
                    str = c(((bp) this).j());
                } else {
                    str = a(a());
                }
            }
        } catch (Throwable th3) {
            th = th3;
            as.a(th, "ht", "pnfr");
            return str;
        }
        return str;
    }

    private static String c(String str) {
        String str2;
        String str3 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("&");
                if (split.length > 1) {
                    int length = split.length;
                    int i = 0;
                    String str4 = str3;
                    while (true) {
                        if (i >= length) {
                            str2 = str3;
                            break;
                        }
                        str2 = split[i];
                        if (str2.contains("sdkversion")) {
                            str4 = str2;
                        }
                        if (str2.contains(DraftMediaHelper.DraftType.PRODUCT)) {
                            break;
                        }
                        i++;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        String[] split2 = str2.split("=");
                        if (split2.length > 1) {
                            str3 = split2[1].trim();
                            if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty(ag.a(str3))) {
                                String[] split3 = str4.split("=");
                                if (split3.length > 1) {
                                    ag.a(str3, split3[1].trim());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            as.a(th, "ht", "pnfp");
        }
        return str3;
    }

    public final void a(int i) {
        this.l = i;
    }

    public final void b(int i) {
        this.m = i;
    }

    public final void a(a aVar) {
        this.g = aVar;
    }

    public final void c(int i) {
        this.b = i;
    }

    public final void a(b bVar) {
        this.h = bVar;
    }

    public final void a(c cVar) {
        this.f = cVar == c.HTTPS;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(Proxy proxy) {
        this.n = proxy;
    }

    public final void a(boolean z) {
        this.e = z;
    }
}
