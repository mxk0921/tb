package com.alibaba.wireless.security.securitybody;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.securitybody.C0191;
import com.taobao.homepage.pop.utils.PopConst;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.alibaba.wireless.security.securitybody.г  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0186 {

    /* renamed from: а  reason: contains not printable characters */
    private static final boolean f462 = false;

    /* renamed from: б  reason: contains not printable characters */
    private static final String f463 = "SecurityBodyUTCallback";

    /* renamed from: в  reason: contains not printable characters */
    private static boolean f464 = false;

    /* renamed from: г  reason: contains not printable characters */
    private static final String f465 = "YTEC";

    /* renamed from: д  reason: contains not printable characters */
    private static final int f466 = 50;

    /* renamed from: е  reason: contains not printable characters */
    private static IRouterComponent f467 = null;

    /* renamed from: ж  reason: contains not printable characters */
    private static int[] f468 = null;

    /* renamed from: з  reason: contains not printable characters */
    private static int f469 = -1;

    /* renamed from: и  reason: contains not printable characters */
    private static volatile int f470 = 0;

    /* renamed from: й  reason: contains not printable characters */
    private static int f471 = 0;

    /* renamed from: к  reason: contains not printable characters */
    private static volatile int f472 = -1;

    /* renamed from: л  reason: contains not printable characters */
    private static volatile int f473 = -1;

    /* renamed from: м  reason: contains not printable characters */
    private static ExecutorService f474 = null;

    /* renamed from: н  reason: contains not printable characters */
    private static boolean f475 = false;

    /* renamed from: о  reason: contains not printable characters */
    private static volatile Integer f476 = 0;

    /* renamed from: п  reason: contains not printable characters */
    private static Integer f477 = -1;

    /* renamed from: р  reason: contains not printable characters */
    private static C0191 f478 = null;

    /* renamed from: с  reason: contains not printable characters */
    private static int f479 = -1;

    /* renamed from: т  reason: contains not printable characters */
    private static ArrayDeque<C0189> f480 = null;

    /* renamed from: у  reason: contains not printable characters */
    private static boolean f481 = false;

    /* renamed from: ё  reason: contains not printable characters */
    private static SharedPreferences f482;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.securitybody.г$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0187 implements InvocationHandler {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ int[] f483;

        /* renamed from: com.alibaba.wireless.security.securitybody.г$а$а  reason: contains not printable characters */
        /* loaded from: classes.dex */
        class RunnableC0188 implements Runnable {

            /* renamed from: а  reason: contains not printable characters */
            final /* synthetic */ Map f484;

            /* renamed from: б  reason: contains not printable characters */
            final /* synthetic */ Object[] f485;

            RunnableC0188(Map map, Object[] objArr) {
                this.f484 = map;
                this.f485 = objArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C0186.f473 == -1 && C0186.f482 != null) {
                    int unused = C0186.f472 = C0186.f482.getInt("ut_sync_count", 0);
                    int unused2 = C0186.f473 = C0186.f482.getInt("ut_async_count", 0);
                }
                C0186.m281();
                C0186.m288(this.f484, this.f485);
                if (C0186.f471 % 10 == 0) {
                    C0186.m295();
                }
            }
        }

        C0187(int[] iArr) {
            this.f483 = iArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.util.HashMap] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r13, java.lang.reflect.Method r14, java.lang.Object[] r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.securitybody.C0186.C0187.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.alibaba.wireless.security.securitybody.г$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0189 {

        /* renamed from: а  reason: contains not printable characters */
        String f487;

        /* renamed from: б  reason: contains not printable characters */
        String f488;

        /* renamed from: в  reason: contains not printable characters */
        int f489;

        private C0189() {
        }

        /* synthetic */ C0189(C0187 r1) {
            this();
        }
    }

    /* renamed from: а  reason: contains not printable characters */
    private static void m270() {
        ArrayDeque<C0189> arrayDeque;
        if (m290() == 1 && (arrayDeque = f480) != null && !arrayDeque.isEmpty()) {
            int i = f480.peekLast().f489;
            if (i > 50) {
                UserTrackMethodJniBridge.addUtRecord("100214", 0, 7, "1", 0L, "x_max_ut_retry: " + i, null, null, null, null);
            }
            while (!f480.isEmpty()) {
                C0189 poll = f480.poll();
                try {
                    f467.doCommand(13801, poll.f487, poll.f488);
                } catch (Throwable unused) {
                }
            }
            f480 = null;
        }
    }

    /* renamed from: л  reason: contains not printable characters */
    static /* synthetic */ int m281() {
        int i = f471;
        f471 = i + 1;
        return i;
    }

    /* renamed from: п  reason: contains not printable characters */
    static /* synthetic */ int m285() {
        int i = f470;
        f470 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: т  reason: contains not printable characters */
    public static void m288(Map<String, String> map, Object[] objArr) {
        try {
            JSONObject jSONObject = new JSONObject(map);
            m296(jSONObject.toString());
            jSONObject.remove("packageName");
            jSONObject.put("pageName", String.valueOf(objArr[0]));
            if (m291().intValue() == 1) {
                C0191.C0193 r5 = new C0191.C0193().m311(jSONObject.getString(PopConst.POP_EVENT_ID_KEY)).m313(String.valueOf(objArr[0]));
                Integer num = f476;
                f476 = Integer.valueOf(f476.intValue() + 1);
                C0191 r52 = r5.m314(num.intValue()).m310(System.currentTimeMillis()).m312(f478).m309();
                jSONObject.put("verification", r52.toString());
                f478 = r52;
            }
            m297(String.valueOf(objArr[1]), jSONObject.toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: у  reason: contains not printable characters */
    private static int[] m289() {
        IRouterComponent iRouterComponent;
        if (f468 == null && (iRouterComponent = f467) != null) {
            try {
                int[] iArr = (int[]) iRouterComponent.doCommand(20802, 0);
                int[] iArr2 = (int[]) f467.doCommand(13806, 0);
                if (!(iArr2 == null || iArr == null)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    int i = 0;
                    for (int i2 : iArr) {
                        iArr3[i] = i2;
                        i++;
                    }
                    for (int i3 : iArr2) {
                        iArr3[i] = i3;
                        i++;
                    }
                    iArr = iArr3;
                }
                f468 = iArr;
            } catch (Throwable unused) {
            }
        }
        return f468;
    }

    /* renamed from: ф  reason: contains not printable characters */
    private static int m290() {
        try {
            if (f479 == -1 && f467 != null) {
                f479 = ((Integer) f467.doCommand(13204, 0, "u_ry742", 0, 0)).intValue();
            }
        } catch (Throwable unused) {
        }
        return f479;
    }

    /* renamed from: х  reason: contains not printable characters */
    private static Integer m291() {
        IRouterComponent iRouterComponent;
        if (f477.intValue() == -1 && (iRouterComponent = f467) != null) {
            f477 = (Integer) iRouterComponent.doCommand(13204, 0, "u_cjb26", 0, 0);
        }
        return f477;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0073 -> B:30:0x0074). Please submit an issue!!! */
    /* renamed from: ц  reason: contains not printable characters */
    public static synchronized void m292(IRouterComponent iRouterComponent, Context context) {
        Class<?> cls;
        Class<?> cls2;
        Method method;
        synchronized (C0186.class) {
            if (!f464) {
                f467 = iRouterComponent;
                if (context != null) {
                    f482 = context.getSharedPreferences("security_body_ut_callback", 0);
                }
                f464 = true;
                if (m293()) {
                    int[] iArr = m289();
                    if (iArr != null) {
                        try {
                            try {
                                cls2 = Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack.UserTrackAdaptor");
                                try {
                                    cls = Class.forName("com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack.IUserTrackPlugin");
                                } catch (Throwable unused) {
                                    cls = null;
                                }
                            } catch (Throwable unused2) {
                                method = null;
                            }
                        } catch (Throwable unused3) {
                            cls2 = null;
                            cls = null;
                        }
                        try {
                            if (cls.getMethod("onEventDispatchExt", String.class, Integer.TYPE, String.class, String.class, String.class, Map.class) != null) {
                                f481 = true;
                            }
                            method = cls2.getDeclaredMethod("registerListener", cls);
                        } catch (Throwable unused4) {
                            method = cls2.getDeclaredMethod("registerListener", cls);
                            if (cls2 == null) {
                            }
                        }
                        if (cls2 == null && method != null && cls != null) {
                            try {
                                method.invoke(null, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0187(iArr)));
                            } catch (Throwable unused5) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ч  reason: contains not printable characters */
    private static boolean m293() {
        IRouterComponent iRouterComponent = f467;
        if (iRouterComponent != null) {
            try {
                return ((Boolean) iRouterComponent.doCommand(20803, 0)).booleanValue();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 == 1) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (com.alibaba.wireless.security.securitybody.C0186.f469 == 1) goto L_0x002d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        return r1;
     */
    /* renamed from: ш  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m294() {
        /*
            com.alibaba.wireless.security.framework.IRouterComponent r0 = com.alibaba.wireless.security.securitybody.C0186.f467
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0027
            int r3 = com.alibaba.wireless.security.securitybody.C0186.f469
            r4 = -1
            if (r3 == r4) goto L_0x000c
            goto L_0x0027
        L_0x000c:
            java.lang.String r3 = "1"
            r4 = 20804(0x5144, float:2.9153E-41)
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: all -> 0x0024
            java.lang.Object r0 = r0.doCommand(r4, r5)     // Catch: all -> 0x0024
            boolean r0 = r3.equals(r0)     // Catch: all -> 0x0024
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.alibaba.wireless.security.securitybody.C0186.f469 = r0     // Catch: all -> 0x0024
            if (r0 != r1) goto L_0x002c
            goto L_0x002d
        L_0x0024:
            com.alibaba.wireless.security.securitybody.C0186.f469 = r2
            goto L_0x002e
        L_0x0027:
            int r0 = com.alibaba.wireless.security.securitybody.C0186.f469
            if (r0 != r1) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            r2 = r1
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.securitybody.C0186.m294():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: щ  reason: contains not printable characters */
    public static void m295() {
        SharedPreferences sharedPreferences = f482;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("ut_sync_count", f470);
            edit.putInt("ut_async_count", f471).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ъ  reason: contains not printable characters */
    public static void m296(String str) {
        IRouterComponent iRouterComponent = f467;
        if (iRouterComponent != null) {
            try {
                iRouterComponent.doCommand(20801, 0, str);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ы  reason: contains not printable characters */
    public static void m297(String str, String str2) {
        IRouterComponent iRouterComponent = f467;
        if (iRouterComponent != null) {
            try {
                iRouterComponent.doCommand(13801, str, str2);
                m270();
            } catch (Throwable unused) {
                m299(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: э  reason: contains not printable characters */
    public static void m298() {
        if (f472 > 0 && Math.abs(f472 - f473) >= 10) {
            UserTrackMethodJniBridge.addUtRecord("100137", 0, 1, "1", 0L, "SyncReportCount is " + f472, "AsyncReportCount is " + f473, null, null, null);
        }
    }

    /* renamed from: ю  reason: contains not printable characters */
    private static void m299(String str, String str2) {
        if (m290() == 1) {
            if (f480 == null) {
                f480 = new ArrayDeque<>();
            }
            C0189 r0 = new C0189(null);
            r0.f487 = str;
            r0.f488 = str2;
            r0.f489 = f480.isEmpty() ? 0 : f480.peekLast().f489 + 1;
            f480.offer(r0);
            if (r0.f489 == 50) {
                UserTrackMethodJniBridge.addUtRecord("100214", 0, 1, "1", 0L, "x_too_long_ut_fail", null, null, null, null);
            }
            if (f480.size() > 50) {
                f480.poll();
            }
        }
    }
}
