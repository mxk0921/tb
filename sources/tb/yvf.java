package tb;

import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(725614642);
    }

    public static Map<String, String> a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b2e8faf", new Object[]{str, str2, str3});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", BizTaskData.MANUAL_TIME);
        hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, "26607-tracker");
        hashMap.put("code", str);
        hashMap.put("sampling", str3);
        hashMap.put("collection_url", "http://taobao.waitpay.detail");
        hashMap.put("name", "代付款请求页面曝光");
        hashMap.put("native", "1");
        if (str2 != null) {
            try {
                hashMap.put("message", URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    public static void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7236ff3", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("taobao.waitpay.detail", 19999, "/jstracker.3", "", "", a("waitpaydetail_exposure_android", tj.c(map), yzr.a("waitpaydetailExposureSampling", "1"))).build());
        }
    }
}
