package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(785383561);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eecf132b", new Object[0])).longValue();
        }
        return System.currentTimeMillis();
    }

    public static String b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50216637", new Object[]{mtopResponse});
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null && !TextUtils.isEmpty(mtopStat.eagleEyeTraceId)) {
            return mtopStat.eagleEyeTraceId;
        }
        return "";
    }

    public static long c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("180045bb", new Object[]{jSONObject})).longValue();
        }
        String string = jSONObject.getString(SkuLogUtils.P_CART_BTN_CLICK);
        string = jSONObject.getString(SkuLogUtils.P_BUY_BTN_CLICK);
        string = jSONObject.getString(SkuLogUtils.P_SKUBAR_BTN_CLICK);
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
        }
        if (TextUtils.isEmpty(string)) {
        }
        try {
            return Long.parseLong(string);
        } catch (Throwable unused) {
            return -1L;
        }
    }
}
