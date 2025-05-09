package tb;

import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.alimama.utils.EnvironmentUtils;
import com.taobao.alimama.utils.UTAppBackgroundTimeoutDetector;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.business.mtop.MunionRemoteBusiness;
import com.taobao.munion.taosdk.MunionUrlBuilder;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dw4 extends MunionRemoteBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ID = "clickid";

    /* renamed from: a  reason: collision with root package name */
    public String f18107a;
    public String b;
    public final boolean c;
    public String d;
    public String e;

    static {
        t2o.a(1017118748);
    }

    public dw4(Application application) {
        this(application, true);
    }

    public static /* synthetic */ Object ipc$super(dw4 dw4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/click/cps/CpsEventCommitter");
    }

    public String commitEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("133d892c", new Object[]{this, str});
        }
        if (str == null || str.trim().length() == 0) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, "广告请求参数或者点击URL为空");
            return "";
        }
        try {
            String str2 = "A22_" + this.e + "_" + vzo.e(this.mApplication);
            HashMap hashMap = new HashMap();
            hashMap.put("ad_cid", vzo.o(str));
            hashMap.put("epid", this.f18107a);
            hashMap.put("uptime", String.valueOf(SystemClock.uptimeMillis() - Global.StartupTime));
            hashMap.put("alitrackid", this.d);
            UserTrackLogs.trackClick(9001, vzo.c(hashMap), str2);
            i4g.a("cps_click_before", vzo.c(hashMap), "clickid=" + str2);
            hashMap.put("redirecturl", this.b);
            UserTrackLogs.trackClick(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, vzo.c(hashMap), str2);
            i4g.a("cps_click_after", vzo.c(hashMap), "clickid=" + str2);
            if (this.c) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("clickid", str2);
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
                if (EnvironmentUtils.isInTaobao() && "on".equals(OrangeConfig.getInstance().getConfig("alimama_ad", "set_ut_tpk_param_switch", "on")) && UTAppBackgroundTimeoutDetector.getInstance().shouldRewriteTpkCache()) {
                    UTAnalytics.getInstance().getDefaultTracker().addTPKCache("adTraceOprId", str2);
                    UTAppBackgroundTimeoutDetector.getInstance().setShouldRewriteTpkCache(false);
                }
            }
            return str2;
        } catch (Exception e) {
            TaoLog.Loge(UserTrackLogs.UT_PAGE_NAME, e.getMessage());
            return "";
        }
    }

    public dw4(Application application, boolean z) {
        super(application);
        this.f18107a = "";
        this.b = "";
        this.d = "";
        this.e = RPCDataItems.CPS;
        this.c = z;
    }

    public Uri commitEvent(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("89baed0a", new Object[]{this, str, uri});
        }
        if (uri != null && uri.isHierarchical()) {
            try {
                this.b = URLEncoder.encode(uri.toString(), "UTF-8");
                String queryParameter = uri.getQueryParameter("epid");
                this.f18107a = queryParameter;
                if (queryParameter == null) {
                    queryParameter = "";
                }
                this.f18107a = queryParameter;
                this.d = uri.getQueryParameter(wll.ALI_TRACK_ID);
                String queryParameter2 = uri.getQueryParameter("eads");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    this.e = queryParameter2;
                }
                yov.c(uri.toString(), "e");
            } catch (Exception unused) {
            }
        }
        return MunionUrlBuilder.appendClickidToTargetUrl(uri, commitEvent(str));
    }
}
