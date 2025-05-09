package com.uc.webview.internal.setup.component;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.internal.setup.component.k;
import java.io.File;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f {
    static final /* synthetic */ boolean k = true;

    /* renamed from: a  reason: collision with root package name */
    Object f14405a;
    File b;
    File c;
    String d;
    String e;
    String f;
    String g;
    String h;
    public String i;
    public String j;
    private String l;
    private String m;

    public f(p pVar, String str) {
        this(pVar, str, null);
    }

    public static f a(p pVar, k.f fVar) {
        if (k || (fVar != null && !TextUtils.isEmpty(fVar.f14427a))) {
            File file = new File(fVar.f14427a);
            f fVar2 = new f(pVar, !TextUtils.isEmpty(fVar.b) ? fVar.b : file.getName(), fVar.c);
            fVar2.c = file;
            return fVar2;
        }
        throw new AssertionError();
    }

    private void e() {
        this.e = "";
        this.i = "";
        this.j = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.m = "";
    }

    public final String b() {
        if (TextUtils.isEmpty(this.l)) {
            return this.g;
        }
        return this.l;
    }

    public final String c() {
        return this.i + "." + a();
    }

    public final String d() {
        return this.i + "." + this.j;
    }

    public boolean equals(Object obj) {
        File file;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.e.equals(fVar.e) || !this.i.equals(fVar.i) || !this.j.equals(fVar.j) || ((!TextUtils.isEmpty(fVar.f) && !fVar.f.equals(this.f)) || ((!TextUtils.isEmpty(fVar.g) && !fVar.g.equals(this.g)) || ((!TextUtils.isEmpty(fVar.b()) && !fVar.b().equals(b())) || ((file = fVar.c) != null && !file.equals(this.c)))))) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        String str2;
        if (d.f14396a) {
            String str3 = this.e;
            String str4 = this.i;
            String str5 = this.j;
            String str6 = "";
            if (TextUtils.isEmpty(this.m)) {
                str = str6;
            } else {
                str = f7l.BRACKET_START_STR + this.m + f7l.BRACKET_END_STR;
            }
            String str7 = this.f;
            String str8 = this.g;
            if (TextUtils.isEmpty(this.l) || this.l.equals(this.g)) {
                str2 = str6;
            } else {
                str2 = "," + this.l;
            }
            if (this.c != null) {
                StringBuilder sb = new StringBuilder(",");
                sb.append(this.c);
                if (this.c.isFile()) {
                    str6 = f7l.BRACKET_START_STR + this.c.length() + f7l.BRACKET_END_STR;
                }
                sb.append(str6);
                str6 = sb.toString();
            }
            return str3 + "[" + str4 + "." + str5 + str + "-" + str7 + "." + str8 + str2 + str6 + "]";
        }
        String str9 = this.d;
        if (!TextUtils.isEmpty(this.m) && !this.m.equals(this.j)) {
            str9 = str9 + "(rseq: " + this.m + f7l.BRACKET_END_STR;
        }
        if (this.c == null) {
            return str9;
        }
        return str9 + "↓";
    }

    private f(p pVar, String str, String str2) {
        a(pVar, str, str2);
    }

    public f(String str) {
        a(null, str, null);
    }

    public final String a() {
        return TextUtils.isEmpty(this.m) ? this.j : this.m;
    }

    public final void a(f fVar) {
        this.d = fVar.d;
        this.i = fVar.i;
        this.j = fVar.j;
        if (!TextUtils.isEmpty(fVar.f)) {
            this.f = fVar.f;
        }
        if (!TextUtils.isEmpty(fVar.g)) {
            this.g = fVar.g;
        }
        if (!TextUtils.isEmpty(fVar.l)) {
            this.l = fVar.l;
        }
        if (!TextUtils.isEmpty(fVar.m)) {
            this.m = fVar.m;
        }
        File file = fVar.c;
        if (file != null) {
            this.c = file;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (r12 == false) goto L_0x008b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.uc.webview.internal.setup.component.p r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.f.a(com.uc.webview.internal.setup.component.p, java.lang.String, java.lang.String):void");
    }

    private void a(p pVar) {
        String str;
        if (pVar != null) {
            if (!TextUtils.isEmpty(this.i)) {
                str = this.i + "." + this.j;
            } else if (TextUtils.isEmpty(this.d)) {
                str = "unknown";
            } else {
                str = "c" + this.d.hashCode();
            }
            this.b = new File(pVar.i, (EnvInfo.is64Bit() ? "arm64" : "arm32") + "/" + str);
        }
    }
}
