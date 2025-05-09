package tb;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.click.cpm.CpmClickRequest;
import com.taobao.alimama.click.cpm.CpmClickResponse;
import com.taobao.alimama.common.NetRetryType;
import com.taobao.alimama.common.TrackType;
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
public class bw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";
    public static final String MM_SCENE_ID = "mm_sceneid";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f16675a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public final boolean h;

    static {
        t2o.a(1017118741);
    }

    public bw4(String str, Map<String, String> map, boolean z) {
        this.b = str;
        this.f16675a = map;
        this.h = z;
    }

    public static /* synthetic */ String a(bw4 bw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aad6d7c9", new Object[]{bw4Var});
        }
        return bw4Var.b;
    }

    public static /* synthetic */ boolean b(bw4 bw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26de36fc", new Object[]{bw4Var})).booleanValue();
        }
        return bw4Var.h;
    }

    public static /* synthetic */ String c(bw4 bw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af6c4187", new Object[]{bw4Var});
        }
        return bw4Var.c;
    }

    public static /* synthetic */ String d(bw4 bw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31b6f666", new Object[]{bw4Var});
        }
        return bw4Var.d;
    }

    public static /* synthetic */ String e(bw4 bw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b401ab45", new Object[]{bw4Var});
        }
        return bw4Var.e;
    }

    public static /* synthetic */ String f(bw4 bw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("364c6024", new Object[]{bw4Var});
        }
        return bw4Var.f;
    }

    public static /* synthetic */ String g(bw4 bw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8971503", new Object[]{bw4Var});
        }
        return bw4Var.g;
    }

    public static /* synthetic */ Map h(bw4 bw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3cf21433", new Object[]{bw4Var});
        }
        return bw4Var.f16675a;
    }

    public static CpmClickRequest i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmClickRequest) ipChange.ipc$dispatch("c14f707c", new Object[]{str, str2});
        }
        CpmClickRequest cpmClickRequest = new CpmClickRequest();
        cpmClickRequest.cna = "";
        cpmClickRequest.e = str2;
        cpmClickRequest.ext = "";
        cpmClickRequest.referer = "";
        cpmClickRequest.utdid = MunionDeviceUtil.getUtdid();
        cpmClickRequest.accept = MunionDeviceUtil.getAccept(str);
        cpmClickRequest.useragent = MunionDeviceUtil.getUserAgent();
        cpmClickRequest.clickid = str;
        return cpmClickRequest;
    }

    public final String k(String str, String str2) {
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
        if (TextUtils.isEmpty(str) || !str.contains("click.mz.simba.taobao.com/brand")) {
            return "A17_" + str3 + vzo.d();
        }
        return "A42_" + str3 + vzo.d();
    }

    public String j() {
        NetRetryType netRetryType;
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
        Map<String, String> map = this.f16675a;
        this.d = vzo.f(map == null ? str : map.get("epid"));
        Map<String, String> map2 = this.f16675a;
        this.c = map2 == null ? null : map2.get("presetClickId");
        Map<String, String> map3 = this.f16675a;
        String f = vzo.f(map3 == null ? str : map3.get("aurl"));
        Map<String, String> map4 = this.f16675a;
        String str2 = map4 == null ? str : map4.get("eadt");
        Map<String, String> map5 = this.f16675a;
        if (map5 == null || !"true".equals(map5.get("isOpenPage"))) {
            z = false;
        }
        Map<String, String> map6 = this.f16675a;
        this.g = vzo.f(map6 == null ? str : map6.get("mmAdArgs"));
        Map<String, String> map7 = this.f16675a;
        this.e = vzo.f(map7 == null ? str : map7.get("host"));
        Map<String, String> map8 = this.f16675a;
        if (map8 != null) {
            str = map8.get("path");
        }
        this.f = vzo.f(str);
        if (this.c == null) {
            this.c = k(this.b, str2);
        }
        CpmClickRequest i = i(this.c, this.b);
        try {
            f = URLEncoder.encode(f, "UTF-8");
        } catch (Exception unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ad_cid", vzo.o(this.b));
        hashMap.put("epid", this.d);
        hashMap.put("aurl", f);
        hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
        hashMap.put("host", this.e);
        hashMap.put("path", this.f);
        hashMap.put("mmAdArgs", this.g);
        TrackType trackType = TrackType.CPM;
        hashMap.put("type", trackType.getValue());
        if (this.h) {
            netRetryType = NetRetryType.DISK;
        } else {
            netRetryType = NetRetryType.NONE;
        }
        hashMap.put("retryType", netRetryType.getValue());
        UserTrackLogs.trackClick(9001, vzo.c(hashMap), this.c);
        String c = vzo.c(hashMap);
        i4g.a("cpm_click_before", c, "clickid=" + this.c);
        o6j o6jVar = new o6j(this.b, jsj.RETRY_FIVE_TIMES, i, CpmClickResponse.class, this.f16675a, trackType.getValue());
        o6jVar.k(new b());
        gsj.a().c(o6jVar);
        if (z) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("clickid", this.c);
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
            String b3 = yov.b(this.b, "mm_sceneid");
            if (!TextUtils.isEmpty(b3)) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("mm_sceneid", b3);
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap3);
            }
            if (EnvironmentUtils.isInTaobao() && "on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "set_ut_tpk_param_switch", "on")) && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", this.c);
                UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
            }
        }
        return this.c;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f16676a;

        static {
            t2o.a(1017118743);
            t2o.a(1018167315);
        }

        public b() {
            this.f16676a = SystemClock.uptimeMillis();
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            CpmClickResponse cpmClickResponse = (CpmClickResponse) obj;
            if (cpmClickResponse != null && cpmClickResponse.getData() != null) {
                String str2 = cpmClickResponse.getData().result;
                String str3 = "";
                if (vzo.l(str2)) {
                    try {
                        str3 = "redirecturl=" + URLEncoder.encode(str2, "UTF-8");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(",rttime=" + String.valueOf(SystemClock.uptimeMillis() - this.f16676a));
                        str3 = sb.toString();
                    } catch (UnsupportedEncodingException e) {
                        TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(",hash_eurl=" + vzo.o(bw4.a(bw4.this)));
                    String sb3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb3);
                    sb4.append(",type=" + TrackType.CPM.getValue());
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append(",retryType=" + vzo.h(z, bw4.b(bw4.this)));
                    String sb7 = sb6.toString();
                    UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, sb7, bw4.c(bw4.this), bw4.d(bw4.this), bw4.e(bw4.this), bw4.f(bw4.this), bw4.g(bw4.this));
                    i4g.a("cpm_click_after", sb7, "clickid=" + bw4.c(bw4.this), vzo.c(bw4.h(bw4.this)));
                }
            }
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            TrackType trackType;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
                return;
            }
            StringBuilder sb = new StringBuilder("type=");
            sb.append(TrackType.CPM.getValue());
            UserTrackLogs.trackAdLog("cpm_click_temp_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + bw4.c(bw4.this), sb.toString());
            i4g.a("cpm_click_temp_failed", "error_code=" + str, "error_msg=" + str2, "eurl=" + Uri.encode(bw4.a(bw4.this)), "clickid=" + bw4.c(bw4.this), vzo.c(bw4.h(bw4.this)), "type=" + trackType.getValue());
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            TrackType trackType;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            StringBuilder sb = new StringBuilder("type=");
            sb.append(TrackType.CPM.getValue());
            UserTrackLogs.trackAdLog("cpm_click_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + bw4.c(bw4.this), sb.toString());
            i4g.a("cpm_click_final_failed", "error_code=" + str, "error_msg=" + str2, "eurl=" + Uri.encode(bw4.a(bw4.this)), "clickid=" + bw4.c(bw4.this), vzo.c(bw4.h(bw4.this)), "type=" + trackType.getValue());
        }
    }
}
