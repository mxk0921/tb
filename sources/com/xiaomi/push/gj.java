package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gj {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f14904a = {80, 85, 83, 72};

    /* renamed from: a  reason: collision with other field name */
    private byte f1050a;

    /* renamed from: a  reason: collision with other field name */
    private int f1051a;

    /* renamed from: a  reason: collision with other field name */
    private short f1052a;
    private byte[] b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14905a = new c();

        /* renamed from: a  reason: collision with other field name */
        public static final d f1053a = new d();

        public static byte[] a(byte[] bArr) {
            return a(bArr, f1053a);
        }

        public static byte[] a(byte[] bArr, b bVar) {
            if (!gj.m731a(bArr)) {
                return bArr;
            }
            gj a2 = gj.a(bArr);
            if (a2.f1050a == 0 || a2.f1050a != bVar.a()) {
                return a2.b;
            }
            return bVar.a(a2.b, a2.f1051a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        byte a();

        byte[] a(byte[] bArr, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d implements b {
        @Override // com.xiaomi.push.gj.b
        public byte a() {
            return (byte) 2;
        }

        @Override // com.xiaomi.push.gj.b
        public byte[] a(byte[] bArr, int i) {
            Throwable th;
            GZIPInputStream gZIPInputStream = null;
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr), i);
                try {
                    byte[] bArr2 = new byte[i];
                    gZIPInputStream2.read(bArr2);
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public gj(byte b2, int i, byte[] bArr) {
        this((short) 1, b2, i, bArr);
    }

    public gj(short s, byte b2, int i, byte[] bArr) {
        this.f1052a = s;
        this.f1050a = b2;
        this.f1051a = i;
        this.b = bArr;
    }

    public static gj a(byte b2, int i, byte[] bArr) {
        return new gj(b2, i, bArr);
    }

    public static gj a(short s, byte b2, int i, byte[] bArr) {
        return new gj(s, b2, i, bArr);
    }

    public static gj a(byte[] bArr) {
        if (!m731a(bArr)) {
            return a((byte) 0, bArr.length, bArr);
        }
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        order.getInt();
        short s = order.getShort();
        byte b2 = order.get();
        int i = order.getInt();
        byte[] bArr2 = new byte[order.getInt()];
        order.get(bArr2);
        return a(s, b2, i, bArr2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m731a(byte[] bArr) {
        byte[] bArr2 = f14904a;
        return a(bArr2, bArr, bArr2.length);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
