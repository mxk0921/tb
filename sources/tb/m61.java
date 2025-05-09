package tb;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class m61 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;
    public final String e;
    public final Map<String, String> f;

    /* renamed from: a  reason: collision with root package name */
    public String f23806a = "";
    public String b = "";
    public boolean d = false;

    static {
        t2o.a(1017118728);
    }

    public m61(String str, Map<String, String> map) {
        this.e = str;
        this.f = map;
    }

    public final void b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705afb87", new Object[]{this, uri});
        } else if (uri != null && uri.isHierarchical()) {
            String queryParameter = uri.getQueryParameter(wll.ALI_TRACK_ID);
            this.b = queryParameter;
            if (queryParameter == null) {
                queryParameter = "";
            }
            this.b = queryParameter;
            this.c = queryParameter.startsWith("2:mm");
            this.d = this.b.startsWith("c:mm");
            this.f23806a = uri.toString();
        }
    }

    public String a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2405f36", new Object[]{this});
        }
        String str2 = "";
        if (TextUtils.isEmpty(this.e)) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "广告请求参数或者点击URL为空");
            return str2;
        }
        b(Uri.parse(this.e));
        Map<String, String> map = this.f;
        String str3 = map == null ? null : map.get("eadt");
        if (!TextUtils.isEmpty(str3)) {
            str2 = str3 + "_";
        }
        if (this.c) {
            str = "A220_";
        } else if (this.d) {
            str = "A22C_";
        } else {
            str = "A270_";
        }
        String str4 = str + str2 + vzo.e(Global.getApplication());
        HashMap hashMap = new HashMap();
        hashMap.put("alitrackid", this.b);
        hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
        UserTrackLogs.trackClick(9001, vzo.c(hashMap), str4);
        i4g.a("app_link_click_before", vzo.c(hashMap), "clickid=" + str4);
        Map<String, String> map2 = this.f;
        if (map2 != null && "true".equals(map2.get("isOpenPage"))) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("clickid", str4);
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
            if (EnvironmentUtils.isInTaobao() && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", str4);
                UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
            }
        }
        try {
            this.f23806a = URLEncoder.encode(this.f23806a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("redirecturl", this.f23806a);
        hashMap3.put("alitrackid", this.b);
        UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, vzo.c(hashMap3), str4);
        i4g.a("app_link_click_after", vzo.c(hashMap3), "clickid=", str4);
        return str4;
    }
}
