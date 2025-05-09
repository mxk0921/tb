package com.loc;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bz {

    /* renamed from: a  reason: collision with root package name */
    private Context f5620a;
    private String b;
    private String c;
    private String d;
    private String e;

    public bz(Context context, String str, String str2, String str3) throws k {
        if (TextUtils.isEmpty(str3) || str3.length() > 256) {
            throw new k("无效的参数 - IllegalArgumentException");
        }
        this.f5620a = context.getApplicationContext();
        this.c = str;
        this.d = str2;
        this.b = str3;
    }

    private byte[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[]{0, 0};
        }
        byte[] a2 = x.a(this.e);
        if (a2 == null) {
            return new byte[]{0, 0};
        }
        return x.a(a2.length);
    }

    public final void a(String str) throws k {
        if (TextUtils.isEmpty(str) || str.length() > 65536) {
            throw new k("无效的参数 - IllegalArgumentException");
        }
        this.e = str;
    }

    public final byte[] a() {
        Throwable th;
        int i = 0;
        byte[] bArr = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    x.a(byteArrayOutputStream2, this.c);
                    x.a(byteArrayOutputStream2, this.d);
                    x.a(byteArrayOutputStream2, this.b);
                    x.a(byteArrayOutputStream2, String.valueOf(o.j(this.f5620a)));
                    try {
                        i = (int) (System.currentTimeMillis() / 1000);
                    } catch (Throwable unused) {
                    }
                    byteArrayOutputStream2.write(a(i));
                    byteArrayOutputStream2.write(b(this.e));
                    byteArrayOutputStream2.write(x.a(this.e));
                    bArr = byteArrayOutputStream2.toByteArray();
                    byteArrayOutputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        av.b(th, "se", "tds");
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return bArr;
                    } catch (Throwable th3) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        return bArr;
    }

    private static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }
}
