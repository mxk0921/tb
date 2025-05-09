package com.taobao.linkmanager;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.aaa;
import tb.ah0;
import tb.ci7;
import tb.fxp;
import tb.k81;
import tb.qqg;
import tb.t2o;
import tb.uqg;
import tb.vp9;
import tb.zsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AfcLifeCycleCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LINK_COLD_START = "__link_cold_start__";
    public static boolean isLauncherStart = true;
    public static String jumpUrl;
    public static String landingUrl;
    private final Application.ActivityLifecycleCallbacks afcLifecycleCallbacks;
    private WeakReference<Activity> currentActivityRef;
    private boolean isNatureCold;
    private String mCurrentActivityCode;
    private String mCurrentActivityName;
    private String mCurrentActivityUrl;
    private String mPreActivityName;
    private String mPreActivityUrl;
    public List<Intent> nameList;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f10900a;

        public a(Activity activity) {
            this.f10900a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ah0.f();
            } catch (Exception e) {
                vp9.a("linkx", "AfcLifeCycleCenter === onActivityCreated：sendLocalData异常了：" + e.getMessage());
                uqg.a("onActivityCreated", "当前页面：" + this.f10900a.getClass().getName() + "  上报缓存日志异常：" + e);
                StringBuilder sb = new StringBuilder();
                sb.append(e);
                sb.append("");
                uqg.b("afc_exception_localData", sb.toString(), this.f10900a.getClass().getName(), null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                AfcLifeCycleCenter.access$200(AfcLifeCycleCenter.this, activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                vp9.a("linkx", "AfcLifeCycleCenter: -->onActivityDestroyed -->".concat(activity.getClass().getSimpleName()));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                vp9.a("linkx", "AfcLifeCycleCenter: -->onActivityPaused -->".concat(activity.getClass().getSimpleName()));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            ah0.h("com.taobao.tao.welcome.Welcome".equals(activity.getClass().getName()));
            AfcLifeCycleCenter.access$302(AfcLifeCycleCenter.this, new WeakReference(activity));
            String e = AfcUtils.e(activity);
            if (TextUtils.isEmpty(e) || TextUtils.isEmpty(AfcLifeCycleCenter.access$400(AfcLifeCycleCenter.this)) || !AfcLifeCycleCenter.access$400(AfcLifeCycleCenter.this).equals(e)) {
                AfcLifeCycleCenter.access$402(AfcLifeCycleCenter.this, e);
                AfcLifeCycleCenter afcLifeCycleCenter = AfcLifeCycleCenter.this;
                AfcLifeCycleCenter.access$502(afcLifeCycleCenter, AfcLifeCycleCenter.access$600(afcLifeCycleCenter));
                AfcLifeCycleCenter afcLifeCycleCenter2 = AfcLifeCycleCenter.this;
                AfcLifeCycleCenter.access$702(afcLifeCycleCenter2, AfcLifeCycleCenter.access$800(afcLifeCycleCenter2));
                AfcLifeCycleCenter.access$602(AfcLifeCycleCenter.this, activity.getClass().getName());
                AfcLifeCycleCenter afcLifeCycleCenter3 = AfcLifeCycleCenter.this;
                if (activity.getIntent() != null) {
                    str = activity.getIntent().getDataString();
                } else {
                    str = "";
                }
                AfcLifeCycleCenter.access$802(afcLifeCycleCenter3, str);
                vp9.a("linkx", "AfcLifeCycleCenter: -->onActivityResumed -->" + e);
                return;
            }
            vp9.a("linkx", "AfcLifeCycleCenter: -->onActivityResumed === same page return === " + e);
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
                return;
            }
            AfcLifeCycleCenter.access$302(AfcLifeCycleCenter.this, new WeakReference(activity));
            vp9.a("linkx", "AfcLifeCycleCenter: -->onActivityStarted -->".concat(activity.getClass().getSimpleName()));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                vp9.a("linkx", "AfcLifeCycleCenter: -->onActivityStopped -->".concat(activity.getClass().getSimpleName()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AfcLifeCycleCenter f10902a = new AfcLifeCycleCenter(null);

        static {
            t2o.a(744488964);
        }

        public static /* synthetic */ AfcLifeCycleCenter a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AfcLifeCycleCenter) ipChange.ipc$dispatch("24108db8", new Object[0]);
            }
            return f10902a;
        }
    }

    static {
        t2o.a(744488961);
    }

    public /* synthetic */ AfcLifeCycleCenter(a aVar) {
        this();
    }

    public static /* synthetic */ void access$200(AfcLifeCycleCenter afcLifeCycleCenter, Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f9f80a", new Object[]{afcLifeCycleCenter, activity, bundle});
        } else {
            afcLifeCycleCenter.activityCreateAction(activity, bundle);
        }
    }

    public static /* synthetic */ WeakReference access$302(AfcLifeCycleCenter afcLifeCycleCenter, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("1743d2f7", new Object[]{afcLifeCycleCenter, weakReference});
        }
        afcLifeCycleCenter.currentActivityRef = weakReference;
        return weakReference;
    }

    public static /* synthetic */ String access$400(AfcLifeCycleCenter afcLifeCycleCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("993f83ea", new Object[]{afcLifeCycleCenter});
        }
        return afcLifeCycleCenter.mCurrentActivityCode;
    }

    public static /* synthetic */ String access$402(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9001c62", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mCurrentActivityCode = str;
        return str;
    }

    public static /* synthetic */ String access$502(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60ec89e3", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mPreActivityName = str;
        return str;
    }

    public static /* synthetic */ String access$600(AfcLifeCycleCenter afcLifeCycleCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50c27b6c", new Object[]{afcLifeCycleCenter});
        }
        return afcLifeCycleCenter.mCurrentActivityName;
    }

    public static /* synthetic */ String access$602(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18d8f764", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mCurrentActivityName = str;
        return str;
    }

    public static /* synthetic */ String access$702(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0c564e5", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mPreActivityUrl = str;
        return str;
    }

    public static /* synthetic */ String access$800(AfcLifeCycleCenter afcLifeCycleCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84572ee", new Object[]{afcLifeCycleCenter});
        }
        return afcLifeCycleCenter.mCurrentActivityUrl;
    }

    public static /* synthetic */ String access$802(AfcLifeCycleCenter afcLifeCycleCenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88b1d266", new Object[]{afcLifeCycleCenter, str});
        }
        afcLifeCycleCenter.mCurrentActivityUrl = str;
        return str;
    }

    private void afcMessagePoint(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0dc595", new Object[]{this, intent, str});
            return;
        }
        vp9.b("linkx", "AfcLifeCycleCenter === onActivityCreated === 桌面触达打点走afc_message");
        String stringExtra = intent.getStringExtra("messageId");
        String stringExtra2 = intent.getStringExtra("source");
        HashMap hashMap = new HashMap();
        hashMap.put("messageId", stringExtra);
        hashMap.put("bc_fl_src", stringExtra2);
        AfcUtils.r(AfcUtils.FlowType.MESSAGE, str, hashMap);
    }

    public static AfcLifeCycleCenter instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AfcLifeCycleCenter) ipChange.ipc$dispatch("d8868e9d", new Object[0]);
        }
        return c.a();
    }

    public void callLinkActivityCreate(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9df8", new Object[]{this, activity, bundle});
        } else if (activity != null && aaa.g()) {
            activityCreateAction(activity, bundle);
            k81.c().f22459a = new WeakReference<>(activity);
        }
    }

    public void dealWithData(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c089072", new Object[]{this, activity, intent});
        } else if (aaa.a()) {
            dealWithData(activity, intent, false);
        }
    }

    public Activity getCurrentActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        return this.currentActivityRef.get();
    }

    public String getCurrentActivityName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f54effc", new Object[]{this});
        }
        return this.mCurrentActivityName;
    }

    public String getCurrentActivityUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52cb407c", new Object[]{this});
        }
        return this.mCurrentActivityUrl;
    }

    public String getPreActivityName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9710f312", new Object[]{this});
        }
        return this.mPreActivityName;
    }

    public String getPreActivityUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("849782a6", new Object[]{this});
        }
        return this.mPreActivityUrl;
    }

    public void startMonitorSmartBanner(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c82118", new Object[]{this, application, hashMap});
            return;
        }
        AfcCustomSdk.h().p();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.afcLifecycleCallbacks);
        }
    }

    private AfcLifeCycleCenter() {
        this.nameList = new ArrayList();
        this.isNatureCold = true;
        this.mCurrentActivityCode = "";
        this.mCurrentActivityName = "";
        this.mCurrentActivityUrl = "";
        this.mPreActivityName = "";
        this.mPreActivityUrl = "";
        this.afcLifecycleCallbacks = new b();
    }

    private void activityCreateAction(Activity activity, Bundle bundle) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf09e3a", new Object[]{this, activity, bundle});
            return;
        }
        vp9.b("linkx", "AfcLifeCycleCenter: -->onActivityCreated -->".concat(activity.getClass().getSimpleName()));
        if (activity.getIntent() != null) {
            if (!aaa.g() || !activity.getIntent().hasExtra("__link_cold_start__")) {
                Intent intent = activity.getIntent();
                List<Intent> list = this.nameList;
                if (list != null && list.size() == 0) {
                    this.nameList.add(intent);
                    boolean z2 = bundle != null;
                    boolean isDeathRecoveryFromLaunch = isDeathRecoveryFromLaunch();
                    if (!z2 && !isDeathRecoveryFromLaunch) {
                        z = false;
                    }
                    vp9.b("linkx", "AfcLifeCycleCenter === onActivityCreated：启动的第一个intent:" + this.nameList.get(0) + ", savedInstanceState=" + z2 + ", deathRecoveryFromLaunch=" + isDeathRecoveryFromLaunch);
                }
                try {
                    dealWithData(activity, intent, z);
                } catch (Exception e) {
                    vp9.b("linkx", "AfcLifeCycleCenter === onActivityCreated：dealWithData异常了：" + e.getMessage());
                    uqg.a("dealWithData", "exception=" + e + " ===intent:" + intent);
                    StringBuilder sb = new StringBuilder();
                    sb.append(e);
                    sb.append("");
                    String sb2 = sb.toString();
                    uqg.b("afc_exception_dealWithData", sb2, intent + "", null);
                }
                zsa.b.a(new a(activity));
            }
        }
    }

    private void afcLinkPoint(String str, Uri uri, String str2, String str3, Intent intent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa5252f", new Object[]{this, str, uri, str2, str3, intent});
            return;
        }
        if (qqg.b(uri)) {
            vp9.b("linkx", "AfcLifeCycleCenter === onActivityCreated: 海关协议外链唤端,包名:" + str3);
        } else if (LauncherRuntime.i(intent)) {
            vp9.b("linkx", "AfcLifeCycleCenter === onActivityCreated: 温启桌面的场景,不做处理");
            return;
        } else {
            vp9.b("linkx", "AfcLifeCycleCenter === onActivityCreated: 非海关协议唤端,包名：" + str3 + " activity名称为: " + str + " activityUrl是: " + uri.toString());
            z = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("packageName", str3);
        hashMap.put("activityName", str);
        hashMap.put("bc_fl_src", uri.getQueryParameter("bc_fl_src"));
        hashMap.put("url", str2);
        hashMap.put("is_link", z + "");
        AfcUtils.r(AfcUtils.FlowType.LINK, str2, hashMap);
        ci7.a(TbFcLinkInit.instance().mApplication);
    }

    private void dealWithData(Activity activity, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50a30a2", new Object[]{this, activity, intent, new Boolean(z)});
            return;
        }
        String simpleName = activity.getClass().getSimpleName();
        Uri data = intent.getData();
        if (data != null) {
            String uri = data.toString();
            String c2 = AfcUtils.c(activity);
            vp9.b("linkx", "AfcLifeCycleCenter === dealWithData: activity名称为: " + simpleName + " url是: " + uri + " 包名：" + c2);
            if (this.isNatureCold && LauncherRuntime.i(this.nameList.get(0))) {
                this.isNatureCold = false;
                HashMap hashMap = new HashMap();
                hashMap.put("currentPackageName", "com.taobao.taobao");
                if (intent.hasExtra("afcTriggerType")) {
                    hashMap.put("afcTriggerType", String.valueOf(intent.getIntExtra("afcTriggerType", 0)));
                }
                AfcUtils.r(AfcUtils.FlowType.LAUNCH, uri, hashMap);
                vp9.b("linkx", "AfcLifeCycleCenter === dealWithData: 自然冷启动埋点上报");
            } else if (!TextUtils.isEmpty(c2) && !TextUtils.equals("com.taobao.taobao", c2)) {
                isLauncherStart = false;
                afcLinkPoint(simpleName, data, uri, c2, intent);
            } else if (TextUtils.equals("true", intent.getStringExtra("afcDeskTopMessage"))) {
                isLauncherStart = false;
                afcMessagePoint(intent, uri);
            } else if (qqg.b(data)) {
                isLauncherStart = false;
                afcLinkPoint(simpleName, data, uri, c2, intent);
            } else if (this.isNatureCold && isLauncherStart && z) {
                this.isNatureCold = false;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("currentPackageName", "com.taobao.taobao");
                hashMap2.put("generateType", fxp.EXTRA_KEY_DEATH_RECOVERY);
                hashMap2.put("activityName", simpleName);
                AfcUtils.r(AfcUtils.FlowType.LAUNCH, uri, hashMap2);
                vp9.b("linkx", "AfcLifeCycleCenter === dealWithData: 死亡恢复埋点上报");
            }
            vp9.a("linkx", "AfcLifeCycleCenter === dealWithData：isLauncherStart = " + isLauncherStart + ", isNatureCold=" + this.isNatureCold);
        }
    }

    private boolean isDeathRecoveryFromLaunch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4618107", new Object[]{this})).booleanValue();
        }
        try {
            int m = fxp.m(fxp.j());
            vp9.b("linkx", "AfcLifeCycleCenter === SimpleContext.restoreFromDeath: flag=" + m);
            return m == 2;
        } catch (Throwable th) {
            vp9.b("linkx", "AfcLifeCycleCenter === SimpleContext.restoreFromDeath: error=" + th.toString());
            return false;
        }
    }
}
