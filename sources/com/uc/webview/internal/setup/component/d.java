package com.uc.webview.internal.setup.component;

import com.uc.webview.internal.setup.component.c;
import com.uc.webview.internal.setup.component.e;
import com.uc.webview.internal.setup.component.r;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.f7l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f14396a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends f {
        private final long c;

        public a(com.uc.webview.internal.setup.component.n nVar) {
            this(nVar.f14431a, nVar.d);
        }

        @Override // com.uc.webview.internal.setup.component.d.f
        public final void a() {
            super.a();
            e(System.currentTimeMillis() - this.c);
        }

        private a(p pVar, com.uc.webview.internal.setup.component.f fVar) {
            super(pVar, fVar);
            this.c = System.currentTimeMillis();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends C0841d {

        /* renamed from: a  reason: collision with root package name */
        final boolean f14397a;
        final boolean b;
        final int c;

        public b(boolean z, boolean z2, boolean z3, int i, boolean z4) {
            super("", (String) null);
            long j;
            long j2;
            long j3;
            this.f14397a = z2;
            this.b = z3;
            this.c = i;
            long j4 = 0;
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            a(j);
            if (z2) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            b(j2);
            if (z3) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            c(j3);
            d(z4 ? 1L : j4);
            e(i);
            y.d();
            b();
        }

        @Override // com.uc.webview.internal.setup.component.d.C0841d
        public final String toString() {
            if (d.f14396a) {
                return "CheckUpgradeCB: {foundNewPkg: " + this.d[0] + ", allFound: " + this.d[1] + ", baseFound: " + this.d[2] + ", timeout: " + this.d[3] + ", tryCount: " + this.d[4] + ", net: " + this.d[5] + "}";
            }
            StringBuilder sb = new StringBuilder(this.d[0]);
            for (int i = 1; i < this.d.length; i++) {
                sb.append(',');
                sb.append(this.d[i]);
            }
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c extends C0841d {
        public c(List<String> list, Map<String, String> map, boolean z, int i) {
            super("PkgNames: " + y.a(list) + ", settings: " + y.a(map), z ? 1 : 0);
            long j;
            b((long) i);
            if (com.uc.webview.internal.setup.component.c.b()) {
                j = 1;
            } else {
                j = 0;
            }
            c(j);
            y.d();
            e(1L);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.internal.setup.component.d$d  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0841d extends h {

        /* renamed from: a  reason: collision with root package name */
        private final String f14398a;

        public C0841d(String str) {
            this(str, (String) null);
        }

        public String toString() {
            return this.f14398a;
        }

        public C0841d(String str, int i) {
            this(str, Integer.toString(i));
        }

        public C0841d(String str, String str2) {
            this.f14398a = str == null ? "" : str;
            if (str2 != null) {
                this.d[0] = str2;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e extends f {
        public e(com.uc.webview.internal.setup.component.n nVar, int i) {
            this(nVar.f14431a, nVar.d, i);
        }

        @Override // com.uc.webview.internal.setup.component.d.f
        public final String toString() {
            return "error: " + this.d[1] + ", " + super.toString();
        }

        private e(p pVar, com.uc.webview.internal.setup.component.f fVar, int i) {
            super(pVar, fVar);
            Arrays.fill(this.d, (Object) null);
            a(pVar.b);
            b(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f extends h {

        /* renamed from: a  reason: collision with root package name */
        protected final p f14399a;
        protected com.uc.webview.internal.setup.component.f b;

        public f(com.uc.webview.internal.setup.component.n nVar) {
            this(nVar.f14431a, nVar.d);
        }

        private void c() {
            com.uc.webview.internal.setup.component.f fVar = this.b;
            if (fVar != null) {
                String str = fVar.i;
                String[] strArr = this.d;
                strArr[1] = str;
                strArr[2] = fVar.j;
                File file = fVar.c;
                if (file != null && file.isFile()) {
                    d(this.b.c.length());
                }
                this.d[4] = this.b.g;
            }
        }

        public void a() {
            c();
        }

        public String toString() {
            if (!d.f14396a) {
                com.uc.webview.internal.setup.component.f fVar = this.b;
                if (fVar == null || fVar.c == null) {
                    return this.f14399a.f14436a;
                }
                return this.f14399a.f14436a + "↓";
            } else if (this.b == null) {
                return this.f14399a.f14436a + f7l.BRACKET_START_STR + this.f14399a.f + f7l.BRACKET_END_STR;
            } else {
                return this.f14399a.f14436a + f7l.BRACKET_START_STR + this.b + f7l.BRACKET_END_STR;
            }
        }

        public f(p pVar, com.uc.webview.internal.setup.component.f fVar) {
            this.f14399a = pVar;
            this.b = fVar;
            a(pVar.b);
            c();
        }

        public f(com.uc.webview.internal.setup.component.n nVar, String str) {
            this(nVar.f14431a, nVar.d);
            this.d[5] = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g extends h {

        /* renamed from: a  reason: collision with root package name */
        protected final com.uc.webview.internal.setup.component.n[] f14400a;

        public g(Collection<com.uc.webview.internal.setup.component.n> collection) {
            this.f14400a = (com.uc.webview.internal.setup.component.n[]) collection.toArray(new com.uc.webview.internal.setup.component.n[collection.size()]);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            int i = 0;
            while (true) {
                com.uc.webview.internal.setup.component.n[] nVarArr = this.f14400a;
                if (i >= nVarArr.length) {
                    break;
                }
                com.uc.webview.internal.setup.component.n nVar = nVarArr[i];
                if (nVar != null) {
                    sb.append(nVar.f14431a.b);
                    sb.append(',');
                    if (nVar.e()) {
                        sb2.append(nVar.f14431a.b);
                        sb2.append(',');
                    }
                    com.uc.webview.internal.setup.component.f fVar = nVar.d;
                    if (fVar != null) {
                        sb3.append(fVar.d());
                        if (!nVar.d()) {
                            sb3.append('.');
                            sb3.append(nVar.d.g);
                        }
                        sb3.append(',');
                    }
                }
                i++;
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
                this.d[0] = sb.toString();
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
                this.d[1] = sb2.toString();
            }
            if (sb3.length() > 0) {
                sb3.setLength(sb3.length() - 1);
                this.d[2] = sb3.toString();
            }
        }

        public String a() {
            return ", ";
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (com.uc.webview.internal.setup.component.n nVar : this.f14400a) {
                d.a(sb, nVar);
            }
            sb.append(a());
            sb.setLength(sb.length() - 2);
            sb.append(']');
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class h extends r.a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class i extends n {
        private final long b = System.currentTimeMillis();

        public i(w wVar) {
            super(wVar);
        }

        public final void a() {
            e(System.currentTimeMillis() - this.b);
            com.uc.webview.internal.setup.component.f fVar = this.f14402a.b.d;
            if (fVar != null) {
                this.d[5] = fVar.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class j extends C0841d {
        public j(String str, int i) {
            super(str, i);
        }

        private j(c.f fVar, int i) {
            super("", fVar.b);
            int i2 = fVar.f14395a;
            if (i2 != i) {
                this.d[1] = Integer.toBinaryString(fVar.f14395a) + ":" + Integer.toBinaryString(i);
            } else {
                this.d[1] = Integer.toBinaryString(i2);
            }
            e(com.uc.webview.internal.setup.component.c.b() ? 1L : 0L);
            y.d();
            b();
        }

        public j(c.f fVar, int i, String str) {
            this(fVar, i);
            this.d[2] = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class k extends C0841d {
        public k(c.h hVar, int i) {
            super(d.a(hVar, i), hVar.b);
            long j;
            long j2;
            long j3 = 0;
            if (hVar.g) {
                j = 1;
            } else {
                j = 0;
            }
            b(j);
            c(i);
            if (com.uc.webview.internal.setup.component.c.d) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            d(j2);
            e(com.uc.webview.internal.setup.component.c.b() ? 1L : j3);
            y.d();
            b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class l extends h {

        /* renamed from: a  reason: collision with root package name */
        private final w f14401a;
        private final int b;

        public l(w wVar, int i) {
            com.uc.webview.internal.setup.component.n[] nVarArr;
            this.f14401a = wVar;
            this.b = i;
            a(wVar.b.f14431a.b);
            com.uc.webview.internal.setup.component.f fVar = wVar.b.d;
            if (fVar != null) {
                this.d[1] = fVar.d() + "." + wVar.b.d.g;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (com.uc.webview.internal.setup.component.n nVar : wVar.f14444a.b) {
                if (nVar.d != null) {
                    sb.append(nVar.f14431a.b);
                    sb.append(',');
                    sb2.append(nVar.d.d());
                    sb2.append(',');
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
                sb2.setLength(sb2.length() - 1);
            }
            this.d[2] = sb.toString();
            this.d[3] = sb2.toString();
            e(i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            d.a(sb, this.f14401a.b);
            for (com.uc.webview.internal.setup.component.n nVar : this.f14401a.f14444a.b) {
                d.a(sb, nVar);
            }
            sb.append("res: ");
            sb.append(d.a(this.b));
            sb.append(", ");
            sb.setLength(sb.length() - 2);
            sb.append(']');
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class m extends g {
        final int b;

        public m(Collection<com.uc.webview.internal.setup.component.n> collection, int i) {
            super(collection);
            this.b = i;
            e(i);
            y.d();
            b();
        }

        @Override // com.uc.webview.internal.setup.component.d.g
        public final String a() {
            return "res: " + d.a(this.b) + super.a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class n extends h {

        /* renamed from: a  reason: collision with root package name */
        protected final w f14402a;
        private final int b;
        private final int c;
        private final File e;

        public n(w wVar) {
            this(wVar, (byte) 0);
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("{");
            sb.append(this.f14402a.d);
            sb.append(":[");
            sb.append(this.f14402a.f14444a.c);
            sb.append(", ");
            sb.append(this.f14402a.b);
            if (this.e != null) {
                sb.append(", ");
                if (d.f14396a) {
                    obj = this.e;
                } else {
                    obj = this.e.getName();
                }
                sb.append(obj);
            }
            sb.append(']');
            if (this.b != -100000) {
                sb.append(", res: ");
                sb.append(this.b);
                sb.append(", err: ");
                sb.append(this.c);
            }
            sb.append('}');
            return sb.toString();
        }

        public n(w wVar, boolean z) {
            this(wVar, (byte) 0);
            e(z ? 1L : 0L);
        }

        private n(w wVar, byte b) {
            this(wVar, -100000, -100000, null);
        }

        public n(w wVar, int i, int i2, File file) {
            this.f14402a = wVar;
            this.b = i;
            this.c = i2;
            this.e = file;
            a(wVar.d);
            b(wVar.b.f14431a.b);
            com.uc.webview.internal.setup.component.n nVar = wVar.f14444a.c.f14412a;
            if (nVar != null) {
                c(nVar.f14431a.b);
            }
            com.uc.webview.internal.setup.component.n nVar2 = wVar.f14444a.c.b;
            if (nVar2 != null) {
                d(nVar2.f14431a.b);
            }
            if (i != -100000) {
                this.d[4] = i + ":" + i2;
            }
            com.uc.webview.internal.setup.component.f fVar = wVar.b.d;
            if (fVar != null) {
                this.d[5] = fVar.c();
            }
        }
    }

    public static void a(String str, int i2, h hVar) {
        int b2 = e.a.b(i2);
        if (!com.uc.webview.internal.setup.component.h.a(b2)) {
            String a2 = e.a.a(i2);
            if (hVar == null) {
                hVar = "";
            }
            Object[] objArr = {"", a2, hVar, null};
            if (!com.uc.webview.internal.setup.component.h.a(b2)) {
                com.uc.webview.internal.setup.component.h.a(b2, str, com.uc.webview.internal.setup.component.h.a("%s[%s] %s", objArr), com.uc.webview.internal.setup.component.h.a(objArr));
            }
        }
    }

    public static /* synthetic */ String a(c.h hVar, int i2) {
        String str;
        Locale.getDefault();
        String a2 = com.uc.webview.internal.setup.g.a(hVar.b);
        String str2 = hVar.c;
        String str3 = hVar.d;
        String binaryString = Long.toBinaryString(hVar.f14395a);
        if (hVar.b == 0) {
            str = "";
        } else {
            str = ", " + com.uc.webview.internal.setup.component.c.b + "." + com.uc.webview.internal.setup.component.c.c;
        }
        String str4 = "Core：" + a2 + f7l.BRACKET_START_STR + str2 + "." + str3 + "_" + binaryString + str + f7l.BRACKET_END_STR;
        if (hVar.e == 3) {
            return str4.concat("，动态切核模式，不执行升级");
        }
        return str4.concat(String.format(Locale.getDefault(), "，expect: %s, mode: %d, nu: %b", Integer.toBinaryString(i2), Integer.valueOf(hVar.e), Boolean.valueOf(hVar.g)));
    }

    public static /* synthetic */ void a(StringBuilder sb, com.uc.webview.internal.setup.component.n nVar) {
        if (f14396a) {
            sb.append(nVar.f14431a.f14436a);
            if (nVar.d != null) {
                sb.append('(');
                sb.append(nVar.d);
                sb.append(')');
            }
        } else {
            sb.append(nVar.f14431a.f14436a);
            if (nVar.d != null) {
                sb.append('(');
                sb.append(nVar.d.d());
                if (!nVar.d()) {
                    sb.append('.');
                    sb.append(nVar.d.g);
                }
                if (nVar.d.c != null) {
                    sb.append("↓");
                }
                sb.append(')');
            }
        }
        sb.append(", ");
    }

    public static /* synthetic */ String a(int i2) {
        return i2 == 0 ? "0" : e.a.a(i2);
    }
}
