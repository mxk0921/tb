package com.alibaba.wireless.security.middletierplugin.г.а;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent;
import com.alibaba.wireless.security.middletierplugin.г.а.C0153;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.orange.OConstant;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mtopsdk.common.util.HttpHeaderConstant;

/* renamed from: com.alibaba.wireless.security.middletierplugin.г.а.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0149 {

    /* renamed from: з  reason: contains not printable characters */
    private static final String f257 = "[NE-SG-ANET]";

    /* renamed from: и  reason: contains not printable characters */
    private static Method f258 = null;

    /* renamed from: й  reason: contains not printable characters */
    private static final boolean f259 = false;

    /* renamed from: к  reason: contains not printable characters */
    private static ISecurityGuardPlugin f260 = null;

    /* renamed from: л  reason: contains not printable characters */
    private static Context f261 = null;

    /* renamed from: м  reason: contains not printable characters */
    private static volatile boolean f262 = false;

    /* renamed from: н  reason: contains not printable characters */
    private static CookieManager f263;

    /* renamed from: о  reason: contains not printable characters */
    private static Random f264 = new Random();

    /* renamed from: п  reason: contains not printable characters */
    private static ExecutorService f265;

    /* renamed from: а  reason: contains not printable characters */
    private Method f266;

    /* renamed from: б  reason: contains not printable characters */
    private Method f267;

    /* renamed from: в  reason: contains not printable characters */
    private Method f268;

    /* renamed from: г  reason: contains not printable characters */
    private Method f269;

    /* renamed from: д  reason: contains not printable characters */
    private Method f270;

    /* renamed from: е  reason: contains not printable characters */
    private Method f271;

    /* renamed from: ж  reason: contains not printable characters */
    private Class<?> f272;

    /* renamed from: ё  reason: contains not printable characters */
    private Method f273;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.г.а.а$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class RunnableC0150 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ String f274;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ String f275;

        /* renamed from: в  reason: contains not printable characters */
        final /* synthetic */ int f276;

        RunnableC0150(String str, String str2, int i) {
            this.f274 = str;
            this.f275 = str2;
            this.f276 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0149.this.m176(this.f274, this.f275, this.f276);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.alibaba.wireless.security.middletierplugin.г.а.а$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    private static class C0151 implements InvocationHandler {

        /* renamed from: а  reason: contains not printable characters */
        private final C0153.C0156 f278;

        /* renamed from: б  reason: contains not printable characters */
        private final Object f279;

        C0151(C0153.C0156 r1, Object obj) {
            this.f278 = r1;
            this.f279 = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
            if (r0 == 1) goto L_0x005f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            r5.f278.m191(((java.lang.Integer) com.alibaba.wireless.security.middletierplugin.г.а.C0149.f258.invoke(r8[0], new java.lang.Object[0])).intValue());
            r5.f278.m193(java.lang.System.currentTimeMillis() - r5.f278.m189());
            com.alibaba.wireless.security.middletierplugin.г.а.C0153.m182(r5.f278);
         */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Class r6 = r7.getDeclaringClass()
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                if (r6 != r0) goto L_0x000d
                java.lang.Object r6 = r7.invoke(r5, r8)
                return r6
            L_0x000d:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x00a7
                r6.<init>()     // Catch: all -> 0x00a7
                java.lang.String r0 = "url = "
                r6.append(r0)     // Catch: all -> 0x00a7
                com.alibaba.wireless.security.middletierplugin.г.а.б$в r0 = r5.f278     // Catch: all -> 0x00a7
                java.lang.String r0 = r0.f287     // Catch: all -> 0x00a7
                r6.append(r0)     // Catch: all -> 0x00a7
                java.lang.String r0 = ", method ="
                r6.append(r0)     // Catch: all -> 0x00a7
                java.lang.String r0 = r7.getName()     // Catch: all -> 0x00a7
                r6.append(r0)     // Catch: all -> 0x00a7
                java.lang.String r6 = r6.toString()     // Catch: all -> 0x00a7
                com.alibaba.wireless.security.middletierplugin.г.а.C0149.m163(r6)     // Catch: all -> 0x00a7
                java.lang.String r6 = r7.getName()     // Catch: all -> 0x00a7
                r0 = -1
                int r1 = r6.hashCode()     // Catch: all -> 0x00a7
                r2 = 1029576603(0x3d5e179b, float:0.05422173)
                r3 = 0
                r4 = 1
                if (r1 == r2) goto L_0x0051
                r2 = 1123967826(0x42fe6352, float:127.193985)
                if (r1 == r2) goto L_0x0047
                goto L_0x005a
            L_0x0047:
                java.lang.String r1 = "onFinish"
                boolean r6 = r6.equals(r1)     // Catch: all -> 0x00a7
                if (r6 == 0) goto L_0x005a
                r0 = 1
                goto L_0x005a
            L_0x0051:
                java.lang.String r1 = "onDataReceiveSize"
                boolean r6 = r6.equals(r1)     // Catch: all -> 0x00a7
                if (r6 == 0) goto L_0x005a
                r0 = 0
            L_0x005a:
                if (r0 == 0) goto L_0x008c
                if (r0 == r4) goto L_0x005f
                goto L_0x009d
            L_0x005f:
                com.alibaba.wireless.security.middletierplugin.г.а.б$в r6 = r5.f278     // Catch: all -> 0x00a7
                java.lang.reflect.Method r0 = com.alibaba.wireless.security.middletierplugin.г.а.C0149.m164()     // Catch: all -> 0x00a7
                r1 = r8[r3]     // Catch: all -> 0x00a7
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: all -> 0x00a7
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: all -> 0x00a7
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: all -> 0x00a7
                int r0 = r0.intValue()     // Catch: all -> 0x00a7
                r6.m191(r0)     // Catch: all -> 0x00a7
                com.alibaba.wireless.security.middletierplugin.г.а.б$в r6 = r5.f278     // Catch: all -> 0x00a7
                long r0 = java.lang.System.currentTimeMillis()     // Catch: all -> 0x00a7
                com.alibaba.wireless.security.middletierplugin.г.а.б$в r2 = r5.f278     // Catch: all -> 0x00a7
                long r2 = r2.m189()     // Catch: all -> 0x00a7
                long r0 = r0 - r2
                r6.m193(r0)     // Catch: all -> 0x00a7
                com.alibaba.wireless.security.middletierplugin.г.а.б$в r6 = r5.f278     // Catch: all -> 0x00a7
                com.alibaba.wireless.security.middletierplugin.г.а.C0153.m182(r6)     // Catch: all -> 0x00a7
                goto L_0x009d
            L_0x008c:
                int r6 = r8.length     // Catch: all -> 0x00a7
                r0 = 3
                if (r6 < r0) goto L_0x009d
                r6 = r8[r4]     // Catch: all -> 0x00a7
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: all -> 0x00a7
                int r6 = r6.intValue()     // Catch: all -> 0x00a7
                com.alibaba.wireless.security.middletierplugin.г.а.б$в r0 = r5.f278     // Catch: all -> 0x00a7
                r0.m192(r6)     // Catch: all -> 0x00a7
            L_0x009d:
                java.lang.Object r6 = r5.f279     // Catch: all -> 0x00a7
                if (r6 == 0) goto L_0x00bc
                java.lang.Object r6 = r5.f279     // Catch: all -> 0x00a7
                r7.invoke(r6, r8)     // Catch: all -> 0x00a7
                goto L_0x00bc
            L_0x00a7:
                r6 = move-exception
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = ""
                r7.append(r8)
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                com.alibaba.wireless.security.middletierplugin.г.а.C0149.m163(r6)
            L_0x00bc:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.middletierplugin.г.а.C0149.C0151.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.г.а.а$в  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class C0152 implements InvocationHandler {
        private C0152() {
        }

        /* synthetic */ C0152(C0149 r1, RunnableC0150 r2) {
            this();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (!AURAPageEventStrategy.INTERCEPT.equals(method.getName()) || objArr == null || objArr.length < 1) {
                return null;
            }
            Object obj2 = objArr[0];
            Object invoke = C0149.this.f269.invoke(obj2, new Object[0]);
            Object invoke2 = C0149.this.f270.invoke(obj2, new Object[0]);
            C0149.this.m175(invoke);
            if (C0153.m183()) {
                C0153.C0156 r2 = new C0153.C0156();
                Object invoke3 = C0149.this.f268.invoke(invoke, new Object[0]);
                if (invoke3 instanceof URL) {
                    r2.m195(invoke3.toString());
                }
                Object invoke4 = C0149.this.f273.invoke(invoke, new Object[0]);
                if (invoke4 instanceof byte[]) {
                    r2.m196(((byte[]) invoke4).length);
                }
                r2.m194(System.currentTimeMillis());
                invoke2 = Proxy.newProxyInstance(C0149.this.f272.getClassLoader(), new Class[]{C0149.this.f272}, new C0151(r2, invoke2));
            }
            return C0149.this.f271.invoke(obj2, invoke, invoke2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: а  reason: contains not printable characters */
    public static void m161(String str) {
    }

    /* renamed from: л  reason: contains not printable characters */
    public static synchronized void m171(Context context) {
        synchronized (C0149.class) {
            if (!f262) {
                try {
                    if (Build.VERSION.SDK_INT < 21) {
                        CookieSyncManager.createInstance(context);
                    }
                    CookieManager instance = CookieManager.getInstance();
                    f263 = instance;
                    instance.setAcceptCookie(true);
                    if (Build.VERSION.SDK_INT < 21) {
                        f263.removeExpiredCookie();
                    }
                } catch (Throwable unused) {
                }
                f262 = true;
            }
        }
    }

    /* renamed from: м  reason: contains not printable characters */
    private String m172(String str) {
        try {
            m171(f261);
            return f263.getCookie(m174(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: н  reason: contains not printable characters */
    public static void m173(ISecurityGuardPlugin iSecurityGuardPlugin, Context context) {
        f260 = iSecurityGuardPlugin;
        f261 = context;
        C0149 r0 = new C0149();
        f265 = Executors.newSingleThreadExecutor();
        r0.m179();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
        if (r1 <= 65535) goto L_0x00a9;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* renamed from: о  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m174(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.middletierplugin.г.а.C0149.m174(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: п  reason: contains not printable characters */
    public void m175(Object obj) {
        try {
            int intValue = ((Integer) f260.getRouter().doCommand(70901, new Object[0])).intValue();
            if (intValue != 0) {
                Map map = (Map) this.f267.invoke(obj, new Object[0]);
                String str = "";
                String obj2 = map != null ? map.toString() : str;
                if (obj2.indexOf(HttpHeaderConstant.X_SIGN) >= 0) {
                    URL url = (URL) this.f268.invoke(obj, new Object[0]);
                    if (url != null) {
                        str = url.toString();
                    }
                    f265.execute(new RunnableC0150(str, obj2, intValue));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: р  reason: contains not printable characters */
    public void m176(String str, String str2, int i) {
        String str3;
        try {
            String str4 = m172(str);
            if (str4 != null && str4.indexOf(LoginSwitch.SGCOOKIE) < 0) {
                if (str2.indexOf(HttpHeaderConstant.X_UID) >= 0) {
                    String str5 = (String) f260.getRouter().doCommand(71101, new Object[0]);
                    if (str5.length() > 0) {
                        m177(str, "sgcookie=" + str5);
                        UserTrackMethodJniBridge.addUtRecord("100142", 0, 7, FCComponent.getPluginVersion(), 0L, "&urlLen=" + str.length() + "&originalCookielength=" + str4.length() + "&nowCookielength=" + str3.length(), str4, m172(str), str, null);
                    }
                }
            }
            int length = str.length() + str2.length() + str4.length();
            String str6 = "totalLen=" + length + "&urlLen=" + str.length() + "&headersLen=" + str2.length() + "&cookiesLen=" + str4.length();
            f260.getRouter().doCommand(70902, Integer.valueOf(length), Integer.valueOf(str.length()), Integer.valueOf(str2.length()), Integer.valueOf(str4.length()));
            if (f264.nextInt(i) % i == 0) {
                UserTrackMethodJniBridge.addUtRecord("100133", 0, 7, FCComponent.getPluginVersion(), 0L, str6, str, null, null, null);
            }
        } catch (Exception e) {
            UserTrackMethodJniBridge.addUtRecord("100142", 0, 7, FCComponent.getPluginVersion(), 0L, e.toString(), str, null, null, null);
        }
    }

    /* renamed from: с  reason: contains not printable characters */
    private void m177(String str, String str2) {
        try {
            m171(f261);
            f263.setCookie(m174(str2), str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: к  reason: contains not printable characters */
    public void m179() {
        try {
            Class<?> cls = Class.forName(OConstant.REFLECT_NETWORK_INTERCEPTORMANAGER);
            Class<?> cls2 = Class.forName(OConstant.REFLECT_NETWORK_INTERCEPTOR);
            Class<?> cls3 = Class.forName("anet.channel.request.Request");
            this.f272 = Class.forName("anetwork.channel.interceptor.Callback");
            Class<?> cls4 = Class.forName("anetwork.channel.aidl.DefaultFinishEvent");
            Class<?> cls5 = Class.forName("anetwork.channel.interceptor.Interceptor$Chain");
            this.f266 = cls.getDeclaredMethod("addInterceptor", cls2);
            this.f267 = cls3.getDeclaredMethod("getHeaders", new Class[0]);
            this.f268 = cls3.getDeclaredMethod("getUrl", new Class[0]);
            this.f269 = cls5.getDeclaredMethod("request", new Class[0]);
            this.f270 = cls5.getDeclaredMethod("callback", new Class[0]);
            this.f271 = cls5.getDeclaredMethod("proceed", cls3, this.f272);
            this.f273 = cls3.getDeclaredMethod("getBodyBytes", new Class[0]);
            f258 = cls4.getDeclaredMethod("getHttpCode", new Class[0]);
            try {
                this.f266.invoke(cls, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new C0152(this, null)));
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            m161("Reflect NetworkSDK interceptor failed." + th);
        }
    }
}
