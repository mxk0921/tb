package com.alibaba.triver.triver_shop.tbsubscribe;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.weexview.TRNestedRenderContainer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.bqd;
import tb.fmi;
import tb.mmi;
import tb.pwr;
import tb.t2o;
import tb.uqp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EmbedSubscribeView extends BaseEmbedView implements AppResumePoint, AppStartPoint, AppDestroyPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "tb-subscribe-view";

    /* renamed from: a  reason: collision with root package name */
    public FragmentActivity f3356a;
    public FrameLayout b;
    public Map c;
    public String d;
    public volatile boolean e = false;
    public mmi f;
    public uqp g;
    public String h;
    public String i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.fmi
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            try {
                if (obj instanceof String) {
                    JSONObject parseObject = JSON.parseObject(obj.toString());
                    if (TextUtils.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_FOLLOW_SETSTATUS, parseObject.getString("_msg_name"))) {
                        String string = parseObject.getString("status");
                        if (TextUtils.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED, string)) {
                            EmbedSubscribeView.access$000(EmbedSubscribeView.this).g((Object) null);
                        } else if (TextUtils.equals(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_UNFOLLOWED, string)) {
                            EmbedSubscribeView.access$000(EmbedSubscribeView.this).g((Object) null);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements bqd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bqd
        public void b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14a94ff3", new Object[]{this, map});
                return;
            }
            EmbedSubscribeView.access$302(EmbedSubscribeView.this, map);
            EmbedSubscribeView.access$400(EmbedSubscribeView.this);
        }

        @Override // tb.bqd
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e373f147", new Object[]{this, str});
                return;
            }
            EmbedSubscribeView.access$502(EmbedSubscribeView.this, str);
            EmbedSubscribeView.access$600(EmbedSubscribeView.this);
        }

        @Override // tb.bqd
        public void updatePageName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("127f43f4", new Object[]{this, str});
                return;
            }
            EmbedSubscribeView.access$102(EmbedSubscribeView.this, str);
            EmbedSubscribeView.access$200(EmbedSubscribeView.this);
        }
    }

    static {
        t2o.a(766510472);
    }

    public static /* synthetic */ uqp access$000(EmbedSubscribeView embedSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqp) ipChange.ipc$dispatch("4af19735", new Object[]{embedSubscribeView});
        }
        return embedSubscribeView.g;
    }

    public static /* synthetic */ String access$102(EmbedSubscribeView embedSubscribeView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0319500", new Object[]{embedSubscribeView, str});
        }
        embedSubscribeView.d = str;
        return str;
    }

    public static /* synthetic */ void access$200(EmbedSubscribeView embedSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9af3b37", new Object[]{embedSubscribeView});
        } else {
            embedSubscribeView.d();
        }
    }

    public static /* synthetic */ Map access$302(EmbedSubscribeView embedSubscribeView, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("56a704e6", new Object[]{embedSubscribeView, map});
        }
        embedSubscribeView.c = map;
        return map;
    }

    public static /* synthetic */ void access$400(EmbedSubscribeView embedSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6ffc75", new Object[]{embedSubscribeView});
        } else {
            embedSubscribeView.f();
        }
    }

    public static /* synthetic */ String access$502(EmbedSubscribeView embedSubscribeView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce502104", new Object[]{embedSubscribeView, str});
        }
        embedSubscribeView.getClass();
        return str;
    }

    public static /* synthetic */ void access$600(EmbedSubscribeView embedSubscribeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d30bdb3", new Object[]{embedSubscribeView});
        } else {
            embedSubscribeView.e();
        }
    }

    public static /* synthetic */ Object ipc$super(EmbedSubscribeView embedSubscribeView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/tbsubscribe/EmbedSubscribeView");
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4bacea", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return "Page_DingYueShopIndexAll";
        }
        return this.d;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bfc0d0", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (jSONObject.containsKey("subscribeData")) {
                Object obj = jSONObject.get("subscribeData");
                if (obj instanceof String) {
                    JSONObject parseObject = JSON.parseObject((String) obj);
                    this.h = parseObject.getString("weexShopToken");
                    this.i = parseObject.getString("weexShopTabId");
                } else if (obj instanceof JSONObject) {
                    this.h = ((JSONObject) obj).getString("weexShopToken");
                    this.i = ((JSONObject) obj).getString("weexShopTabId");
                }
            }
            if (jSONObject.containsKey("visible")) {
                g(jSONObject.getBooleanValue("visible"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c() {
        FragmentActivity fragmentActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bb14b2f", new Object[]{this});
            return;
        }
        Page page = this.mOuterPage;
        if (page != null && page.getPageContext() != null) {
            Activity activity = this.mOuterPage.getPageContext().getActivity();
            if (activity instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) activity;
            } else {
                fragmentActivity = null;
            }
            this.f3356a = fragmentActivity;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a41a931", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_msg_type", (Object) "aplus.enter");
        jSONObject.put("_msg_token", (Object) this.h);
        jSONObject.put("_msg_source", (Object) this.i);
        jSONObject.put("_msg_target", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("isonepage", (Object) Boolean.TRUE);
        jSONObject2.put("pageName", (Object) a());
        jSONObject.put("pageConfig", (Object) jSONObject2);
        jSONObject.put("params", (Object) this.c);
        mmi mmiVar = this.f;
        if (mmiVar != null) {
            mmiVar.d(jSONObject);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1f64", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_msg_type", (Object) "aplus.updateNextPageProperties");
        jSONObject.put("_msg_token", (Object) this.h);
        jSONObject.put("_msg_source", (Object) this.i);
        jSONObject.put("_msg_target", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        jSONObject.put("pageConfig", (Object) null);
        jSONObject.put("params", (Object) null);
        mmi mmiVar = this.f;
        if (mmiVar != null) {
            mmiVar.d(jSONObject);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cc0311", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_msg_type", (Object) "aplus.updatePageProperties");
        jSONObject.put("_msg_token", (Object) this.h);
        jSONObject.put("_msg_source", (Object) this.i);
        jSONObject.put("_msg_target", (Object) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pageName", (Object) a());
        jSONObject2.put("isonepage", (Object) Boolean.TRUE);
        jSONObject.put("pageConfig", (Object) jSONObject2);
        jSONObject.put("params", (Object) this.c);
        mmi mmiVar = this.f;
        if (mmiVar != null) {
            mmiVar.d(jSONObject);
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c1992b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.e = z;
        uqp uqpVar = this.g;
        if (uqpVar != null) {
            if (z) {
                uqpVar.f();
            } else {
                uqpVar.e();
            }
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return TYPE;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        uqp uqpVar;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        if (this.f3356a == null || (uqpVar = this.g) == null) {
            return null;
        }
        View a2 = uqpVar.a(map);
        parseParams(map);
        if (pwr.b()) {
            frameLayout = new FrameLayout(this.f3356a);
        } else {
            frameLayout = new TRNestedRenderContainer(this.f3356a);
        }
        this.b = frameLayout;
        frameLayout.addView(a2, new FrameLayout.LayoutParams(-1, -1));
        return this.b;
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppDestroyPoint
    public void onAppDestroy(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffc9373", new Object[]{this, app});
            return;
        }
        uqp uqpVar = this.g;
        if (uqpVar != null) {
            uqpVar.d();
            this.g = null;
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppResumePoint
    public void onAppResume(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af37acaa", new Object[]{this, app});
        }
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppStartPoint
    public void onAppStart(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a9c35b", new Object[]{this, app});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        super.onCreate(map);
        try {
            c();
            this.f = new mmi(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext(), "mashop_broadcast", new a());
            this.g = new uqp(this.f3356a, new b());
        } catch (Exception unused) {
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f = null;
        uqp uqpVar = this.g;
        if (uqpVar != null) {
            uqpVar.d();
            this.g = null;
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
        } else if (this.g != null) {
            b(jSONObject);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        } else if (this.g != null) {
            b(jSONObject);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
        } else if (this.g != null && this.e) {
            this.g.e();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        } else if (this.g != null && this.e) {
            this.g.f();
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.f3356a, a());
            Map map = this.c;
            if (map != null && map.size() > 0) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f3356a, this.c);
            }
        }
    }

    public final void parseParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79431965", new Object[]{this, map});
            return;
        }
        try {
            if (map.containsKey("subscribeData")) {
                JSONObject parseObject = JSON.parseObject(map.get("subscribeData"));
                this.h = parseObject.getString("weexShopToken");
                this.i = parseObject.getString("weexShopTabId");
            }
            if (map.containsKey("visible")) {
                g("true".equalsIgnoreCase(map.get("visible")));
            } else {
                this.g.f();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
