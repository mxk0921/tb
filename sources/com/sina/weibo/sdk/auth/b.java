package com.sina.weibo.sdk.auth;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b {
    private Map<String, WbAuthListener> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        private static final b f = new b((byte) 0);

        static {
            t2o.a(988807209);
        }
    }

    static {
        t2o.a(988807208);
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    public static synchronized b b() {
        b bVar;
        synchronized (b.class) {
            bVar = a.f;
        }
        return bVar;
    }

    public final synchronized void a(String str, WbAuthListener wbAuthListener) {
        if (!TextUtils.isEmpty(str) && wbAuthListener != null) {
            this.e.put(str, wbAuthListener);
        }
    }

    private b() {
        this.e = new HashMap();
    }

    public final synchronized void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.e.remove(str);
        }
    }

    public final synchronized WbAuthListener a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.get(str);
    }
}
