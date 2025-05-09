package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fn extends bp {
    Map<String, String> d = null;
    private String q = "";
    String e = "";
    String f = "";
    byte[] g = null;
    byte[] h = null;
    boolean i = false;
    String j = null;
    Map<String, String> k = null;
    boolean p = false;

    public fn(Context context, w wVar) {
        super(context, wVar);
    }

    @Override // com.loc.bt
    public final Map<String, String> a() {
        return this.d;
    }

    @Override // com.loc.bp
    public final byte[] a_() {
        return this.g;
    }

    @Override // com.loc.bt
    public final String b() {
        return this.e;
    }

    @Override // com.loc.bp
    public final byte[] b_() {
        return this.h;
    }

    @Override // com.loc.r, com.loc.bt
    public final String c() {
        return this.f;
    }

    @Override // com.loc.bt
    public final String c_() {
        return MspEventTypes.ACTION_INVOKE_LOC;
    }

    public final void d(String str) {
        this.f = str;
    }

    @Override // com.loc.bp, com.loc.bt
    public final Map<String, String> e() {
        return this.k;
    }

    @Override // com.loc.bt
    public final String g() {
        return this.q;
    }

    @Override // com.loc.bp
    public final boolean i() {
        return this.i;
    }

    @Override // com.loc.bp
    public final String j() {
        return this.j;
    }

    @Override // com.loc.bp
    public final boolean k() {
        return this.p;
    }

    public final void a(Map<String, String> map) {
        this.k = map;
    }

    public final void b(String str) {
        this.j = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.q = str;
        } else {
            this.q = "";
        }
    }

    public final void b(Map<String, String> map) {
        this.d = map;
    }

    public final void c(boolean z) {
        this.p = z;
    }

    public final void b(boolean z) {
        this.i = z;
    }

    public final void c(byte[] bArr) {
        this.g = bArr;
    }

    public final void b(byte[] bArr) {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            if (bArr != null) {
                try {
                    byteArrayOutputStream2.write(bp.a(bArr));
                    byteArrayOutputStream2.write(bArr);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        th.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                                return;
                            } catch (IOException e) {
                                e.printStackTrace();
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th3;
                    }
                }
            }
            this.h = byteArrayOutputStream2.toByteArray();
            try {
                byteArrayOutputStream2.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
