package com.taobao.android.tbabilitykit.pop;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.Application;
import android.app.LocalActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.taobao.R;
import com.uc.webview.export.extension.UCCore;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import tb.a07;
import tb.a9;
import tb.abl;
import tb.acq;
import tb.ckf;
import tb.d05;
import tb.e9;
import tb.evo;
import tb.f8v;
import tb.gab;
import tb.gxv;
import tb.h9;
import tb.hab;
import tb.iih;
import tb.keb;
import tb.m7r;
import tb.pg1;
import tb.qlq;
import tb.t2o;
import tb.tam;
import tb.tfc;
import tb.wsq;
import tb.xhm;
import tb.xhv;
import tb.za0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class StdPopActivityGroup extends ActivityGroup implements tfc, keb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ORIENTATION = "Mega_Orientation";

    /* renamed from: a  reason: collision with root package name */
    public qlq f9536a;
    public evo b;
    public Application.ActivityLifecycleCallbacks c;
    public boolean d;
    public a9 e;
    public boolean f;
    public boolean g;
    public ContentObserver h;
    public boolean i;
    public boolean j;
    public Application.ActivityLifecycleCallbacks k;
    public final int l = 1;
    public final int m = 2;
    public final int n = 3;
    public int o = 0;
    public static final a Companion = new a(null);
    public static final LinkedList<StdPopActivityGroup> p = new LinkedList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(786432123);
        }

        public a() {
        }

        public final void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b5c5ff1", new Object[]{this, str, str2});
            } else {
                AppMonitor.Counter.commit("AbilityKit", str, str2, 1.0d);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean b(ActivityInfo activityInfo, Intent intent, Intent intent2, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f0e2053", new Object[]{this, activityInfo, intent, intent2, context})).booleanValue();
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            if (activityInfo != null && gxv.l(context)) {
                int i = activityInfo.launchMode;
                if (i == 1) {
                    iih iihVar = iih.INSTANCE;
                    iihVar.a("stdPopTag", "deal single top " + activityInfo.name);
                    if (!StdPopActivityGroup.e().isEmpty()) {
                        StdPopActivityGroup stdPopActivityGroup = (StdPopActivityGroup) StdPopActivityGroup.e().getFirst();
                        ckf.f(stdPopActivityGroup, AdvanceSetting.NETWORK_TYPE);
                        Activity currentActivity = stdPopActivityGroup.getCurrentActivity();
                        StdPopActivityGroup stdPopActivityGroup2 = null;
                        Activity parent = currentActivity != null ? currentActivity.getParent() : null;
                        if (parent instanceof StdPopActivityGroup) {
                            stdPopActivityGroup2 = parent;
                        }
                        StdPopActivityGroup stdPopActivityGroup3 = stdPopActivityGroup2;
                        boolean z = stdPopActivityGroup3 != null && stdPopActivityGroup3.m();
                        Activity currentActivity2 = stdPopActivityGroup.getCurrentActivity();
                        ckf.f(currentActivity2, "it.currentActivity");
                        if (!currentActivity2.isFinishing() && ckf.b(stdPopActivityGroup.getCurrentActivity().getClass().getName(), activityInfo.name) && z) {
                            iihVar.a("stdPopTag", "found single top " + activityInfo.name);
                            if (intent2 != null) {
                                Activity currentActivity3 = stdPopActivityGroup.getCurrentActivity();
                                ckf.f(currentActivity3, "it.currentActivity");
                                currentActivity3.setIntent(intent2);
                            }
                            intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
                            StdPopActivityGroup.Companion.a("StdPopSingleTop", activityInfo.name);
                            return true;
                        }
                    }
                } else if (i == 2) {
                    iih iihVar2 = iih.INSTANCE;
                    iihVar2.a("stdPopTag", "deal single task act " + activityInfo.name);
                    Iterator it = StdPopActivityGroup.e().iterator();
                    ckf.f(it, "sActivityStack.iterator()");
                    while (it.hasNext()) {
                        StdPopActivityGroup stdPopActivityGroup4 = (StdPopActivityGroup) it.next();
                        if (!stdPopActivityGroup4.isFinishing() && ckf.b(stdPopActivityGroup4.getCurrentActivity().getClass().getName(), activityInfo.name)) {
                            a("StdPopSingleTask", activityInfo.name);
                            iih.INSTANCE.a("stdPopTag", " found act = ".concat(StdPopActivityGroup.class.getName()));
                            Intent intent3 = new Intent();
                            intent3.putExtra("fakeNewIntent", true);
                            if (!tam.b().f(stdPopActivityGroup4, intent3)) {
                                return false;
                            }
                            intent.addFlags(UCCore.VERIFY_POLICY_PAK_QUICK);
                            if (intent2 != null) {
                                Activity currentActivity4 = stdPopActivityGroup4.getCurrentActivity();
                                ckf.f(currentActivity4, "activity.currentActivity");
                                currentActivity4.setIntent(intent2);
                            }
                            return true;
                        }
                    }
                    ckf.f(intent.addFlags(268435456), "intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)");
                } else if (i == 3) {
                    iih iihVar3 = iih.INSTANCE;
                    iihVar3.a("stdPopTag", "deal single instance act " + activityInfo.name);
                    intent.addFlags(268435456);
                    intent.addFlags(134217728);
                    a("StdPopSingleInstance", activityInfo.name);
                } else {
                    iih iihVar4 = iih.INSTANCE;
                    iihVar4.a("stdPopTag", "deal standard act " + activityInfo.name);
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            hab<?, ?> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            qlq h = StdPopActivityGroup.this.h();
            if (!(h == null || (b = h.b()) == null)) {
                b.a(null, false);
            }
            StdPopActivityGroup.g(StdPopActivityGroup.this, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Handler b;
        public final /* synthetic */ int c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    StdPopActivityGroup.this.setRequestedOrientation(10);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Handler handler, int i, Handler handler2) {
            super(handler2);
            this.b = handler;
            this.c = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1222901218) {
                super.onChange(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/pop/StdPopActivityGroup$initSystemOrientation$1");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                return;
            }
            super.onChange(z);
            boolean k = StdPopActivityGroup.this.k();
            if (k) {
                this.b.postDelayed(new a(), 10L);
            } else {
                StdPopActivityGroup.this.setRequestedOrientation(this.c);
            }
            a aVar = StdPopActivityGroup.Companion;
            aVar.a("systemRotationChanged", "{\n    \"selfChange\":" + z + ",\n    \"autoRotate\":" + k + " \n}");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bundle b;

        public d(Bundle bundle) {
            this.b = bundle;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Application.ActivityLifecycleCallbacks f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "onActivityCreated act " + activity.getClass().getName() + " is child " + activity.isChild());
            if (gxv.l(StdPopActivityGroup.this) && !activity.isChild() && (f = StdPopActivityGroup.f(StdPopActivityGroup.this)) != null) {
                try {
                    f.onActivityCreated(activity, bundle);
                } catch (Throwable th) {
                    iih iihVar2 = iih.INSTANCE;
                    iihVar2.a("stdPopTag", "splitContainer onActivityDestroyed error = " + th);
                }
            }
            if (ckf.b(activity.getParent(), StdPopActivityGroup.this)) {
                d05 d05Var = new d05(activity.getBaseContext());
                d05Var.a(StdPopActivityGroup.this.getBaseContext());
                xhv xhvVar = xhv.INSTANCE;
                xhm.a(activity, d05Var);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Application.ActivityLifecycleCallbacks f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            try {
                if (gxv.l(StdPopActivityGroup.this) && !activity.isChild() && (f = StdPopActivityGroup.f(StdPopActivityGroup.this)) != null) {
                    f.onActivityCreated(activity, this.b);
                }
            } catch (Throwable th) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("stdPopTag", "splitContainer onActivityDestroyed error = " + th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1cb46a1", new Object[]{this, activity, bundle});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }
    }

    static {
        t2o.a(786432122);
        t2o.a(336592969);
        t2o.a(336592978);
    }

    public StdPopActivityGroup() {
        super(true);
    }

    public static final /* synthetic */ LinkedList e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("fc895252", new Object[0]);
        }
        return p;
    }

    public static final /* synthetic */ Application.ActivityLifecycleCallbacks f(StdPopActivityGroup stdPopActivityGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("3ba9bac3", new Object[]{stdPopActivityGroup});
        }
        return stdPopActivityGroup.c;
    }

    public static final /* synthetic */ void g(StdPopActivityGroup stdPopActivityGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80a19", new Object[]{stdPopActivityGroup, new Boolean(z)});
        } else {
            stdPopActivityGroup.j = z;
        }
    }

    public static /* synthetic */ Object ipc$super(StdPopActivityGroup stdPopActivityGroup, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -92595176:
                super.finishFromChild((Activity) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/pop/StdPopActivityGroup");
        }
    }

    @Override // tb.tfc
    public void a(JSONObject jSONObject) {
        IAKPopRender p2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54265718", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        a9 a9Var = this.e;
        AKBasePopPresenter aKBasePopPresenter = null;
        jSONObject2.put((JSONObject) "popId", a9Var != null ? a9Var.d : null);
        jSONObject2.put((JSONObject) "from", "innerPopForward");
        if (jSONObject != null) {
            jSONObject2.put((JSONObject) "data", (String) jSONObject);
        }
        qlq qlqVar = this.f9536a;
        hab<?, ?> b2 = qlqVar != null ? qlqVar.b() : null;
        if (b2 instanceof AKBasePopPresenter) {
            aKBasePopPresenter = b2;
        }
        AKBasePopPresenter aKBasePopPresenter2 = aKBasePopPresenter;
        if (aKBasePopPresenter2 != null && (p2 = aKBasePopPresenter2.p()) != null) {
            p2.n(IAKPopRender.LifecycleType.CHANGE_POSITION, jSONObject2);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        qlq a2 = za0.a();
        a9 a9Var = null;
        if (a2 != null) {
            h9 c2 = a2.c();
            if (c2 instanceof a9) {
                a9Var = c2;
            }
            this.e = a9Var;
            xhv xhvVar = xhv.INSTANCE;
        } else {
            a2 = null;
        }
        this.f9536a = a2;
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // tb.tfc
    public void c(String str, JSONObject jSONObject) {
        IAKPopRender p2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1314c2", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "state");
        JSONObject jSONObject2 = new JSONObject();
        a9 a9Var = this.e;
        AKBasePopPresenter aKBasePopPresenter = null;
        jSONObject2.put((JSONObject) "popId", a9Var != null ? a9Var.d : null);
        jSONObject2.put((JSONObject) "from", "innerPopForward");
        if (jSONObject != null) {
            jSONObject2.put((JSONObject) "data", (String) jSONObject);
        }
        qlq qlqVar = this.f9536a;
        hab<?, ?> b2 = qlqVar != null ? qlqVar.b() : null;
        if (b2 instanceof AKBasePopPresenter) {
            aKBasePopPresenter = b2;
        }
        AKBasePopPresenter aKBasePopPresenter2 = aKBasePopPresenter;
        if (aKBasePopPresenter2 != null && (p2 = aKBasePopPresenter2.p()) != null) {
            p2.n(str, jSONObject2);
        }
    }

    @Override // tb.tfc
    public void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be838a35", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "state");
        AKBasePopPresenter aKBasePopPresenter = null;
        if (jSONObject != null) {
            a9 a9Var = this.e;
            jSONObject.put((JSONObject) "popId", a9Var != null ? a9Var.d : null);
            jSONObject.put((JSONObject) "from", "innerPopForward");
        }
        qlq qlqVar = this.f9536a;
        hab<?, ?> b2 = qlqVar != null ? qlqVar.b() : null;
        if (b2 instanceof AKBasePopPresenter) {
            aKBasePopPresenter = b2;
        }
        AKBasePopPresenter aKBasePopPresenter2 = aKBasePopPresenter;
        if (aKBasePopPresenter2 != null) {
            aKBasePopPresenter2.s(str, jSONObject);
        }
    }

    public final qlq h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qlq) ipChange.ipc$dispatch("3eddd4df", new Object[]{this});
        }
        return this.f9536a;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59da84be", new Object[]{this})).booleanValue();
        }
        if (Settings.System.getInt(getContentResolver(), "accelerometer_rotation", 0) == 1) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a66e5fb", new Object[]{this})).booleanValue();
        }
        if (this.o <= this.l) {
            return true;
        }
        return false;
    }

    public final void n() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df2f012", new Object[]{this});
        } else if (abl.z(this) && (activityLifecycleCallbacks = this.c) != null) {
            Object b2 = xhm.b(Application.class, "mActivityLifecycleCallbacks", getApplication());
            if (!(b2 instanceof ArrayList)) {
                b2 = null;
            }
            if (((ArrayList) b2) != null) {
                synchronized (activityLifecycleCallbacks) {
                    try {
                        iih.INSTANCE.a("stdPopTag", "add SplitContainer " + arrayList.add(activityLifecycleCallbacks));
                        this.c = null;
                        xhv xhvVar = xhv.INSTANCE;
                    }
                }
            }
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75ff861", new Object[]{this});
            return;
        }
        try {
            LinkedList<StdPopActivityGroup> linkedList = p;
            if (linkedList.contains(this)) {
                linkedList.remove(this);
            }
        } catch (Exception e) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "sActivityStack remove err = " + e);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        try {
            Activity r = r();
            if (r != null) {
                r.onBackPressed();
            }
            iih.INSTANCE.a("stdPopTag", "onBackPressed");
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "backPressErr = " + th);
            Companion.a("StdGroupBackPressErr", th.toString());
        }
        super.onBackPressed();
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.o = this.l;
        n();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        this.o = 0;
        if (this.d && !this.g) {
            e9 q = q();
            if (q != null) {
                str = q.D();
            } else {
                str = null;
            }
            if (ckf.b(h9.DEFAULT_LANDSCAPE_DRAWER, str)) {
                gxv.n(this, true);
            }
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.o = 0;
        e9 q = q();
        if (q != null && q.w() && abl.p() && TBDeviceUtils.P(this)) {
            i();
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.o = this.m;
    }

    public final e9 q() {
        h9 c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e9) ipChange.ipc$dispatch("c39a6e65", new Object[]{this});
        }
        qlq qlqVar = this.f9536a;
        if (qlqVar == null || (c2 = qlqVar.c()) == null) {
            return null;
        }
        return c2.f20479a;
    }

    public final Activity r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ba892668", new Object[]{this});
        }
        LocalActivityManager localActivityManager = getLocalActivityManager();
        if (localActivityManager != null) {
            return localActivityManager.getCurrentActivity();
        }
        return null;
    }

    public final Window s() {
        Activity currentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("c07d61f8", new Object[]{this});
        }
        LocalActivityManager localActivityManager = getLocalActivityManager();
        if (localActivityManager == null || (currentActivity = localActivityManager.getCurrentActivity()) == null) {
            return null;
        }
        return currentActivity.getWindow();
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT != 26) {
            super.setRequestedOrientation(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        try {
            Activity r = r();
            if (r != null) {
                if (r.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "handle dispatchKeyEvent error = " + th);
            AppMonitor.Counter.commit("AbilityKit", "dispatchKeyEvent2ChildError", th.toString(), 1.0d);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561188f8", new Object[]{this});
            return;
        }
        int intExtra = getIntent().getIntExtra(KEY_ORIENTATION, -1);
        iih iihVar = iih.INSTANCE;
        iihVar.a("stdPopTag", "orientation = " + intExtra);
        if (intExtra != -1 && intExtra != 4) {
            setRequestedOrientation(k() ? 10 : 3);
            Handler handler = new Handler(Looper.getMainLooper());
            c cVar = new c(handler, intExtra, handler);
            getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, cVar);
            xhv xhvVar = xhv.INSTANCE;
            this.h = cVar;
        }
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public void onDestroy() {
        qlq qlqVar;
        hab<?, ?> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.o = this.n;
        o();
        if (!(this.j || (qlqVar = this.f9536a) == null || (b2 = qlqVar.b()) == null)) {
            b2.a(null, false);
        }
        evo evoVar = this.b;
        if (evoVar != null) {
            TBAutoSizeConfig.x().h0(evoVar);
            this.b = null;
        }
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.k;
        if (activityLifecycleCallbacks != null) {
            getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        ContentObserver contentObserver = this.h;
        if (contentObserver != null) {
            getContentResolver().unregisterContentObserver(contentObserver);
        }
        try {
            super.onDestroy();
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "stdPopGroup destroy error = " + th);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        e9 q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!abl.g() && (q = q()) != null && !q.I()) {
            try {
                Activity r = r();
                if (r != null) {
                    if (r.onKeyDown(i, keyEvent)) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                iih iihVar = iih.INSTANCE;
                iihVar.a("stdPopTag", "handle key down error = " + th);
                AppMonitor.Counter.commit("AbilityKit", "disPatchKeyDown2ChildError", th.toString(), 1.0d);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // tb.keb
    public void b(View view, View view2, gab gabVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e994501d", new Object[]{this, view, view2, gabVar, new Integer(i)});
            return;
        }
        ckf.g(view, f8v.KEY_TARGET_VIEW);
        overridePendingTransition(R.anim.mega_anim_bottom_in, 0);
        e9 q = q();
        String y = q != null ? q.y() : null;
        if (y == null || y.length() == 0) {
            y = "#80000000";
        }
        try {
            Window window = getWindow();
            if (window != null) {
                window.setDimAmount(Color.alpha(Color.parseColor(y)) / 256.0f);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.addFlags(2);
            }
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "setDimAmount error = " + th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (tb.ckf.b(tb.h9.PAD_FULL_SCREEN_DRAWER, r2 != null ? r2.D() : null) != false) goto L_0x006a;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void finish() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "44908f9a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            tb.iih r2 = tb.iih.INSTANCE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "StdPopGroup finish isFinishFromChild = "
            r3.<init>(r4)
            boolean r4 = r5.i
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "stdPopTag"
            r2.a(r4, r3)
            boolean r2 = r5.i
            if (r2 != 0) goto L_0x0040
            android.app.Activity r2 = r5.r()
            if (r2 == 0) goto L_0x0040
            r5.i = r1
            android.app.Activity r0 = r5.r()
            if (r0 == 0) goto L_0x0088
            r0.finish()
            goto L_0x0088
        L_0x0040:
            super.finish()
            r5.o()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            r4 = 0
            if (r2 < r3) goto L_0x0069
            boolean r2 = tb.abl.N()
            if (r2 == 0) goto L_0x0069
            tb.e9 r2 = r5.q()
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = r2.D()
            goto L_0x005f
        L_0x005e:
            r2 = r4
        L_0x005f:
            java.lang.String r3 = "padFullScreen"
            boolean r2 = tb.ckf.b(r3, r2)
            if (r2 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            int r2 = com.taobao.taobao.R.anim.mega_slide_in_left
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            if (r1 == 0) goto L_0x0074
            int r0 = com.taobao.taobao.R.anim.mega_slide_out_right
        L_0x0074:
            r5.overridePendingTransition(r2, r0)
            boolean r0 = tb.abl.F()
            if (r0 == 0) goto L_0x0088
            com.taobao.android.tbabilitykit.pop.StdPopActivityGroup$b r0 = new com.taobao.android.tbabilitykit.pop.StdPopActivityGroup$b
            r0.<init>()
            r1 = 0
            r3 = 2
            com.alibaba.ability.MegaUtils.A(r0, r1, r3, r4)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.finish():void");
    }

    @Override // android.app.Activity
    public void finishFromChild(Activity activity) {
        Bundle extras;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7b1c18", new Object[]{this, activity});
            return;
        }
        this.i = true;
        if (activity != null) {
            try {
                Object b2 = xhm.b(Activity.class, "mResultData", activity);
                String str = null;
                if (!(b2 instanceof Intent)) {
                    b2 = null;
                }
                Intent intent = (Intent) b2;
                Object b3 = xhm.b(Activity.class, "mResultCode", activity);
                if (!(b3 instanceof Integer)) {
                    b3 = null;
                }
                Integer num = (Integer) b3;
                iih iihVar = iih.INSTANCE;
                StringBuilder sb = new StringBuilder("finishFromChild retCode = ");
                sb.append(num);
                sb.append(" data = ");
                if (!(intent == null || (extras = intent.getExtras()) == null)) {
                    str = extras.toString();
                }
                sb.append(str);
                iihVar.a("stdPopTag", sb.toString());
                if (num != null) {
                    i = num.intValue();
                }
                setResult(i, intent);
            } catch (Throwable th) {
                iih.INSTANCE.a("stdPopTag", "finishFromChild setRet error = " + th);
            }
        }
        super.finishFromChild(activity);
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0ce3fc9", new Object[]{this})).booleanValue();
        }
        ArrayList arrayList = (ArrayList) gxv.e();
        if (arrayList.size() == 1 && ckf.b((Activity) arrayList.get(0), this)) {
            iih.INSTANCE.a("stdPopTag", "start with root");
            return true;
        } else if (arrayList.size() != 2 || ((!ckf.b((Activity) arrayList.get(0), this) || !ckf.b((Activity) arrayList.get(1), r())) && (!ckf.b((Activity) arrayList.get(0), r()) || !ckf.b((Activity) arrayList.get(1), this)))) {
            return false;
        } else {
            iih iihVar = iih.INSTANCE;
            StringBuilder sb = new StringBuilder("start with root subActivity = ");
            Activity r = r();
            sb.append(r != null ? r.getClass().getName() : null);
            iihVar.a("stdPopTag", sb.toString());
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    @Override // android.app.ActivityGroup, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Activity r;
        Bundle extras;
        Bundle extras2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        iih iihVar = iih.INSTANCE;
        StringBuilder sb = new StringBuilder("onNewIntent intent = ");
        sb.append((intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.toString());
        iihVar.a("stdPopTag", sb.toString());
        if ((intent == null || !intent.getBooleanExtra("fakeNewIntent", false)) && (r = r()) != null) {
            if (!(intent == null || (extras = intent.getExtras()) == null)) {
                r.getIntent().putExtras(extras);
            }
            j(r, "onNewIntent", r.getIntent());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (tb.xhm.c(r10, r4 != null ? r4.getClass().getName() : null) != false) goto L_0x0040;
     */
    @Override // android.app.ActivityGroup, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.pop.StdPopActivityGroup.onResume():void");
    }

    public final void p() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc63332", new Object[]{this});
        } else if (abl.z(this)) {
            try {
                Object b2 = xhm.b(Application.class, "mActivityLifecycleCallbacks", getApplication());
                if (!(b2 instanceof ArrayList)) {
                    b2 = null;
                }
                ArrayList arrayList = (ArrayList) b2;
                Iterator it = arrayList != null ? arrayList.iterator() : null;
                while (it != null && it.hasNext()) {
                    Object next = it.next();
                    ckf.f(next, "iterator.next()");
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) next;
                    if (wsq.O(activityLifecycleCallbacks2.getClass().getName(), "androidx.window.extensions.embedding.SplitController$LifecycleCallbacks", false, 2, null)) {
                        iih.INSTANCE.a("stdPopTag", "found SplitContainer " + activityLifecycleCallbacks2);
                        this.c = activityLifecycleCallbacks2;
                    }
                }
                if (this.c != null && arrayList != null) {
                    synchronized (arrayList) {
                        iih.INSTANCE.a("stdPopTag", "remove SplitContainer " + arrayList.remove(activityLifecycleCallbacks));
                        xhv xhvVar = xhv.INSTANCE;
                    }
                }
            } catch (Throwable th) {
                iih.INSTANCE.a("stdPopTag", "tempLifeCycleCb throwble = " + th);
            }
        }
    }

    public final void t(e9 e9Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Activity r;
        Resources resources2;
        DisplayMetrics displayMetrics2;
        Window s;
        String str;
        WindowManager.LayoutParams attributes;
        String queryParameter;
        Intent intent;
        Uri data;
        Intent intent2;
        Uri data2;
        Intent intent3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec11998", new Object[]{this, e9Var});
        } else if (this.f9536a != null) {
            a9 a9Var = this.e;
            WindowManager.LayoutParams layoutParams = null;
            if (!(a9Var == null || !a9Var.j() || (s = s()) == null)) {
                Window window = getWindow();
                ckf.f(window, pg1.ATOM_EXT_window);
                window.setStatusBarColor(s.getStatusBarColor());
                WindowManager.LayoutParams attributes2 = s.getAttributes();
                if (attributes2 != null) {
                    int i = attributes2.flags;
                    Window window2 = getWindow();
                    ckf.f(window2, pg1.ATOM_EXT_window);
                    window2.getAttributes().flags = i;
                    getWindow().clearFlags(2);
                    getWindow().clearFlags(4);
                }
                try {
                    Activity r2 = r();
                    queryParameter = Uri.parse((r2 == null || (intent3 = r2.getIntent()) == null) ? null : intent3.getDataString()).getQueryParameter(m7r.WEEX_REFERER_ORIGIN);
                } catch (Throwable unused) {
                    str = null;
                }
                if (!(queryParameter == null || queryParameter.length() == 0)) {
                    Uri parse = Uri.parse(queryParameter);
                    ckf.f(parse, "data");
                    str = ckf.p(parse.getHost(), parse.getPath());
                    if (abl.H(str) && (attributes = s.getAttributes()) != null) {
                        getWindow().setSoftInputMode(attributes.softInputMode);
                    }
                }
                Activity r3 = r();
                String host = (r3 == null || (intent2 = r3.getIntent()) == null || (data2 = intent2.getData()) == null) ? null : data2.getHost();
                Activity r4 = r();
                str = ckf.p(host, (r4 == null || (intent = r4.getIntent()) == null || (data = intent.getData()) == null) ? null : data.getPath());
                if (abl.H(str)) {
                    getWindow().setSoftInputMode(attributes.softInputMode);
                }
            }
            if (ckf.b(h9.DEFAULT_LANDSCAPE_DRAWER, e9Var != null ? e9Var.D() : null) && e9Var.E()) {
                int H = TBAutoSizeConfig.x().H(this);
                getWindow().addFlags(32);
                Window window3 = getWindow();
                ckf.f(window3, pg1.ATOM_EXT_window);
                WindowManager.LayoutParams attributes3 = window3.getAttributes();
                attributes3.height = -1;
                attributes3.width = H / 2;
                if (!(!this.f || (r = r()) == null || (resources2 = r.getResources()) == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null)) {
                    displayMetrics2.widthPixels = attributes3.width;
                }
                Window window4 = getWindow();
                ckf.f(window4, pg1.ATOM_EXT_window);
                window4.setAttributes(attributes3);
                getWindow().setGravity(8388629);
            }
            if (ckf.b(h9.DEFAULT_LANDSCAPE_DRAWER, e9Var != null ? e9Var.D() : null)) {
                int H2 = TBAutoSizeConfig.x().H(this);
                Window s2 = s();
                if (s2 != null) {
                    layoutParams = s2.getAttributes();
                }
                if (layoutParams != null) {
                    layoutParams.width = H2 / 2;
                }
                if (this.f && layoutParams != null) {
                    int i2 = layoutParams.width;
                    Activity r5 = r();
                    if (!(r5 == null || (resources = r5.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                        displayMetrics.widthPixels = i2;
                    }
                }
                if (layoutParams != null) {
                    layoutParams.height = TBAutoSizeConfig.x().B(this);
                }
                Window s3 = s();
                if (s3 != null) {
                    s3.setAttributes(layoutParams);
                }
            }
        }
    }

    public final Object j(Activity activity, String str, Intent intent) {
        if (activity == null || str == null) {
            return null;
        }
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod(str, Intent.class);
            ckf.f(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(activity, intent);
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "invokeOnNewIntent err = " + th);
            return null;
        }
    }
}
