package tb;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.click.cpc.CpcClickRequest;
import com.taobao.alimama.click.cpc.CpcClickResponse;
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
public class zv4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";
    public static final String MM_SCENE_ID = "mm_sceneid";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f33037a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public final boolean h;

    static {
        t2o.a(1017118733);
    }

    public zv4(String str, Map<String, String> map, boolean z) {
        this.b = str;
        this.f33037a = map;
        this.h = z;
    }

    public static /* synthetic */ String a(zv4 zv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc55b1b5", new Object[]{zv4Var});
        }
        return zv4Var.b;
    }

    public static /* synthetic */ boolean b(zv4 zv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37f21790", new Object[]{zv4Var})).booleanValue();
        }
        return zv4Var.h;
    }

    public static /* synthetic */ String c(zv4 zv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0eb1b73", new Object[]{zv4Var});
        }
        return zv4Var.c;
    }

    public static /* synthetic */ String d(zv4 zv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5335d052", new Object[]{zv4Var});
        }
        return zv4Var.d;
    }

    public static /* synthetic */ String e(zv4 zv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5808531", new Object[]{zv4Var});
        }
        return zv4Var.f;
    }

    public static /* synthetic */ String f(zv4 zv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57cb3a10", new Object[]{zv4Var});
        }
        return zv4Var.g;
    }

    public static /* synthetic */ String g(zv4 zv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da15eeef", new Object[]{zv4Var});
        }
        return zv4Var.e;
    }

    public static /* synthetic */ Map h(zv4 zv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("609761c7", new Object[]{zv4Var});
        }
        return zv4Var.f33037a;
    }

    public static CpcClickRequest i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpcClickRequest) ipChange.ipc$dispatch("7919c1da", new Object[]{str, str2});
        }
        CpcClickRequest cpcClickRequest = new CpcClickRequest();
        cpcClickRequest.cna = "";
        cpcClickRequest.ext = "";
        cpcClickRequest.referer = "";
        cpcClickRequest.utkey = "";
        cpcClickRequest.utsid = "";
        cpcClickRequest.host = "";
        cpcClickRequest.e = str2;
        cpcClickRequest.utdid = MunionDeviceUtil.getUtdid();
        cpcClickRequest.accept = MunionDeviceUtil.getAccept(str);
        cpcClickRequest.clickid = str;
        return cpcClickRequest;
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
        Map<String, String> map = this.f33037a;
        this.d = vzo.f(map == null ? str : map.get("epid"));
        Map<String, String> map2 = this.f33037a;
        this.c = map2 == null ? null : map2.get("presetClickId");
        Map<String, String> map3 = this.f33037a;
        String f = vzo.f(map3 == null ? str : map3.get("aurl"));
        Map<String, String> map4 = this.f33037a;
        String str2 = map4 == null ? null : map4.get("eadt");
        Map<String, String> map5 = this.f33037a;
        if (map5 == null || !"true".equals(map5.get("isOpenPage"))) {
            z = false;
        }
        Map<String, String> map6 = this.f33037a;
        this.e = vzo.f(map6 == null ? str : map6.get("mmAdArgs"));
        Map<String, String> map7 = this.f33037a;
        this.f = vzo.f(map7 == null ? str : map7.get("host"));
        Map<String, String> map8 = this.f33037a;
        this.g = vzo.f(map8 == null ? str : map8.get("path"));
        if (this.c == null) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + "_";
            }
            this.c = "A1_" + str + vzo.d();
        }
        CpcClickRequest i = i(this.c, this.b);
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
        TrackType trackType = TrackType.CPC;
        hashMap.put("type", trackType.getValue());
        if (this.h) {
            netRetryType = NetRetryType.DISK;
        } else {
            netRetryType = NetRetryType.NONE;
        }
        hashMap.put("retryType", netRetryType.getValue());
        UserTrackLogs.trackClick(9001, vzo.c(hashMap), this.c);
        i4g.a("cpc_click_before", vzo.c(hashMap), "clickid=" + this.c);
        o6j o6jVar = new o6j(this.b, jsj.RETRY_FIVE_TIMES, i, CpcClickResponse.class, this.f33037a, trackType.getValue());
        o6jVar.k(new b());
        gsj.a().c(o6jVar);
        if (z) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("clickid", this.c);
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
            String b2 = yov.b(this.b, "mm_sceneid");
            if (!TextUtils.isEmpty(b2)) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("mm_sceneid", b2);
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
        public final long f33038a;

        static {
            t2o.a(1017118735);
            t2o.a(1018167315);
        }

        public b() {
            this.f33038a = SystemClock.uptimeMillis();
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            CpcClickResponse cpcClickResponse = (CpcClickResponse) obj;
            if (cpcClickResponse != null && cpcClickResponse.getData() != null) {
                String str2 = cpcClickResponse.getData().result;
                String str3 = "";
                if (vzo.l(str2)) {
                    try {
                        str3 = "redirecturl=" + URLEncoder.encode(str2, "UTF-8");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(",rttime=" + String.valueOf(SystemClock.uptimeMillis() - this.f33038a));
                        str3 = sb.toString();
                    } catch (UnsupportedEncodingException e) {
                        TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(",hash_eurl=" + vzo.o(zv4.a(zv4.this)));
                    String sb3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb3);
                    sb4.append(",type=" + TrackType.CPC.getValue());
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append(",retryType=" + vzo.h(z, zv4.b(zv4.this)));
                    String sb7 = sb6.toString();
                    UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, sb7, zv4.c(zv4.this), zv4.d(zv4.this), zv4.e(zv4.this), zv4.f(zv4.this), zv4.g(zv4.this));
                    i4g.a("cpc_click_after", sb7, "clickid=" + zv4.c(zv4.this), vzo.c(zv4.h(zv4.this)));
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
            sb.append(TrackType.CPC.getValue());
            UserTrackLogs.trackAdLog("cpc_click_temp_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + zv4.c(zv4.this), sb.toString());
            i4g.a("cpc_click_temp_failed", "error_code=" + str, "error_msg=" + str2, "eurl=" + Uri.encode(zv4.a(zv4.this)), "clickid=" + zv4.c(zv4.this), vzo.c(zv4.h(zv4.this)), "type=" + trackType.getValue());
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
            sb.append(TrackType.CPC.getValue());
            UserTrackLogs.trackAdLog("cpc_click_fail", "error_code=" + str, "error_msg=" + str2, "clickid=" + zv4.c(zv4.this), sb.toString());
            i4g.a("cpc_click_final_failed", "error_code=" + str, "error_msg=" + str2, "eurl=" + Uri.encode(zv4.a(zv4.this)), "clickid=" + zv4.c(zv4.this), vzo.c(zv4.h(zv4.this)), "type=" + trackType.getValue());
        }
    }
}
