package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.em;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.bo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gf {

    /* renamed from: a  reason: collision with other field name */
    int f1032a;

    /* renamed from: a  reason: collision with other field name */
    private em.a f1033a;

    /* renamed from: a  reason: collision with other field name */
    String f1034a;

    /* renamed from: a  reason: collision with other field name */
    private short f1035a;

    /* renamed from: b  reason: collision with other field name */
    private final long f1036b;

    /* renamed from: b  reason: collision with other field name */
    private byte[] f1037b;
    private static String b = hs.a(5) + "-";

    /* renamed from: a  reason: collision with root package name */
    private static long f14900a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static final byte[] f1031a = new byte[0];

    public gf() {
        this.f1035a = (short) 2;
        this.f1037b = f1031a;
        this.f1034a = null;
        this.f1036b = System.currentTimeMillis();
        this.f1033a = new em.a();
        this.f1032a = 1;
    }

    public static synchronized String d() {
        String sb;
        synchronized (gf.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b);
            long j = f14900a;
            f14900a = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    public int a() {
        return this.f1033a.c();
    }

    public int b() {
        return this.f1033a.f();
    }

    public int c() {
        return this.f1033a.mo668b() + 8 + this.f1037b.length;
    }

    public String e() {
        String e = this.f1033a.m623e();
        if ("ID_NOT_AVAILABLE".equals(e)) {
            return null;
        }
        if (this.f1033a.g()) {
            return e;
        }
        String d = d();
        this.f1033a.e(d);
        return d;
    }

    public String f() {
        return this.f1034a;
    }

    public String g() {
        if (!this.f1033a.mo668b()) {
            return null;
        }
        return Long.toString(this.f1033a.mo666a()) + "@" + this.f1033a.mo666a() + "/" + this.f1033a.mo668b();
    }

    public String toString() {
        return "Blob [chid=" + a() + "; Id=" + bc.a(e()) + "; cmd=" + m718a() + "; type=" + ((int) m720a()) + "; from=" + g() + " ]";
    }

    public gf(em.a aVar, short s, byte[] bArr) {
        this.f1035a = (short) 2;
        this.f1037b = f1031a;
        this.f1034a = null;
        this.f1036b = System.currentTimeMillis();
        this.f1033a = aVar;
        this.f1035a = s;
        this.f1037b = bArr;
        this.f1032a = 2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m717a() {
        return this.f1036b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public long m724b() {
        return this.f1033a.mo668b();
    }

    /* renamed from: c  reason: collision with other method in class */
    public long m727c() {
        return this.f1033a.mo666a();
    }

    @Deprecated
    public static gf a(hh hhVar, String str) {
        int i;
        gf gfVar = new gf();
        try {
            i = Integer.parseInt(hhVar.k());
        } catch (Exception e) {
            b.m410a("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        gfVar.a(i);
        gfVar.a(hhVar.j());
        gfVar.c(hhVar.m());
        gfVar.b(hhVar.n());
        gfVar.a("XMLMSG", (String) null);
        try {
            gfVar.a(hhVar.m759a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                gfVar.a((short) 3);
            } else {
                gfVar.a((short) 2);
                gfVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e2) {
            b.m410a("Blob setPayload err： " + e2.getMessage());
        }
        return gfVar;
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m725b() {
        return this.f1033a.m621d();
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m728c() {
        return this.f1033a.m625f();
    }

    public static gf a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            em.a aVar = new em.a();
            aVar.a(slice.array(), slice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new gf(aVar, s, bArr);
        } catch (Exception e) {
            b.m410a("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    public void b(long j) {
        this.f1033a.b(j);
    }

    public void c(long j) {
        this.f1033a.c(j);
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m718a() {
        return this.f1033a.m619c();
    }

    public void b(String str) {
        this.f1034a = str;
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("@");
            try {
                long parseLong = Long.parseLong(str.substring(0, indexOf));
                int indexOf2 = str.indexOf("/", indexOf);
                String substring = str.substring(indexOf + 1, indexOf2);
                String substring2 = str.substring(indexOf2 + 1);
                this.f1033a.a(parseLong);
                this.f1033a.a(substring);
                this.f1033a.b(substring2);
            } catch (Exception e) {
                b.m410a("Blob parse user err " + e.getMessage());
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public ByteBuffer mo719a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(c());
        }
        byteBuffer.putShort(this.f1035a);
        byteBuffer.putShort((short) this.f1033a.mo666a());
        byteBuffer.putInt(this.f1037b.length);
        int position = byteBuffer.position();
        this.f1033a.m600a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f1033a.mo666a());
        byteBuffer.position(position + this.f1033a.mo666a());
        byteBuffer.put(this.f1037b);
        return byteBuffer;
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m726b() {
        return this.f1033a.l();
    }

    /* renamed from: a  reason: collision with other method in class */
    public short m720a() {
        return this.f1035a;
    }

    public void a(int i) {
        this.f1033a.a(i);
    }

    public void a(long j) {
        this.f1033a.a(j);
    }

    public void a(long j, String str, String str2) {
        if (j != 0) {
            this.f1033a.a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f1033a.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f1033a.b(str2);
        }
    }

    public void a(String str) {
        this.f1033a.e(str);
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f1033a.c(str);
            this.f1033a.mo666a();
            if (!TextUtils.isEmpty(str2)) {
                this.f1033a.d(str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("command should not be empty");
    }

    public void a(short s) {
        this.f1035a = s;
    }

    public void a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f1033a.c(1);
            this.f1037b = bo.a(bo.a(str, e()), bArr);
            return;
        }
        this.f1033a.c(0);
        this.f1037b = bArr;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m721a() {
        return this.f1033a.j();
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m722a() {
        return gg.a(this, this.f1037b);
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m723a(String str) {
        if (this.f1033a.e() == 1) {
            return gg.a(this, bo.a(bo.a(str, e()), this.f1037b));
        }
        if (this.f1033a.e() == 0) {
            return gg.a(this, this.f1037b);
        }
        b.m410a("unknow cipher = " + this.f1033a.e());
        return gg.a(this, this.f1037b);
    }
}
