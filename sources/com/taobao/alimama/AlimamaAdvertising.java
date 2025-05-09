package com.taobao.alimama;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.cpc.CpcClickBuilder;
import com.taobao.alimama.click.cpm.CpmClickBuilder;
import com.taobao.alimama.click.interact.InteractBuilder;
import com.taobao.alimama.common.FailRequestDiskCacheManager;
import com.taobao.alimama.cpm.ifs.IfsBuilder;
import com.taobao.alimama.login.LoginManager;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.Munion;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.utils.Global;
import com.taobao.utils.ILoginInfoGetter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.d4g;
import tb.fd0;
import tb.hs0;
import tb.i4g;
import tb.is0;
import tb.itw;
import tb.js0;
import tb.m5j;
import tb.nic;
import tb.os0;
import tb.pfb;
import tb.sss;
import tb.t2o;
import tb.uss;
import tb.wll;
import tb.wss;
import tb.wzu;
import tb.xhe;
import tb.xss;
import tb.yov;
import tb.zss;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AlimamaAdvertising implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AlimamaAdvertising";
    private ConcurrentMap<String, pfb> mTkCpsAdMap;
    private String mTkDefaultKey;
    private os0 mUDAdCommitter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static volatile AlimamaAdvertising f6174a = new AlimamaAdvertising();

        static {
            t2o.a(1021313033);
        }
    }

    static {
        t2o.a(1021313031);
    }

    private pfb getDefaultTkCpsAd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfb) ipChange.ipc$dispatch("c8a0ee1e", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mTkDefaultKey)) {
            String packageName = Global.getPackageName();
            this.mTkDefaultKey = packageName;
            if (TextUtils.isEmpty(packageName)) {
                this.mTkDefaultKey = "default";
            }
        }
        pfb pfbVar = this.mTkCpsAdMap.get(this.mTkDefaultKey);
        if (pfbVar != null) {
            return pfbVar;
        }
        pfb a2 = hs0.a(this.mTkDefaultKey);
        this.mTkCpsAdMap.put(this.mTkDefaultKey, a2);
        return a2;
    }

    private String handleInteractionClick(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("514099f6", new Object[]{this, str, str2, list});
        }
        i4g.a("handle_interaction_click", "url = " + str + ", actionType = " + str2 + ", actionList=" + list);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || list == null || !list.contains(str2)) {
            return null;
        }
        return str;
    }

    public static AlimamaAdvertising instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlimamaAdvertising) ipChange.ipc$dispatch("acb31d93", new Object[0]);
        }
        return b.f6174a;
    }

    public CpcClickBuilder buildCpcAdClick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickBuilder) ipChange.ipc$dispatch("986267aa", new Object[]{this, str});
        }
        return new CpcClickBuilder(str);
    }

    public CpmClickBuilder buildCpmAdClick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickBuilder) ipChange.ipc$dispatch("1d8cc8a0", new Object[]{this, str});
        }
        return new CpmClickBuilder(str);
    }

    public IfsBuilder buildIfsExposure(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IfsBuilder) ipChange.ipc$dispatch("8d94aa9b", new Object[]{this, application, str});
        }
        return new IfsBuilder(application, str);
    }

    public InteractBuilder buildInteractTracking(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractBuilder) ipChange.ipc$dispatch("3b88bfee", new Object[]{this, str});
        }
        return new InteractBuilder(str);
    }

    public sss buildTanxClickArrayTracking(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sss) ipChange.ipc$dispatch("2cfffe9f", new Object[]{this, str});
        }
        return new sss(str);
    }

    public uss buildTanxClickTracking(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uss) ipChange.ipc$dispatch("65b1dcb0", new Object[]{this, application, str});
        }
        return new uss(str);
    }

    public zss buildTanxEventTracking(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zss) ipChange.ipc$dispatch("9bbdd2fe", new Object[]{this, application, str});
        }
        return new zss(application, str);
    }

    public xss buildTanxImpTracking(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xss) ipChange.ipc$dispatch("895efcbc", new Object[]{this, application, str});
        }
        return new xss(application, str);
    }

    public void commitCpsInitiativeAction(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8285226f", new Object[]{this, str, str2, str3, map});
        } else {
            getDefaultTkCpsAd().k(str, str2, str3, map);
        }
    }

    public void commitIfsArrayExposure(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff0f85f", new Object[]{this, str, str2, str3, map});
            return;
        }
        Application application = Global.getApplication();
        if (TextUtils.isEmpty(str2)) {
            str2 = Global.getPackageName();
        }
        JSONArray parseArray = JSON.parseArray(str);
        if (parseArray != null && parseArray.size() > 0) {
            for (int i = 0; i < parseArray.size(); i++) {
                buildIfsExposure(application, parseArray.getString(i)).withArgPid(str2).withArgNamespace(str3).withArgs(map).commit();
            }
        }
    }

    @Deprecated
    public void commitIfsExposure(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff195a6", new Object[]{this, application, str, str2});
            return;
        }
        if (application == null) {
            application = Global.getApplication();
        }
        if (TextUtils.isEmpty(str)) {
            str = Global.getPackageName();
        }
        buildIfsExposure(application, str2).withArgPid(str).commit();
    }

    public void commitTaokeInfo(String str, String str2, String str3, boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed24909c", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        long j2 = 0;
        try {
            j = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        try {
            j2 = Long.parseLong(str3);
        } catch (NumberFormatException unused2) {
        }
        commitTaokeInfo(str, j, j2, z);
    }

    public String fetchAdParameter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f65f3d03", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String f = getDefaultTkCpsAd().f(str);
        AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, "Munion_fetch_param", str + "=" + f);
        TaoLog.Logd("AlimamaSdk", "fetched ad parameter: " + str + " = " + f);
        return f;
    }

    public void filterAndHandleTaokeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740791cb", new Object[]{this, str});
        } else {
            getDefaultTkCpsAd().d(str);
        }
    }

    public Map<String, String> getCrossTaokeEConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dcbc0ed1", new Object[]{this});
        }
        return getDefaultTkCpsAd().j();
    }

    public String handleAdClickForClickid(String str, String str2) {
        Munion instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddca706e", new Object[]{this, str, str2});
        }
        if (EnvironmentUtils.getCurrentEnv() != EnvironmentUtils.Env.TMALL || (instance = Munion.getInstance(Global.getApplication(), null)) == null) {
            return "";
        }
        return instance.commitCpmEvent(str);
    }

    public String handleAdUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0744cab", new Object[]{this, str}) : fd0.b().a(str);
    }

    public String handleAdUrlForClickid(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd0c1716", new Object[]{this, str, str2, list}) : handleAdUrlForClickid(str, str2, list, true);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application != null) {
            Global.setApplication(application);
            if ("on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "tk_cps_param_switch", "on"))) {
                getDefaultTkCpsAd().b();
            }
            xhe.f().e();
            FailRequestDiskCacheManager.g().f();
            wss.b().a(application);
            wzu.registerAppStatusCallbacks(UTAppBackgroundTimeoutDetector.getInstance());
            UserTrackLogs.emptyCacheAndAllowDirectReport();
        } else {
            throw new NullPointerException("application is can not be null");
        }
    }

    public void initTaokeCps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4777cc41", new Object[]{this});
        } else {
            getDefaultTkCpsAd().a();
        }
    }

    public void injectMtopInstance(m5j.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3937a47", new Object[]{this, aVar});
        } else {
            m5j.a().c(aVar);
        }
    }

    public boolean isRegisterMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e18d0b8", new Object[]{this})).booleanValue();
        }
        return d4g.e().f();
    }

    public void parseTkCpsAdParameters(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fa631a", new Object[]{this, str});
            return;
        }
        UserTrackLogs.trackAdLog("Munion_tk_cps_param_parse", "data=" + str);
        getDefaultTkCpsAd().e(str);
    }

    public void registerMonitor(nic nicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a031b1fa", new Object[]{this, nicVar});
        } else {
            d4g.e().g(nicVar);
        }
    }

    public void registerService(IBaseService iBaseService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5703f8", new Object[]{this, iBaseService});
        } else {
            com.taobao.alimama.services.a.e().g(iBaseService);
        }
    }

    public void removeMtopInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17bb128", new Object[]{this});
        } else {
            m5j.a().d();
        }
    }

    public void requestTkChannelECheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2fb47", new Object[]{this});
        } else {
            getDefaultTkCpsAd().g();
        }
    }

    public void setApplicationContext(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fef2997", new Object[]{this, application});
        } else {
            Global.setApplication(application);
        }
    }

    public void setLoginInfoGetter(ILoginInfoGetter iLoginInfoGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cffcd0", new Object[]{this, iLoginInfoGetter});
        } else {
            LoginManager.b(iLoginInfoGetter);
        }
    }

    public void setParamsAndinitTaokeCps(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb93cf84", new Object[]{this, str, str2});
        } else {
            getDefaultTkCpsAd().c(str, str2);
        }
    }

    public void syncCrossTaokeE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398db395", new Object[]{this});
        } else {
            getDefaultTkCpsAd().i();
        }
    }

    public void uploadUDTrack(String str, String str2, String str3, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabea071", new Object[]{this, str, str2, str3, new Boolean(z), map});
            return;
        }
        String c = yov.c(str, wll.ALI_TRACK_ID);
        if (!TextUtils.isEmpty(c) && c.matches("\\d+_[A-Za-z0-9]{32}")) {
            if (this.mUDAdCommitter == null) {
                this.mUDAdCommitter = new os0();
            }
            this.mUDAdCommitter.e(str, str2, str3, z, c, map);
        }
    }

    private AlimamaAdvertising() {
        this.mTkCpsAdMap = new ConcurrentHashMap();
    }

    public String handleAdUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1536da1", new Object[]{this, str, new Boolean(z)}) : handleAdUrl(str, z, true);
    }

    public String handleAdUrlForClickid(String str, String str2, List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b4f096", new Object[]{this, str, str2, list, new Boolean(z)}) : handleAdUrlForClickid(handleInteractionClick(str, str2, list), z);
    }

    public String handleAdUrl(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc586b6b", new Object[]{this, str, new Boolean(z), new Boolean(z2)}) : js0.b().c(str, z, z2);
    }

    public void commitTaokeInfo(String str, String str2, String str3, boolean z, Map<String, String> map) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605e7f69", new Object[]{this, str, str2, str3, new Boolean(z), map});
            return;
        }
        long j2 = 0;
        try {
            j = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        try {
            j2 = Long.parseLong(str3);
        } catch (NumberFormatException unused2) {
        }
        commitTaokeInfo(str, j, j2, z, map);
    }

    public String handleAdUrl(String str, String str2, List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e541490", new Object[]{this, str, str2, list}) : handleAdUrl(handleInteractionClick(str, str2, list));
    }

    public String handleAdUrlForClickid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5438d0b1", new Object[]{this, str}) : handleAdUrlForClickid(str, true);
    }

    public String handleAdUrlForClickid(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d61f6a5b", new Object[]{this, str, new Boolean(z)});
        }
        if (!EnvironmentUtils.isInTaobao()) {
            return js0.b().d(str, z);
        }
        String c = is0.b().c(str);
        Uri parse = Uri.parse(c);
        if (!parse.isHierarchical() && c.startsWith(itw.URL_SEPARATOR)) {
            parse = Uri.parse("http:".concat(c));
        }
        return parse.getQueryParameter("clickid");
    }

    public String handleAdUrl(String str, String str2, List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4f6ca25c", new Object[]{this, str, str2, list, new Boolean(z)}) : handleAdUrl(str, str2, list, z, true);
    }

    public void commitTaokeInfo(String str, long j, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31a31b0", new Object[]{this, str, new Long(j), new Long(j2), new Boolean(z)});
        } else {
            getDefaultTkCpsAd().l(str, j, j2, z);
        }
    }

    public String handleAdUrl(String str, String str2, List<String> list, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4165ce10", new Object[]{this, str, str2, list, new Boolean(z), new Boolean(z2)}) : handleAdUrl(handleInteractionClick(str, str2, list), z, z2);
    }

    public void commitTaokeInfo(String str, long j, long j2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb813d5", new Object[]{this, str, new Long(j), new Long(j2), new Boolean(z), map});
        } else {
            getDefaultTkCpsAd().h(str, j, j2, z, map);
        }
    }

    @Deprecated
    public Uri handleAdUrl(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("99b40653", new Object[]{this, uri}) : handleAdUrl(uri, true);
    }

    @Deprecated
    public Uri handleAdUrl(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("2a1fba6f", new Object[]{this, uri, new Boolean(z)}) : Uri.parse(handleAdUrl(uri.toString(), z, false));
    }

    @Deprecated
    public String handleAdUrlForClickid(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c7473e3e", new Object[]{this, uri}) : handleAdUrlForClickid(uri.toString(), true);
    }

    @Deprecated
    public String handleAdUrlForClickid(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4deae6e", new Object[]{this, uri, new Boolean(z)}) : handleAdUrlForClickid(uri.toString(), z);
    }
}
