package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.m;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.uikit.extend.component.TBErrorView;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class b5b extends nv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEHAVIOR = "behavior";
    public static final String CLICK_TAB_BAR_BUTTON = "WV.Event.clickNavigationTabBarButton";
    public static final String COMPENSATE_UPDATE_PAGE_PROPERTIES_PARAMS_ENABLE = "compensatePagePropertiesParamsEnable";
    public static final String CURRENT_TAB_BAR_BUTTON_STATUS = "currentTabBarButtonStatus";
    public static final a Companion = new a(null);
    public static final String ELEME_PREFETCH_ELE_UA = "eLeMePrefetchUa";
    public static final String ELEME_PREFETCH_FIRST_AND_SECOND = "eLeMePrefetchStrategy";
    public static final String ELEME_PREFETCH_FIRST_URL = "eLeMePrefetchFirstUrl";
    public static final String ELEME_PREFETCH_SECOND_URL = "eLeMePrefetchSecondUrl";
    public static final String ELEME_PREFETCH_TTID = "eLeMePrefetchTtid";
    public static final String ENABLE_ELEME_PREFETCH = "enableELeMePrefetch";
    public static final String PAGE_NAME = "pageName";
    public static final String PAGE_PROP = "params";
    public static final String PAGE_SELECTED = "WV.Event.pageSelected";
    public static final String PAGE_UNSELECTED = "WV.Event.pageUnSelected";
    public static final String SCM = "scm";
    public static final String SPM_CNT = "spm-cnt";
    public static final String TAB_PAGE_SPM_CNT = "tabPageSpmCnt";
    public static final String TAG = "WebTabController";
    public static final String UPDATE_PAGE_URL_ENABLE = "updatePageUrlEnable";
    public static final String UPDATE_PAGE_URL_ON_RESUME_ENABLE = "updatePageUrlOnResumeEnable";

    /* renamed from: a  reason: collision with root package name */
    public q1x f16184a;
    public kps b;
    public wsl c;
    public mrm d;
    public boolean e;
    public Context f;
    public JSONObject g;
    public final IMultiTabPerformanceListener h;
    public final IMultiTabStabilityListener i;
    public long j;
    public final fdc k;
    public final String l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(490733570);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements ajd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ajd
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            }
        }

        @Override // tb.ajd
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7e8a42e", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            IMultiTabStabilityListener b = b5b.b(b5b.this);
            if (b != null) {
                b.a(IMultiTabStabilityListener.ON_RENDER, b5b.a(b5b.this), "tmsRenderFail");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c extends TypeReference<Map<String, ? extends String>> {
    }

    static {
        t2o.a(490733569);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5b(fdc fdcVar, String str) {
        super(fdcVar);
        ckf.g(fdcVar, "callBack");
        ckf.g(str, "businessId");
        this.k = fdcVar;
        this.l = str;
        k();
    }

    public static final /* synthetic */ String a(b5b b5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d434709", new Object[]{b5bVar});
        }
        return b5bVar.l;
    }

    public static final /* synthetic */ IMultiTabStabilityListener b(b5b b5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMultiTabStabilityListener) ipChange.ipc$dispatch("dc1c7d88", new Object[]{b5bVar});
        }
        return b5bVar.i;
    }

    public static /* synthetic */ Object ipc$super(b5b b5bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 188604040) {
            super.onStop();
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/HomeWebTabController");
        }
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e5f42d1", new Object[]{this, str, str2});
        }
        if (wsq.O(str, "?", false, 2, null)) {
            return str + '&' + str2;
        }
        return str + f7l.CONDITION_IF + str2;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99943875", new Object[]{this});
        } else if (this.f16184a == null) {
            k();
            fve.e(TAG, "重新初始化引擎");
        }
    }

    public final ajd f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajd) ipChange.ipc$dispatch("6be9f261", new Object[]{this});
        }
        return new b();
    }

    public final String g() {
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this});
        }
        z9c globalExtModel = this.k.getGlobalExtModel();
        if (globalExtModel == null || (e = globalExtModel.e()) == null || (jSONObject = e.getJSONObject("preloadConfig")) == null) {
            return null;
        }
        return jSONObject.getString("bucketId");
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        JSONObject f;
        String string;
        k1x h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        q1x q1xVar = this.f16184a;
        yuv d = (q1xVar == null || (h = q1xVar.h()) == null) ? null : h.d();
        return (d == null || (f = d.f()) == null || (string = f.getString("pageName")) == null || string.length() == 0) ? "Page_HomeSale" : string;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1f1c0ca", new Object[]{this});
        }
        String i = i();
        JSONObject jSONObject = null;
        if (i == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        JSONObject jSONObject2 = this.g;
        if (jSONObject2 != null) {
            if (!jSONObject2.isEmpty()) {
                jSONObject = jSONObject2;
            }
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String encode = URLEncoder.encode(entry.getValue().toString(), "UTF-8");
                    sb.append(entry.getKey() + '=' + encode + '&');
                }
            }
        }
        boolean c2 = zmm.c(i);
        sb.append("isTriggerPreLoad=" + c2 + '&');
        String g = g();
        if (g != null) {
            sb.append("abTestId=" + g + '&');
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "StringBuilder().apply(builderAction).toString()");
        String s0 = wsq.s0(sb2, "&");
        if (s0.length() == 0) {
            return i;
        }
        return c(i, s0);
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66864920", new Object[]{this});
        }
        String l = l();
        if (l == null || l.length() == 0) {
            fve.e(TAG, "webViewUrl == null");
            mdv.INSTANCE.b("getManifestUrl", "pageUrl == null", "", this.l, TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), "");
            return null;
        }
        return l + "&businessId=" + this.l;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        kps kpsVar = this.b;
        if (kpsVar != null) {
            String e = kpsVar.e();
            if (e == null) {
                e = kis.TAO;
            }
            fve.e(TAG, "isOnRocketState，当前的小火箭状态是：".concat(e));
            return TextUtils.equals(e, "rocket");
        }
        ckf.y("mTabBarButtonService");
        throw null;
    }

    public final Uri j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("c39f544a", new Object[]{this});
        }
        String h = h();
        if (h != null && h.length() != 0) {
            return Uri.parse(h);
        }
        fve.e(TAG, "getWebViewUrl finalUrl == null");
        return null;
    }

    public final void k() {
        k1x h;
        jvf b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f599727a", new Object[]{this});
            return;
        }
        q1x q1xVar = new q1x(this.l, this.k.f());
        this.f16184a = q1xVar;
        q1xVar.r(f());
        q1x q1xVar2 = this.f16184a;
        if (q1xVar2 != null && (h = q1xVar2.h()) != null && (b2 = h.b()) != null) {
            fdc fdcVar = this.k;
            q1x q1xVar3 = this.f16184a;
            ckf.d(q1xVar3);
            this.d = new mrm(b2, fdcVar, q1xVar3);
            this.b = new kps(b2, this.k, this);
            this.c = new wsl(b2, this.k, this);
            fve.e(TAG, "初始化引擎");
        }
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("250e7d0c", new Object[]{this});
        }
        JSONObject v = this.k.v(this);
        String c2 = tl4.c(v);
        String a2 = tl4.a(v);
        if (c2 == null || c2.length() == 0) {
            fve.e(TAG, "页面刷新,ssrManifestUrl为空,manifestUrl: " + a2);
        } else if (!z1x.b(TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), z1x.PARSE_MANIFEST_URL)) {
            fve.e(TAG, "页面刷新,uc降级,manifestUrl: " + a2);
        } else {
            fve.e(TAG, "页面刷新,ssrManifestUrl: ".concat(c2));
            return c2;
        }
        return a2;
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d258bfd", new Object[]{this, str});
            return;
        }
        ckf.g(str, "pageUrl");
        String str2 = str + "&businessId=" + this.l;
        String h = h();
        if (h != null && h.length() != 0) {
            String a2 = zhe.INSTANCE.a(h);
            if (TextUtils.equals(str2, h) || TextUtils.equals(a2, str2)) {
                fve.e(TAG, "链接没变化，不预请求了");
                return;
            }
            q1x q1xVar = this.f16184a;
            if (q1xVar != null) {
                q1xVar.n(str2, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
            }
            fve.e(TAG, "preRequest, pageUrl: ".concat(str));
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2f720d", new Object[]{this});
        } else if (!z1x.b(TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), "preloadFirstChunk")) {
            fve.e(TAG, "uc降级不做任何优化");
        } else if (this.e) {
            fve.e(TAG, "预加载时已经进入会场了");
        } else {
            String h = h();
            if (h != null) {
                q1x q1xVar = this.f16184a;
                if (q1xVar != null) {
                    q1xVar.o(h);
                }
                fve.e(TAG, "preloadFirstChunk, pageUrl: ".concat(h));
            }
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        k1x h;
        sxl c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        q1x q1xVar = this.f16184a;
        if (q1xVar != null && (h = q1xVar.h()) != null && (c2 = h.c()) != null) {
            c2.l();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyRefreshPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b07908", new Object[]{this});
            return;
        }
        String i = i();
        if (i != null) {
            q1x q1xVar = this.f16184a;
            if (q1xVar != null) {
                q1xVar.p(i);
            }
            fve.e(TAG, "notifyRefreshPage, pageUrl: ".concat(i));
        }
    }

    public final void o() {
        k1x h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c54485e", new Object[]{this});
            return;
        }
        Uri j = j();
        if (j == null) {
            fve.e(TAG, "updatePageUrl webViewUrl == null");
            return;
        }
        q1x q1xVar = this.f16184a;
        yuv d = (q1xVar == null || (h = q1xVar.h()) == null) ? null : h.d();
        if (d != null) {
            d.m(this.f, j);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        q1x q1xVar = this.f16184a;
        if (q1xVar != null) {
            q1xVar.i(i, i2, intent);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            kps kpsVar = this.b;
            if (kpsVar != null) {
                String e = kpsVar.e();
                if (e == null) {
                    e = kis.TAO;
                }
                jSONObject.put((JSONObject) CURRENT_TAB_BAR_BUTTON_STATUS, e);
                q1x q1xVar = this.f16184a;
                if (q1xVar != null) {
                    q1xVar.g(CLICK_TAB_BAR_BUTTON, jSONObject);
                }
                fve.e(TAG, "发送给前端一个小火箭点击的事件,小火箭的状态是: ".concat(e));
                return;
            }
            ckf.y("mTabBarButtonService");
            throw null;
        } catch (Exception e2) {
            fve.e(TAG, "发送给前端一个小火箭点击的事件出现异常： " + e2);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        k1x h;
        sxl c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        q1x q1xVar = this.f16184a;
        if (!(q1xVar == null || (h = q1xVar.h()) == null || (c2 = h.c()) == null)) {
            IMultiTabPerformanceListener iMultiTabPerformanceListener = this.h;
            c2.j(iMultiTabPerformanceListener != null ? iMultiTabPerformanceListener.a() : null);
        }
        q1x q1xVar2 = this.f16184a;
        if (q1xVar2 != null) {
            q1xVar2.s();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "behavior", "fromTab");
        q1x q1xVar3 = this.f16184a;
        if (q1xVar3 != null) {
            q1xVar3.g(PAGE_SELECTED, jSONObject);
        }
        fve.e(TAG, "onPageSelected，发送选中事件");
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        m d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        q1x q1xVar = this.f16184a;
        if (q1xVar != null) {
            q1xVar.g(PAGE_UNSELECTED, null);
        }
        q1x q1xVar2 = this.f16184a;
        if (q1xVar2 != null) {
            q1xVar2.t();
        }
        IMultiTabPerformanceListener iMultiTabPerformanceListener = this.h;
        if (!(iMultiTabPerformanceListener == null || (d = iMultiTabPerformanceListener.d(this.l)) == null)) {
            d9j.c(TAG, "WebTabController onPageUnSelected: span:" + d);
            q1x q1xVar3 = this.f16184a;
            if (q1xVar3 != null) {
                q1xVar3.q(d);
            }
        }
        fve.e(TAG, "onPageUnSelected，发送离开事件：" + this.h);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        m d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        q1x q1xVar = this.f16184a;
        if (q1xVar != null) {
            q1xVar.j();
        }
        q1x q1xVar2 = this.f16184a;
        if (q1xVar2 != null) {
            q1xVar2.g(PAGE_UNSELECTED, null);
        }
        IMultiTabPerformanceListener iMultiTabPerformanceListener = this.h;
        if (!(iMultiTabPerformanceListener == null || (d = iMultiTabPerformanceListener.d(this.l)) == null)) {
            d9j.c(TAG, "WebTabController onPause: span:" + d);
            q1x q1xVar3 = this.f16184a;
            if (q1xVar3 != null) {
                q1xVar3.q(d);
            }
        }
        fve.e(TAG, "onPause，发送离开事件：" + this.h);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        q1x q1xVar = this.f16184a;
        if (q1xVar != null) {
            q1xVar.l();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        q1x q1xVar = this.f16184a;
        if (q1xVar != null) {
            q1xVar.m();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onTabClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b1a18", new Object[]{this});
        } else {
            this.j = System.currentTimeMillis();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void passThroughData(v7d v7dVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0cdc44", new Object[]{this, v7dVar, str, str2});
            return;
        }
        ckf.g(v7dVar, "data");
        this.g = null;
        if (!this.e) {
            this.g = v7dVar.a();
            return;
        }
        wsl wslVar = this.c;
        if (wslVar != null) {
            wslVar.h(v7dVar.a());
        } else {
            ckf.y("mPassParamsService");
            throw null;
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        k1x h;
        sxl c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View view = null;
        if (!(context instanceof Activity)) {
            mdv mdvVar = mdv.INSTANCE;
            mdvVar.b("ucNotSupport", "contextNotActivity", "context" + context, this.l, TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), "");
            if (!(context instanceof Application)) {
                return new TBErrorView(context);
            }
            return null;
        }
        this.f = context;
        d();
        String h2 = h();
        if (h2 == null || h2.length() == 0) {
            fve.e(TAG, "createView webViewUrl == null");
            return new TBErrorView(context);
        }
        fve.e(TAG, "createView webViewUrl: ".concat(h2));
        this.e = true;
        q1x q1xVar = this.f16184a;
        if (q1xVar != null) {
            view = q1xVar.e((Activity) context, TMSEmbedSolutionType.WEB_SINGLE_PAGE, h2);
        }
        q1x q1xVar2 = this.f16184a;
        if (!(q1xVar2 == null || (h = q1xVar2.h()) == null || (c2 = h.c()) == null)) {
            c2.c(sxl.TAB_CLICKED_TIME, this.j);
        }
        return view;
    }

    public final Map<String, String> e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e309c08b", new Object[]{this, map});
        }
        Uri j = j();
        if (j == null) {
            fve.e(TAG, "compensateUpdatePagePropertiesParams webViewUrl == null");
            return map;
        }
        if (mve.a(COMPENSATE_UPDATE_PAGE_PROPERTIES_PARAMS_ENABLE, true)) {
            String queryParameter = j.getQueryParameter("scm");
            if (queryParameter != null) {
                map.put("scm", queryParameter);
                fve.e(TAG, "compensateUpdatePagePropertiesParams scm:".concat(queryParameter));
            }
            String queryParameter2 = j.getQueryParameter(TAB_PAGE_SPM_CNT);
            if (queryParameter2 != null) {
                map.put("spm-cnt", queryParameter2);
                fve.e(TAG, "compensateUpdatePagePropertiesParams spmCnt: ".concat(queryParameter2));
            }
        }
        return map;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        k1x h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        q1x q1xVar = this.f16184a;
        JSONObject jSONObject = null;
        yuv d = (q1xVar == null || (h = q1xVar.h()) == null) ? null : h.d();
        if (d != null) {
            jSONObject = d.f();
        }
        Map<String, String> hashMap = new HashMap<>();
        if (jSONObject == null) {
            return e(hashMap);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
        if (jSONObject2 != null) {
            Object parseObject = JSON.parseObject(jSONObject2.toJSONString(), new c(), new Feature[0]);
            if (parseObject != null) {
                hashMap = kqu.d(parseObject);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
            }
        }
        if (mve.a(UPDATE_PAGE_URL_ENABLE, false)) {
            o();
            fve.e(TAG, "getUpdatePageProperties，更新页面参数");
        }
        return e(hashMap);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        kps kpsVar = this.b;
        if (kpsVar != null) {
            kpsVar.f();
            wsl wslVar = this.c;
            if (wslVar != null) {
                wslVar.g();
                mrm mrmVar = this.d;
                if (mrmVar != null) {
                    mrmVar.g();
                    q1x q1xVar = this.f16184a;
                    if (q1xVar != null) {
                        q1xVar.f();
                    }
                    this.f16184a = null;
                    this.e = false;
                    fve.e(TAG, "onDestroy");
                    return;
                }
                ckf.y("mPreloadFirstChunkService");
                throw null;
            }
            ckf.y("mPassParamsService");
            throw null;
        }
        ckf.y("mTabBarButtonService");
        throw null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        q1x q1xVar = this.f16184a;
        if (q1xVar != null) {
            q1xVar.k();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "behavior", "fromOther");
        q1x q1xVar2 = this.f16184a;
        if (q1xVar2 != null) {
            q1xVar2.g(PAGE_SELECTED, jSONObject);
        }
        if (mve.a(UPDATE_PAGE_URL_ON_RESUME_ENABLE, false)) {
            o();
            fve.e(TAG, "onResume，更新页面参数");
        }
        fve.e(TAG, "onResume，发送选中事件");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b5b(fdc fdcVar, String str, IMultiTabPerformanceListener iMultiTabPerformanceListener, IMultiTabStabilityListener iMultiTabStabilityListener) {
        this(fdcVar, str);
        ckf.g(fdcVar, "callBack");
        ckf.g(str, "businessId");
        this.h = iMultiTabPerformanceListener;
        this.i = iMultiTabStabilityListener;
    }
}
