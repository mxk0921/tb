package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tmcs.utils.TmcsOrderParamsHelper;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Set;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class eyt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TMCS_CART_HOST = "cart.m.tmall.com";
    public static final String TMCS_CART_PATH = "/cart/myCart.htm";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
                return;
            }
            RVLLevel rVLLevel = RVLLevel.Info;
            lcn.f(rVLLevel, gyt.TLOG_MODULE, "onPrefetch: " + str + "; " + JSON.toJSONString(hashMap));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements MtopPrefetch.IPrefetchComparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public final boolean a(MtopRequest mtopRequest, MtopRequest mtopRequest2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("98ba5eaa", new Object[]{this, mtopRequest, mtopRequest2})).booleanValue();
            }
            return TextUtils.equals(mtopRequest.getKey(), mtopRequest2.getKey());
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
        public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
            }
            MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
            compareResult.setSame(a(mtopBuilder.getMtopContext().b, mtopBuilder2.getMtopContext().b));
            RVLLevel rVLLevel = RVLLevel.Info;
            lcn.f(rVLLevel, gyt.TLOG_MODULE, "prefetch compare result: " + compareResult.isSame());
            return compareResult;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3a358c", new Object[0]);
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Extend", 2201, "Page_MCFastBuy_Middleware_Expo", null, null, new HashMap()).build());
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e8ec13", new Object[0]);
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Extend", 2201, "Page_MCCart_Middleware_Expo", null, null, new HashMap()).build());
    }

    public static Uri e(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a5295422", new Object[]{intent, str});
        }
        if (intent == null || intent.getData() == null) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Uri data = intent.getData();
        Set<String> queryParameterNames = data.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str2 : queryParameterNames) {
                buildUpon.appendQueryParameter(str2, data.getQueryParameter(str2));
            }
        }
        return buildUpon.build();
    }

    public static void a(zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7e14ad", new Object[]{zmjVar});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.sm.trade.fast.order.build");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(true);
        HashMap hashMap = new HashMap();
        hashMap.put("countryCode", TmcsOrderParamsHelper.d(zmjVar.d()));
        hashMap.put("cartFrom", QueryParamsManager.TMALL_MARKET_CART_FROM);
        hashMap.put(gf0.K_DELIVERY_ID, "");
        hashMap.put("exParams", JSON.toJSONString(TmcsOrderParamsHelper.e(zmjVar.d())));
        mtopRequest.setData(JSON.toJSONString(hashMap));
        lcn.f(RVLLevel.Info, gyt.TLOG_MODULE, "do prefetch");
        MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, zmjVar.d()), mtopRequest).reqMethod(MethodEnum.POST).setUnitStrategy("UNIT_TRADE").setJsonType(JsonTypeEnum.ORIGINALJSON).setConnectionTimeoutMilliSecond(30000).prefetchComparator((MtopPrefetch.IPrefetchComparator) new b()).prefetch(10000L, (MtopPrefetch.IPrefetchCallback) new a()).startRequest();
    }

    public static boolean d(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{intent, zmjVar})).booleanValue();
        }
        if (!q6s.f() || !q6s.e()) {
            intent.setClassName(zmjVar.d(), UltronTradeHybridActivity.class.getName());
            zmjVar.A(true, gyt.class.getSimpleName());
            intent.setData(e(intent, q6s.d()));
            RVLLevel rVLLevel = RVLLevel.Info;
            lcn.f(rVLLevel, gyt.TLOG_MODULE, "intercept to mc weex cart url: " + q6s.d());
            c();
            return true;
        }
        Uri data = intent.getData();
        if (!q6s.g() && data != null && !"mcHome".equals(data.getQueryParameter("sceneFrom"))) {
            a(zmjVar);
        }
        RVLLevel rVLLevel2 = RVLLevel.Info;
        lcn.f(rVLLevel2, gyt.TLOG_MODULE, "intercept to mc fastbuy: " + q6s.c());
        intent.setClassName(zmjVar.d(), UltronTradeHybridActivity.class.getName());
        zmjVar.A(true, gyt.class.getSimpleName());
        intent.setData(e(intent, q6s.c()));
        b();
        return true;
    }
}
