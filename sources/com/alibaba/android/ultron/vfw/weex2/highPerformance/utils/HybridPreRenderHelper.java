package com.alibaba.android.ultron.vfw.weex2.highPerformance.utils;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.cbv;
import tb.ckf;
import tb.dbv;
import tb.njg;
import tb.t2o;
import tb.v9v;
import tb.z1x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class HybridPreRenderHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final njg f2378a = kotlin.a.b(HybridPreRenderHelper$Companion$useSurfaceView$2.INSTANCE);
    public static final njg b = kotlin.a.b(HybridPreRenderHelper$Companion$enablePreRequestRefund$2.INSTANCE);
    public static final njg c = kotlin.a.b(HybridPreRenderHelper$Companion$enableRefundUseAsync$2.INSTANCE);
    public static final njg d = kotlin.a.b(HybridPreRenderHelper$Companion$enableNativeJSX$2.INSTANCE);
    public static final njg e = kotlin.a.b(HybridPreRenderHelper$Companion$enableLogisticsMapPreRender$2.INSTANCE);
    public static final njg f = kotlin.a.b(HybridPreRenderHelper$Companion$enableLogisticsMemOpt$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286919);
        }

        public a() {
        }

        public final boolean c() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("8ca503e2", new Object[]{this});
            } else {
                value = HybridPreRenderHelper.a().getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        public final boolean d() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("86769763", new Object[]{this});
            } else {
                value = HybridPreRenderHelper.b().getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        public final boolean e() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("52d7e14a", new Object[]{this});
            } else {
                value = HybridPreRenderHelper.c().getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        public final boolean f() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("d9145da8", new Object[]{this});
            } else {
                value = HybridPreRenderHelper.d().getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        public final boolean g() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("fc9b8331", new Object[]{this});
            } else {
                value = HybridPreRenderHelper.e().getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        @JvmStatic
        public final String h(String str, String str2) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6c0ec2a8", new Object[]{this, str, str2});
            }
            if (str == null || str2 == null || str2.length() == 0) {
                return "";
            }
            String p = UltronTradeHybridSwitcherHelper.p(str);
            if (p.length() == 0) {
                return "";
            }
            if (ckf.b(p, UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER)) {
                str3 = "hybridExtraQueryParamsIn" + str2;
            } else {
                str3 = "preRenderExtraQueryParamsIn" + str2;
            }
            String g = v9v.g(p, str3, "");
            return g != null ? g : "";
        }

        public final boolean i() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("75a2edec", new Object[]{this});
            } else {
                value = HybridPreRenderHelper.f().getValue();
            }
            return ((Boolean) value).booleanValue();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ea29619d", new Object[]{this, str, str2});
            }
            ckf.g(str, "oriUrl");
            ckf.g(str2, "extraQueryParamsStr");
            if (str.length() == 0 || str2.length() == 0 || !v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableComposePreRenderUrl", true)) {
                return str;
            }
            try {
                JSONObject parseObject = JSON.parseObject(str2);
                Set<String> keySet = parseObject.keySet();
                ckf.f(keySet, "extraQueryParams.keys");
                if (keySet.isEmpty()) {
                    return str;
                }
                Uri parse = Uri.parse(str);
                Uri.Builder buildUpon = parse.buildUpon();
                buildUpon.clearQuery();
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                    for (String str3 : queryParameterNames) {
                        if (!keySet.contains(str3)) {
                            buildUpon.appendQueryParameter(str3, parse.getQueryParameter(str3));
                        }
                    }
                }
                for (String str4 : keySet) {
                    if (!(str4 == null || str4.length() == 0)) {
                        Object obj = parseObject.get(str4);
                        if (obj instanceof String) {
                            buildUpon.appendQueryParameter(str4, (String) obj);
                        }
                    }
                }
                String builder = buildUpon.toString();
                ckf.f(builder, "uriBuilder.toString()");
                return builder;
            } catch (Throwable th) {
                th.printStackTrace();
                return str;
            }
        }

        @JvmStatic
        public final String b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aeede7b4", new Object[]{this, str, str2});
            }
            if (str2 == null) {
                return "";
            }
            String str3 = "false";
            switch (str2.hashCode()) {
                case -2076803997:
                    if (!str2.equals(dbv.BIZ_LOGISTICS)) {
                        return "";
                    }
                    try {
                        Uri.Builder buildUpon = Uri.parse(dbv.PRE_RENDER_URL_LOGISTICS).buildUpon();
                        if (c()) {
                            buildUpon.appendQueryParameter("preloadMap", "true");
                        } else {
                            buildUpon.appendQueryParameter("preloadMap", str3);
                        }
                        if (d()) {
                            buildUpon.appendQueryParameter("wx_limit_raster_cache", "true");
                        }
                        String h = h(str, str2);
                        String builder = buildUpon.toString();
                        ckf.f(builder, "resUrl.toString()");
                        return a(builder, h);
                    } catch (Throwable unused) {
                        String str4 = dbv.PRE_RENDER_URL_LOGISTICS;
                        ckf.f(str4, "UltronTradeHybridConstan….PRE_RENDER_URL_LOGISTICS");
                        return str4;
                    }
                case -712918345:
                    if (!str2.equals("askList")) {
                        return "";
                    }
                    String h2 = h(str, str2);
                    String str5 = dbv.PRE_RENDER_URL_ASK_LIST;
                    ckf.f(str5, "UltronTradeHybridConstan…r.PRE_RENDER_URL_ASK_LIST");
                    return a(str5, h2);
                case -82300954:
                    if (!str2.equals(dbv.BIZ_REFUND_LIST)) {
                        return "";
                    }
                    try {
                        Uri.Builder buildUpon2 = Uri.parse(cbv.e(dbv.PRE_RENDER_URL_REFUND_LIST)).buildUpon();
                        if (f()) {
                            buildUpon2.appendQueryParameter(z1x.PRE_REQUEST, "true");
                        }
                        if (g()) {
                            buildUpon2.appendQueryParameter(dbv.QUERY_ASYNC_CREATE_INSTANCE, "true");
                        }
                        if (UltronTradeHybridSwitcherHelper.n()) {
                            buildUpon2.appendQueryParameter("hitRefundDetailHybridContainer", "true");
                        }
                        if (UltronTradeHybridSwitcherHelper.l()) {
                            buildUpon2.appendQueryParameter("hitAserver", "true");
                        }
                        if (e()) {
                            str3 = "true";
                        }
                        buildUpon2.appendQueryParameter("wx_use_native_jsx", str3);
                        String h3 = h(str, str2);
                        String builder2 = buildUpon2.toString();
                        ckf.f(builder2, "resUrl.toString()");
                        return a(builder2, h3);
                    } catch (Throwable unused2) {
                        String str6 = dbv.PRE_RENDER_URL_REFUND_LIST;
                        ckf.f(str6, "UltronTradeHybridConstan…RE_RENDER_URL_REFUND_LIST");
                        return str6;
                    }
                case 146909071:
                    if (!str2.equals(dbv.BIZ_ORDER_DETAIL)) {
                        return "";
                    }
                    String h4 = h(str, str2);
                    String str7 = dbv.PRE_RENDER_URL_ORDER_DETAIL;
                    ckf.f(str7, "UltronTradeHybridConstan…E_RENDER_URL_ORDER_DETAIL");
                    return a(str7, h4);
                case 344030109:
                    if (!str2.equals(dbv.BIZ_CONFIRM_GOOD)) {
                        return "";
                    }
                    String h5 = h(str, str2);
                    String str8 = dbv.PRE_RENDER_URL_CONFIRM_GOOD;
                    ckf.f(str8, "UltronTradeHybridConstan…E_RENDER_URL_CONFIRM_GOOD");
                    return a(str8, h5);
                case 421938655:
                    if (!str2.equals(dbv.BIZ_RATE_HOME)) {
                        return "";
                    }
                    String h6 = h(str, str2);
                    String str9 = dbv.PRE_RENDER_URL_RATE_HOME;
                    ckf.f(str9, "UltronTradeHybridConstan….PRE_RENDER_URL_RATE_HOME");
                    return a(str9, h6);
                case 422052254:
                    if (!str2.equals("rateList")) {
                        return "";
                    }
                    String h7 = h(str, str2);
                    String str10 = dbv.PRE_RENDER_URL_RATE_LIST;
                    ckf.f(str10, "UltronTradeHybridConstan….PRE_RENDER_URL_RATE_LIST");
                    return a(str10, h7);
                case 2089042411:
                    if (!str2.equals(dbv.BIZ_PAY_SUCCESS)) {
                        return "";
                    }
                    try {
                        Uri.Builder buildUpon3 = Uri.parse(dbv.PRE_RENDER_URL_PAY_SUCCESS).buildUpon();
                        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_PURCHASE, dbv.QUERY_ASYNC_CREATE_INSTANCE, true)) {
                            buildUpon3.appendQueryParameter(dbv.QUERY_ASYNC_CREATE_INSTANCE, "true");
                        }
                        String h8 = h(str, str2);
                        String builder3 = buildUpon3.toString();
                        ckf.f(builder3, "resUrl.toString()");
                        return a(builder3, h8);
                    } catch (Throwable unused3) {
                        String str11 = dbv.PRE_RENDER_URL_PAY_SUCCESS;
                        ckf.f(str11, "UltronTradeHybridConstan…RE_RENDER_URL_PAY_SUCCESS");
                        return str11;
                    }
                default:
                    return "";
            }
        }
    }

    static {
        t2o.a(157286918);
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("8edcbfb0", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ njg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("1e672a0f", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ njg c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("b9498548", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ njg d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("768787aa", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ njg e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("4a1e4f01", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ njg f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("24f126e6", new Object[0]);
        }
        return f2378a;
    }

    @JvmStatic
    public static final String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea29619d", new Object[]{str, str2});
        }
        return Companion.a(str, str2);
    }

    @JvmStatic
    public static final String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aeede7b4", new Object[]{str, str2});
        }
        return Companion.b(str, str2);
    }

    public static final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc9b8331", new Object[0])).booleanValue();
        }
        return Companion.g();
    }

    @JvmStatic
    public static final String j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c0ec2a8", new Object[]{str, str2});
        }
        return Companion.h(str, str2);
    }
}
