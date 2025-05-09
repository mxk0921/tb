package tb;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import com.taobao.taobao.R;
import java.io.File;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qtm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int P2FF_PREADDVIEW_SAFEREMOVE_DELAYTIME = 500;

    /* renamed from: a  reason: collision with root package name */
    public static String f26924a = "435094871315";
    public static final String b = "435094871315_localfile";
    public static final long c = -1;
    public static long d = -1;
    public static boolean e;
    public static boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26925a;
        public final /* synthetic */ DetailCacheData b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ int d;

        /* compiled from: Taobao */
        /* renamed from: tb.qtm$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C1042a implements h9e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1042a() {
            }

            @Override // tb.h9e
            public void onCancel(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
                }
            }

            @Override // tb.h9e
            public void onError(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                }
            }

            @Override // tb.h9e
            public void onFinish(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                    return;
                }
                ryr.d(a.this.f26925a, null, "gg_pickpreload_preload_inpath", null);
                ir9.b("PickPreloadController_PreloadVideoUtils", "preload path preLoadWithVideoInfo onFinish:" + i);
            }

            @Override // tb.h9e
            public void onProgress(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                }
            }

            @Override // tb.h9e
            public void onStart(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                    return;
                }
                ir9.b("PickPreloadController_PreloadVideoUtils", "preload path preLoadWithVideoInfo onStart:" + str);
            }
        }

        public a(Context context, DetailCacheData detailCacheData, JSONObject jSONObject, int i) {
            this.f26925a = context;
            this.b = detailCacheData;
            this.c = jSONObject;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ryr.b(this.f26925a, null, "gg_pickpreload_preload_inpath");
            String d = lv7.d(this.f26925a, this.b.getContentId(), this.c, this.d * 1024, null, new C1042a());
            ir9.b("PickPreloadController_PreloadVideoUtils", "preload path preLoadWithVideoInfo size:" + this.d + " url: " + d + "contentid:" + this.b.getContentId());
            if (TextUtils.isEmpty(d)) {
                ryr.c(this.f26925a, null, "gg_pickpreload_preload_inpath", "no url", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f26927a;

        public b(View view) {
            this.f26927a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else {
                ir9.b("PickPreloadController_PreloadVideoUtils", "[preloadvideo]预创建播放器 onViewAttachedToWindow");
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                return;
            }
            ir9.b("PickPreloadController_PreloadVideoUtils", "[preloadvideo]预创建播放器 onViewDetachedFromWindow");
            qtm.n(this.f26927a);
            this.f26927a.removeOnAttachStateChangeListener(this);
        }
    }

    static {
        t2o.a(468714675);
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ea9a5d4", new Object[0])).longValue();
        }
        return d;
    }

    public static ntm d(FluidInstance fluidInstance, Context context, ViewGroup viewGroup, boolean z, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("1dfeb63f", new Object[]{fluidInstance, context, viewGroup, new Boolean(z), uri});
        }
        if (!(context instanceof Activity)) {
            ir9.b("PickPreloadController_PreloadVideoUtils", "PickPreloadControllerNew,setLocalVideoPreloadData当前的Context不是Activity的Context，return");
            return null;
        }
        String c2 = c(context, z);
        com.alibaba.fastjson.JSONObject g = vrl.g(uri);
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        ir9.b("PickPreloadController_PreloadVideoUtils", "PickPreloadControllerNew,创建本地文件播放器");
        Pair<atb, String> a2 = omm.a(fluidInstance, context, false, f26924a, c2, null, viewGroup, g, null);
        ntm ntmVar = new ntm((atb) a2.first, (String) a2.second);
        ntmVar.i(null);
        ntmVar.j = true;
        ntmVar.k = c2;
        ntmVar.o = true;
        ntmVar.s = g(uri);
        ntmVar.p = false;
        ntmVar.q = z;
        return ntmVar;
    }

    public static int e(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e725e73", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            return activeNetworkInfo.getType();
        } catch (Throwable th) {
            ir9.c("PickPreloadController_PreloadVideoUtils", th.getMessage(), th);
            return 0;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25e924a9", new Object[0])).booleanValue();
        }
        long j = c;
        boolean z2 = true;
        if (j < 0) {
            z = true;
        }
        if (System.currentTimeMillis() - j <= 0) {
            z2 = z;
        }
        ir9.b("PickPreloadController_PreloadVideoUtils", "PickPreloadController,iconNetWorkRequestOverdued，overdued:" + z2);
        return z2;
    }

    public static boolean h(atb atbVar) {
        ViewGroup view;
        ntm ntmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7a21903", new Object[]{atbVar})).booleanValue();
        }
        if (atbVar == null || (view = atbVar.getView()) == null || (ntmVar = (ntm) view.getTag(R.id.fluid_sdk_tag_preloadVideo)) == null) {
            return false;
        }
        if (ntmVar.j || ntmVar.r) {
            return true;
        }
        return false;
    }

    public static boolean i(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e3fc980", new Object[]{fluidContext})).booleanValue();
        }
        return ((IPreloadService) fluidContext.getService(IPreloadService.class)).isPreloadedVideoAdded(fluidContext);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37ac01bc", new Object[0])).booleanValue();
        }
        return e;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0aa7a91", new Object[0])).booleanValue();
        }
        return f;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c896226", new Object[]{context})).booleanValue();
        }
        try {
            if (e(context) == 1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            ir9.c("PickPreloadController_PreloadVideoUtils", th.getMessage(), th);
            return false;
        }
    }

    public static boolean n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1700dbff", new Object[]{view})).booleanValue();
        }
        if (view != null) {
            int i = R.id.fluid_sdk_tag_p2ff_preaddview;
            if (nwv.o(view.getTag(i), false)) {
                view.setTag(i, Boolean.FALSE);
                view.setAlpha(1.0f);
                if (view.getParent() instanceof NavigationTabIndicatorView) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ir9.b("PickPreloadController_PreloadVideoUtils", "[preloadvideo]预创建播放器 reset videoview....");
                return true;
            }
        }
        return false;
    }

    public static void p(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cf28f0", new Object[]{new Long(j)});
        } else {
            d = j;
        }
    }

    public static boolean g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dca740e", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("spm");
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter.startsWith("huitui.huitui");
        }
        return false;
    }

    public static void o(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30866797", new Object[]{uri});
            return;
        }
        f = "1".equals(uri.getQueryParameter("skipMTOPSS"));
        e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(android.view.View r6) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "PickPreloadController_PreloadVideoUtils"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.qtm.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r2 = "cdef5d0a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r2, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001b:
            if (r6 != 0) goto L_0x001e
            return r0
        L_0x001e:
            boolean r3 = tb.aps.N()
            if (r3 != 0) goto L_0x0077
            java.lang.String r3 = "enableP2ffPreAddview"
            boolean r3 = tb.usm.j(r3)
            if (r3 == 0) goto L_0x0077
            com.taobao.tao.navigation.TBFragmentTabHost r3 = com.taobao.tao.navigation.a.o()     // Catch: all -> 0x005d
            if (r3 == 0) goto L_0x0077
            com.taobao.tao.navigation.NavigationTabIndicatorView r3 = r3.getTabViewAtIndex(r1)     // Catch: all -> 0x005d
            if (r3 == 0) goto L_0x0077
            android.view.ViewParent r4 = r6.getParent()     // Catch: all -> 0x005d
            if (r4 != 0) goto L_0x0077
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch: all -> 0x005d
            r4.<init>(r1, r1)     // Catch: all -> 0x005d
            r6.setVisibility(r0)     // Catch: all -> 0x005d
            r5 = 0
            r6.setAlpha(r5)     // Catch: all -> 0x005d
            r3.addView(r6, r4)     // Catch: all -> 0x005d
            int r3 = com.taobao.taobao.R.id.fluid_sdk_tag_p2ff_preaddview     // Catch: all -> 0x005d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: all -> 0x005d
            r6.setTag(r3, r4)     // Catch: all -> 0x005d
            java.lang.String r0 = "[preloadvideo]预创建播放器 add viewtree"
            tb.ir9.b(r2, r0)     // Catch: all -> 0x005b
            r0 = 1
            goto L_0x0077
        L_0x005b:
            r0 = move-exception
            goto L_0x0060
        L_0x005d:
            r1 = move-exception
            r0 = r1
            r1 = 0
        L_0x0060:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "p2ffPreAddview error"
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            tb.ir9.b(r2, r0)
            r0 = r1
        L_0x0077:
            if (r0 == 0) goto L_0x0081
            tb.qtm$b r1 = new tb.qtm$b
            r1.<init>(r6)
            r6.addOnAttachStateChangeListener(r1)
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qtm.m(android.view.View):boolean");
    }

    public static String c(Context context, boolean z) {
        String[] split;
        File g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9b62c2", new Object[]{context, new Boolean(z)});
        }
        synchronized (qtm.class) {
            try {
                IStorage z2 = od0.D().z();
                Object a2 = ggs.a("Tab2localVideoConfig");
                String str = a2 instanceof String ? (String) a2 : null;
                if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null && split.length == 2) {
                    String str2 = split[0];
                    String str3 = split[1];
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && (g = z2.g(str3)) != null && g.exists()) {
                        ir9.b("PickPreloadController_PreloadVideoUtils", "获取远程配置的视频文件, videoId:" + str2);
                        f26924a = str2;
                        return g.getAbsolutePath();
                    }
                }
                if (z || akt.p2("ShortVideo.useLocalVideoInHotLaunch", true)) {
                    File g2 = z2.g(b);
                    if (g2 != null) {
                        if (g2.exists() && g2.isFile()) {
                            ir9.b("PickPreloadController_PreloadVideoUtils", "本地视频文件已存在");
                            return g2.getAbsolutePath();
                        } else if (nwv.n0(context, "tab2_launcher.mp4", g2)) {
                            ir9.b("PickPreloadController_PreloadVideoUtils", "移动本地视频文件成功");
                            return g2.getAbsolutePath();
                        }
                    }
                    ir9.b("PickPreloadController_PreloadVideoUtils", "本地视频文件不存在");
                    return null;
                }
                ir9.b("PickPreloadController_PreloadVideoUtils", "热启不使用本地视频文件");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.ntm a(com.taobao.android.fluid.core.FluidInstance r16, android.content.Context r17, android.view.ViewGroup r18, boolean r19, android.net.Uri r20, com.taobao.android.fluid.framework.preload.cache.DetailCacheData r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qtm.a(com.taobao.android.fluid.core.FluidInstance, android.content.Context, android.view.ViewGroup, boolean, android.net.Uri, com.taobao.android.fluid.framework.preload.cache.DetailCacheData):tb.ntm");
    }
}
