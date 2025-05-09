package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.UltronTradeHybridPreRequest;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import tb.fcv;
import tb.jcv;
import tb.pbv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class p9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final jcv f25961a;
    public static final jcv c;
    public static final a Companion = new a(null);
    public static final List<String> b = yz3.l("waitConfirm", "waitSend", "all", "waitPay");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286927);
        }

        public a() {
        }

        public static /* synthetic */ void r(a aVar, String str, String str2, String str3, JSONObject jSONObject, String str4, boolean z, int i, Object obj) {
            String str5;
            String str6;
            String str7;
            String str8;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c3b7605", new Object[]{aVar, str, str2, str3, jSONObject, str4, new Boolean(z), new Integer(i), obj});
                return;
            }
            if ((1 & i) != 0) {
                str5 = "";
            } else {
                str5 = str;
            }
            if ((2 & i) != 0) {
                str6 = "";
            } else {
                str6 = str2;
            }
            if ((4 & i) != 0) {
                str7 = "";
            } else {
                str7 = str3;
            }
            if ((i & 16) != 0) {
                str8 = null;
            } else {
                str8 = str4;
            }
            if ((i & 32) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            aVar.q(str5, str6, str7, jSONObject, str8, z2);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("17fa5968", new Object[]{this});
            }
            long currentTimeMillis = System.currentTimeMillis();
            return "v1-" + s() + '-' + currentTimeMillis;
        }

        @JvmStatic
        public final List<fcv> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("9ad0bd1a", new Object[]{this});
            }
            List<String> n = n();
            ArrayList arrayList = new ArrayList(zz3.q(n, 10));
            for (String str : n) {
                fcv.b i = new fcv.b().b(dbv.BIZ_ORDER_LIST).e(p9b.Companion.d(str)).j(p9b.a()).i(UltronTradeHybridStage.ON_CONTAINER_RESUME);
                fcv.b c = i.c("${enablePreRequestListCode" + str + '}');
                StringBuilder sb = new StringBuilder("${userId}");
                sb.append(str);
                arrayList.add(c.f(sb.toString()).a());
            }
            return arrayList;
        }

        @JvmStatic
        public final fcv f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("ead768ec", new Object[]{this});
            }
            return m(UltronTradeHybridStage.ON_CONTAINER_DESTROY);
        }

        @JvmStatic
        public final fcv l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("b41d3fd0", new Object[]{this});
            }
            return m(UltronTradeHybridStage.ON_CONTAINER_RESUME);
        }

        public final fcv m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("af4aeeda", new Object[]{this, str});
            }
            fcv a2 = new fcv.b().b(ae2.BizKeyRefund).e(k()).j(p9b.c()).i(str).c("${enablePreRequestRefund}").f("first_data").a();
            ckf.f(a2, "UltronTradeHybridPreRequ…\n                .build()");
            return a2;
        }

        public final List<String> n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("14df40f7", new Object[]{this});
            }
            return p9b.b();
        }

        public final String o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dbcc621c", new Object[]{this, new Integer(i)});
            }
            kotlin.text.a.a(16);
            String num = Integer.toString(i ^ ((((int) Math.random()) & 15) >> (i / 4)), 16);
            ckf.f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            return num;
        }

        @JvmStatic
        public final void p(pbv pbvVar, JSONObject jSONObject, String str, boolean z, s5e s5eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("569df9c8", new Object[]{this, pbvVar, jSONObject, str, new Boolean(z), s5eVar});
                return;
            }
            ckf.g(pbvVar, "model");
            UltronTradeHybridPreRequest ultronTradeHybridPreRequest = new UltronTradeHybridPreRequest(pbvVar, jSONObject, s5eVar);
            hav.d("UltronTradeHybrid", "startRequestOnIdle: " + pbvVar.f26004a);
            if (z) {
                ultronTradeHybridPreRequest.c(str);
            } else {
                ultronTradeHybridPreRequest.b(str);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void q(String str, String str2, String str3, JSONObject jSONObject, String str4, boolean z) {
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326d479d", new Object[]{this, str, str2, str3, jSONObject, str4, new Boolean(z)});
                return;
            }
            ckf.g(str, "sceneName");
            ckf.g(str2, "bizName");
            ckf.g(str3, oe3.keyPVUUID);
            ckf.g(jSONObject, "mtopConfig");
            if (str.length() == 0 || str2.length() == 0) {
                hav.d("HybridPreRequestHelper", "startRequestWithoutPreRender:");
                return;
            }
            if (str3.length() == 0) {
                str3 = a();
            }
            try {
                pbv.b bVar = new pbv.b();
                String string = jSONObject.getString("apiMethod");
                if (string == null) {
                    string = "";
                }
                pbv.b c = bVar.c(string);
                String string2 = jSONObject.getString("apiVersion");
                if (string2 == null) {
                    string2 = "1.0";
                }
                pbv.b d = c.d(string2);
                Boolean bool = jSONObject.getBoolean("usePost");
                pbv.b i = d.i(bool != null ? bool.booleanValue() : false);
                Boolean bool2 = jSONObject.getBoolean("allowSwitchToPOST");
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                }
                pbv.b b = i.b(z2);
                String string3 = jSONObject.getString("unitStrategy");
                if (string3 == null) {
                    string3 = "UNIT_TRADE";
                }
                pbv a2 = b.h(string3).e(jSONObject.getJSONObject("data")).a();
                ckf.f(a2, "UltronTradeHybridMTopMod…                 .build()");
                jSONObject.put((JSONObject) "bizName", str2);
                jSONObject.put((JSONObject) "preRequestUniqueKey", str3);
                jcv a3 = new jcv.a().d(str3).a();
                ckf.f(a3, "UltronTradeHybridStorage…                 .build()");
                fcv a4 = new fcv.b().b(str2).e(a2).j(a3).f(str3).a();
                ckf.f(a4, "UltronTradeHybridPreRequ…                 .build()");
                UltronTradeHybridPreRequest ultronTradeHybridPreRequest = new UltronTradeHybridPreRequest(a2, jSONObject, new zbv(str, a4, jSONObject));
                if (z) {
                    ultronTradeHybridPreRequest.c(str4);
                } else {
                    ultronTradeHybridPreRequest.b(str4);
                }
            } catch (Throwable unused) {
            }
        }

        @JvmStatic
        public final fcv b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("a21e0b32", new Object[]{this});
            }
            pbv a2 = new pbv.b().c("mtop.taobao.wdj.list.item.info").d("1.0").i(false).j(false).f(true).g(true).h("UNIT_DEFAULT").e("${preRequestParams}").a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            jcv a3 = new jcv.a().d("${storageKey}").c(v9v.f(u38.NAME_SPACE, "askListStorageExpireDuration", 60000L)).a();
            ckf.f(a3, "UltronTradeHybridStorage…\n                .build()");
            fcv a4 = new fcv.b().b("askList").e(a2).j(a3).f("${storageKey}").i(UltronTradeHybridStage.ON_NAV).h(false).g(HybridPreRenderHelper.Companion.b("ask_list_item_info", "askList")).a();
            ckf.f(a4, "UltronTradeHybridPreRequ…\n                .build()");
            return a4;
        }

        @JvmStatic
        public final fcv c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("41f04afd", new Object[]{this});
            }
            pbv a2 = new pbv.b().c("mtop.taobao.wdj.list.merge.search").d("1.0").i(false).j(false).f(true).g(true).h("UNIT_DEFAULT").e("${preRequestParams}").a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            jcv a3 = new jcv.a().d("${storageKey}").c(v9v.f(u38.NAME_SPACE, "askListStorageExpireDuration", 60000L)).a();
            ckf.f(a3, "UltronTradeHybridStorage…\n                .build()");
            fcv a4 = new fcv.b().b("askList").e(a2).j(a3).f("${storageKey}").i(UltronTradeHybridStage.ON_NAV).h(false).g(HybridPreRenderHelper.Companion.b("ask_list", "askList")).a();
            ckf.f(a4, "UltronTradeHybridPreRequ…\n                .build()");
            return a4;
        }

        public final pbv d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pbv) ipChange.ipc$dispatch("ea655f69", new Object[]{this, str});
            }
            pbv.b h = new pbv.b().c("mtop.taobao.order.queryboughtlistv2").d("1.0").i(true).j(false).f(true).g(true).h("UNIT_TRADE");
            pbv a2 = h.e(JSON.parseObject("{\"OrderType\":\"OrderList\",\"appName\":\"tborder\",\"appVersion\":\"3.0\",\"condition\":\"{\\\"preRequest\\\":\\\"true\\\",\\\"deviceLevel\\\":\\\"low\\\",\\\"inner\\\":\\\"1\\\",\\\"version\\\":\\\"1.0.0\\\"}\",\"exParams\":\"{\\\"inner\\\":\\\"1\\\"}\",\"page\":\"1\",\"tabCode\":\"" + str + "\",\"useV2\":\"true\"}")).a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            return a2;
        }

        @JvmStatic
        public final fcv g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("814ef4bd", new Object[]{this});
            }
            pbv a2 = new pbv.b().c("mtop.taobao.rate.raterinfo.get").d("1.0").i(false).j(false).f(true).g(true).h("UNIT_DEFAULT").e("${preRequestParams}").a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            jcv a3 = new jcv.a().d("${storageKey}").c(v9v.f("tb_ratepublish_android", "rateHomeInfoStorageExpireDuration", 60000L)).a();
            ckf.f(a3, "UltronTradeHybridStorage…\n                .build()");
            fcv a4 = new fcv.b().b(dbv.BIZ_RATE_HOME).e(a2).j(a3).f("${storageKey}").i(UltronTradeHybridStage.ON_NAV).h(false).g(HybridPreRenderHelper.Companion.b("rate_home_info", dbv.BIZ_RATE_HOME)).a();
            ckf.f(a4, "UltronTradeHybridPreRequ…\n                .build()");
            return a4;
        }

        @JvmStatic
        public final fcv h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("21e2d4ad", new Object[]{this});
            }
            pbv a2 = new pbv.b().c("mtop.taobao.rate.portallist.get").d("1.0").i(false).j(false).f(true).g(true).h("UNIT_DEFAULT").e("${preRequestParams}").a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            jcv a3 = new jcv.a().d("${storageKey}").c(v9v.f("tb_ratepublish_android", "rateHomeListStorageExpireDuration", 60000L)).a();
            ckf.f(a3, "UltronTradeHybridStorage…\n                .build()");
            fcv a4 = new fcv.b().b(dbv.BIZ_RATE_HOME).e(a2).j(a3).f("${storageKey}").i(UltronTradeHybridStage.ON_NAV).h(false).g(HybridPreRenderHelper.Companion.b("rate_home_list", dbv.BIZ_RATE_HOME)).a();
            ckf.f(a4, "UltronTradeHybridPreRequ…\n                .build()");
            return a4;
        }

        @JvmStatic
        public final fcv i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("91bdeea9", new Object[]{this});
            }
            pbv a2 = new pbv.b().c("mtop.alibaba.review.buyer.query.my.review").d("1.0").i(false).j(false).f(true).g(true).h("UNIT_DEFAULT").e("${preRequestParams}").a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            jcv a3 = new jcv.a().d("${storageKey}").c(v9v.f("tb_ratepublish_android", "rateHomeListStorageExpireDuration", 60000L)).a();
            ckf.f(a3, "UltronTradeHybridStorage…\n                .build()");
            fcv a4 = new fcv.b().b(dbv.BIZ_RATE_HOME).e(a2).j(a3).f("${storageKey}").i(UltronTradeHybridStage.ON_NAV).h(false).g(HybridPreRenderHelper.Companion.b("rate_home_rated_list", dbv.BIZ_RATE_HOME)).a();
            ckf.f(a4, "UltronTradeHybridPreRequ…\n                .build()");
            return a4;
        }

        @JvmStatic
        public final fcv j(String str) {
            String str2;
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fcv) ipChange.ipc$dispatch("15d16ab4", new Object[]{this, str});
            }
            ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
            pbv.b bVar = new pbv.b();
            if (TextUtils.equals(UltronTradeHybridStage.ON_NAV, str)) {
                str2 = "mtop.taobao.rate.detaillist.get";
            } else {
                str2 = "mtop.taobao.rate.detaillist.preload";
            }
            pbv.b c = bVar.c(str2);
            if (TextUtils.equals(UltronTradeHybridStage.ON_NAV, str)) {
                str3 = j5m.API_VERSION;
            } else {
                str3 = "1.0";
            }
            pbv a2 = c.d(str3).i(true).j(false).f(true).g(true).h("UNIT_DEFAULT").e("${preRequestParams}").a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            jcv a3 = new jcv.a().d("${storageKey}").c(v9v.f(u38.NAME_SPACE, "storageExpireDuration", 300000L)).a();
            ckf.f(a3, "UltronTradeHybridStorage…\n                .build()");
            fcv a4 = new fcv.b().b("rateList").e(a2).j(a3).f("${storageKey}").i(str).d(true).h(false).g(HybridPreRenderHelper.Companion.b("detail", "rateList")).a();
            ckf.f(a4, "UltronTradeHybridPreRequ…\n                .build()");
            return a4;
        }

        public final pbv k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pbv) ipChange.ipc$dispatch("79424ed5", new Object[]{this});
            }
            int e = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "preRequestRefundPageSize", 10);
            pbv.b h = new pbv.b().c("mtop.com.alibaba.refundface2.disputeservice.renderlist.noultron").d("1.0").i(true).j(false).f(true).g(true).h("UNIT_TRADE");
            pbv a2 = h.e(JSON.parseObject("{'curPage':'1','inThirtyDays':'false','pageSize':'" + e + "','terminal':'wireless','preRequest':'true'}")).a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            return a2;
        }

        public final String s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f01cc520", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            int length = "10000000-1000-4000-8000-100000000000".length();
            for (int i = 0; i < length; i++) {
                char charAt = "10000000-1000-4000-8000-100000000000".charAt(i);
                if (charAt == '0') {
                    sb.append(o(0));
                } else if (charAt == '1') {
                    sb.append(o(1));
                } else if (charAt != '8') {
                    sb.append(charAt);
                } else {
                    sb.append(o(8));
                }
            }
            String sb2 = sb.toString();
            ckf.f(sb2, "uuid.toString()");
            return sb2;
        }
    }

    public static final /* synthetic */ jcv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcv) ipChange.ipc$dispatch("37fc1afe", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ List b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc441178", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ jcv c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcv) ipChange.ipc$dispatch("5037554", new Object[0]);
        }
        return f25961a;
    }

    @JvmStatic
    public static final fcv d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcv) ipChange.ipc$dispatch("a21e0b32", new Object[0]);
        }
        return Companion.b();
    }

    @JvmStatic
    public static final fcv e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcv) ipChange.ipc$dispatch("41f04afd", new Object[0]);
        }
        return Companion.c();
    }

    @JvmStatic
    public static final List<fcv> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9ad0bd1a", new Object[0]);
        }
        return Companion.e();
    }

    @JvmStatic
    public static final fcv g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcv) ipChange.ipc$dispatch("ead768ec", new Object[0]);
        }
        return Companion.f();
    }

    @JvmStatic
    public static final fcv h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcv) ipChange.ipc$dispatch("814ef4bd", new Object[0]);
        }
        return Companion.g();
    }

    @JvmStatic
    public static final fcv i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcv) ipChange.ipc$dispatch("21e2d4ad", new Object[0]);
        }
        return Companion.h();
    }

    @JvmStatic
    public static final fcv j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcv) ipChange.ipc$dispatch("91bdeea9", new Object[0]);
        }
        return Companion.i();
    }

    @JvmStatic
    public static final fcv k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcv) ipChange.ipc$dispatch("15d16ab4", new Object[]{str});
        }
        return Companion.j(str);
    }

    @JvmStatic
    public static final fcv l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fcv) ipChange.ipc$dispatch("b41d3fd0", new Object[0]);
        }
        return Companion.l();
    }

    @JvmStatic
    public static final void m(pbv pbvVar, JSONObject jSONObject, String str, boolean z, s5e s5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569df9c8", new Object[]{pbvVar, jSONObject, str, new Boolean(z), s5eVar});
        } else {
            Companion.p(pbvVar, jSONObject, str, z, s5eVar);
        }
    }

    static {
        t2o.a(157286926);
        jcv a2 = new jcv.a().d("first_data").b("none").a();
        ckf.f(a2, "UltronTradeHybridStorage…ONE)\n            .build()");
        f25961a = a2;
        jcv a3 = new jcv.a().d("first_data").b("none").a();
        ckf.f(a3, "UltronTradeHybridStorage…ONE)\n            .build()");
        c = a3;
    }
}
