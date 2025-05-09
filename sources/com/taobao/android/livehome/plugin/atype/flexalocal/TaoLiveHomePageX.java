package com.taobao.android.livehome.plugin.atype.flexalocal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowInsets;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import tb.cus;
import tb.d9m;
import tb.fkx;
import tb.kza;
import tb.nj7;
import tb.nvs;
import tb.nwg;
import tb.nxq;
import tb.o86;
import tb.orq;
import tb.p0;
import tb.p9m;
import tb.qkr;
import tb.qw0;
import tb.qyg;
import tb.shr;
import tb.sj7;
import tb.t2o;
import tb.vc;
import tb.wca;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveHomePageX implements ITaoLiveHomePageProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APP_VERSION = "20250320";
    private static final String LIVE_HOME_INTERCEPT_URL = "h5.m.taobao.com/taolive/main.html";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zmj f8776a;
        public final /* synthetic */ JSONObject b;

        public a(zmj zmjVar, JSONObject jSONObject) {
            this.f8776a = zmjVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) "cache_read_start");
            jSONObject.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
            p9m.d("tbLiveChannelTabs_navProcHAsy", null);
            TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor process Thread");
            TaoLiveLaunchInitializer.init();
            if (!p0.g(p0.f())) {
                shr.b = nwg.b("kTBLiveFeedListKey_2024_new");
            } else {
                if (p0.j(p0.f())) {
                    kza.c = nwg.b(kza.KEY_CACHE_SINGLE);
                    if (kza.c == null) {
                        kza.c = nwg.a(Globals.getApplication(), "live_flexalocal/discovery_video_list_new_single.json");
                    }
                    if ((kza.c instanceof String) && !orq.a((String) kza.c)) {
                        kza.d = fkx.d((String) kza.c);
                    }
                } else {
                    kza.b = nwg.b(kza.KEY_CACHE_DOUBLE);
                    if (kza.b == null) {
                        kza.b = nwg.a(Globals.getApplication(), "live_flexalocal/discovery_video_list_new.json");
                    }
                    if ((kza.b instanceof String) && !orq.a((String) kza.b)) {
                        kza.e = fkx.d((String) kza.b);
                    }
                }
                kza.h = nwg.b(kza.f);
                kza.i = nwg.b(kza.g);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", (Object) "cache_read_end");
            jSONObject2.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
            cus cusVar = wca.b;
            if (cusVar != null) {
                cusVar.g(false, false);
                TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor enableOptimize4Asyn end");
            }
            TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor LiveCache.readData");
            if (nvs.E()) {
                new qkr().a(this.f8776a.d());
            }
            qyg.c().e("com.taobao.taolive.performance_tracker", this.b);
            qyg.c().e("com.taobao.taolive.performance_tracker", jSONObject);
            qyg.c().e("com.taobao.taolive.performance_tracker", jSONObject2);
        }
    }

    static {
        t2o.a(310378499);
        t2o.a(806355185);
    }

    private void handleFullscreen(Intent intent, zmj zmjVar) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c52524f", new Object[]{this, intent, zmjVar});
        } else if (intent != null && intent.getData() != null && zmjVar != null) {
            Uri data = intent.getData();
            String queryParameter = data.getQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY);
            if (TextUtils.isEmpty(queryParameter)) {
                uri = data.buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
            } else {
                String uri2 = data.toString();
                uri = Uri.parse(uri2.replace("largescreenstyle=" + queryParameter, "largescreenstyle=fullscreen"));
            }
            intent.setData(uri);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public cus createTaoLiveHomePage(Context context, boolean z, Object obj, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cus) ipChange.ipc$dispatch("dfdbd067", new Object[]{this, context, new Boolean(z), obj, intent});
        }
        return new TaoLiveNewHomePage(context, z, obj, intent);
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getBailoutTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0d24c29", new Object[]{this});
        }
        return "livehomecore_flexalocal/bottoming_template_list.json";
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getBailoutVideoListData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a978b4ac", new Object[]{this});
        }
        return "live_flexalocal/discovery_video_list.json";
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getDXAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb6a1c18", new Object[]{this});
        }
        return getAppVersion(null);
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getDXBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6db0c1b6", new Object[]{this});
        }
        return "live_channel_flexalocal";
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public void previewEngineDidInitialized(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe99d8e", new Object[]{this, sVar});
        } else {
            o86.a(sVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public boolean processInner(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("397a04af", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        return processInner1(intent, zmjVar);
    }

    public static String getAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba9fc222", new Object[]{str});
        }
        if (qw0.p() && !TextUtils.isEmpty(str)) {
            return str;
        }
        String d = p0.d();
        if (!"normal".equals(d) && !TextUtils.isEmpty(d)) {
            String[] split = d.split(",");
            if (split.length >= 2) {
                if (sj7.j().equals(split[1])) {
                    return split[0];
                }
                if ("*".equals(split[1])) {
                    return split[0];
                }
            }
        }
        return APP_VERSION;
    }

    private boolean processInner1(Intent intent, zmj zmjVar) {
        WindowInsets rootWindowInsets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d00ed8c", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", (Object) "navStart");
        jSONObject.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
        p9m.d("tbLiveChannelTabs_navProc", null);
        TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor process start");
        if (intent.getData() != null) {
            String uri = intent.getData().toString();
            if (TextUtils.isEmpty(uri)) {
                return true;
            }
            boolean z = zmjVar.d() instanceof AppCompatActivity;
            if (uri.contains(LIVE_HOME_INTERCEPT_URL)) {
                sj7.x(zmjVar.d());
            }
            if (!uri.contains("smallWindowClick=true")) {
                shr.b = null;
                cus cusVar = wca.b;
                if (cusVar != null) {
                    cusVar.h();
                    wca.b = null;
                }
                if (uri.contains(LIVE_HOME_INTERCEPT_URL) && (z || !nvs.q())) {
                    p9m.d("tbLiveChannelTabs_navProcH", null);
                    if (Build.VERSION.SDK_INT >= 23 && z) {
                        Context d = zmjVar.d();
                        rootWindowInsets = ((Activity) zmjVar.d()).getWindow().getDecorView().getRootWindowInsets();
                        nxq.r(d, rootWindowInsets);
                    }
                    FlexaLiveX.o().z(FlexaLiveX.TAOLIVE_HOMEPAGE, false, zmjVar.d());
                    TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor process");
                    wca.b = d9m.H().createTaoLiveHomePage(zmjVar.d(), false, null, intent);
                    Thread thread = new Thread(new a(zmjVar, jSONObject), "processInner1");
                    thread.setPriority(10);
                    thread.start();
                }
            }
            if (uri.contains(LIVE_HOME_INTERCEPT_URL) && zmjVar.d() != null && (vc.i(zmjVar.d()) || vc.d(zmjVar.d()))) {
                handleFullscreen(intent, zmjVar);
            }
        }
        return true;
    }
}
