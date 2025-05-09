package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridDialogFragment;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2BackKeyModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2BizLifecycleModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2ImagePreloadModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2PrefetchCacheModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2TinctModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2TradeHybridContainerModule;
import com.alibaba.android.ultron.vfw.weex2.module.UltronWeex2TradeHybridManagerModule;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.tao.Globals;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import tb.nbv;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23240a = false;
    public static boolean b = false;
    public static volatile boolean c = false;
    public static volatile boolean d = false;
    public static final List<String> e = Arrays.asList("com.taobao.android.detail2.core.framework.NewDetailActivity");
    public static final List<String> f = Arrays.asList("com.taobao.android.detail2.core.framework.NewDetailActivity", "com.taobao.android.detail.wrapper.activity.DetailActivity", "com.taobao.android.detail.alittdetail.TTDetailActivity");
    public static final List<String> g = Arrays.asList("com.taobao.android.detail.wrapper.activity.DetailActivity", "com.taobao.android.detail.alittdetail.TTDetailActivity");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "order-amap - onClassNotFound!");
            }
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            } else if (!lbv.c) {
                try {
                    MUSEngine.registerPlatformView("order-amap", cls);
                    lbv.c = true;
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "order-amap - 异步注册");
                } catch (Exception e) {
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "order-amap - onClassLoaded: " + e.toString());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "order-amapv4 - onClassNotFound!");
            }
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
            } else if (!lbv.d) {
                try {
                    MUSEngine.registerPlatformView("order-amapv4", cls);
                    lbv.d = true;
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "order-amapv4 - 异步注册");
                } catch (Exception e) {
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "order-amapv4 - onClassLoaded: " + e.toString());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
            } else {
                hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "order-amap - onClassNotFound!");
            }
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            if (!lbv.c) {
                try {
                    MUSEngine.registerPlatformView("order-amap", cls);
                    lbv.c = true;
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "order-amap - 异步注册");
                } catch (Exception e) {
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "order-amap - onClassLoaded: " + e.toString());
                }
            }
            if (!lbv.d) {
                try {
                    MUSEngine.registerPlatformView("order-amapv4", Class.forName("com.taobao.android.order.bundle.weex2.view.AMapV4PlatformView"));
                    lbv.d = true;
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "order-amapv4 - 异步注册");
                } catch (Exception e2) {
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "order-amapv4 - onClassLoaded: " + e2.toString());
                }
            }
        }
    }

    static {
        t2o.a(157286942);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:5:0x000a, B:7:0x001a, B:12:0x0027, B:13:0x0035, B:15:0x003b, B:18:0x0042, B:19:0x0074, B:21:0x007a, B:23:0x009f, B:24:0x00a3), top: B:28:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r6, android.net.Uri r7) {
        /*
            java.lang.String r0 = "finishPreviousActivities:"
            java.lang.String r1 = "UltronTradeHybridHelper"
            if (r6 == 0) goto L_0x00c4
            if (r7 != 0) goto L_0x000a
            goto L_0x00c4
        L_0x000a:
            java.lang.String r2 = "popFrom"
            java.lang.String r7 = r7.getQueryParameter(r2)     // Catch: all -> 0x0024
            java.lang.String r2 = "live_detail"
            boolean r2 = android.text.TextUtils.equals(r2, r7)     // Catch: all -> 0x0024
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = "live"
            boolean r2 = android.text.TextUtils.equals(r2, r7)     // Catch: all -> 0x0024
            if (r2 == 0) goto L_0x0035
            goto L_0x0027
        L_0x0024:
            r6 = move-exception
            goto L_0x00ae
        L_0x0027:
            androidx.localbroadcastmanager.content.LocalBroadcastManager r6 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r6)     // Catch: all -> 0x0024
            android.content.Intent r2 = new android.content.Intent     // Catch: all -> 0x0024
            java.lang.String r3 = "TradePay.Event.livebag.close"
            r2.<init>(r3)     // Catch: all -> 0x0024
            r6.sendBroadcast(r2)     // Catch: all -> 0x0024
        L_0x0035:
            java.util.List r6 = h(r7)     // Catch: all -> 0x0024
            if (r6 == 0) goto L_0x00a3
            boolean r7 = r6.isEmpty()     // Catch: all -> 0x0024
            if (r7 == 0) goto L_0x0042
            goto L_0x00a3
        L_0x0042:
            java.lang.String r7 = "android.app.ActivityThread"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: all -> 0x0024
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: all -> 0x0024
            java.lang.reflect.Method r2 = r7.getDeclaredMethod(r2, r4)     // Catch: all -> 0x0024
            r4 = 1
            r2.setAccessible(r4)     // Catch: all -> 0x0024
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: all -> 0x0024
            r5 = 0
            java.lang.Object r2 = r2.invoke(r5, r3)     // Catch: all -> 0x0024
            java.lang.String r3 = "mActivities"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r3)     // Catch: all -> 0x0024
            r7.setAccessible(r4)     // Catch: all -> 0x0024
            java.lang.Object r7 = r7.get(r2)     // Catch: all -> 0x0024
            java.util.Map r7 = (java.util.Map) r7     // Catch: all -> 0x0024
            java.util.Collection r7 = r7.values()     // Catch: all -> 0x0024
            java.util.Iterator r7 = r7.iterator()     // Catch: all -> 0x0024
        L_0x0074:
            boolean r2 = r7.hasNext()     // Catch: all -> 0x0024
            if (r2 == 0) goto L_0x00c4
            java.lang.Object r2 = r7.next()     // Catch: all -> 0x0024
            java.lang.Class r3 = r2.getClass()     // Catch: all -> 0x0024
            java.lang.String r5 = "activity"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r5)     // Catch: all -> 0x0024
            r3.setAccessible(r4)     // Catch: all -> 0x0024
            java.lang.Object r2 = r3.get(r2)     // Catch: all -> 0x0024
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: all -> 0x0024
            android.content.ComponentName r3 = r2.getComponentName()     // Catch: all -> 0x0024
            java.lang.String r3 = r3.getClassName()     // Catch: all -> 0x0024
            boolean r3 = r6.contains(r3)     // Catch: all -> 0x0024
            if (r3 == 0) goto L_0x0074
            r2.finish()     // Catch: all -> 0x0024
            goto L_0x0074
        L_0x00a3:
            java.lang.String r6 = "no removedActivities!"
            java.lang.String[] r6 = new java.lang.String[]{r0, r6}     // Catch: all -> 0x0024
            tb.hav.g(r1, r6)     // Catch: all -> 0x0024
            return
        L_0x00ae:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "onError!"
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String[] r6 = new java.lang.String[]{r0, r6}
            tb.hav.g(r1, r6)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lbv.b(android.content.Context, android.net.Uri):void");
    }

    public static String c(Context context, mbv mbvVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ee3076", new Object[]{context, mbvVar, new Integer(i), new Integer(i2)});
        }
        return com.alibaba.android.ultron.vfw.weex2.a.g().e(context, mbvVar.f23930a, mbvVar.b, mbvVar.i, i, i2);
    }

    public static String d(Context context, mbv mbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad06d038", new Object[]{context, mbvVar});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return c(context, mbvVar, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4d76746", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Uri.parse(str).getQueryParameter(str2);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d387e5f", new Object[]{context})).intValue();
        }
        if (!(context instanceof Activity)) {
            return 0;
        }
        Activity activity = (Activity) context;
        if (activity.getWindowManager() == null || activity.getWindowManager().getDefaultDisplay() == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static boolean g(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ff984a6", new Object[]{aVar})).booleanValue();
        }
        ybv a2 = ybv.a(aVar);
        if (a2 == null) {
            return false;
        }
        boolean e2 = a2.e();
        boolean c2 = a2.c();
        boolean d2 = a2.d();
        hav.d("UltronTradeHybridHelper", "isRenderReady: " + e2 + ", isBizReady: " + c2 + ", isRenderException: " + d2);
        if (!e2 || !c2 || d2) {
            return false;
        }
        return true;
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644f5b02", new Object[0]);
        } else if (v9v.i("orderMap", "enableRegisterAMapPlatformView", true)) {
            if (v9v.i("orderMap", "useRegisterPlatformViewV2", true)) {
                t();
            } else {
                s();
            }
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce56557", new Object[0]);
        } else if (!f23240a) {
            MUSEngine.registerModule(UltronWeex2TradeHybridContainerModule.MODULE_NAME, UltronWeex2TradeHybridContainerModule.class);
            MUSEngine.registerModule(UltronWeex2BackKeyModule.MODULE_NAME, UltronWeex2BackKeyModule.class);
            MUSEngine.registerModule(UltronWeex2TinctModule.MODULE_NAME, UltronWeex2TinctModule.class);
            MUSEngine.registerModule(UltronWeex2BizLifecycleModule.MODULE_NAME, UltronWeex2BizLifecycleModule.class);
            MUSEngine.registerModule(UltronWeex2PrefetchCacheModule.MODULE_NAME, UltronWeex2PrefetchCacheModule.class);
            MUSEngine.registerModule(UltronWeex2ImagePreloadModule.MODULE_NAME, UltronWeex2ImagePreloadModule.class);
            MUSEngine.registerModule(UltronWeex2TradeHybridManagerModule.MODULE_NAME, UltronWeex2TradeHybridManagerModule.class);
            f23240a = true;
            hav.g("UltronTradeHybridHelper", "registerWeexModule:", "first registration");
        } else {
            hav.g("UltronTradeHybridHelper", "registerWeexModule:", "has registered");
        }
    }

    public static Object n(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5e2df951", new Object[]{str, jSONObject});
        }
        if (!m(str)) {
            return null;
        }
        try {
            String[] split = str.substring(2, str.length() - 1).split("\\.");
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            Object obj = null;
            for (int i = 0; i < split.length; i++) {
                if (i < split.length - 1) {
                    jSONObject2 = jSONObject2.getJSONObject(split[i]);
                    if (jSONObject2 == null) {
                        break;
                    }
                } else {
                    obj = jSONObject2.get(split[i]);
                }
            }
            return obj;
        } catch (Exception e2) {
            UnifyLog.e("UltronTradeHybridPreRequest.parseExpression", e2.toString());
            return null;
        }
    }

    public static JSONObject o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e52340af", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(jSONObject);
        if (jSONObject2.containsKey(gbv.PARAM_KEY_DX_ENGINE)) {
            jSONObject2.remove(gbv.PARAM_KEY_DX_ENGINE);
        }
        return jSONObject2;
    }

    public static boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f00ed785", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("hybridEmbedPageType");
    }

    public static void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a6ed5d", new Object[0]);
            return;
        }
        try {
            if (c && d) {
                hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "PlatformView均已注册");
            } else if (mcq.a().a().contains(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC)) {
                if (!c) {
                    MUSEngine.registerPlatformView("order-amap", Class.forName("com.taobao.android.order.bundle.weex2.view.AMapPlatformView"));
                    c = true;
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "order-amap - 同步注册");
                }
                if (!d) {
                    MUSEngine.registerPlatformView("order-amapv4", Class.forName("com.taobao.android.order.bundle.weex2.view.AMapV4PlatformView"));
                    d = true;
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "order-amapv4 - 同步注册");
                }
            } else {
                zk9.b("com.taobao.android.order.bundle.weex2.view.AMapPlatformView", new a());
                zk9.b("com.taobao.android.order.bundle.weex2.view.AMapV4PlatformView", new b());
            }
        } catch (Exception e2) {
            hav.g("UltronTradeHybridHelper", "registerPlatformViewV1:", "Error: " + e2.toString());
        }
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b504de", new Object[0]);
            return;
        }
        try {
            if (c && d) {
                hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "PlatformView均已注册");
            } else if (mcq.a().a().contains(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC)) {
                if (!c) {
                    MUSEngine.registerPlatformView("order-amap", Class.forName("com.taobao.android.order.bundle.weex2.view.AMapPlatformView"));
                    c = true;
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "order-amap - 同步注册");
                }
                if (!d) {
                    MUSEngine.registerPlatformView("order-amapv4", Class.forName("com.taobao.android.order.bundle.weex2.view.AMapV4PlatformView"));
                    d = true;
                    hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "order-amapv4 - 同步注册");
                }
            } else {
                zk9.b("com.taobao.android.order.bundle.weex2.view.AMapPlatformView", new c());
            }
        } catch (Exception e2) {
            hav.g("UltronTradeHybridHelper", "registerPlatformViewV2:", "Error: " + e2.toString());
        }
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffbc492", new Object[]{str});
        } else if (TextUtils.equals(str, "mytaobao")) {
            if (b) {
                hav.g("UltronTradeHybridHelper", "tryPrefetchOListImgOnMytaobao:", "has prefetched");
            } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "tryPrefetchOListImgOnMytaobao", true)) {
                b = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ccv.PARAM_ASYNC_DATA_SOURCE, (Object) "true");
                qbv.j().a(UltronTradeHybridStage.ON_RENDER_END, "mytaobao", jSONObject);
                hav.g("UltronTradeHybridHelper", "tryPrefetchOListImgOnMytaobao:", "try to prefetch");
            }
        }
    }

    public static void r(UltronTradeHybridDialogFragment ultronTradeHybridDialogFragment, String str, Bundle bundle) {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d27532", new Object[]{ultronTradeHybridDialogFragment, str, bundle});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "setInitialDataInEmbed", true) && ultronTradeHybridDialogFragment != null && bundle != null && q(str) && (keySet = bundle.keySet()) != null && !keySet.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : keySet) {
                if (!TextUtils.isEmpty(str2) && bundle.get(str2) != null) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            }
            if (!jSONObject.isEmpty()) {
                ultronTradeHybridDialogFragment.Q3(jSONObject);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r6.equals("nd_detail") == false) goto L_0x005f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> h(java.lang.String r6) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.lbv.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "b6f30c9"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r1)
            java.util.List r6 = (java.util.List) r6
            return r6
        L_0x0015:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r3 = "loadFinishedDialogActivities:"
            java.lang.String r4 = "UltronTradeHybridHelper"
            r5 = 0
            if (r2 == 0) goto L_0x002c
            java.lang.String r6 = "popFrom is empty!"
            java.lang.String[] r6 = new java.lang.String[]{r3, r6}
            tb.hav.g(r4, r6)
            return r5
        L_0x002c:
            java.lang.String r2 = "tradeHybridPaySuccess"
            java.lang.String r2 = tb.v9v.g(r2, r6, r5)
            if (r2 == 0) goto L_0x0054
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.util.List r6 = com.alibaba.fastjson.JSON.parseArray(r2, r6)     // Catch: all -> 0x003c
            return r6
        L_0x003c:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onError!"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String[] r6 = new java.lang.String[]{r3, r6}
            tb.hav.g(r4, r6)
            return r5
        L_0x0054:
            r6.hashCode()
            r2 = -1
            int r3 = r6.hashCode()
            switch(r3) {
                case -1690874118: goto L_0x0079;
                case -1479097596: goto L_0x006d;
                case 3510: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            r0 = -1
            goto L_0x0083
        L_0x0061:
            java.lang.String r0 = "nd"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x006b
            goto L_0x005f
        L_0x006b:
            r0 = 2
            goto L_0x0083
        L_0x006d:
            java.lang.String r0 = "live_detail"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0077
            goto L_0x005f
        L_0x0077:
            r0 = 1
            goto L_0x0083
        L_0x0079:
            java.lang.String r1 = "nd_detail"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0083
            goto L_0x005f
        L_0x0083:
            switch(r0) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008a;
                case 2: goto L_0x0087;
                default: goto L_0x0086;
            }
        L_0x0086:
            return r5
        L_0x0087:
            java.util.List<java.lang.String> r6 = tb.lbv.e
            return r6
        L_0x008a:
            java.util.List<java.lang.String> r6 = tb.lbv.g
            return r6
        L_0x008d:
            java.util.List<java.lang.String> r6 = tb.lbv.f
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lbv.h(java.lang.String):java.util.List");
    }

    public static void j(UltronWeex2DialogFragment ultronWeex2DialogFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a615d7fa", new Object[]{ultronWeex2DialogFragment, str, str2});
        } else if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableRedirectByWeexError", true)) {
            hav.g("UltronTradeHybridHelper", "redirectPageByWeexError", "switcher is off");
        } else if (TextUtils.isEmpty(str)) {
            hav.g("UltronTradeHybridHelper", "redirectPageByWeexError", "weexUrl is empty");
        } else if (ultronWeex2DialogFragment == null || ultronWeex2DialogFragment.getActivity() == null) {
            hav.g("UltronTradeHybridHelper", "redirectPageByWeexError", "context is error");
        } else {
            FragmentActivity activity = ultronWeex2DialogFragment.getActivity();
            h15 success = nbv.a.a("redirectPageByWeexError").success(false);
            nbv.a(success.message(str2 + " - " + str).sampling(0.01f));
            if (str.contains("tradeHybrid=true")) {
                str = str.replace("tradeHybrid=true", "tradeHybrid=false");
            }
            try {
                if (q(str)) {
                    Toast.makeText(Globals.getApplication(), "请关闭页面后重试", 0).show();
                    return;
                }
                Nav.from(activity).disableTransition().toUri(Uri.parse(str));
                if (activity instanceof UltronTradeHybridActivity) {
                    activity.finish();
                } else {
                    ultronWeex2DialogFragment.dismiss();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6df6a84", new Object[]{str})).booleanValue();
        }
        return !TextUtils.isEmpty(str) && str.startsWith("${") && str.endsWith("}");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r7.equals("refundProcess") == false) goto L_0x002a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.lbv.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "b5ed299d"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            r0[r1] = r7
            java.lang.Object r6 = r3.ipc$dispatch(r4, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            r7.hashCode()
            java.lang.String r3 = "on_container_resume"
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1554129835: goto L_0x0072;
                case -1332506973: goto L_0x0066;
                case -767426601: goto L_0x005c;
                case -391817972: goto L_0x0050;
                case 120528346: goto L_0x0044;
                case 1066145458: goto L_0x0038;
                case 1275195605: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = -1
            goto L_0x007d
        L_0x002c:
            java.lang.String r0 = "tabGuangGuang"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0036
            goto L_0x002a
        L_0x0036:
            r0 = 6
            goto L_0x007d
        L_0x0038:
            java.lang.String r0 = "tabMessage"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0042
            goto L_0x002a
        L_0x0042:
            r0 = 5
            goto L_0x007d
        L_0x0044:
            java.lang.String r0 = "mytaobao"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x004e
            goto L_0x002a
        L_0x004e:
            r0 = 4
            goto L_0x007d
        L_0x0050:
            java.lang.String r0 = "orderList"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005a
            goto L_0x002a
        L_0x005a:
            r0 = 3
            goto L_0x007d
        L_0x005c:
            java.lang.String r5 = "refundProcess"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x007d
            goto L_0x002a
        L_0x0066:
            java.lang.String r0 = "tabHomepage"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0070
            goto L_0x002a
        L_0x0070:
            r0 = 1
            goto L_0x007d
        L_0x0072:
            java.lang.String r0 = "tabCart"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x007c
            goto L_0x002a
        L_0x007c:
            r0 = 0
        L_0x007d:
            switch(r0) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0098;
                case 2: goto L_0x0091;
                case 3: goto L_0x0081;
                case 4: goto L_0x0091;
                case 5: goto L_0x0098;
                case 6: goto L_0x0098;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00a2
        L_0x0081:
            boolean r7 = r3.equals(r6)
            if (r7 != 0) goto L_0x0090
            java.lang.String r7 = "on_container_destroy"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00a2
        L_0x0090:
            return r1
        L_0x0091:
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x00a2
            return r1
        L_0x0098:
            java.lang.String r7 = "on_tab_change"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00a2
            return r1
        L_0x00a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lbv.a(java.lang.String, java.lang.String):boolean");
    }

    public static String i(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa59ab4", new Object[]{str, jSONObject});
        }
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return "";
        }
        if (!str.startsWith("${") || !str.endsWith("}")) {
            return str;
        }
        try {
            String[] split = str.substring(2, str.length() - 1).split("\\.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(jSONObject);
            for (int i = 0; i < split.length; i++) {
                if (i == split.length - 1) {
                    str = jSONObject2.getString(split[i]);
                    return str;
                }
                jSONObject2 = jSONObject2.getJSONObject(split[i]);
                if (jSONObject2 == null) {
                    return str;
                }
            }
            return str;
        } catch (Exception e2) {
            UnifyLog.e("UltronTradeHybridPreRequestCallback.onSuccess", e2.toString());
            return str;
        }
    }
}
