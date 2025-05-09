package com.vivo.push.util;

import android.content.Context;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    private static volatile a c;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f14656a;
    private byte[] b;

    private a(Context context) {
        ad.b().a(ContextDelegate.getContext(context));
        ad b = ad.b();
        this.f14656a = b.c();
        this.b = b.d();
    }

    public static a a(Context context) {
        if (c == null) {
            synchronized (a.class) {
                try {
                    if (c == null) {
                        c = new a(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final String b(String str) throws Exception {
        return new String(j.a(j.a(a()), j.a(b()), Base64.decode(str, 2)), "utf-8");
    }

    private byte[] b() {
        byte[] bArr = this.b;
        return (bArr == null || bArr.length <= 0) ? ad.b().d() : bArr;
    }

    public final String a(String str) throws Exception {
        String a2 = j.a(a());
        String a3 = j.a(b());
        byte[] bytes = str.getBytes("utf-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(a3.getBytes("utf-8"), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, new IvParameterSpec(a2.getBytes("utf-8")));
        return Base64.encodeToString(instance.doFinal(bytes), 2);
    }

    private byte[] a() {
        byte[] bArr = this.f14656a;
        return (bArr == null || bArr.length <= 0) ? ad.b().c() : bArr;
    }
}
