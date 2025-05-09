package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class av implements ar {

    /* renamed from: a  reason: collision with root package name */
    private Context f14764a;

    /* renamed from: a  reason: collision with other field name */
    private Class<?> f748a;

    /* renamed from: a  reason: collision with other field name */
    private Object f749a;

    /* renamed from: a  reason: collision with other field name */
    private Method f750a = null;
    private Method b = null;
    private Method c = null;
    private Method d = null;

    public av(Context context) {
        this.f14764a = context;
        a(context);
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo506a() {
        return a(this.f14764a, this.b);
    }

    private String a(Context context, Method method) {
        Object obj = this.f749a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e) {
            b.a("miui invoke error", e);
            return null;
        }
    }

    private void a(Context context) {
        try {
            Class<?> a2 = r.a(context, "com.android.id.impl.IdProviderImpl");
            this.f748a = a2;
            this.f749a = a2.newInstance();
            this.b = this.f748a.getMethod("getOAID", Context.class);
        } catch (Exception e) {
            b.a("miui load class error", e);
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo506a() {
        return (this.f748a == null || this.f749a == null) ? false : true;
    }
}
