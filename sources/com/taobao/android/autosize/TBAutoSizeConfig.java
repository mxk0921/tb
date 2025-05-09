package com.taobao.android.autosize;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Choreographer;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.orientation.ConfigChangeProvider;
import com.taobao.android.autosize.orientation.FoldPosture;
import com.taobao.application.common.IApmEventListener;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.c21;
import tb.d7r;
import tb.e7r;
import tb.f7r;
import tb.f8k;
import tb.guk;
import tb.ig4;
import tb.obq;
import tb.rhx;
import tb.w1a;
import tb.wvr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBAutoSizeConfig implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static volatile TBAutoSizeConfig s = null;
    public static int t = -1;
    public static int u = -1;
    public static ArrayList<String> v;
    public static final List<String> w = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public int f6411a;
    public float b;
    public int c;
    public int d;
    public volatile int e;
    public volatile int f;
    public Application h;
    public e7r i;
    public int g = 375;
    public final List<OnScreenChangedListener> j = new CopyOnWriteArrayList();
    public final Set<OnScreenChangedListener> k = new CopyOnWriteArraySet();
    public final com.taobao.android.autosize.a l = new com.taobao.android.autosize.a();
    public final Handler m = new Handler(Looper.getMainLooper());
    public volatile boolean n = false;
    public volatile int o = 1;
    public volatile boolean p = false;
    public boolean q = false;
    public volatile boolean r = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ComponentCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Configuration f6413a;

        public a(Configuration configuration) {
            this.f6413a = configuration;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                return;
            }
            TBAutoSizeConfig.this.e = this.f6413a.screenWidthDp;
            TBAutoSizeConfig.this.f = this.f6413a.screenHeightDp;
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements w1a<Activity, Configuration, Integer, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public Void invoke(Activity activity, Configuration configuration, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("e2a1d725", new Object[]{this, activity, configuration, num});
            }
            TBAutoSizeConfig.this.a0(activity, configuration, num.intValue());
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f6415a;
        public final /* synthetic */ Configuration b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    return;
                }
                TLog.loge("TBAutoSize.ConfigInterface", "delayNotifyConfigurationChanged: activity=" + c.this.f6415a);
                c cVar = c.this;
                TBAutoSizeConfig.a(TBAutoSizeConfig.this, cVar.b, cVar.f6415a);
            }
        }

        public c(Activity activity, Configuration configuration) {
            this.f6415a = activity;
            this.b = configuration;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Choreographer.getInstance().postFrameCallback(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements IApmEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (2 == i) {
                TBAutoSizeConfig.d(TBAutoSizeConfig.this, "checkOnBgFg", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6419a;
        public final /* synthetic */ Activity b;

        public f(String str, Activity activity) {
            this.f6419a = str;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBAutoSizeConfig tBAutoSizeConfig = TBAutoSizeConfig.this;
            Application application = tBAutoSizeConfig.h;
            if (!tBAutoSizeConfig.W(application, application.getResources().getConfiguration())) {
                i = 2;
            }
            if (i != TBAutoSizeConfig.e(TBAutoSizeConfig.this)) {
                TBAutoSizeConfig.f(TBAutoSizeConfig.this, i);
                TLog.loge("TBAutoSize.ConfigInterface", "newType != nowScreenChangeType, recall onScreenChanged, type=" + this.f6419a);
                TBAutoSizeConfig tBAutoSizeConfig2 = TBAutoSizeConfig.this;
                TBAutoSizeConfig.a(tBAutoSizeConfig2, tBAutoSizeConfig2.h.getResources().getConfiguration(), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            TBAutoSizeConfig tBAutoSizeConfig = TBAutoSizeConfig.this;
            if (TBAutoSizeConfig.e(tBAutoSizeConfig) != i) {
                z = false;
            }
            TBAutoSizeConfig.c(tBAutoSizeConfig, z);
            TBAutoSizeConfig.f(TBAutoSizeConfig.this, i);
        }
    }

    public TBAutoSizeConfig() {
        if (v == null) {
            v = new ArrayList<>();
        }
        v.add(obq.BIZ_NAME);
        v.add("com.taobao.android.trade.cart.CartActivity");
        v.add("com.taobao.order.detail.ui.OrderDetailActivity");
        v.add("com.taobao.message.category.MsgCenterCategoryTabActivity");
        v.add("com.taobao.message.category.MsgCenterCategoryListActivity");
        v.add("com.taobao.message.category.MsgCenterCategoryActivity");
        v.add("com.taobao.order.list.OrderListActivity");
        v.add("com.taobao.android.purchase.TBPurchaseActivity");
        v.add("com.taobao.android.detail.wrapper.activity.DetailActivity");
        ArrayList arrayList = (ArrayList) w;
        arrayList.add("com.taobao.tao.welcome.Welcome");
        arrayList.add(obq.BIZ_NAME);
    }

    public static /* synthetic */ void a(TBAutoSizeConfig tBAutoSizeConfig, Configuration configuration, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaad2a8", new Object[]{tBAutoSizeConfig, configuration, activity});
        } else {
            tBAutoSizeConfig.Z(configuration, activity);
        }
    }

    public static /* synthetic */ boolean b(TBAutoSizeConfig tBAutoSizeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a68dee0", new Object[]{tBAutoSizeConfig})).booleanValue();
        }
        return tBAutoSizeConfig.p;
    }

    public static int b0(Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbe6c968", new Object[]{context, new Float(f2)})).intValue();
        }
        return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ boolean c(TBAutoSizeConfig tBAutoSizeConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e64e43a", new Object[]{tBAutoSizeConfig, new Boolean(z)})).booleanValue();
        }
        tBAutoSizeConfig.p = z;
        return z;
    }

    public static /* synthetic */ void d(TBAutoSizeConfig tBAutoSizeConfig, String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e06fcf9", new Object[]{tBAutoSizeConfig, str, activity});
        } else {
            tBAutoSizeConfig.q(str, activity);
        }
    }

    public static /* synthetic */ int e(TBAutoSizeConfig tBAutoSizeConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4de41d1", new Object[]{tBAutoSizeConfig})).intValue();
        }
        return tBAutoSizeConfig.o;
    }

    public static /* synthetic */ int f(TBAutoSizeConfig tBAutoSizeConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("429ba196", new Object[]{tBAutoSizeConfig, new Integer(i)})).intValue();
        }
        tBAutoSizeConfig.o = i;
        return i;
    }

    public static int p(Context context, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f2)})).intValue();
        }
        return (int) ((context.getResources().getDisplayMetrics().density * f2) + 0.5f);
    }

    public static TBAutoSizeConfig x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAutoSizeConfig) ipChange.ipc$dispatch("38617367", new Object[0]);
        }
        if (s == null) {
            synchronized (TBAutoSizeConfig.class) {
                try {
                    if (s == null) {
                        if (ig4.m().x()) {
                            s = new f7r();
                        } else {
                            s = new TBAutoSizeConfig();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return s;
    }

    public static float z(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7843b671", new Object[]{new Float(f2), new Float(f3)})).floatValue();
        }
        if (f2 > 0.0f) {
            float f4 = f3 * 375.0f;
            if (f2 < f4) {
                float f5 = f2 / f4;
                TLog.loge("TBAutoSize.ConfigInterface", "getScalingRatio=" + f5);
                return f5;
            }
        }
        return 1.0f;
    }

    public float A(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29cfeb43", new Object[]{this, activity})).floatValue();
        }
        return z(rhx.a(activity).width(), activity.getResources().getDisplayMetrics().density);
    }

    public int B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{this, context})).intValue();
        }
        int p = p(context, this.f);
        if (p > 0) {
            return p;
        }
        return wvr.a(context)[1];
    }

    public int C(Context context, boolean z) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8be4edb3", new Object[]{this, context, new Boolean(z)})).intValue();
        }
        if (u < 0 || z) {
            if (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
                return 0;
            }
            t = displayMetrics.widthPixels;
            u = displayMetrics.heightPixels;
        }
        return u;
    }

    public ScreenType D(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("6f2663ce", new Object[]{this, context});
        }
        int b0 = b0(context, x().H(context));
        ScreenType E = E(b0);
        TLog.loge("TBAutoSize.ConfigInterface", "getScreenType=" + E + ", widthDp=" + b0 + ", context=" + context);
        return E;
    }

    public ScreenType E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("7d28dc71", new Object[]{this, new Integer(i)});
        }
        if (ig4.m().I()) {
            return F(i);
        }
        return G(i);
    }

    public final ScreenType F(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("434509bb", new Object[]{this, new Integer(i)});
        }
        if (i < 300) {
            return ScreenType.MIN;
        }
        if (i <= 600) {
            return ScreenType.SMALL;
        }
        if (i <= 890) {
            return ScreenType.MEDIUM;
        }
        if (i <= 1150) {
            return ScreenType.LARGE;
        }
        return ScreenType.MAX;
    }

    public final ScreenType G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("51159fc2", new Object[]{this, new Integer(i)});
        }
        if (i < 300) {
            return ScreenType.MIN;
        }
        if (i <= 500) {
            return ScreenType.SMALL;
        }
        if (i <= 960) {
            return ScreenType.MEDIUM;
        }
        if (i <= 1050) {
            return ScreenType.LARGE;
        }
        return ScreenType.MAX;
    }

    public int H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{this, context})).intValue();
        }
        int p = p(context, this.e);
        TLog.loge("TBAutoSize.ConfigInterface", "getScreenWidth: " + p + " context" + context);
        if (p > 0) {
            return p;
        }
        return wvr.a(context)[0];
    }

    public int I(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f369f78", new Object[]{this, context, new Boolean(z)})).intValue();
        }
        int i = t;
        if (i >= 0 && !z) {
            return i;
        }
        Pair<Integer, Integer> g2 = g(context);
        if (g2 == null) {
            return 0;
        }
        t = ((Integer) g2.first).intValue();
        u = ((Integer) g2.second).intValue();
        return t;
    }

    public int J(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2264b5fa", new Object[]{this, context})).intValue();
        }
        int H = x().H(context);
        StringBuilder sb = new StringBuilder("getSplitWindowWidthPx=");
        int i = H / 2;
        sb.append(i);
        TLog.loge("TBAutoSize.ConfigInterface", sb.toString());
        return i;
    }

    public int K(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16d54c70", new Object[]{this, context, new Boolean(z)})).intValue();
        }
        return I(context, z);
    }

    public WindowType L(int i) {
        WindowType windowType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowType) ipChange.ipc$dispatch("a811f3b3", new Object[]{this, new Integer(i)});
        }
        if (ig4.m().I()) {
            windowType = N(i);
        } else {
            windowType = O(i);
        }
        TLog.loge("TBAutoSize.ConfigInterface", "getWindowType=" + windowType + ", widthDp=" + i);
        return windowType;
    }

    public WindowType M(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowType) ipChange.ipc$dispatch("36c5f556", new Object[]{this, activity});
        }
        int b0 = b0(activity, rhx.a(activity).width());
        WindowType L = L(b0);
        TLog.loge("TBAutoSize.ConfigInterface", "getWindowType=" + L + ", widthDp=" + b0 + ", activity=" + activity);
        return L;
    }

    public final WindowType N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowType) ipChange.ipc$dispatch("b7091eb3", new Object[]{this, new Integer(i)});
        }
        if (i < 300) {
            return WindowType.MIN;
        }
        if (i <= 600) {
            return WindowType.SMALL;
        }
        if (i <= 890) {
            return WindowType.MEDIUM;
        }
        if (i <= 1150) {
            return WindowType.LARGE;
        }
        return WindowType.MAX;
    }

    public final WindowType O(int i) {
        WindowType windowType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowType) ipChange.ipc$dispatch("c4d9b4ba", new Object[]{this, new Integer(i)});
        }
        if (i < 300) {
            windowType = WindowType.MIN;
        } else if (i <= 500) {
            windowType = WindowType.SMALL;
        } else if (i <= 960) {
            windowType = WindowType.MEDIUM;
        } else if (i <= 1050) {
            windowType = WindowType.LARGE;
        } else {
            windowType = WindowType.MAX;
        }
        TLog.loge("TBAutoSize.ConfigInterface", "getWindowType=" + windowType);
        return windowType;
    }

    public void P(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
        } else if (this.n) {
            TLog.loge("TBAutoSize.ConfigInterface", "initialized, return");
        } else {
            this.n = true;
            this.h = application;
            Configuration configuration = application.getResources().getConfiguration();
            this.f6411a = configuration.densityDpi;
            this.b = application.getResources().getDisplayMetrics().density;
            int i = configuration.screenWidthDp;
            this.c = i;
            this.e = i;
            int i2 = configuration.screenHeightDp;
            this.d = i2;
            this.f = i2;
            this.g = application.getResources().getInteger(R.integer.designWidth);
            this.r = W(application, configuration);
            TLog.loge("TBAutoSize.ConfigInterface", "init configuration done, new dpi = " + this.f6411a + ", new widthDP = " + this.c + ", new heightDP = " + this.d);
            this.h.registerComponentCallbacks(new a(configuration));
            X(application);
            if (!ig4.m().M()) {
                j();
            }
            k(application);
            Y(application);
            i(application);
            e7r e7rVar = new e7r();
            this.i = e7rVar;
            application.registerActivityLifecycleCallbacks(e7rVar);
        }
    }

    public boolean Q(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("333cfd02", new Object[]{this, activity})).booleanValue();
        }
        return wvr.c(activity);
    }

    public boolean R(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("938bce89", new Object[]{this, context})).booleanValue();
        }
        return wvr.b(context);
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6df34db", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean T(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802a3d16", new Object[]{this, context})).booleanValue();
        }
        return this.r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (com.taobao.android.autosize.TBDeviceUtils.D(r4) == false) goto L_0x0073;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (com.taobao.android.autosize.TBDeviceUtils.D(y()) == false) goto L_0x0073;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean U(android.content.Context r11, android.content.res.Configuration r12) {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.autosize.TBAutoSizeConfig.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "e73881e0"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r10
            r5[r1] = r11
            r5[r0] = r12
            java.lang.Object r11 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x001f:
            boolean r3 = com.taobao.android.autosize.TBDeviceUtils.P(r11)
            if (r3 != 0) goto L_0x002c
            boolean r3 = com.taobao.android.autosize.TBDeviceUtils.p(r11)
            if (r3 != 0) goto L_0x002c
            return r1
        L_0x002c:
            com.taobao.android.autosize.TBAutoSizeConfig r3 = x()
            boolean r3 = r3.S()
            boolean r4 = r11 instanceof android.app.Activity
            java.lang.String r5 = "TBAutoSize.ConfigInterface"
            if (r4 == 0) goto L_0x004a
            r4 = r11
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r6 = com.taobao.android.autosize.TBDeviceUtils.E(r4)
            if (r6 != 0) goto L_0x005e
            boolean r4 = com.taobao.android.autosize.TBDeviceUtils.D(r4)
            if (r4 == 0) goto L_0x0073
            goto L_0x005e
        L_0x004a:
            android.app.Activity r4 = r10.y()
            boolean r4 = com.taobao.android.autosize.TBDeviceUtils.E(r4)
            if (r4 != 0) goto L_0x005e
            android.app.Activity r4 = r10.y()
            boolean r4 = com.taobao.android.autosize.TBDeviceUtils.D(r4)
            if (r4 == 0) goto L_0x0073
        L_0x005e:
            if (r3 == 0) goto L_0x0073
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "isPortraitLayout=true isEasyGoOpen=true context="
            r12.<init>(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.taobao.tao.log.TLog.loge(r5, r11)
            return r1
        L_0x0073:
            int r11 = com.taobao.android.autosize.TBDeviceUtils.a(r11)
            if (r11 == 0) goto L_0x00cf
            if (r11 != r1) goto L_0x007c
            goto L_0x00cf
        L_0x007c:
            if (r11 != r0) goto L_0x0095
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "isPortraitLayout=true foldStatus="
            r12.<init>(r0)
            java.lang.String r11 = com.taobao.android.autosize.orientation.FoldPosture.f(r11)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.taobao.tao.log.TLog.loge(r5, r11)
            return r1
        L_0x0095:
            int r11 = r12.screenWidthDp
            double r3 = (double) r11
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r6
            int r11 = r12.screenHeightDp
            double r8 = (double) r11
            double r3 = r3 / r8
            r8 = 4606101554889448489(0x3fec28f5c28f5c29, double:0.88)
            int r11 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r11 >= 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r1 = 0
        L_0x00ab:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "isPortraitLayout="
            r11.<init>(r0)
            r11.append(r1)
            java.lang.String r0 = " widthHeightRate="
            r11.append(r0)
            int r0 = r12.screenWidthDp
            double r2 = (double) r0
            double r2 = r2 * r6
            int r12 = r12.screenHeightDp
            double r6 = (double) r12
            double r2 = r2 / r6
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.taobao.tao.log.TLog.loge(r5, r11)
            return r1
        L_0x00cf:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "isPortraitLayout=false foldStatus="
            r12.<init>(r0)
            java.lang.String r11 = com.taobao.android.autosize.orientation.FoldPosture.f(r11)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.taobao.tao.log.TLog.loge(r5, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.TBAutoSizeConfig.U(android.content.Context, android.content.res.Configuration):boolean");
    }

    public final boolean V(Context context, Configuration configuration) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d60353c", new Object[]{this, context, configuration})).booleanValue();
        }
        if (!TBDeviceUtils.P(context) && !TBDeviceUtils.p(context)) {
            return true;
        }
        boolean S = x().S();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            z = TBDeviceUtils.D(activity);
            z2 = TBDeviceUtils.E(activity);
        } else {
            z = TBDeviceUtils.D(y());
            z2 = TBDeviceUtils.E(y());
        }
        if (!z || S) {
            ScreenType D = D(context);
            if (D == ScreenType.MIN || D == ScreenType.SMALL) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                TLog.loge("TBAutoSize.ConfigInterface", "isInMultiWindowMode=true isPortraitLayoutRealV2=" + z3 + ", screenType=" + D);
                return z3;
            } else if (z3) {
                TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutRealV2=true, screenType=" + D);
                return true;
            } else {
                if ((configuration.screenWidthDp * 1.0d) / configuration.screenHeightDp >= 0.88d) {
                    z4 = false;
                }
                TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutRealV2=" + z4 + " widthHeightRate=" + ((configuration.screenWidthDp * 1.0d) / configuration.screenHeightDp) + " width=" + configuration.screenWidthDp + " height=" + configuration.screenHeightDp);
                return z4;
            }
        } else {
            TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutV2=true isEasyGoOpen=true context=" + context);
            return true;
        }
    }

    public boolean W(Context context, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffbe7849", new Object[]{this, context, configuration})).booleanValue();
        }
        if (ig4.m().M()) {
            this.r = V(context, configuration);
        } else {
            this.r = U(context, configuration);
        }
        return this.r;
    }

    public final void X(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907fb18d", new Object[]{this, application});
        } else {
            ConfigChangeProvider.i().h(new b());
        }
    }

    public final void Y(Application application) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3ae413", new Object[]{this, application});
            return;
        }
        if (!W(application, application.getResources().getConfiguration())) {
            i = 2;
        }
        this.o = i;
        c0(new g());
    }

    public final void Z(Configuration configuration, Activity activity) {
        Activity activity2;
        Activity activity3;
        Activity activity4;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a685e34", new Object[]{this, configuration, activity});
            return;
        }
        if (activity == null) {
            activity2 = y();
        } else {
            activity2 = activity;
        }
        d7r.f(activity2, true);
        if (activity == null) {
            activity3 = y();
        } else {
            activity3 = activity;
        }
        d7r.c(activity3, true);
        if (activity == null) {
            activity4 = y();
        } else {
            activity4 = activity;
        }
        f8k.a(activity4, true);
        this.e = configuration.screenWidthDp;
        this.f = configuration.screenHeightDp;
        TLog.loge("TBAutoSize.ConfigInterface", "notifyConfigurationChanged: activity=" + activity + ", configuration=" + configuration);
        o(activity, configuration);
        if (!this.q || !ig4.m().y()) {
            if (activity != null) {
                context = activity;
            } else {
                context = this.h;
            }
            if (W(context, configuration)) {
                m(activity, 1, configuration);
            } else {
                m(activity, 2, configuration);
            }
        } else {
            TLog.loge("TBAutoSize.ConfigInterface", "notifyConfigurationChanged: skip notify, for barrier on");
        }
    }

    public void a0(Activity activity, Configuration configuration, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccba17c9", new Object[]{this, activity, configuration, new Integer(i)});
        } else {
            l(activity, configuration);
        }
    }

    public void c0(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142682d6", new Object[]{this, onScreenChangedListener});
        } else {
            ((CopyOnWriteArrayList) this.j).add(onScreenChangedListener);
        }
    }

    public void d0(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee5f4f", new Object[]{this, onScreenChangedListener});
        } else {
            ((CopyOnWriteArraySet) this.k).add(onScreenChangedListener);
        }
    }

    public void e0(Activity activity, OnWindowChangedListener onWindowChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecae7346", new Object[]{this, activity, onWindowChangedListener});
        } else {
            this.l.a(activity, onWindowChangedListener);
        }
    }

    public void f0(Application application, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970bec07", new Object[]{this, application, configuration});
            return;
        }
        int i = configuration.densityDpi;
        this.f6411a = i;
        this.b = i / 160.0f;
        this.c = configuration.screenWidthDp;
        this.d = configuration.screenHeightDp;
        TLog.loge("TBAutoSize.ConfigInterface", "reset configuration done, new dpi = " + this.f6411a + ", new widthDP = " + this.c + ", new heightDP = " + this.d);
    }

    public Pair<Integer, Integer> g(Context context) {
        DisplayMetrics displayMetrics;
        int i;
        Activity y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e1ceeed0", new Object[]{this, context});
        }
        if ((context instanceof Application) && ig4.m().G() && (y = x().y()) != null && !y.isDestroyed() && !y.isFinishing()) {
            context = y;
        }
        if (context == null || context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return null;
        }
        Pair<Integer, Integer> d2 = d7r.d(context, true);
        if (displayMetrics.widthPixels + ((Integer) d2.first).intValue() > ((Integer) d2.second).intValue()) {
            i = displayMetrics.widthPixels;
        } else {
            i = ((Integer) d2.first).intValue() + displayMetrics.widthPixels;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(displayMetrics.heightPixels));
    }

    public void g0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bc2df2", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public final void h(OnScreenChangedListener onScreenChangedListener, Activity activity, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763176a", new Object[]{this, onScreenChangedListener, activity, new Integer(i), configuration});
            return;
        }
        onScreenChangedListener.onScreenChanged(i, configuration);
        if (activity != null) {
            try {
                onScreenChangedListener.onActivityChanged(activity, i, configuration);
            } catch (Throwable th) {
                TLog.loge("TBAutoSize.ConfigInterface", "notifyConfigurationChanged: exception, listener=" + onScreenChangedListener, th);
            }
        }
    }

    public boolean h0(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9592aec", new Object[]{this, onScreenChangedListener})).booleanValue();
        }
        if (((CopyOnWriteArraySet) this.k).remove(onScreenChangedListener) || ((CopyOnWriteArrayList) this.j).remove(onScreenChangedListener)) {
            return true;
        }
        return false;
    }

    public final void i(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec26cb0", new Object[]{this, application});
        } else {
            FoldPosture.c(application, new d());
        }
    }

    public void i0(Activity activity, OnWindowChangedListener onWindowChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1830785f", new Object[]{this, activity, onWindowChangedListener});
        } else {
            this.l.i(activity, onWindowChangedListener);
        }
    }

    @Deprecated
    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e47394", new Object[]{this});
        } else {
            c21.c(new e());
        }
    }

    public final void k(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6a2cf5", new Object[]{this, application});
        } else {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public void l(Activity activity, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a266e54d", new Object[]{this, activity, configuration});
        } else {
            this.m.post(new c(activity, configuration));
        }
    }

    public final void m(Activity activity, int i, Configuration configuration) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74dcfe9e", new Object[]{this, activity, new Integer(i), configuration});
            return;
        }
        StringBuilder sb = new StringBuilder();
        n(this.j, activity, i, configuration, sb);
        n(this.k, activity, i, configuration, sb);
        StringBuilder sb2 = new StringBuilder("notifyConfigurationChanged:isPortraitLayout = ");
        if (i != 1) {
            z = false;
        }
        sb2.append(z);
        sb2.append(", new dpi = ");
        sb2.append(configuration.densityDpi);
        sb2.append(", new widthDP = ");
        sb2.append(configuration.screenWidthDp);
        sb2.append(", new heightDP = ");
        sb2.append(configuration.screenHeightDp);
        TLog.loge("TBAutoSize.ConfigInterface", sb2.toString());
        TLog.loge("TBAutoSize.ConfigInterface", "notifyConfigurationChanged: notifyLogInfo" + ((Object) sb));
    }

    public final void n(Collection<OnScreenChangedListener> collection, Activity activity, int i, Configuration configuration, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a15d94b6", new Object[]{this, collection, activity, new Integer(i), configuration, sb});
            return;
        }
        for (OnScreenChangedListener onScreenChangedListener : collection) {
            try {
                sb.append("notifyConfigurationChanged:");
                sb.append(onScreenChangedListener);
                long uptimeMillis = SystemClock.uptimeMillis();
                h(onScreenChangedListener, activity, i, configuration);
                sb.append(", costTime = ");
                sb.append(SystemClock.uptimeMillis() - uptimeMillis);
                sb.append("\n");
            } catch (Exception e2) {
                TLog.loge("TBAutoSize.ConfigInterface", "notifyConfigurationChanged: exception, listener=" + onScreenChangedListener, e2);
            }
        }
    }

    public void o(Activity activity, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419870ad", new Object[]{this, activity, configuration});
        } else {
            this.l.c(activity, configuration, 1);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(final Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        if (((ArrayList) w).contains(activity.getClass().getName())) {
            q("checkOnActivityCreatedLifecycle", activity);
        }
        Application application = this.h;
        this.r = W(application, application.getResources().getConfiguration());
        d7r.f(activity, true);
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.android.autosize.TBAutoSizeConfig.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                    if (str.hashCode() == -2028521039) {
                        super.onFragmentCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/autosize/TBAutoSizeConfig$9");
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle2});
                        return;
                    }
                    super.onFragmentCreated(fragmentManager, fragment, bundle2);
                    if (d7r.c(activity, false) != d7r.c(activity, true)) {
                        TBAutoSizeConfig tBAutoSizeConfig = TBAutoSizeConfig.this;
                        Activity activity2 = activity;
                        tBAutoSizeConfig.l(activity2, activity2.getResources().getConfiguration());
                    }
                }
            }, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (activity.isDestroyed()) {
            this.l.h(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        d7r.f(activity, true);
        if (d7r.c(activity, false) != d7r.c(activity, true)) {
            l(activity, activity.getResources().getConfiguration());
        } else if (ig4.m().w(activity)) {
            q("checkOnActivityResumedLifecycle", activity);
        }
    }

    public final void q(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4882132f", new Object[]{this, str, activity});
        } else {
            this.m.post(new f(str, activity));
        }
    }

    public ArrayList<String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6a186e34", new Object[]{this});
        }
        return v;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("533e301d", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public float t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e950aff9", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ecfb875", new Object[]{this})).intValue();
        }
        return this.f6411a;
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("573859f", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d451c35a", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public Activity y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("323f0ab1", new Object[]{this});
        }
        e7r e7rVar = this.i;
        if (e7rVar == null) {
            return null;
        }
        return e7rVar.a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements FoldPosture.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.android.autosize.orientation.FoldPosture.d
        public void onChange() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47f89f76", new Object[]{this});
            } else if (ig4.m().M()) {
                TBAutoSizeConfig.d(TBAutoSizeConfig.this, "checkByFoldPostureV2", null);
            } else if (TBAutoSizeConfig.b(TBAutoSizeConfig.this)) {
                TBAutoSizeConfig.d(TBAutoSizeConfig.this, "checkByFoldPosture", null);
                TBAutoSizeConfig.c(TBAutoSizeConfig.this, false);
            }
        }

        @Override // com.taobao.android.autosize.orientation.FoldPosture.d
        public /* synthetic */ void a(String str) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
