package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class as implements ar, InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final String[][] f14761a = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* renamed from: a  reason: collision with other field name */
    private Context f740a;

    /* renamed from: a  reason: collision with other field name */
    private Class f742a = null;
    private Class b = null;

    /* renamed from: a  reason: collision with other field name */
    private Method f744a = null;

    /* renamed from: b  reason: collision with other field name */
    private Method f745b = null;
    private Method c = null;
    private Method d = null;
    private Method e = null;
    private Method f = null;
    private Method g = null;

    /* renamed from: a  reason: collision with other field name */
    private final Object f743a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private volatile int f738a = 0;

    /* renamed from: a  reason: collision with other field name */
    private volatile long f739a = 0;

    /* renamed from: a  reason: collision with other field name */
    private volatile a f741a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a {

        /* renamed from: a  reason: collision with other field name */
        Boolean f746a;

        /* renamed from: a  reason: collision with other field name */
        String f747a;
        String b;
        String c;
        String d;

        private a() {
            this.f746a = null;
            this.f747a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public boolean a() {
            if (!TextUtils.isEmpty(this.f747a) || !TextUtils.isEmpty(this.b) || !TextUtils.isEmpty(this.c) || !TextUtils.isEmpty(this.d)) {
                this.f746a = Boolean.TRUE;
            }
            if (this.f746a != null) {
                return true;
            }
            return false;
        }
    }

    public as(Context context) {
        this.f740a = context.getApplicationContext();
        a(context);
        b(context);
    }

    private static Class<?> a(Context context, String str) {
        try {
            return r.a(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void b(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        elapsedRealtime = -elapsedRealtime;
        Class cls = this.b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                a(this.f744a, this.f742a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.b}, this));
            } catch (Throwable th) {
                b("call init sdk error:" + th);
            }
            this.f739a = elapsedRealtime;
        }
        this.f739a = elapsedRealtime;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f739a = SystemClock.elapsedRealtime();
        if (objArr != null) {
            a aVar = new a();
            int length = objArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && !a(obj2)) {
                    aVar.b = (String) a(this.c, obj2, new Object[0]);
                    aVar.f746a = (Boolean) a(this.f, obj2, new Object[0]);
                    a(this.g, obj2, new Object[0]);
                    if (aVar.a()) {
                        StringBuilder sb = new StringBuilder("has get succ, check duplicate:");
                        if (this.f741a != null) {
                            z = true;
                        }
                        sb.append(z);
                        b(sb.toString());
                        synchronized (as.class) {
                            try {
                                if (this.f741a == null) {
                                    this.f741a = aVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                i++;
            }
        }
        a();
        return null;
    }

    private static <T> T a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T t = (T) method.invoke(obj, objArr);
            if (t != null) {
                return t;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void b(String str) {
        b.m410a("mdid:" + str);
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo506a() {
        a("getOAID");
        if (this.f741a == null) {
            return null;
        }
        return this.f741a.b;
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a() {
        synchronized (this.f743a) {
            try {
                this.f743a.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    private void a(Context context) {
        Class<?> a2 = a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            String[][] strArr = f14761a;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i];
            Class<?> a3 = a(context, strArr2[0]);
            Class<?> a4 = a(context, strArr2[1]);
            if (a3 != null && a4 != null) {
                b("found class in index " + i);
                cls2 = a4;
                cls = a3;
                break;
            }
            i++;
            cls2 = a4;
            cls = a3;
        }
        this.f742a = a2;
        this.f744a = a(a2, "InitSdk", Context.class, cls);
        this.b = cls;
        this.c = a(cls2, "getOAID", new Class[0]);
        this.f = a(cls2, "isSupported", new Class[0]);
        this.g = a(cls2, "shutDown", new Class[0]);
    }

    private void a(String str) {
        if (this.f741a == null) {
            long j = this.f739a;
            long elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
            int i = this.f738a;
            if (elapsedRealtime > 3000 && i < 3) {
                synchronized (this.f743a) {
                    try {
                        if (this.f739a == j && this.f738a == i) {
                            b("retry, current count is " + i);
                            this.f738a = this.f738a + 1;
                            b(this.f740a);
                            j = this.f739a;
                            elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.f741a == null && j >= 0 && elapsedRealtime <= 3000 && Looper.myLooper() != Looper.getMainLooper()) {
                synchronized (this.f743a) {
                    if (this.f741a == null) {
                        try {
                            b(str + " wait...");
                            this.f743a.wait(3000L);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo506a() {
        a("isSupported");
        return this.f741a != null && Boolean.TRUE.equals(this.f741a.f746a);
    }

    private static boolean a(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }
}
