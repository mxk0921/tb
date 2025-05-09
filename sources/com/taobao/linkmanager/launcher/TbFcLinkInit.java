package com.taobao.linkmanager.launcher;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.task.Coordinator;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.afc.plugin.TfcAutoLoginPlugin;
import com.taobao.linkmanager.afc.plugin.TfcLoginPlugin;
import com.taobao.linkmanager.afc.remote.HomePageReceiver;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.afc.windvane.AfcIdJsBridge;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import com.taobao.linkmanager.afc.windvane.LoginFreeJsBridge;
import com.taobao.linkmanager.afc.windvane.XbsJsBridge;
import com.taobao.linkmanager.flowout.windvane.FlowCustomsWvPlugin;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.ae7;
import tb.ah0;
import tb.c21;
import tb.c51;
import tb.dho;
import tb.fsw;
import tb.jj1;
import tb.kot;
import tb.lot;
import tb.mol;
import tb.mot;
import tb.not;
import tb.oot;
import tb.pg0;
import tb.pm2;
import tb.pot;
import tb.qqg;
import tb.rnx;
import tb.s8t;
import tb.t2o;
import tb.tgg;
import tb.u11;
import tb.vp9;
import tb.xg0;
import tb.xhq;
import tb.ypg;
import tb.zg0;
import tb.zsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TbFcLinkInit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_HOMEPAGE_FINISH = "action_welcome_need_finish";
    public static final String LOG_TAG = "linkx";
    public static String launchType = "COLD";
    public Map<Uri, Boolean> doLinkMap;
    public boolean isAfcLink;
    public HashMap<String, Object> launchParams;
    public boolean linkAhead;
    public String mAppKey;
    public Application mApplication;
    public String ttid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f10934a;
        public final /* synthetic */ HashMap b;

        public a(Application application, HashMap hashMap) {
            this.f10934a = application;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vp9.a("linkx", "TbFcLinkInit === initBackgroundTask：冷启，极速版");
            TbFcLinkInit.access$200(TbFcLinkInit.this, this.f10934a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f10935a;
        public final /* synthetic */ HashMap b;

        public b(Application application, HashMap hashMap) {
            this.f10935a = application;
            this.b = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vp9.a("linkx", "TbFcLinkInit === initBackgroundTask：冷启,正常子线程初始化");
            TbFcLinkInit.access$200(TbFcLinkInit.this, this.f10935a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements u11 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(c cVar) {
            }

            @Override // tb.u11, com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    return;
                }
                if (i == 1) {
                    TbFcLinkInit.launchType = "HOT";
                }
                vp9.a("linkx", "TbFcLinkInit === registerForgroundListener: 是否冷启动：" + TbFcLinkInit.launchType);
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c21.c(new a(this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TbFcLinkInit f10937a = new TbFcLinkInit(null);

        static {
            t2o.a(744489116);
        }

        public static /* synthetic */ TbFcLinkInit a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TbFcLinkInit) ipChange.ipc$dispatch("9464dfb9", new Object[0]);
            }
            return f10937a;
        }
    }

    static {
        t2o.a(744489111);
    }

    public /* synthetic */ TbFcLinkInit(a aVar) {
        this();
    }

    public static /* synthetic */ void access$200(TbFcLinkInit tbFcLinkInit, Application application, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb4d87a7", new Object[]{tbFcLinkInit, application, hashMap});
        } else {
            tbFcLinkInit.initBackgroundTask(application, hashMap);
        }
    }

    public static TbFcLinkInit instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbFcLinkInit) ipChange.ipc$dispatch("496f8b4", new Object[0]);
        }
        return d.a();
    }

    private void registerForgroundListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8dec08", new Object[]{this});
        } else {
            new Handler(Looper.getMainLooper()).post(new c());
        }
    }

    private TbFcLinkInit() {
        this.doLinkMap = new HashMap();
        this.mAppKey = "21646297";
    }

    private void initBackgroundTask(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4aca97e", new Object[]{this, application, hashMap});
            return;
        }
        ypg.e().b(application, hashMap);
        ae7.c().e(application, hashMap);
        fsw.h(XbsJsBridge.CLASSNAME_BC_TIPS, XbsJsBridge.class);
        fsw.h(DeviceInfoJsBridge.NAME, DeviceInfoJsBridge.class);
        fsw.h(FlowCustomsWvPlugin.PLUGIN_NAME, FlowCustomsWvPlugin.class);
        fsw.h(AfcIdJsBridge.NAME, AfcIdJsBridge.class);
        fsw.h(LoginFreeJsBridge.NAME, LoginFreeJsBridge.class);
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(application);
        HomePageReceiver homePageReceiver = HomePageReceiver.a.f10912a;
        instance.registerReceiver(homePageReceiver, new IntentFilter(ACTION_HOMEPAGE_FINISH));
        if (hashMap.containsKey("currentLocale") && !Locale.CHINESE.getLanguage().equals((String) hashMap.get("currentLocale"))) {
            homePageReceiver.a(false);
        }
        c51.e(application);
        jj1.k();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("isNetWorkInThread", Boolean.valueOf(TFCCommonUtils.s(application, TFCCommonUtils.b)));
        jj1.h().g(application, hashMap2);
        zg0.g(application);
    }

    private void linkAheadProcess(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7af103", new Object[]{this, application, hashMap});
            return;
        }
        if (this.linkAhead) {
            try {
                Coordinator.execute(new a(application, hashMap));
            } catch (Exception e) {
                initBackgroundTask(application, hashMap);
                vp9.b("linkx", "TbFcLinkInit === 异常：" + e.toString());
            }
        } else {
            zsa.b.a(new b(application, hashMap));
        }
        if (this.linkAhead) {
            xhq d2 = LauncherRuntime.d();
            pg0.i().m = d2.d;
            Intent intent = d2.e;
            Uri data = intent.getData();
            if (data != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", data.toString());
                hashMap2.put("packageName", d2.d);
                if (qqg.b(data)) {
                    this.isAfcLink = true;
                    this.doLinkMap.put(data, Boolean.TRUE);
                    vp9.a("linkx", "TbFcLinkInit === init：冷启，极速版开启，海关逻辑提前执行, 来源包名: " + d2.d);
                    AfcCustomSdk.h().f(application, intent);
                    ah0.d("tb_speed_link", "", "", hashMap2);
                    return;
                }
                ah0.d("tb_illegalLink", "", "", hashMap2);
            }
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        long g = AfcUtils.g();
        vp9.b("linkx", "TbFcLinkInit === init.");
        this.mApplication = application;
        this.ttid = (String) hashMap.get("ttid");
        this.launchParams = hashMap;
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.mAppKey = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
        pg0.i().getClass();
        pg0.i().k = true;
        pg0.i().n = false;
        pg0.i().o = true;
        pg0.i().l = "flow_customs_in";
        pg0.i().f26073a = new lot();
        pg0.i().h = new pot();
        pg0.i().b = new not();
        pg0.i().c = new mot();
        pg0.i().d = new s8t();
        pg0.i().e = new tgg();
        pg0.i().i = new dho();
        AfcCustomSdk.h().g(application, this.mAppKey, (String) hashMap.get("appVersion"), TFCCommonUtils.n(hashMap));
        xg0.a().b(new TfcLoginPlugin());
        xg0.a().b(new kot());
        xg0.a().b(new oot());
        xg0.a().b(new TfcAutoLoginPlugin());
        pg0.i().g = new rnx();
        registerForgroundListener();
        try {
            mol.b().h(pm2.g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        long g2 = AfcUtils.g();
        StringBuilder sb = new StringBuilder("海关初始化节点耗时：");
        long j = g2 - g;
        sb.append(j);
        sb.append("");
        vp9.b(AfcCustomSdk.LOG_TIME, sb.toString());
        ah0.d(ah0.AFC_SDK_INIT_TIME, j + "", "", null);
        linkAheadProcess(application, hashMap);
        vp9.b("linkx", "TbFcLinkInit === init done.");
    }
}
