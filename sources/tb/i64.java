package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i64 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262756);
    }

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b867a083", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        Application d = mr7.d();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Build.MODEL);
        hashMap.put("osVersion", Build.VERSION.SDK_INT + "");
        hashMap.put("soVersion", "2.0");
        hashMap.put("appReqFrom", "detail");
        hashMap.put("spm-cnt", b5m.K().b());
        hashMap.put("dinamic_v3", "true");
        hashMap.put("newStruct", "true");
        hashMap.put("ttd_ttid", b());
        Boolean bool = Boolean.TRUE;
        Map<String, Boolean> map = DevFeature.mFeature;
        if (bool.equals(map.get(DevFeature.sTryRequestDetail2))) {
            hashMap.put("mockDetailPageVersion", "2.0");
        }
        if (bool.equals(map.get(DevFeature.sTryRequestIndustry))) {
            hashMap.put("mockDetailPageVersion", MainRequestParams.INDUSTRY);
        }
        if (bool.equals(map.get(DevFeature.sCropMtopData))) {
            hashMap.put("reqMergeCropping", "true");
        }
        if (bool.equals(map.get(DevFeature.sForceSku2))) {
            hashMap.put("forbidSku3", "true");
            hashMap.put("forbidSimpleSku", "true");
            hashMap.put("forbidSku35", "true");
            hashMap.put("forbidSkuWeexSku", "true");
        }
        if (bool.equals(map.get(DevFeature.sRequestWithDebugMode))) {
            hashMap.put(Constants.SP_KEY_DEBUG_MODE, "true");
        }
        hashMap.put("finalUltron", "true");
        hashMap.put("ultron2", "true");
        hashMap.put("container_type", "xdetail");
        hashMap.put("videoAutoPlay", String.valueOf(rcw.c(mr7.d())));
        hashMap.put("supportIndustryMainPic", "true");
        hashMap.put("dynamicJsonData", "true");
        hashMap.put("isPadDevice", String.valueOf(nj7.h()));
        hashMap.put("isFoldDevice", String.valueOf(nj7.d()));
        d(hashMap);
        c(d, hashMap);
        return hashMap;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2dace849", new Object[0]);
        }
        String a2 = b5m.M().a();
        String appVersion = b5m.M().getAppVersion();
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(appVersion)) {
            return "600000@tt_detail_android_1.0.0";
        }
        return a2 + "@tt_detail_android_" + appVersion;
    }

    public static void c(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee66bd3", new Object[]{context, map});
            return;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
            map.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, String.valueOf(displayMetrics.widthPixels));
            map.put("screenHeight", String.valueOf(displayMetrics.heightPixels));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3dd146d", new Object[]{map});
            return;
        }
        int i = nj7.a().f26769a;
        if (i == 3) {
            str = "high";
        } else if (i == 2) {
            str = "medium";
        } else {
            str = "low";
        }
        map.put("deviceLevel", str);
    }
}
