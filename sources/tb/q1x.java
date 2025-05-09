package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.export.network.Request;
import android.text.TextUtils;
import android.view.View;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import com.taobao.avplayer.DWLauncher1;
import com.taobao.falco.m;
import com.taobao.infoflow.eleme.ELeMePrefetchMtopBusiness;
import com.taobao.infoflow.webview.WebViewProvider$eLeMeTTid$2;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.UniAppStartParams;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.external.embed.Weex2StartParams;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.util.ReflectUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class q1x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String FAST_PAGE = "pages-fast.m.taobao.com";
    public static final String IS_CAN_PRELOAD_FIRST_CHUNK = "isCanPreloadFirstChunk";
    public static final String IS_CAN_PRE_REQUEST = "isPreRequest";
    public static final String TAG = "WebViewProvider";

    /* renamed from: a  reason: collision with root package name */
    public final k1x f26454a;
    public TMSEmbed b;
    public final bji d;
    public ajd e;
    public final String f;
    public TMSEmbedSolutionType c = TMSEmbedSolutionType.WEB_SINGLE_PAGE;
    public final njg g = kotlin.a.b(WebViewProvider$eLeMeTTid$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(490733615);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(490733614);
    }

    public q1x(String str, Context context) {
        ckf.g(str, "mBusinessId");
        this.f = str;
        this.f26454a = new k1x(str);
        this.d = new bji(context, str);
    }

    public static final /* synthetic */ String a(q1x q1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e02567d8", new Object[]{q1xVar});
        }
        return q1xVar.f;
    }

    public static final /* synthetic */ TMSEmbedSolutionType b(q1x q1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbedSolutionType) ipChange.ipc$dispatch("a962c44b", new Object[]{q1xVar});
        }
        return q1xVar.c;
    }

    public final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6463e7", new Object[]{this, context});
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                new DWLauncher1().init((Application) applicationContext, null);
            }
        } catch (Exception e) {
            fve.e(TAG, "补偿注册播放器" + e);
        }
    }

    public final StartParams d(TMSEmbedSolutionType tMSEmbedSolutionType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StartParams) ipChange.ipc$dispatch("4c38e15f", new Object[]{this, tMSEmbedSolutionType, str});
        }
        int i = r1x.$EnumSwitchMapping$0[tMSEmbedSolutionType.ordinal()];
        if (i == 1) {
            UniAppStartParams uniAppStartParams = new UniAppStartParams();
            uniAppStartParams.setUrl(str);
            return uniAppStartParams;
        } else if (i != 2) {
            WebStartParams webStartParams = new WebStartParams();
            webStartParams.setUrl(str);
            return webStartParams;
        } else {
            Weex2StartParams weex2StartParams = new Weex2StartParams();
            weex2StartParams.setUrl(str);
            return weex2StartParams;
        }
    }

    public final View e(Activity activity, TMSEmbedSolutionType tMSEmbedSolutionType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e99bc69d", new Object[]{this, activity, tMSEmbedSolutionType, str});
        }
        ckf.g(activity, "context");
        ckf.g(tMSEmbedSolutionType, "containerType");
        ckf.g(str, "url");
        fve.e(TAG, "createView url：".concat(str));
        this.c = tMSEmbedSolutionType;
        n(str, tMSEmbedSolutionType);
        c(activity);
        this.f26454a.e(activity, tMSEmbedSolutionType.name(), this.f);
        sxl c = this.f26454a.c();
        if (c != null) {
            c.k(sxl.CREATE_VIEW_TIME);
        }
        TMSEmbed tMSEmbed = new TMSEmbed(activity, this.c);
        this.b = tMSEmbed;
        tMSEmbed.r(new u1x(this.f26454a, str, this.c, this.f, this.e));
        tMSEmbed.i(d(this.c, str));
        tMSEmbed.u();
        return tMSEmbed.h();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.e = null;
        this.f26454a.a();
        this.d.a();
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        }
        fve.e(TAG, "destroy");
    }

    public final void g(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75fd43f", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "event");
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            TMSEmbed.f(tMSEmbed, str, jSONObject, null, 4, null);
        }
        fve.e(TAG, "dispatchEvent,".concat(str));
    }

    public final k1x h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1x) ipChange.ipc$dispatch("d30fc706", new Object[]{this});
        }
        return this.f26454a;
    }

    public final void i(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.l(i, i2, intent);
        }
        fve.e(TAG, "onActivityResult");
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        }
        fve.e(TAG, "onActivityPause");
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.m();
        }
        fve.e(TAG, "onActivityResume");
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.n();
        }
        fve.e(TAG, "onActivityStart");
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.o();
        }
        fve.e(TAG, "onActivityStop");
    }

    public final void q(m mVar) {
        i2c i2cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714c3cd0", new Object[]{this, mVar});
            return;
        }
        ckf.g(mVar, pg1.ATOM_EXT_span);
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null && (i2cVar = (i2c) tMSEmbed.g(i2c.class)) != null) {
            i2cVar.T(mVar);
        }
    }

    public final void r(ajd ajdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2f8511", new Object[]{this, ajdVar});
            return;
        }
        ckf.g(ajdVar, "renderListener");
        this.e = ajdVar;
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112f4c21", new Object[]{this});
            return;
        }
        yuv d = this.f26454a.d();
        if (d != null) {
            d.h();
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.p();
        }
        fve.e(TAG, "viewAppear");
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c023025", new Object[]{this});
            return;
        }
        yuv d = this.f26454a.d();
        if (d != null) {
            d.i();
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.q();
        }
        fve.e(TAG, "viewDisAppear");
    }

    public final Map<String, String> u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a0fbe0f0", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaderConstant.X_TTID, z());
        hashMap.put("x-social-attr", "3");
        String d = mve.d(b5b.ELEME_PREFETCH_ELE_UA, "RenderWay/H5 AppName/h5 UnknownPhone/UnknownPhone,NaN Android/AndroidOS Mobile/2.8.9 DeviceId/a39eca40-9de6-4384-858b-1216eb23c127-1745767494711 channel/miniapp subChannel/miniapp.taobao subSubChannel/miniapp.taobao.et From/miniapp.taobao H5Version/11.22.1 H5Build/18 Latitude/30.281185 Longitude/120.020218 Mozilla/5.0 (Linux; U; Android 15; zh-CN; 24031PN0DC Build/AQ3A.240627.003) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/100.0.4896.58 UWS/5.18.6.0 Mobile Safari/537.36 AliApp(TB/10.48.30.2079) UCBS/2.11.1.1 TTID/600000@taobao_android_10.48.30.2079 WindVane/8.5.0 Themis/1.7.168");
        ckf.f(d, "InfoFlowOrangeConfig.get…ne/8.5.0 Themis/1.7.168\")");
        hashMap.put("x-ele-ua", d);
        hashMap.put("x-decode-ua", "false");
        hashMap.put("x-region-channel", o78.CHINA_MAINLAND);
        hashMap.put("x-app-edition", "UN");
        hashMap.put("is-ele-prefetch", "true");
        hashMap.put("ele-home-url", str);
        return hashMap;
    }

    public final MtopRequest v(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("48d0312", new Object[]{this, str, new Boolean(z)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        if (z) {
            mtopRequest.setApiName(mve.d(b5b.ELEME_PREFETCH_FIRST_URL, "mtop.alsc.eleme.miniapp.homepagev1"));
        } else {
            mtopRequest.setApiName(mve.d(b5b.ELEME_PREFETCH_SECOND_URL, "mtop.alsc.eleme.miniapp.homepagev1"));
        }
        mtopRequest.setVersion("1.0");
        HashMap hashMap = new HashMap();
        if (z) {
            x(str, hashMap);
        } else {
            y(str, hashMap);
        }
        mtopRequest.dataParams = hashMap;
        mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
        return mtopRequest;
    }

    public final void x(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2779774b", new Object[]{this, str, map});
            return;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("longitude");
            if (queryParameter != null) {
                String queryParameter2 = Uri.parse(str).getQueryParameter("latitude");
                if (queryParameter2 != null) {
                    map.put(ParamsConstants.Key.PARAM_SCENE_CODE, "tb_miniapp_hourly_delivery");
                    map.put("needReverseGeoAddress", "1");
                    map.put("pageParams", "{\"specialFrom\":\"miniapp.taobao\"}");
                    map.put("bizInfos", "{\"scene\":\"tbmini:subsidy:homepage\"}");
                    map.put("longitude", queryParameter);
                    map.put("latitude", queryParameter2);
                }
            }
        } catch (Exception e) {
            fve.e(TAG, e.getMessage());
        }
    }

    public final void y(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bea59", new Object[]{this, str, map});
            return;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("longitude");
            if (queryParameter != null) {
                String queryParameter2 = Uri.parse(str).getQueryParameter("latitude");
                if (queryParameter2 != null) {
                    map.put(ParamsConstants.Key.PARAM_SCENE_CODE, "tb_miniapp_hourly_delivery_list");
                    map.put("pageParams", "{\"offset\":0,\"limit\":6,\"queryParams\":\"{\\\"restaurantCategoryIds\\\":\\\"\\\"}\",\"scene\":\"tbmini:subsidy:homepage\"}");
                    map.put("needReverseGeoAddress", "1");
                    map.put("bizInfos", "{\"offset\":0,\"limit\":6,\"queryParams\":\"{\\\"restaurantCategoryIds\\\":\\\"\\\"}\",\"scene\":\"tbmini:subsidy:homepage\"}");
                    map.put("longitude", queryParameter);
                    map.put("latitude", queryParameter2);
                }
            }
        } catch (Exception e) {
            fve.e(TAG, e.getMessage());
        }
    }

    public final String z() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("56680fe", new Object[]{this});
        } else {
            value = this.g.getValue();
        }
        return (String) value;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements ecd {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ TMSEmbedSolutionType b;
        public final /* synthetic */ String c;

        public b(TMSEmbedSolutionType tMSEmbedSolutionType, String str) {
            this.b = tMSEmbedSolutionType;
            this.c = str;
        }

        @Override // tb.ecd
        public final boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("216932e4", new Object[]{this, str, str2})).booleanValue();
            }
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || !TextUtils.equals(new URL(str).getHost(), new URL(str2).getHost())) {
                return false;
            }
            String a2 = zhe.INSTANCE.a(str);
            if (TextUtils.equals(str, str2) || TextUtils.equals(a2, str2)) {
                mdv.INSTANCE.c("preRequestSuccess", q1x.a(q1x.this), this.b, this.c);
                fve.e(q1x.TAG, "命中预请求");
                return true;
            }
            mdv.INSTANCE.b("preRequestFailure", "notHitPreRequest", "没有命中预请求,prefetchUrl：$prefetchUrl", q1x.a(q1x.this), q1x.b(q1x.this).name(), str);
            return false;
        }
    }

    public final void o(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14631297", new Object[]{this, str});
            return;
        }
        ckf.g(str, "webUrl");
        if (!mve.a(IS_CAN_PRELOAD_FIRST_CHUNK, true)) {
            fve.e(TAG, "webViewPerformanceOptimization,orange开关关闭了");
            return;
        }
        try {
            str2 = new URL(str).getHost();
            ckf.f(str2, "URL(webUrl).host");
        } catch (Exception e) {
            fve.e(TAG, "preloadFirstChunk" + e);
            str2 = "";
        }
        if (!TextUtils.equals(str2, "pages-fast.m.taobao.com")) {
            fve.e(TAG, "不是fast请求头链接，不预请求");
            return;
        }
        this.d.b(str);
        mdv.INSTANCE.c("preloadFirstChunk", this.f, this.c, str);
        fve.e(TAG, "webViewPerformanceOptimization,url".concat(str));
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3e5f27", new Object[]{this, str});
            return;
        }
        ckf.g(str, "webUrl");
        StartParams d = d(this.c, str);
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            TMSEmbed.t(tMSEmbed, d, null, 2, null);
        }
        fve.e(TAG, "reloadUrl," + d);
    }

    public final void w(String str, Mtop mtop, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac37827e", new Object[]{this, str, mtop, str2, new Boolean(z)});
            return;
        }
        MtopRequest v = v(str, z);
        if (mtop != null && str2 != null) {
            ELeMePrefetchMtopBusiness eLeMePrefetchMtopBusiness = new ELeMePrefetchMtopBusiness(mtop, v, str2);
            eLeMePrefetchMtopBusiness.prefetchMode(0).reqMethod(MethodEnum.POST);
            eLeMePrefetchMtopBusiness.prefetchComparator((MtopPrefetch.IPrefetchComparator) new a6z());
            eLeMePrefetchMtopBusiness.useWua();
            eLeMePrefetchMtopBusiness.headers(u(str));
            eLeMePrefetchMtopBusiness.prefetch(20000L, (MtopPrefetch.IPrefetchCallback) new gkz());
            eLeMePrefetchMtopBusiness.asyncRequest();
            fve.e(TAG, "触发饿了么预请求 isFirstPage: " + z);
        }
    }

    public final void A(String str, TMSEmbedSolutionType tMSEmbedSolutionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf77e90", new Object[]{this, str, tMSEmbedSolutionType});
            return;
        }
        try {
            if (TextUtils.equals(Uri.parse(str).getQueryParameter("disablePrefetch"), "true")) {
                return;
            }
        } catch (Exception e) {
            fve.e(TAG, e.getMessage());
        }
        if (mve.a(b5b.ENABLE_ELEME_PREFETCH, true)) {
            Mtop instance = Mtop.getInstance("MTOP_ID_ELEME");
            String z = z();
            String d = mve.d(b5b.ELEME_PREFETCH_FIRST_AND_SECOND, "first");
            if (d != null) {
                int hashCode = d.hashCode();
                if (hashCode != -906279820) {
                    if (hashCode != 97440432) {
                        if (hashCode == 1487667291 && d.equals("firstAndSecond")) {
                            w(str, instance, z, true);
                            w(str, instance, z, false);
                            return;
                        }
                    } else if (d.equals("first")) {
                        w(str, instance, z, true);
                        return;
                    }
                } else if (d.equals(c.LOCATION_SECOND)) {
                    w(str, instance, z, false);
                    return;
                }
            }
            w(str, instance, z, true);
        }
    }

    public final void n(String str, TMSEmbedSolutionType tMSEmbedSolutionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712ee74e", new Object[]{this, str, tMSEmbedSolutionType});
            return;
        }
        ckf.g(str, "pageUrl");
        ckf.g(tMSEmbedSolutionType, "solutionType");
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("businessId");
            if (queryParameter != null && tsq.I(queryParameter, "eleme", false, 2, null)) {
                A(str, tMSEmbedSolutionType);
                return;
            }
        } catch (Exception e) {
            fve.e(TAG, e.getMessage());
        }
        if (!z1x.b(TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), z1x.PRE_REQUEST)) {
            fve.e(TAG, "preRequest uc降级不做任何优化");
        } else if (!mve.a(IS_CAN_PRE_REQUEST, true)) {
            fve.e(TAG, "orange开关关闭");
        } else if (!TextUtils.equals(new URL(str).getHost(), "pages-fast.m.taobao.com")) {
            fve.e(TAG, "不是fast请求头链接，不预请求");
        } else {
            Request f = new Request.b().l(str).i("GET").j(new b(tMSEmbedSolutionType, str)).f();
            ckf.f(f, "Request.Builder()\n      …               }).build()");
            android.taobao.windvane.export.network.b.i(f);
            fve.e(TAG, "触发预请求");
        }
    }
}
