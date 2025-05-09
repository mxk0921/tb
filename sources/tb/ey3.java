package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ey3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f18880a;
    public static boolean b;
    public static ey3 c;
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final List<Pair<String, Map<String, String>>> e = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0083 A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #1 {all -> 0x00b4, blocks: (B:6:0x001f, B:8:0x0075, B:9:0x007d, B:11:0x0083), top: B:24:0x001f }] */
        @Override // tb.z8l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onConfigUpdate(java.lang.String r6, boolean r7) {
            /*
                r5 = this;
                r0 = 1
                r1 = 0
                java.lang.String r2 = "CodeMarkerUtils:update canUploadCodeMarkers:"
                com.android.alibaba.ip.runtime.IpChange r3 = tb.ey3.a.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001f
                java.lang.String r2 = "9458c0f9"
                java.lang.Boolean r4 = new java.lang.Boolean
                r4.<init>(r7)
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r7[r1] = r5
                r7[r0] = r6
                r6 = 2
                r7[r6] = r4
                r3.ipc$dispatch(r2, r7)
                return
            L_0x001f:
                java.util.concurrent.atomic.AtomicBoolean r6 = tb.ey3.a()     // Catch: all -> 0x00b4
                r6.set(r0)     // Catch: all -> 0x00b4
                com.taobao.orange.OrangeConfig r6 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: all -> 0x00b4
                java.lang.String r7 = "android_scancode_client"
                java.lang.String r0 = "canUploadCodeMarkers"
                java.lang.String r3 = "false"
                java.lang.String r6 = r6.getConfig(r7, r0, r3)     // Catch: all -> 0x00b4
                boolean r6 = java.lang.Boolean.parseBoolean(r6)     // Catch: all -> 0x00b4
                tb.ey3.c(r6)     // Catch: all -> 0x00b4
                com.taobao.orange.OrangeConfig r6 = com.taobao.orange.OrangeConfig.getInstance()     // Catch: all -> 0x00b4
                java.lang.String r7 = "android_scancode_client"
                java.lang.String r0 = "ignoredCodeMarkers"
                java.lang.String r3 = ""
                java.lang.String r6 = r6.getConfig(r7, r0, r3)     // Catch: all -> 0x00b4
                tb.ey3.e(r6)     // Catch: all -> 0x00b4
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x00b4
                r6.<init>(r2)     // Catch: all -> 0x00b4
                boolean r7 = tb.ey3.b()     // Catch: all -> 0x00b4
                r6.append(r7)     // Catch: all -> 0x00b4
                java.lang.String r7 = ",ignoredCodeMarkers:"
                r6.append(r7)     // Catch: all -> 0x00b4
                java.lang.String r7 = tb.ey3.d()     // Catch: all -> 0x00b4
                r6.append(r7)     // Catch: all -> 0x00b4
                java.lang.String r6 = r6.toString()     // Catch: all -> 0x00b4
                java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: all -> 0x00b4
                tb.gso.c(r6, r7)     // Catch: all -> 0x00b4
                java.util.List r6 = tb.ey3.f()     // Catch: all -> 0x00b4
                if (r6 == 0) goto L_0x00ce
                java.util.List r6 = tb.ey3.f()     // Catch: all -> 0x00b4
                java.util.Iterator r6 = r6.iterator()     // Catch: all -> 0x00b4
            L_0x007d:
                boolean r7 = r6.hasNext()     // Catch: all -> 0x00b4
                if (r7 == 0) goto L_0x00b6
                java.lang.Object r7 = r6.next()     // Catch: all -> 0x00b4
                android.util.Pair r7 = (android.util.Pair) r7     // Catch: all -> 0x00b4
                if (r7 != 0) goto L_0x008c
                goto L_0x007d
            L_0x008c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x007d
                r0.<init>()     // Catch: all -> 0x007d
                java.lang.String r2 = "CodeMarkerUtils:resend data:"
                r0.append(r2)     // Catch: all -> 0x007d
                java.lang.Object r2 = r7.first     // Catch: all -> 0x007d
                java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x007d
                r0.append(r2)     // Catch: all -> 0x007d
                java.lang.String r0 = r0.toString()     // Catch: all -> 0x007d
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: all -> 0x007d
                tb.gso.c(r0, r2)     // Catch: all -> 0x007d
                tb.ey3 r0 = tb.ey3.this     // Catch: all -> 0x007d
                java.lang.Object r2 = r7.first     // Catch: all -> 0x007d
                java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x007d
                java.lang.Object r7 = r7.second     // Catch: all -> 0x007d
                java.util.Map r7 = (java.util.Map) r7     // Catch: all -> 0x007d
                r0.j(r2, r7)     // Catch: all -> 0x007d
                goto L_0x007d
            L_0x00b4:
                r6 = move-exception
                goto L_0x00c7
            L_0x00b6:
                java.util.List r6 = tb.ey3.f()     // Catch: all -> 0x00ce
                monitor-enter(r6)     // Catch: all -> 0x00ce
                java.util.List r7 = tb.ey3.f()     // Catch: all -> 0x00c4
                r7.clear()     // Catch: all -> 0x00c4
                monitor-exit(r6)     // Catch: all -> 0x00c4
                goto L_0x00ce
            L_0x00c4:
                r7 = move-exception
                monitor-exit(r6)     // Catch: all -> 0x00c4
                throw r7     // Catch: all -> 0x00ce
            L_0x00c7:
                java.lang.String r7 = "CodeMarkerUtils:Code Marker update error"
                java.lang.Object[] r0 = new java.lang.Object[r1]
                tb.gso.a(r6, r7, r0)
            L_0x00ce:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ey3.a.onConfigUpdate(java.lang.String, boolean):void");
        }
    }

    static {
        t2o.a(760217794);
    }

    public ey3() {
        OrangeConfig.getInstance().registerListener(new String[]{"android_scancode_client"}, new a());
    }

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return b;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return f18880a;
    }

    public static /* synthetic */ String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c6713b", new Object[]{str});
        }
        f18880a = str;
        return str;
    }

    public static /* synthetic */ List f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e8603dcd", new Object[0]);
        }
        return e;
    }

    public static ey3 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ey3) ipChange.ipc$dispatch("75f10cde", new Object[0]);
        }
        if (c == null) {
            synchronized (ey3.class) {
                try {
                    if (c == null) {
                        c = new ey3();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0d9b31", new Object[]{this, str});
        } else {
            j(str, null);
        }
    }

    public void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381ecbc5", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(str2, str3);
        }
        j(str, hashMap);
    }

    public void j(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e65834", new Object[]{this, str, map});
        } else if (!TextUtils.isEmpty(str)) {
            if (!d.get()) {
                List<Pair<String, Map<String, String>>> list = e;
                if (((ArrayList) list).size() > 10) {
                    gso.c("CodeMarkerUtils:cached data out of range 30,drop it", new Object[0]);
                    return;
                }
                try {
                    synchronized (list) {
                        ((ArrayList) list).add(new Pair(str, map));
                    }
                    gso.c("CodeMarkerUtils:cached data :" + str, new Object[0]);
                } catch (Throwable unused) {
                }
            } else if (b) {
                if (TextUtils.isEmpty(f18880a) || !f18880a.contains(str)) {
                    k(str, map);
                    return;
                }
                gso.c("CodeMarkerUtils:ignore:" + str, new Object[0]);
            }
        }
    }

    public final void k(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a595b73", new Object[]{this, str, map});
            return;
        }
        try {
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("Page_ScanCode_CM", str);
            if (map != null && !map.isEmpty()) {
                uTHitBuilders$UTControlHitBuilder.setProperties(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
            StringBuilder sb = new StringBuilder("CodeMarkerUtils:upload:{path:");
            sb.append(str);
            sb.append(",args:");
            if (map == null) {
                str2 = "null";
            } else {
                str2 = map.toString();
            }
            sb.append(str2);
            sb.append("}");
            gso.c(sb.toString(), new Object[0]);
        } catch (Throwable unused) {
        }
    }
}
