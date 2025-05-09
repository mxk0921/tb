package com.uc.webview.internal.setup.component;

import com.uc.webview.internal.setup.component.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    final n[] f14410a;
    final n[] b;
    final b c = new b();
    private final n[] d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final String f14411a;
        final String b;
        final String c;

        public a(String str) {
            this(str, null, null);
        }

        public a(String str, String str2, String str3) {
            this.f14411a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        n f14412a;
        n b;

        public final String toString() {
            n nVar = this.f14412a;
            if (nVar == null) {
                return "";
            }
            if (this.b == null) {
                return nVar.toString();
            }
            return "[" + this.f14412a + ", " + this.b + "]";
        }
    }

    public i(int i, g.a aVar) {
        int i2;
        int i3;
        int i4 = 1;
        int i5 = 0;
        if (i == 109 || i == 108) {
            this.b = r9;
            n[] nVarArr = {n.f(100)};
            this.f14410a = nVarArr;
            this.d = new n[0];
            return;
        }
        n a2 = com.uc.webview.internal.setup.component.a.a(aVar);
        int[] b2 = n.b();
        int[] c = n.c();
        if (a2 != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i6 = i2 + 2;
        n[] nVarArr2 = new n[i2 + 4];
        this.b = nVarArr2;
        n[] nVarArr3 = new n[i6];
        this.f14410a = nVarArr3;
        this.d = new n[2];
        if (a2 != null) {
            nVarArr2[0] = a2;
            nVarArr3[0] = a2;
            i3 = 1;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i7 = 0;
        while (i7 < 2) {
            n f = n.f(b2[i7]);
            this.b[i4] = f;
            this.f14410a[i3] = f;
            i7++;
            i3++;
            i4++;
        }
        int i8 = 0;
        while (i5 < 2) {
            n f2 = n.f(c[i5]);
            this.b[i4] = f2;
            this.d[i8] = f2;
            i5++;
            i8++;
            i4++;
        }
    }

    public final boolean a() {
        return this.b[0].b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int i = 0;
        if (d.f14396a) {
            n nVar = this.c.f14412a;
            if (nVar != null) {
                sb.append(nVar);
                if (this.c.b != null) {
                    sb.append(", ");
                    sb.append(this.c.b);
                }
            } else {
                n[] nVarArr = this.b;
                int length = nVarArr.length;
                while (i < length) {
                    sb.append(nVarArr[i]);
                    sb.append(", ");
                    i++;
                }
                sb.setLength(sb.length() - 2);
            }
        } else {
            n nVar2 = this.c.f14412a;
            if (nVar2 != null) {
                sb.append(nVar2.f14431a.f14436a);
                if (this.c.b != null) {
                    sb.append(", ");
                    sb.append(this.c.b.f14431a.f14436a);
                }
            } else {
                n[] nVarArr2 = this.b;
                int length2 = nVarArr2.length;
                while (i < length2) {
                    sb.append(nVarArr2[i].f14431a.f14436a);
                    sb.append(", ");
                    i++;
                }
                sb.setLength(sb.length() - 2);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public final n a(String str, boolean z) {
        n[] nVarArr;
        f fVar;
        for (n nVar : this.f14410a) {
            if ((!z || nVar.e()) && (fVar = nVar.d) != null && str.equals(fVar.j)) {
                return nVar;
            }
        }
        return null;
    }

    public final boolean a(n nVar, boolean z) {
        n[] nVarArr;
        n a2;
        for (n nVar2 : this.d) {
            f fVar = nVar2.d;
            if (fVar != null && nVar.d.g.equals(fVar.j) && (a2 = a(nVar2.d.g, z)) != null) {
                b bVar = this.c;
                bVar.f14412a = a2;
                bVar.b = nVar2;
                return true;
            }
        }
        return false;
    }
}
