package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ju extends jy {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f14986a = new kd();

    /* renamed from: a  reason: collision with other field name */
    protected int f1463a;

    /* renamed from: a  reason: collision with other field name */
    protected boolean f1464a;
    protected boolean b;
    protected boolean c = false;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f1465a = new byte[1];

    /* renamed from: b  reason: collision with other field name */
    private byte[] f1466b = new byte[2];

    /* renamed from: c  reason: collision with other field name */
    private byte[] f1467c = new byte[4];
    private byte[] d = new byte[8];
    private byte[] e = new byte[1];
    private byte[] f = new byte[2];
    private byte[] g = new byte[4];
    private byte[] h = new byte[8];

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ka {

        /* renamed from: a  reason: collision with root package name */
        protected int f14987a;

        /* renamed from: a  reason: collision with other field name */
        protected boolean f1468a;
        protected boolean b;

        public a() {
            this(false, true);
        }

        @Override // com.xiaomi.push.ka
        public jy a(ki kiVar) {
            ju juVar = new ju(kiVar, this.f1468a, this.b);
            int i = this.f14987a;
            if (i != 0) {
                juVar.b(i);
            }
            return juVar;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f1468a = z;
            this.b = z2;
            this.f14987a = i;
        }
    }

    public ju(ki kiVar, boolean z, boolean z2) {
        super(kiVar);
        this.f1464a = z;
        this.b = z2;
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public byte mo957a() {
        if (((jy) this).f14991a.b() >= 1) {
            byte b = ((jy) this).f14991a.a()[((jy) this).f14991a.mo961a()];
            ((jy) this).f14991a.a(1);
            return b;
        }
        a(this.e, 0, 1);
        return this.e[0];
    }

    @Override // com.xiaomi.push.jy
    public void b() {
    }

    @Override // com.xiaomi.push.jy
    public void c() {
        a((byte) 0);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public double mo957a() {
        return Double.longBitsToDouble(mo957a());
    }

    public void b(int i) {
        this.f1463a = i;
        this.c = true;
    }

    public void c(int i) {
        if (i < 0) {
            throw new js("Negative length: " + i);
        } else if (this.c) {
            int i2 = this.f1463a - i;
            this.f1463a = i2;
            if (i2 < 0) {
                throw new js("Message length exceeded: " + i);
            }
        }
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public int mo957a() {
        int i;
        byte[] bArr = this.g;
        if (((jy) this).f14991a.b() >= 4) {
            bArr = ((jy) this).f14991a.a();
            i = ((jy) this).f14991a.mo961a();
            ((jy) this).f14991a.a(4);
        } else {
            a(this.g, 0, 4);
            i = 0;
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private int a(byte[] bArr, int i, int i2) {
        c(i2);
        return ((jy) this).f14991a.b(bArr, i, i2);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public long mo957a() {
        int i;
        byte[] bArr = this.h;
        if (((jy) this).f14991a.b() >= 8) {
            bArr = ((jy) this).f14991a.a();
            i = ((jy) this).f14991a.mo961a();
            ((jy) this).f14991a.a(8);
        } else {
            a(this.h, 0, 8);
            i = 0;
        }
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public jv mo957a() {
        byte a2 = mo957a();
        return new jv("", a2, a2 == 0 ? (short) 0 : mo957a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public jw mo957a() {
        return new jw(mo957a(), mo957a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public jx mo957a() {
        return new jx(mo957a(), mo957a(), mo957a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public kc mo957a() {
        return new kc(mo957a(), mo957a());
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public kd mo957a() {
        return f14986a;
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public String mo957a() {
        int a2 = mo957a();
        if (((jy) this).f14991a.b() < a2) {
            return mo941a(a2);
        }
        try {
            String str = new String(((jy) this).f14991a.a(), ((jy) this).f14991a.mo961a(), a2, "UTF-8");
            ((jy) this).f14991a.a(a2);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new js("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public String mo941a(int i) {
        try {
            c(i);
            byte[] bArr = new byte[i];
            ((jy) this).f14991a.b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new js("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public ByteBuffer mo957a() {
        int a2 = mo957a();
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

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public short mo957a() {
        int i;
        byte[] bArr = this.f;
        if (((jy) this).f14991a.b() >= 2) {
            bArr = ((jy) this).f14991a.a();
            i = ((jy) this).f14991a.mo961a();
            ((jy) this).f14991a.a(2);
        } else {
            a(this.f, 0, 2);
            i = 0;
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a */
    public void mo957a() {
    }

    @Override // com.xiaomi.push.jy
    public void a(byte b) {
        byte[] bArr = this.f1465a;
        bArr[0] = b;
        ((jy) this).f14991a.a(bArr, 0, 1);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public void mo941a(int i) {
        byte[] bArr = this.f1467c;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        ((jy) this).f14991a.a(bArr, 0, 4);
    }

    @Override // com.xiaomi.push.jy
    public void a(long j) {
        byte[] bArr = this.d;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        ((jy) this).f14991a.a(bArr, 0, 8);
    }

    @Override // com.xiaomi.push.jy
    public void a(jv jvVar) {
        a(jvVar.f14988a);
        a(jvVar.f1470a);
    }

    @Override // com.xiaomi.push.jy
    public void a(jw jwVar) {
        a(jwVar.f14989a);
        mo941a(jwVar.f1471a);
    }

    @Override // com.xiaomi.push.jy
    public void a(jx jxVar) {
        a(jxVar.f14990a);
        a(jxVar.b);
        mo941a(jxVar.f1472a);
    }

    @Override // com.xiaomi.push.jy
    public void a(kd kdVar) {
    }

    @Override // com.xiaomi.push.jy
    public void a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo941a(bytes.length);
            ((jy) this).f14991a.a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new js("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jy
    public void d() {
    }

    @Override // com.xiaomi.push.jy
    public void e() {
    }

    @Override // com.xiaomi.push.jy
    public void f() {
    }

    @Override // com.xiaomi.push.jy
    public void g() {
    }

    @Override // com.xiaomi.push.jy
    public void h() {
    }

    @Override // com.xiaomi.push.jy
    public void i() {
    }

    @Override // com.xiaomi.push.jy
    public void j() {
    }

    @Override // com.xiaomi.push.jy
    public void a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo941a(limit);
        ((jy) this).f14991a.a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.xiaomi.push.jy
    public void a(short s) {
        byte[] bArr = this.f1466b;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        ((jy) this).f14991a.a(bArr, 0, 2);
    }

    @Override // com.xiaomi.push.jy
    public void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.jy
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo957a() {
        return mo957a() == 1;
    }
}
