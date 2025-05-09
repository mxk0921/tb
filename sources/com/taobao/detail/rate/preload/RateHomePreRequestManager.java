package com.taobao.detail.rate.preload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.abv;
import tb.ckf;
import tb.dbv;
import tb.k75;
import tb.qbv;
import tb.u9v;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/taobao/detail/rate/preload/RateHomePreRequestManager;", "", "<init>", "()V", "Companion", "a", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RateHomePreRequestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AB_COMPONENT = "rate_home_performance_component";
    private static final String AB_ENABLE_NATIVE_JSX = "enable_native_jsx";
    private static final String AB_ENABLE_PRE_REQUEST = "enable_nav_pre_request";
    private static final String AB_MODULE = "rate_home_performance_module";
    public static final a Companion = new a(null);
    private static final String KEY_NAV_PRE_REQUEST = "navPreRequest";
    private static final String KEY_RATE_TAB = "rateTab";
    private static final String RATE_HOME_URL_PATH = "app/mtb/taobao-ugc/rate/home";
    private static final String RATE_TAB_MY_RATE = "2";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public final void a(String str, JSONObject jSONObject, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a0b2712", new Object[]{this, str, jSONObject, str2});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "preRequestParams", (String) jSONObject);
            jSONObject2.put((JSONObject) "storageKey", str);
            jSONObject2.put((JSONObject) "bizName", dbv.BIZ_RATE_HOME);
            jSONObject2.put((JSONObject) "preRequestUniqueKey", str);
            qbv.j().a(UltronTradeHybridStage.ON_NAV, str2, jSONObject2);
        }

        public final JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("7b2f2ab9", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("extParams", (Object) new JSONObject());
            return jSONObject;
        }

        public final JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("6404fcc9", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appName", (Object) "tborder");
            jSONObject.put("appVersion", (Object) k75.VIDEOCONFIG_API_VERSION_3);
            jSONObject.put("asac", (Object) "2A23A16I9YC7QUVMJ8EH2I");
            jSONObject.put("extParams", (Object) new JSONObject());
            jSONObject.put("page", (Object) "1");
            jSONObject.put("tabCode", (Object) "waitRate");
            return jSONObject;
        }

        @TradeHybridCustomAnnotation
        @JvmStatic
        public final void e(Activity activity, String str, String str2, Map<?, ?> map) {
            String str3;
            Uri data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85f70396", new Object[]{this, activity, str, str2, map});
                return;
            }
            Object obj = null;
            Object obj2 = map != null ? map.get("nav_process_param_intent") : null;
            if (obj2 instanceof Intent) {
                obj = obj2;
            }
            Intent intent = (Intent) obj;
            if (intent == null || (data = intent.getData()) == null || (str3 = data.toString()) == null) {
                str3 = "";
            }
            if (g(str3) && intent != null) {
                h(intent);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final JSONObject d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("73e5cb2f", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizCode", (Object) "ali.china.taobao");
            jSONObject.put("pageNum", (Object) "1");
            jSONObject.put("pageSize", (Object) 10);
            jSONObject.put("qualityLevels", (Object) null);
            jSONObject.put("useAllRate", (Object) 1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("request", (Object) jSONObject.toJSONString());
            return jSONObject2;
        }

        @JvmStatic
        public final void h(Intent intent) {
            Uri.Builder buildUpon;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("486fbd87", new Object[]{this, intent});
                return;
            }
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            Uri data = intent.getData();
            String queryParameter = data != null ? data.getQueryParameter(RateHomePreRequestManager.KEY_RATE_TAB) : null;
            if (f()) {
                long currentTimeMillis = System.currentTimeMillis();
                String str = currentTimeMillis + "_rateHomeInfo";
                String str2 = currentTimeMillis + "_rateHomeList";
                a(str, b(), "rate_home_info");
                if (TextUtils.equals(queryParameter, "2")) {
                    a(str2, d(), "rate_home_rated_list");
                } else {
                    a(str2, c(), "rate_home_list");
                }
                Uri data2 = intent.getData();
                if (data2 != null && (buildUpon = data2.buildUpon()) != null) {
                    buildUpon.appendQueryParameter("preRequestUniqueKeyList", str2);
                    buildUpon.appendQueryParameter("preRequestUniqueKeyInfo", str);
                    buildUpon.appendQueryParameter(RateHomePreRequestManager.KEY_NAV_PRE_REQUEST, "true");
                    buildUpon.appendQueryParameter("wx_use_native_jsx", String.valueOf(abv.a(RateHomePreRequestManager.AB_COMPONENT, RateHomePreRequestManager.AB_MODULE, RateHomePreRequestManager.AB_ENABLE_NATIVE_JSX, false)));
                    intent.setData(buildUpon.build());
                }
            }
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2752864", new Object[]{this})).booleanValue();
            }
            return u9v.f("tb_ratepublish_android", "enableRateHomePreRequest", true) && UltronTradeHybridSwitcherHelper.i("rate_home_info", dbv.BIZ_RATE_HOME);
        }

        @JvmStatic
        public final boolean g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("19caf2fe", new Object[]{this, str})).booleanValue();
            }
            ckf.g(str, "url");
            return wsq.O(str, RateHomePreRequestManager.RATE_HOME_URL_PATH, false, 2, null) && f();
        }
    }

    @TradeHybridCustomAnnotation
    @JvmStatic
    public static final void hybridStage(Activity activity, String str, String str2, Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f70396", new Object[]{activity, str, str2, map});
        } else {
            Companion.e(activity, str, str2, map);
        }
    }

    @JvmStatic
    public static final boolean isRateHome(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19caf2fe", new Object[]{str})).booleanValue();
        }
        return Companion.g(str);
    }

    @JvmStatic
    public static final void onNavRateHome(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486fbd87", new Object[]{intent});
        } else {
            Companion.h(intent);
        }
    }
}
