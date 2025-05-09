package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.click.extend.ExtendClickLink;
import com.taobao.alimama.click.extend.cpm.ExtendCpmClickRequest;
import com.taobao.alimama.click.extend.cpm.ExtendCpmClickResponse;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.MunionDeviceUtil;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hs8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f20852a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public final ExtendClickLink h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f20853a;

        static {
            t2o.a(1017118760);
            t2o.a(1018167315);
        }

        public b() {
            this.f20853a = SystemClock.uptimeMillis();
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("cpm_click_temp_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + hs8.a(hs8.this));
            i4g.a("cpm_click_temp_failed", "error_code=" + str, "error_msg=" + str2);
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            UserTrackLogs.trackAdLog("cpm_click_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + hs8.a(hs8.this));
            i4g.a("cpm_click_final_failed", "error_code=" + str, "error_msg=" + str2);
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            ExtendCpmClickResponse extendCpmClickResponse = (ExtendCpmClickResponse) obj;
            if (extendCpmClickResponse != null && extendCpmClickResponse.getData() != null) {
                String str2 = extendCpmClickResponse.getData().result;
                String str3 = "";
                if (vzo.l(str2)) {
                    try {
                        str3 = "redirecturl=" + URLEncoder.encode(str2, "UTF-8");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(",rttime=" + String.valueOf(SystemClock.uptimeMillis() - this.f20853a));
                        str3 = sb.toString();
                    } catch (UnsupportedEncodingException e) {
                        TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
                    }
                    if (vm2.l()) {
                        UserTrackLogs.trackAdLog("cpm_click_after", str3, "clickid=" + hs8.a(hs8.this), "epid=" + hs8.b(hs8.this));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append(",hash_eurl=" + vzo.o(hs8.c(hs8.this)));
                        str3 = sb2.toString();
                        UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, str3, hs8.a(hs8.this), hs8.b(hs8.this), hs8.d(hs8.this), hs8.e(hs8.this), hs8.f(hs8.this));
                    }
                    i4g.a("cpm_click_after", str3, "clickid=" + hs8.a(hs8.this));
                }
            }
        }
    }

    static {
        t2o.a(1017118758);
    }

    public hs8(String str, Map<String, String> map, ExtendClickLink extendClickLink) {
        this.b = str;
        this.f20852a = map;
        this.h = extendClickLink;
    }

    public static /* synthetic */ String a(hs8 hs8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2962e69e", new Object[]{hs8Var});
        }
        return hs8Var.c;
    }

    public static /* synthetic */ String b(hs8 hs8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e14f541f", new Object[]{hs8Var});
        }
        return hs8Var.d;
    }

    public static /* synthetic */ String c(hs8 hs8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("993bc1a0", new Object[]{hs8Var});
        }
        return hs8Var.b;
    }

    public static /* synthetic */ String d(hs8 hs8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51282f21", new Object[]{hs8Var});
        }
        return hs8Var.f;
    }

    public static /* synthetic */ String e(hs8 hs8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9149ca2", new Object[]{hs8Var});
        }
        return hs8Var.g;
    }

    public static /* synthetic */ String f(hs8 hs8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1010a23", new Object[]{hs8Var});
        }
        return hs8Var.e;
    }

    public static ExtendCpmClickRequest g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtendCpmClickRequest) ipChange.ipc$dispatch("308508c3", new Object[]{str, str2, str3});
        }
        ExtendCpmClickRequest extendCpmClickRequest = new ExtendCpmClickRequest();
        extendCpmClickRequest.cna = "";
        extendCpmClickRequest.e = str2;
        extendCpmClickRequest.ext = "";
        extendCpmClickRequest.referer = "";
        extendCpmClickRequest.utdid = MunionDeviceUtil.getUtdid();
        extendCpmClickRequest.accept = MunionDeviceUtil.getAccept(str);
        extendCpmClickRequest.useragent = MunionDeviceUtil.getUserAgent();
        extendCpmClickRequest.clickid = str;
        extendCpmClickRequest.API_NAME = str3;
        return extendCpmClickRequest;
    }

    public final String i(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eed8812", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = str2 + "_";
        }
        Map<String, String> map = this.f20852a;
        if (map != null && map.containsKey("a48")) {
            String str4 = this.f20852a.get("a48");
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
            return "A101_" + str3 + vzo.d();
        } else if (TextUtils.isEmpty(str) || !str.contains("click.mz.simba.taobao.com/brand")) {
            return "A17_" + str3 + vzo.d();
        } else {
            return "A42_" + str3 + vzo.d();
        }
    }

    public String h() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2405f36", new Object[]{this});
        }
        String str = "";
        if (TextUtils.isEmpty(this.b)) {
            return str;
        }
        Pair<Long, Long> b2 = aw4.b(this.b);
        if (b2 != null) {
            long longValue = ((Long) b2.first).longValue();
            long longValue2 = ((Long) b2.second).longValue();
            long currentTimeMillis = System.currentTimeMillis() - longValue;
            if (currentTimeMillis > longValue2) {
                UserTrackLogs.trackLog(19999, "munionAdForClickExpired", String.valueOf(currentTimeMillis), this.b, null);
            }
        }
        Map<String, String> map = this.f20852a;
        this.d = vzo.f(map == null ? str : map.get("epid"));
        Map<String, String> map2 = this.f20852a;
        this.c = map2 == null ? null : map2.get("presetClickId");
        Map<String, String> map3 = this.f20852a;
        String f = vzo.f(map3 == null ? str : map3.get("aurl"));
        Map<String, String> map4 = this.f20852a;
        String str2 = map4 == null ? str : map4.get("eadt");
        Map<String, String> map5 = this.f20852a;
        if (map5 == null || !"true".equals(map5.get("isOpenPage"))) {
            z = false;
        }
        Map<String, String> map6 = this.f20852a;
        this.e = vzo.f(map6 == null ? str : map6.get("mmAdArgs"));
        Map<String, String> map7 = this.f20852a;
        this.f = vzo.f(map7 == null ? str : map7.get("host"));
        Map<String, String> map8 = this.f20852a;
        if (map8 != null) {
            str = map8.get("path");
        }
        this.g = vzo.f(str);
        if (this.c == null) {
            this.c = i(this.b, str2);
        }
        ExtendCpmClickRequest g = g(this.c, this.b, this.h.c());
        try {
            f = URLEncoder.encode(f, "UTF-8");
        } catch (Exception unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ad_cid", vzo.o(this.b));
        hashMap.put("epid", this.d);
        hashMap.put("aurl", f);
        hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
        hashMap.put("host", this.f);
        hashMap.put("path", this.g);
        hashMap.put("mmAdArgs", this.e);
        if (vm2.l()) {
            String c = vzo.c(hashMap);
            UserTrackLogs.trackAdLog("cpm_click_before", c, "clickid=" + this.c);
        } else {
            UserTrackLogs.trackClick(9001, vzo.c(hashMap), this.c);
        }
        String c2 = vzo.c(hashMap);
        i4g.a("cpm_click_before", c2, "clickid=" + this.c);
        o6j o6jVar = new o6j(null, jsj.RETRY_FIVE_TIMES, g, ExtendCpmClickResponse.class);
        o6jVar.k(new b());
        gsj.a().c(o6jVar);
        if (z) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("clickid", this.c);
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
            if (EnvironmentUtils.isInTaobao() && "on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "set_ut_tpk_param_switch", "on")) && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", this.c);
                UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
            }
        }
        return this.c;
    }
}
