package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.ad;
import com.vivo.push.util.af;
import com.vivo.push.util.k;
import com.vivo.push.util.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    protected static final Object f14581a = new Object();
    protected List<T> b = new ArrayList();
    protected Context c;
    private byte[] d;
    private byte[] e;

    public c(Context context) {
        this.c = ContextDelegate.getContext(context);
        ad b = ad.b();
        b.a(this.c);
        this.d = b.c();
        this.e = b.d();
        c();
    }

    private String b() {
        return af.b(this.c).a(a(), null);
    }

    private void d(String str) {
        af.b(this.c).b(a(), str);
    }

    public abstract String a();

    public abstract List<T> a(String str);

    public abstract String b(String str) throws Exception;

    public final void c() {
        synchronized (f14581a) {
            k.a(a());
            this.b.clear();
            c(b());
        }
    }

    public final byte[] e() {
        byte[] bArr = this.d;
        if (bArr == null || bArr.length <= 0) {
            return ad.b().c();
        }
        return bArr;
    }

    public final byte[] f() {
        byte[] bArr = this.e;
        if (bArr == null || bArr.length <= 0) {
            return ad.b().d();
        }
        return bArr;
    }

    public final void d() {
        synchronized (f14581a) {
            this.b.clear();
            d("");
            u.d("CacheSettings", "clear " + a() + " strApps");
        }
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            u.d("CacheSettings", "ClientManager init " + a() + " strApps empty.");
        } else if (str.length() > 10000) {
            u.d("CacheSettings", "sync " + a() + " strApps lenght too large");
            d();
        } else {
            try {
                u.d("CacheSettings", "ClientManager init " + a() + " strApps : " + str);
                List<T> a2 = a(b(str));
                if (a2 != null) {
                    this.b.addAll(a2);
                }
            } catch (Exception e) {
                d();
                u.d("CacheSettings", u.a(e));
            }
        }
    }
}
