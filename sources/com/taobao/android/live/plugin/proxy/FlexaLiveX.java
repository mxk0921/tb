package com.taobao.android.live.plugin.proxy;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.launcherx.TaoLiveIdleTask;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b02;
import tb.bcq;
import tb.bdq;
import tb.bl9;
import tb.c21;
import tb.cl9;
import tb.edq;
import tb.giv;
import tb.gvk;
import tb.hw0;
import tb.mcs;
import tb.obk;
import tb.p5c;
import tb.rqk;
import tb.t2o;
import tb.u0;
import tb.ucq;
import tb.v2s;
import tb.v8f;
import tb.vcq;
import tb.xcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FlexaLiveX {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATYPE = "liveroom_android_plugin_AType";
    public static final String BTYPE = "liveroom_android_plugin_BType";
    public static final String TAOLIVE_CROSSPLATFORM = "tao_live_crossplatform_foundation_remote_android";
    public static final String TAOLIVE_HOMEPAGE = "LivehomeAtype";
    public static final String TAOLIVE_NEXUS = "nexus_remote_android";
    public static final String TAO_LIVE_HOME_ACTIVITY = "com.taobao.taolivehome.TaoLiveHomepageActivity";
    public static final String TAO_LIVE_VIDEO_ACTIVITY = "com.taobao.taolive.room.TaoLiveVideoActivity";
    public static final String TBLIVE_GIFT = "tblive_gift_android";
    public static final boolean j = Log.isLoggable("FlexaLiveXLocal", 2);
    public static final boolean k = cl9.a(".flexa_live_x_local");
    public static final AtomicBoolean l = new AtomicBoolean(false);
    public static final Map<String, String> m = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, p5c> f8732a;
    public final Map<String, DynamicFeatureInfo> b;
    public final Map<String, Boolean> c;
    public final Set<String> d;
    public final SharedPreferences e;
    public int f;
    public int g;
    public final ucq h;
    public final Map<Integer, String> i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                FlexaLiveX.a(FlexaLiveX.this, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar != null) {
                if (bdqVar.h() == FlexaLiveX.b(FlexaLiveX.this)) {
                    str = FlexaLiveX.ATYPE;
                } else if (bdqVar.h() == FlexaLiveX.d(FlexaLiveX.this)) {
                    str = FlexaLiveX.BTYPE;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    FlexaLiveX.w("[onStateUpdate] module: " + str + ", " + ((String) FlexaLiveX.f(FlexaLiveX.this).get(Integer.valueOf(bdqVar.i()))) + " , state: " + bdqVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8735a;

        public c(String str) {
            this.f8735a = str;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            String name = activity.getClass().getName();
            if (FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY.equals(name)) {
                bl9.g().c();
                FlexaLiveX.g(FlexaLiveX.this, activity);
                FlexaLiveX.u();
                FlexaLiveX.w("[onActivityCreated] FlexaLiveX  activityName: " + name + ", moduleName: " + this.f8735a);
            } else if (FlexaLiveX.TAO_LIVE_HOME_ACTIVITY.equals(name)) {
                bl9.g().c();
                FlexaLiveX.g(FlexaLiveX.this, activity);
                FlexaLiveX.u();
                FlexaLiveX.w("[onActivityCreated] FlexaLiveX  activityName: " + name + ", moduleName: " + this.f8735a);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            String name = activity.getClass().getName();
            if (FlexaLiveX.TAO_LIVE_VIDEO_ACTIVITY.equals(name)) {
                bl9.g().c();
                FlexaLiveX.w("[onActivityDestroyed] FlexaLiveX  activityName: " + name + ", moduleName: " + this.f8735a);
            } else if (FlexaLiveX.TAO_LIVE_HOME_ACTIVITY.equals(name)) {
                bl9.g().c();
                FlexaLiveX.w("[onActivityDestroyed] FlexaLiveX  activityName: " + name + ", moduleName: " + this.f8735a);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8736a;

        public d(String str) {
            this.f8736a = str;
        }

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
            } else if (num != null) {
                if (FlexaLiveX.ATYPE.equals(this.f8736a)) {
                    FlexaLiveX.c(FlexaLiveX.this, num.intValue());
                } else if (FlexaLiveX.BTYPE.equals(this.f8736a)) {
                    FlexaLiveX.e(FlexaLiveX.this, num.intValue());
                }
                try {
                    FlexaLiveX.w("[downloadAType] " + this.f8736a + " start success");
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements b02.b<p5c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8737a;

        public e(String str) {
            this.f8737a = str;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
                return;
            }
            FlexaLiveX.w("[downloadRemoteModuleInner] InstantiationCallBack#onFailure  moduleName: " + this.f8737a + ", message: " + str);
        }

        /* renamed from: c */
        public void b(p5c p5cVar, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dff0ef1", new Object[]{this, p5cVar, bundle});
                return;
            }
            if (c21.i() != null) {
                bcq.a().f(c21.i(), this.f8737a);
                FlexaLiveX.w("[downloadRemoteModuleInner] InstantiationCallBack#onInstantiate  apm activity is not null, try res inject, activity: " + c21.i().toString());
            } else {
                FlexaLiveX.w("[downloadRemoteModuleInner] InstantiationCallBack#onInstantiate  apm activity is null, res inject fail");
            }
            p5c p5cVar2 = (p5c) FlexaLiveX.h(FlexaLiveX.this).get(this.f8737a);
            if (p5cVar2 == null) {
                FlexaLiveX.h(FlexaLiveX.this).put(this.f8737a, p5cVar);
                p5cVar.init(FlexaLiveX.i(), bundle);
                FlexaLiveX.w("[downloadRemoteModuleInner] InstantiationCallBack#onInstantiate  moduleName: " + this.f8737a + ", featureInitial: " + p5cVar.getClass().getName());
                return;
            }
            FlexaLiveX.w("[downloadRemoteModuleInner] InstantiationCallBack#onInstantiate feature class has init, moduleName: " + this.f8737a + ", featureInitial: " + p5cVar2.getClass().getName());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8738a;

        public f(FlexaLiveX flexaLiveX, String str) {
            this.f8738a = str;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            FlexaLiveX.w("[downloadRemoteModuleInner] " + this.f8738a + " download fail");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final FlexaLiveX f8739a = new FlexaLiveX();

        static {
            t2o.a(806355108);
        }

        public static /* synthetic */ FlexaLiveX a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlexaLiveX) ipChange.ipc$dispatch("b38fa1dc", new Object[0]);
            }
            return f8739a;
        }
    }

    static {
        t2o.a(806355100);
    }

    public static boolean D(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bffadcc", new Object[]{str})).booleanValue();
        }
        if (!j || !k) {
            z = false;
        } else {
            z = true;
        }
        w("[useLocalPlugin] local force: " + z);
        if (z) {
            return true;
        }
        if (giv.c().b()) {
            w("[useLocalPlugin] isDianTaoApp, return");
            return true;
        } else if (TextUtils.isEmpty(str) || o().q(str)) {
            return false;
        } else {
            w("[useLocalPlugin] orange value = false");
            return true;
        }
    }

    public static /* synthetic */ void a(FlexaLiveX flexaLiveX, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca62890c", new Object[]{flexaLiveX, map});
        } else {
            flexaLiveX.C(map);
        }
    }

    public static /* synthetic */ int b(FlexaLiveX flexaLiveX) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d077282b", new Object[]{flexaLiveX})).intValue();
        }
        return flexaLiveX.f;
    }

    public static /* synthetic */ int c(FlexaLiveX flexaLiveX, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9116fc40", new Object[]{flexaLiveX, new Integer(i)})).intValue();
        }
        flexaLiveX.f = i;
        return i;
    }

    public static /* synthetic */ int d(FlexaLiveX flexaLiveX) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1ad7b0a", new Object[]{flexaLiveX})).intValue();
        }
        return flexaLiveX.g;
    }

    public static /* synthetic */ int e(FlexaLiveX flexaLiveX, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6ab0541", new Object[]{flexaLiveX, new Integer(i)})).intValue();
        }
        flexaLiveX.g = i;
        return i;
    }

    public static /* synthetic */ Map f(FlexaLiveX flexaLiveX) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4339ab", new Object[]{flexaLiveX});
        }
        return flexaLiveX.i;
    }

    public static /* synthetic */ void g(FlexaLiveX flexaLiveX, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fd4095", new Object[]{flexaLiveX, context});
        } else {
            flexaLiveX.s(context);
        }
    }

    public static /* synthetic */ Map h(FlexaLiveX flexaLiveX) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("efc4bc27", new Object[]{flexaLiveX});
        }
        return flexaLiveX.f8732a;
    }

    public static /* synthetic */ Application i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("ea45584e", new Object[0]);
        }
        return m();
    }

    public static boolean l() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("575019de", new Object[0])).booleanValue();
        }
        if (!j || !k) {
            z = false;
        } else {
            z = true;
        }
        w("[btype] force close plugin: " + z);
        if (z) {
            return true;
        }
        return false;
    }

    public static Application m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
        }
        try {
            if (giv.c() == null || !giv.c().b()) {
                return com.taobao.appbundle.a.Companion.a().d();
            }
            return v2s.o().f().getApplication();
        } catch (Throwable th) {
            w("[getApplication] error: " + th.getMessage());
            return com.taobao.appbundle.a.Companion.a().d();
        }
    }

    public static FlexaLiveX o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlexaLiveX) ipChange.ipc$dispatch("73068732", new Object[0]);
        }
        return g.a();
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2bc583d", new Object[0]);
        } else if (c21.i() != null) {
            v(c21.i());
        } else {
            w("[installLiveContextResource] fail, apm activity is null");
        }
    }

    public static void v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ce022b", new Object[]{context});
            return;
        }
        try {
            w("[installLiveContextResource] start, ATYPE, BTYPE, TBLIVE_GIFT, TAOLIVE_HOMEPAGE, activity: " + context.toString());
            bcq.a().f(context, ATYPE, BTYPE, TBLIVE_GIFT, TAOLIVE_HOMEPAGE);
            w("[installLiveContextResource] success");
        } catch (Throwable th) {
            w("[installLiveContextResource] fail, error: " + th.getMessage());
        }
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d528d925", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            if (!hw0.l()) {
                Log.e("FlexaLiveX", str);
            }
            TLog.loge("TBLive", "FlexaLiveX", String.valueOf(str));
        }
    }

    public static void x(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0204fa6", new Object[]{new Boolean(z), str, str2});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("remotePlugin", String.valueOf(z));
        hashMap.put("pluginName", str);
        if (-1 == TaoLiveLaunchInitializer.sLaunchInitializerTime) {
            hashMap.put("launchTime", Long.toString(-1L));
        } else {
            hashMap.put("launchTime", Long.toString(currentTimeMillis - TaoLiveLaunchInitializer.sLaunchInitializerTime));
        }
        if (-1 == TaoLiveIdleTask.sLiveInitTime) {
            hashMap.put("initTime", Long.toString(-1L));
        } else {
            hashMap.put("initTime", Long.toString(currentTimeMillis - TaoLiveIdleTask.sLiveInitTime));
        }
        if (v2s.o().E() != null) {
            v2s.o().E().track4Show("Page_TaobaoLiveWatch", "TaoLiveRoomFlexa", hashMap);
        }
    }

    public final void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d20aa1", new Object[]{this, str, str2});
            return;
        }
        w("[tryToDownloadRemoteModuleInner] module: " + str);
        if (str2 != null) {
            ((CopyOnWriteArraySet) this.d).add(str);
            B(str, str2);
            y(str, str2);
        }
    }

    public final void B(String str, String str2) {
        if (!k()) {
            w("[tryToSyncLoadRemoteModule] enableSyncLoadRemoteModule false, return");
            return;
        }
        Activity i = c21.i();
        if (i != null) {
            Map<String, Boolean> map = this.c;
            try {
                Boolean bool = (Boolean) ((HashMap) map).get(str);
                if (bool == null || !bool.booleanValue()) {
                    w("[tryToSyncLoadRemoteModule] load, module: " + str + ", startTime: " + SystemClock.uptimeMillis());
                    try {
                        bcq.a().g(com.taobao.appbundle.a.Companion.a().d(), false, str);
                        bcq.a().f(i, str);
                        Class<?> cls = Class.forName(str2);
                        cls.getDeclaredMethod("init", Application.class, Bundle.class).invoke(cls.newInstance(), null, null);
                        ((HashMap) map).put(str, Boolean.TRUE);
                        w("[tryToSyncLoadRemoteModule] load, " + str2 + "#init success ");
                    } catch (Exception e2) {
                        w("[tryToSyncLoadRemoteModule] load, " + str2 + "#init fail: " + e2.getMessage());
                    }
                    w("[tryToSyncLoadRemoteModule] load, module: " + str + ", endTime: " + SystemClock.uptimeMillis());
                    return;
                }
                w("[tryToSyncLoadRemoteModule] module already loaded, module: " + str);
                bcq.a().f(i, str);
            } catch (Exception e3) {
                w("[tryToSyncLoadRemoteModule] start load, module: " + str + ", error: " + e3.getMessage());
            }
        } else {
            w("[tryToSyncLoadRemoteModule] load, context null");
        }
    }

    public final void C(Map<String, String> map) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d75c54", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry == null || entry.getKey() == null || entry.getValue() == null || (sharedPreferences = this.e) == null)) {
                    sharedPreferences.edit().putString(entry.getKey(), entry.getValue()).apply();
                }
            }
        }
    }

    public final void j(String str, String str2) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ae7197", new Object[]{this, str, str2});
            return;
        }
        w("[tryToDownloadRemoteModule] load, moduleName: " + str + ", classInital: " + str2);
        if (ATYPE.equals(str) || BTYPE.equals(str)) {
            dVar = new d(str);
        } else {
            dVar = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            xcq n = xcq.c().k(v8f.h(m(), str2).f(new e(str)).a()).n();
            ucq ucqVar = this.h;
            if (ucqVar != null) {
                ucqVar.c(n).c(dVar).b(new f(this, str));
            }
        }
    }

    public DynamicFeatureInfo n(String str) {
        ucq ucqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicFeatureInfo) ipChange.ipc$dispatch("936fbedb", new Object[]{this, str});
        }
        DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(ATYPE);
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null || (ucqVar = this.h) == null || !ucqVar.f().contains(str)) {
            return null;
        }
        return dynamicFeatureInfo;
    }

    public Set<String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("ac263e1b", new Object[]{this});
        }
        return this.d;
    }

    public final void r() {
        try {
            Class<?> cls = Class.forName("com.taobao.android.live.plugin.btype.flexaremote.BTypeInitial");
            w("[FlexaLiveX<init>] isDianTaoApp  bTypeInitial forName success");
            w("[FlexaLiveX<init>] isDianTaoApp  bTypeInitial newInstance success");
            ((p5c) cls.newInstance()).init(m(), null);
            w("[FlexaLiveX<init>] isDianTaoApp  bTypeInitial init success");
        } catch (Exception e2) {
            w("[FlexaLiveX<init>] isDianTaoApp e: " + e2.getMessage());
        }
    }

    public final void s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568fef12", new Object[]{this, context});
            return;
        }
        o().z(TAOLIVE_HOMEPAGE, false, context);
        o().z(ATYPE, false, context);
        o().z(BTYPE, false, context);
    }

    public final void t() {
        try {
            Class<?> cls = Class.forName("com.taobao.android.live.plugin.btype.flexaremote.TBLiveGiftInitial");
            w("[FlexaLiveX<init>] isDianTaoApp  tbliveGiftInitial forName success");
            w("[FlexaLiveX<init>] isDianTaoApp  tbliveGiftInitial newInstance success");
            ((p5c) cls.newInstance()).init(m(), null);
            w("[FlexaLiveX<init>] isDianTaoApp  tbliveGiftInitial init success");
        } catch (Exception e2) {
            w("[FlexaLiveX<init>] isDianTaoApp e: " + e2.getMessage());
        }
    }

    public final void y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffff9ead", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            DynamicFeatureInfo n = n(str);
            if (n == null) {
                w("[tryToDownloadRemoteInner] try to download, module: " + str);
            } else {
                ((HashMap) this.b).put(str, n);
                w("[tryToDownloadRemoteInner] has feature, name: " + n.featureName);
            }
            j(str, str2);
            w("[tryToDownloadRemoteInner] start download, module: " + str);
        }
    }

    public void z(String str, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8a2c75", new Object[]{this, str, new Boolean(z), context});
            return;
        }
        w("[tryToDownloadRemoteModule] start");
        w("[tryToDownloadRemoteModule] download  moduleName: " + str);
        if (l.compareAndSet(false, true) && m() != null) {
            m().registerActivityLifecycleCallbacks(new c(str));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.equals(ATYPE)) {
                arrayList.add(ATYPE);
                arrayList2.add("com.taobao.android.live.plugin.atype.flexaremote.ATypeInitial");
                arrayList.add(TAOLIVE_HOMEPAGE);
                arrayList2.add("com.taobao.android.livehome.plugin.atype.flexaremote.LiveHomeInitial");
                arrayList.add(TAOLIVE_CROSSPLATFORM);
                arrayList2.add("com.taobao.taolive.crossplatformfoundation.flexaremote.TLCrossPlatformInitial");
            } else if (str.equals(BTYPE)) {
                arrayList.add(BTYPE);
                arrayList2.add("com.taobao.android.live.plugin.btype.flexaremote.BTypeInitial");
                arrayList.add(TBLIVE_GIFT);
                arrayList2.add("com.taobao.android.live.plugin.btype.flexaremote.TBLiveGiftInitial");
            }
            if (arrayList2.size() != 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    A(str2, (String) ((HashMap) m).get(str2));
                }
            }
        }
    }

    public FlexaLiveX() {
        Map<String, String> configs;
        this.f8732a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new CopyOnWriteArraySet();
        this.f = -2333;
        this.g = -23333;
        this.i = new HashMap<Integer, String>() { // from class: com.taobao.android.live.plugin.proxy.FlexaLiveX.1
            {
                put(0, "UNKNOWN");
                put(1, "PENDING");
                put(2, "DOWNLOADING");
                put(3, "DOWNLOADED");
                put(4, "INSTALLING");
                put(5, "INSTALLED");
                put(6, "FAILED");
                put(7, "CANCELING");
                put(8, "CANCELED");
                put(9, "SUSPEND");
                put(10, "VERIFYING");
                put(11, "LOADING");
                put(12, "UNINSTALL");
                put(13, mcs.EVENT_DOWNLOAD_FINISH);
            }
        };
        try {
            Map<String, String> map = m;
            ((HashMap) map).put(ATYPE, "com.taobao.android.live.plugin.atype.flexaremote.ATypeInitial");
            ((HashMap) map).put(BTYPE, "com.taobao.android.live.plugin.btype.flexaremote.BTypeInitial");
            ((HashMap) map).put(TBLIVE_GIFT, "com.taobao.android.live.plugin.btype.flexaremote.TBLiveGiftInitial");
            ((HashMap) map).put(TAOLIVE_HOMEPAGE, "com.taobao.android.livehome.plugin.atype.flexaremote.LiveHomeInitial");
            ((HashMap) map).put(TAOLIVE_CROSSPLATFORM, "com.taobao.taolive.crossplatformfoundation.flexaremote.TLCrossPlatformInitial");
            ((HashMap) map).put(TAOLIVE_NEXUS, "com.taobao.kmp.nexus.flexaremote.flexa.TLNexusInitial");
            this.e = m().getSharedPreferences("tblive_remote_plugin", 0);
            configs = OrangeConfig.getInstance().getConfigs("tblive_remote_plugin");
        } catch (Throwable th) {
            w("[FlexaLiveX<init>] error: " + th.getMessage());
            th.printStackTrace();
        }
        try {
            if (configs != null && !configs.isEmpty()) {
                C(configs);
                ucq a2 = vcq.a(m());
                this.h = a2;
                a2.g(new b());
                if (giv.c() != null && giv.c().b()) {
                    w("[FlexaLiveX<init>] isDianTaoApp");
                    r();
                    t();
                    return;
                }
                return;
            }
            if (giv.c() != null) {
                return;
            }
            return;
        } catch (Throwable th2) {
            w("[FlexaLiveX<init> for dt] error: " + th2.getMessage());
            th2.printStackTrace();
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{"tblive_remote_plugin"}, new a(), true);
        ucq a22 = vcq.a(m());
        this.h = a22;
        a22.g(new b());
    }

    public boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6081b982", new Object[]{this, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences == null) {
            return true;
        }
        String string = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            w("[getOrangeValue] not set orange value, default true, key = " + str);
            return true;
        }
        w("[getOrangeValue] key = " + str + ", value = " + string);
        return "true".equals(string);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4caeeac1", new Object[]{this})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = i > 29;
        w("[enableSyncLoadRemoteModule] SDK_INT: " + i);
        if (!z) {
            w("[enableSyncLoadRemoteModule] greaterThanQ false, return");
            return false;
        } else if (Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_remote_plugin", "enableSyncLoadRemoteModule", "true")) && u0.d()) {
            return true;
        } else {
            w("[enableSyncLoadRemoteModule] enable false, return");
            return false;
        }
    }
}
