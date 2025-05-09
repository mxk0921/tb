package com.loc;

import com.uc.webview.base.cyclone.BSError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fa {
    public int l;
    public boolean n;

    /* renamed from: a  reason: collision with root package name */
    public int f5689a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public long e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA;
    public short m = 0;
    public int o = 32767;
    public int p = Integer.MAX_VALUE;
    public int q = Integer.MAX_VALUE;
    public boolean r = true;
    public int s = 99;
    public long t = 0;

    public fa(int i, boolean z) {
        this.l = i;
        this.n = z;
    }

    private String e() {
        return this.l + "#" + this.f5689a + "#" + this.b + "#0#" + a();
    }

    private String f() {
        return this.l + "#" + this.h + "#" + this.i + "#" + this.j;
    }

    public final long a() {
        if (this.l == 5) {
            return this.e;
        }
        return this.d;
    }

    public final String b() {
        int i = this.l;
        if (i != 1) {
            if (i == 2) {
                return f();
            }
            if (!(i == 3 || i == 4 || i == 5)) {
                return null;
            }
        }
        return e();
    }

    public final String c() {
        String b = b();
        if (b == null || b.length() <= 0) {
            return "";
        }
        boolean z = this.r;
        return (z ? 1 : 0) + "#" + b;
    }

    /* renamed from: d */
    public final fa clone() {
        fa faVar = new fa(this.l, this.n);
        faVar.f5689a = this.f5689a;
        faVar.b = this.b;
        faVar.c = this.c;
        faVar.d = this.d;
        faVar.e = this.e;
        faVar.f = this.f;
        faVar.g = this.g;
        faVar.h = this.h;
        faVar.i = this.i;
        faVar.j = this.j;
        faVar.k = this.k;
        faVar.m = this.m;
        faVar.o = this.o;
        faVar.p = this.p;
        faVar.q = this.q;
        faVar.r = this.r;
        faVar.s = this.s;
        faVar.t = this.t;
        return faVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fa)) {
            fa faVar = (fa) obj;
            int i = faVar.l;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && this.l == 5 && faVar.c == this.c && faVar.e == this.e && faVar.q == this.q) {
                                return true;
                            }
                            return false;
                        } else if (this.l == 4 && faVar.c == this.c && faVar.d == this.d && faVar.b == this.b) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (this.l == 3 && faVar.c == this.c && faVar.d == this.d && faVar.b == this.b) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (this.l == 2 && faVar.j == this.j && faVar.i == this.i && faVar.h == this.h) {
                    return true;
                } else {
                    return false;
                }
            } else if (this.l == 1 && faVar.c == this.c && faVar.d == this.d && faVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = String.valueOf(this.l).hashCode();
        if (this.l == 2) {
            hashCode = String.valueOf(this.j).hashCode() + String.valueOf(this.i).hashCode();
            i = this.h;
        } else {
            hashCode = String.valueOf(this.c).hashCode() + String.valueOf(this.d).hashCode();
            i = this.b;
        }
        return hashCode2 + hashCode + String.valueOf(i).hashCode();
    }
}
