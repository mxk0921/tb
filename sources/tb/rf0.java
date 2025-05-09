package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.U4Engine;
import com.ut.device.UTDevice;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rf0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "address.AddressUtils";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f27329a;

        public a(int i) {
            this.f27329a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AdapterForTLog.loge(ff0.TAG, "address prefetch delay:" + this.f27329a);
            rf0.A();
        }
    }

    public static void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa2c666", new Object[0]);
            return;
        }
        AdapterForTLog.loge(ff0.TAG, "address prefetch run");
        yox.n(Arrays.asList(h().getString(ff0.SP_KEY_ADDRESS_ZCACHE_LIST, ff0.CONSTANT_ADDRESS_ZCACHE_LIST_DEFAULT).split(";")));
    }

    public static void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b385f5eb", new Object[0]);
            return;
        }
        int e = e("zcache_delay_ms", 30000);
        kst.c(new a(e), e);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a380013d", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        try {
            PositionInfo i = o78.i(context);
            PositionInfo f = o78.f(context);
            AdapterForTLog.loge(TAG, "appendH5UrlParams countryCode = " + i.countryCode + " ipPositionInfo:" + f.countryCode);
            boolean t = t(i);
            if (t) {
                sb.append("isOverseaSite");
                sb.append("=");
                sb.append(t);
            } else if (k("use_ip_judge_country")) {
                sb.append("isOverseaSite");
                sb.append("=");
                sb.append(t(f));
            } else {
                sb.append("isOverseaSite");
                sb.append("=");
                sb.append(t);
            }
            sb.append("&");
            sb.append("country");
            sb.append("=");
            sb.append(i.countryCode);
            sb.append("&");
            sb.append("ipCountry");
            sb.append("=");
            sb.append(f.countryCode);
            return b(str, sb.toString());
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "isOverseaUnSupportByIP error", e);
            return sb.toString();
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecbb59d2", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&" + str2;
        }
        return str + "?" + str2;
    }

    public static String c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0cfb1f7", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(key);
                sb.append("=");
                sb.append(value.toString());
            }
        }
        return sb.toString();
    }

    public static int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55d4a979", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(f(str, String.valueOf(i)));
        } catch (Throwable unused) {
            return i;
        }
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb992dd9", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("receiverAddressConfig", str, str2);
        AdapterForTLog.loge(TAG, "key:" + str + " defValue:" + str2 + " value:" + config);
        return config;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        try {
            int b = qp0.b();
            AdapterForTLog.loge(TAG, "deviceLevel = " + b);
            return b;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static SharedPreferences h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        return ff0.a().getSharedPreferences(ff0.SP_FILE_NAME, 0);
    }

    public static boolean i(String str, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94834ff9", new Object[]{str, new Integer(i)})).booleanValue();
        }
        try {
            long hashCode = UTDevice.getUtdid(ff0.a()).hashCode();
            String userId = Login.getUserId();
            if (!TextUtils.isEmpty(userId)) {
                hashCode = Long.parseLong(userId);
            }
            int e = e(str, i);
            if (hashCode % 10000 < e) {
                z = true;
            } else {
                z = false;
            }
            AdapterForTLog.loge(TAG, "key:" + str + " defValue:" + i + " configValue:" + e + " result:" + z);
            return z;
        } catch (Throwable unused) {
            if (i >= 10000) {
                return true;
            }
            return false;
        }
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ce8e66b", new Object[]{str})).booleanValue();
        }
        return i(str, 10000);
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6407f26e", new Object[]{str})).booleanValue();
        }
        return i(str, -1);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c39b0787", new Object[0])).booleanValue();
        }
        if (Localization.p() || !j("not_cn_use_weex2_list")) {
            return false;
        }
        return true;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3e13c30", new Object[0])).booleanValue();
        }
        boolean k = k("list_optimize");
        boolean d = d("AB_new_address", "optimize", "client_optimze");
        AdapterForTLog.logd(TAG, "isAddressListOptimize open:" + k + " evoHit:" + d);
        return k || d;
    }

    public static boolean o(Context context, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd69eb86", new Object[]{context, str})).booleanValue();
        }
        HashMap hashMap = new HashMap();
        boolean l = l();
        boolean n = n(context);
        hashMap.put("addressListNotCNForceWeex2", String.valueOf(l));
        hashMap.put("addressListOverseaSiteForceWeex2", String.valueOf(n));
        if (!l && !n) {
            boolean p = p();
            hashMap.put("addressListWeex2Url", String.valueOf(p));
            z = p ? ThemisConfig.e(str) : false;
        }
        mtv.c("listWeex2", String.valueOf(z), str, hashMap);
        return z;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb298031", new Object[0])).booleanValue();
        }
        boolean j = j("support_use_new_list");
        boolean j2 = j("useNewListOrange");
        boolean d = d("AB_new_address", WXAddressModule2.PLUGIN_NAME, "useNewList");
        AdapterForTLog.loge(TAG, "useNewList:" + j2 + " evoUseNewList:" + d);
        if (j && (j2 || d)) {
            z = true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("orangeUseH5", String.valueOf(j));
        hashMap.put("useNewList", String.valueOf(j2));
        hashMap.put("evoUseNewList", String.valueOf(d));
        mtv.c("isAddressListWeex2Url", String.valueOf(z), "", hashMap);
        return z;
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9036c67c", new Object[]{context})).booleanValue();
        }
        try {
            PositionInfo f = o78.f(context);
            AdapterForTLog.loge(TAG, "H5EditBlacklist countryCode = " + f.countryCode);
            for (String str : f("address_h5edit_unsupport_country_code", "").split(";")) {
                if (TextUtils.equals(str, f.countryCode)) {
                    return true;
                }
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "H5EditBlacklist error", e);
        }
        AdapterForTLog.logd(TAG, "H5EditBlacklist false");
        return false;
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39ec3854", new Object[]{context})).booleanValue();
        }
        return t(o78.i(context));
    }

    public static boolean t(PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a309a02c", new Object[]{positionInfo})).booleanValue();
        }
        AdapterForTLog.loge(TAG, "isOversea countryCode = " + positionInfo.countryCode);
        boolean o = o78.o(positionInfo.editionCode);
        try {
            for (String str : f("address_exclude_oversea_site", "").split(";")) {
                if (TextUtils.equals(str, positionInfo.countryCode)) {
                    return false;
                }
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "isOversea error", e);
        }
        AdapterForTLog.logd(TAG, "isOversea " + o);
        return o;
    }

    public static boolean u(PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2074337", new Object[]{positionInfo})).booleanValue();
        }
        AdapterForTLog.loge(TAG, "isOversea countryCode = " + positionInfo.countryCode);
        boolean o = o78.o(positionInfo.editionCode);
        if ("MO".equals(positionInfo.countryCode) && k("MO_isNotForigen")) {
            return false;
        }
        if ("HK".equals(positionInfo.countryCode) && k("HK_isNotForigen")) {
            return false;
        }
        AdapterForTLog.logd(TAG, "isOversea " + o);
        return o;
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("768eef32", new Object[]{context})).booleanValue();
        }
        try {
            PositionInfo i = o78.i(context);
            AdapterForTLog.loge(TAG, "H5EditWhiteList countryCode = " + i.countryCode);
            for (String str : f("address_h5edit_support_oversea_code", "").split(";")) {
                if (TextUtils.equals(str, i.countryCode)) {
                    return true;
                }
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "H5EditWhiteList error", e);
        }
        AdapterForTLog.logd(TAG, "H5EditWhiteList false");
        return false;
    }

    public static boolean w() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bc8be6b", new Object[0])).booleanValue();
        }
        try {
            if (U4Engine.isInited()) {
                i = WebView.getCoreType();
            } else {
                i = 2;
            }
            if (2 == i) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "isSystemWebView fail", th);
            return false;
        }
    }

    public static void y(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4758f399", new Object[]{activity});
        } else if (!k("close_act_transparent")) {
            try {
                if (!k("address_autosize")) {
                    d7r.a(activity);
                } else if (Build.VERSION.SDK_INT == 26) {
                    activity.setRequestedOrientation(-1);
                } else {
                    activity.setRequestedOrientation(1);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                AdapterForTLog.loge(TAG, "TBAutoSize.autoSetRequestedOrientation error", th);
            }
            activity.getWindow().setBackgroundDrawableResource(17170445);
        }
    }

    public static String z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bac6fcb0", new Object[]{str});
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return URLEncoder.encode(new String(str.getBytes(), "UTF-8"), "UTF-8");
            }
            return "";
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "urlEncoded error", e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (android.text.TextUtils.equals(r3.getValueAsString("false"), "true") != false) goto L_0x003e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "getAddressEVOValue component:"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.rf0.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0021
            java.lang.String r2 = "a2ab87fa"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r5 = 2
            r4[r5] = r7
            java.lang.Object r5 = r3.ipc$dispatch(r2, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0021:
            com.alibaba.ut.abtest.VariationSet r3 = com.alibaba.ut.abtest.UTABTest.activate(r5, r6)     // Catch: Exception -> 0x003b
            com.alibaba.ut.abtest.Variation r3 = r3.getVariation(r7)     // Catch: Exception -> 0x003b
            if (r3 == 0) goto L_0x003d
            java.lang.String r4 = "false"
            java.lang.String r3 = r3.getValueAsString(r4)     // Catch: Exception -> 0x003b
            java.lang.String r4 = "true"
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch: Exception -> 0x003b
            if (r3 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003b:
            r5 = move-exception
            goto L_0x006a
        L_0x003d:
            r0 = 0
        L_0x003e:
            java.lang.String r1 = "address.AddressUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: Exception -> 0x0068
            r3.<init>(r2)     // Catch: Exception -> 0x0068
            r3.append(r5)     // Catch: Exception -> 0x0068
            java.lang.String r5 = " module="
            r3.append(r5)     // Catch: Exception -> 0x0068
            r3.append(r6)     // Catch: Exception -> 0x0068
            java.lang.String r5 = " key="
            r3.append(r5)     // Catch: Exception -> 0x0068
            r3.append(r7)     // Catch: Exception -> 0x0068
            java.lang.String r5 = " value="
            r3.append(r5)     // Catch: Exception -> 0x0068
            r3.append(r0)     // Catch: Exception -> 0x0068
            java.lang.String r5 = r3.toString()     // Catch: Exception -> 0x0068
            com.taobao.tlog.adapter.AdapterForTLog.loge(r1, r5)     // Catch: Exception -> 0x0068
            goto L_0x006e
        L_0x0068:
            r5 = move-exception
            r1 = r0
        L_0x006a:
            r5.printStackTrace()
            r0 = r1
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rf0.d(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4851bcc5", new Object[]{context})).booleanValue();
        }
        return t(o78.i(context)) && k("oversea_site_use_weex2_list");
    }

    public static boolean q(Activity activity) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e40eef14", new Object[]{activity})).booleanValue();
        }
        try {
            AdapterForTLog.loge(TAG, "isBizIdentityUseH5Edit");
            Intent intent = activity.getIntent();
            if (!(intent == null || (data = intent.getData()) == null)) {
                String queryParameter = data.getQueryParameter("bizIdentity");
                AdapterForTLog.loge(TAG, "isBizIdentityUseH5Edit bizIdentity:" + queryParameter);
                for (String str : f("address_h5edit_support_biz", "onehour_timing").split(";")) {
                    if (TextUtils.equals(str, queryParameter)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "isBizIdentityUseH5Edit error", e);
        }
        AdapterForTLog.logd(TAG, "isBizIdentityUseH5Edit false");
        return false;
    }

    public static boolean x(Activity activity) {
        boolean z = false;
        z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a635e71", new Object[]{activity})).booleanValue();
        }
        boolean j = j("use_h5_containter");
        boolean k = k("useNewEditOrange");
        boolean d = d("AB_new_address_edit", "address_edit", "useNewEdit");
        int g = g();
        boolean z2 = g == 0 || g == 1;
        AdapterForTLog.logd(TAG, "isUseH5Edit orangeUseH5:" + j + "use_use_new_edit:" + k + " evoUseNewEdit:" + d + ",highLevel = " + z2);
        HashMap hashMap = new HashMap();
        hashMap.put("orangeUseH5", String.valueOf(j));
        hashMap.put("use_use_new_edit", String.valueOf(k));
        hashMap.put("evoUseNewEdit", String.valueOf(d));
        hashMap.put("deviceLevel", String.valueOf(g));
        hashMap.put("highLevel", String.valueOf(z2));
        PositionInfo i = o78.i(activity);
        PositionInfo f = o78.f(activity);
        mtv.a(19997, "startJudgeCanEnterNewEdit", null, null, null);
        hashMap.put("sitePositionInfo", i.countryCode);
        hashMap.put("ipPositionInfo", f.countryCode);
        if (!j) {
            return false;
        }
        try {
            Language h = Localization.h();
            AdapterForTLog.loge(TAG, "isUseH5Edit language = " + h.getLanguage());
            z = !Localization.p();
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "isUseH5Edit language error", th);
        }
        String str = "0";
        if (!z && !(z = q(activity))) {
            boolean u = u(i);
            if (u) {
                z = v(activity);
                mtv.a(19997, "supportOversea", mf6.TYPE_SELECTED, z ? "1" : str, null);
            } else {
                boolean k2 = k("use_ip_judge_country");
                hashMap.put("useIpJudgeCountry", String.valueOf(k2));
                if (k2) {
                    u = u(f);
                }
                if (u) {
                    boolean r = r(activity);
                    z = true ^ r;
                    mtv.a(19997, "supportOversea", pod.IP, !r ? "1" : str, null);
                } else {
                    mtv.a(19997, "supportOversea", "ab", "1", null);
                }
            }
        }
        if (z) {
            str = "1";
        }
        mtv.a(19997, "canEnterNewEdit", null, str, hashMap);
        return z;
    }
}
