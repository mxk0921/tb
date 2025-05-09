package com.xiaomi.push;

import com.xiaomi.push.ju;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ke extends ju {
    private static int b = 10000;
    private static int c = 10000;
    private static int d = 10000;
    private static int e = 10485760;
    private static int f = 104857600;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends ju.a {
        public a() {
            super(false, true);
        }

        @Override // com.xiaomi.push.ju.a, com.xiaomi.push.ka
        public jy a(ki kiVar) {
            ke keVar = new ke(kiVar, ((ju.a) this).f1468a, this.b);
            int i = ((ju.a) this).f14987a;
            if (i != 0) {
                keVar.b(i);
            }
            return keVar;
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }
    }

    public ke(ki kiVar, boolean z, boolean z2) {
        super(kiVar, z, z2);
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a */
    public jw mo957a() {
        byte a2 = mo957a();
        int a3 = mo957a();
        if (a3 <= c) {
            return new jw(a2, a3);
        }
        throw new jz(3, "Thrift list size " + a3 + " out of range!");
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public jx mo957a() {
        byte a2 = mo957a();
        byte a3 = mo957a();
        int a4 = mo957a();
        if (a4 <= b) {
            return new jx(a2, a3, a4);
        }
        throw new jz(3, "Thrift map size " + a4 + " out of range!");
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a */
    public kc mo957a() {
        byte a2 = mo957a();
        int a3 = mo957a();
        if (a3 <= d) {
            return new kc(a2, a3);
        }
        throw new jz(3, "Thrift set size " + a3 + " out of range!");
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public String mo957a() {
        int a2 = mo957a();
        if (a2 > e) {
            throw new jz(3, "Thrift string size " + a2 + " out of range!");
        } else if (((jy) this).f14991a.b() < a2) {
            return mo941a(a2);
        } else {
            try {
                String str = new String(((jy) this).f14991a.a(), ((jy) this).f14991a.mo961a(), a2, "UTF-8");
                ((jy) this).f14991a.a(a2);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new js("JVM DOES NOT SUPPORT UTF-8");
            }
        }
    }

    @Override // com.xiaomi.push.ju, com.xiaomi.push.jy
    /* renamed from: a */
    public ByteBuffer mo957a() {
        int a2 = mo957a();
        if (a2 <= f) {
            c(a2);
            if (((jy) this).f14991a.b() >= a2) {
                ByteBuffer wrap = ByteBuffer.wrap(((jy) this).f14991a.a(), ((jy) this).f14991a.mo961a(), a2);
                ((jy) this).f14991a.a(a2);
                return wrap;
            }
            byte[] bArr = new byte[a2];
            ((jy) this).f14991a.b(bArr, 0, a2);
            return ByteBuffer.wrap(bArr);
        }
        throw new jz(3, "Thrift binary size " + a2 + " out of range!");
    }
}
