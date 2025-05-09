package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.ScreenType;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.autosize.WindowType;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f7r extends TBAutoSizeConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean x = false;
    public final Map<Context, c> y = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f19086a;
        public final /* synthetic */ Configuration b;
        public final /* synthetic */ int c;

        /* compiled from: Taobao */
        /* renamed from: tb.f7r$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class Choreographer$FrameCallbackC0920a implements Choreographer.FrameCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public Choreographer$FrameCallbackC0920a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    return;
                }
                a aVar = a.this;
                f7r.this.l.b(aVar.f19086a, aVar.b, aVar.c);
            }
        }

        public a(Activity activity, Configuration configuration, int i) {
            this.f19086a = activity;
            this.b = configuration;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Choreographer.getInstance().postFrameCallback(new Choreographer$FrameCallbackC0920a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f7r.j0(f7r.this, false);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(f7r f7rVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2144715498:
                return new Boolean(super.T((Context) objArr[0]));
            case -1570314931:
                super.l((Activity) objArr[0], (Configuration) objArr[1]);
                return null;
            case -1475218509:
                return f7rVar.L(((Number) objArr[0]).intValue());
            case -1284566000:
                return new Integer(super.H((Context) objArr[0]));
            case -857321247:
                super.onActivityCreated((Activity) objArr[0], (Bundle) objArr[1]);
                return null;
            case 383077488:
                return new Integer(super.K((Context) objArr[0], ((Boolean) objArr[1]).booleanValue()));
            case 701492035:
                return new Float(super.A((Activity) objArr[0]));
            case 918943062:
                return super.M((Activity) objArr[0]);
            case 1049280322:
                super.onActivityResumed((Activity) objArr[0]);
                return null;
            case 1095289988:
                super.onActivityDestroyed((Activity) objArr[0]);
                return null;
            case 1864786894:
                return super.D((Context) objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/autosize/TBAutoSizeCacheConfig");
        }
    }

    public static /* synthetic */ boolean j0(f7r f7rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c1a7cb", new Object[]{f7rVar, new Boolean(z)})).booleanValue();
        }
        f7rVar.x = z;
        return z;
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public float A(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29cfeb43", new Object[]{this, activity})).floatValue();
        }
        c cVar = (c) ((HashMap) this.y).get(l0(activity));
        if (cVar == null) {
            return super.A(activity);
        }
        return cVar.d;
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public ScreenType D(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("6f2663ce", new Object[]{this, context});
        }
        c cVar = (c) ((HashMap) this.y).get(l0(context));
        if (cVar == null) {
            return super.D(context);
        }
        return cVar.e;
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public int H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{this, context})).intValue();
        }
        c cVar = (c) ((HashMap) this.y).get(l0(context));
        if (cVar != null) {
            return cVar.b;
        }
        return super.H(context);
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public int K(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16d54c70", new Object[]{this, context, new Boolean(z)})).intValue();
        }
        int K = super.K(context, z);
        c cVar = (c) ((HashMap) this.y).get(l0(context));
        if (cVar != null) {
            return cVar.f19089a;
        }
        return K;
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public WindowType M(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowType) ipChange.ipc$dispatch("36c5f556", new Object[]{this, activity});
        }
        c cVar = (c) ((HashMap) this.y).get(l0(activity));
        if (cVar == null) {
            return super.M(activity);
        }
        return cVar.f;
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public boolean T(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802a3d16", new Object[]{this, context})).booleanValue();
        }
        boolean T = super.T(context);
        c cVar = (c) ((HashMap) this.y).get(l0(context));
        if (cVar != null) {
            return cVar.g;
        }
        return T;
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public void a0(Activity activity, Configuration configuration, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccba17c9", new Object[]{this, activity, configuration, new Integer(i)});
            return;
        }
        l(activity, configuration);
        k0(activity, configuration, i);
    }

    public final void k0(Activity activity, Configuration configuration, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93143058", new Object[]{this, activity, configuration, new Integer(i)});
        } else if (i == 2 || i == 3) {
            int d = this.l.d(activity, configuration);
            if (d == 0) {
                TLog.loge("TBAutoSize.ConfigInterface", "dispatchWindowChangedInner failed. activity=" + activity + " configuration=" + configuration + " dataSource=" + i + " changeReason=" + d);
                return;
            }
            this.m.post(new a(activity, configuration, d));
        } else {
            TLog.loge("TBAutoSize.ConfigInterface", "dispatchWindowChangedInner failed. activity=" + activity + " configuration=" + configuration + " dataSource=" + i);
        }
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public void l(Activity activity, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a266e54d", new Object[]{this, activity, configuration});
            return;
        }
        o0(activity, configuration);
        if (!this.x) {
            this.x = true;
            super.l(activity, configuration);
            this.m.postAtFrontOfQueue(new b());
        }
    }

    public Context l0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("fe70d030", new Object[]{this, context});
        }
        Application application = this.h;
        if (!(context instanceof Activity)) {
            return application;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            context = application;
        }
        if (((HashMap) this.y).get(activity) != null) {
            return activity;
        }
        return context;
    }

    public final boolean m0(Context context, Configuration configuration) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4fb73a2", new Object[]{this, context, configuration})).booleanValue();
        }
        if (!TBDeviceUtils.P(context) && !TBDeviceUtils.p(context)) {
            return true;
        }
        if (context instanceof Activity) {
            z = TBDeviceUtils.D((Activity) context);
        } else {
            z = TBDeviceUtils.D(y());
        }
        if (z) {
            TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutV2=true isEasyGoOpen=true context=" + context);
            return true;
        }
        ScreenType E = E(configuration.screenWidthDp);
        if (E == ScreenType.MIN || E == ScreenType.SMALL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutRealV2=true, screenType=" + E);
            return true;
        }
        if ((configuration.screenWidthDp * 1.0d) / configuration.screenHeightDp >= 0.88d) {
            z3 = false;
        }
        TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutRealV2=" + z3 + " widthHeightRate=" + ((configuration.screenWidthDp * 1.0d) / configuration.screenHeightDp) + " width=" + configuration.screenWidthDp + " height=" + configuration.screenHeightDp);
        return z3;
    }

    public final c n0(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f4c00f8a", new Object[]{this, activity});
        }
        return o0(activity, activity.getResources().getConfiguration());
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig
    public void o(Activity activity, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419870ad", new Object[]{this, activity, configuration});
        }
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        p0(n0(activity));
        super.onActivityCreated(activity, bundle);
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        ((HashMap) this.y).remove(activity);
        super.onActivityDestroyed(activity);
    }

    @Override // com.taobao.android.autosize.TBAutoSizeConfig, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        super.onActivityResumed(activity);
        c cVar = (c) ((HashMap) this.y).get(activity);
        c n0 = n0(activity);
        p0(n0);
        if (cVar != null && cVar.b != n0.b) {
            super.l(activity, activity.getResources().getConfiguration());
        }
    }

    public final void p0(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2591c457", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.e = cVar.c;
            TBAutoSizeConfig.t = cVar.f19089a;
            this.r = cVar.g;
            ((HashMap) this.y).put(this.h, cVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f19089a;
        public int b;
        public int c;
        public float d;
        public ScreenType e;
        public WindowType f;
        public boolean g;

        public c() {
            this.g = true;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TBActivityConfigs{displayWidthWithNotch=" + this.f19089a + ", screenWidth=" + this.b + ", screenWidthDp=" + this.c + ", scalingRatio=" + this.d + ", screenType=" + this.e + ", windowType=" + this.f + ", isPortraitLayout=" + this.g + '}';
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public final c o0(Activity activity, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("41124954", new Object[]{this, activity, configuration});
        }
        c cVar = new c(null);
        Pair<Integer, Integer> g = g(activity);
        int I = I(activity, true);
        if (g != null) {
            cVar.f19089a = ((Integer) g.first).intValue();
        } else {
            cVar.f19089a = I;
        }
        int i = configuration.screenWidthDp;
        cVar.c = i;
        int p = TBAutoSizeConfig.p(activity, i);
        if (p > 0) {
            cVar.b = p;
        } else {
            cVar.b = wvr.a(activity)[0];
            TLog.loge("TBAutoSize.ConfigInterface", "TBScreenUtils.getScreenSize: " + p);
        }
        cVar.d = super.A(activity);
        cVar.e = E(cVar.c);
        cVar.f = L(TBAutoSizeConfig.b0(activity, cVar.f19089a));
        cVar.g = m0(activity, configuration);
        ((HashMap) this.y).put(activity, cVar);
        if (activity == y()) {
            p0(cVar);
        }
        TLog.loge("TBAutoSize.ConfigInterface", "updateAndGetActivityConfigCaches: " + activity + " config:" + cVar);
        return cVar;
    }
}
