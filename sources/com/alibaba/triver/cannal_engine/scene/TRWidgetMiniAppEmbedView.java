package com.alibaba.triver.cannal_engine.scene;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.app.api.point.app.AppStartPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.widget.event.WebWidgetNestedRenderContainer;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import java.util.HashMap;
import java.util.Map;
import tb.aax;
import tb.fbx;
import tb.fks;
import tb.npt;
import tb.rde;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetMiniAppEmbedView extends BaseEmbedView implements AppResumePoint, AppStartPoint, AppDestroyPoint {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "widget";
    public FragmentActivity b;
    public ViewGroup c;
    public TRWidgetInstance d;
    public WXSDKInstance e;
    public String f;
    public String g;
    public WidgetStartParams h;
    public npt i;
    public String j;
    public Map<String, String> l;

    /* renamed from: a  reason: collision with root package name */
    public final String f2939a = "TRWidgetMiniAppEmbedView";
    public boolean k = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 2123836685) {
                super.l((String) objArr[0], (String) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/scene/TRWidgetMiniAppEmbedView$1");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
            } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMsg", (Object) str2);
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "jsError", jSONObject);
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            super.l(str, str2);
            if (TRWidgetMiniAppEmbedView.this.getOuterPage() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMessage", (Object) str2);
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderError", jSONObject);
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            } else {
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderFinish", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements TRWidgetInstance.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c48665a", new Object[]{this, new Boolean(z)});
            } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() != null) {
                TRWidgetMiniAppEmbedView.access$100(TRWidgetMiniAppEmbedView.this, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements TRWidgetInstance.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
        public void e(fks fksVar, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3608db", new Object[]{this, fksVar, map});
            } else if (!TextUtils.equals(TRWidgetConstant.CL_TRIVER_INITING.f19372a, fksVar.f19372a) && TRWidgetMiniAppEmbedView.this.getOuterPage() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) fksVar.f19372a);
                jSONObject.put("errorMessage", (Object) fksVar.b);
                jSONObject.put("errorActionType", (Object) fksVar.c);
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderError", jSONObject);
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
        public void onRenderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
            } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() != null) {
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderFinish", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements TRWidgetInstance.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.e
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
            } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMsg", (Object) str2);
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "jsError", jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements TRWidgetInstance.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.h
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26d671a6", new Object[]{this, str, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", (Object) str);
            jSONObject2.put("args", (Object) jSONObject);
            TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "apicall", jSONObject2);
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.h
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("795348cd", new Object[]{this, jSONObject});
            } else {
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "widgettouch", jSONObject);
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.h
        public void f(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61a11b61", new Object[]{this, motionEvent});
            } else if (motionEvent != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("eventType", (Object) "click");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", (Object) Float.valueOf(motionEvent.getX()));
                jSONObject2.put("y", (Object) Float.valueOf(motionEvent.getY()));
                jSONObject2.put("identifier", (Object) Integer.valueOf(motionEvent.hashCode()));
                jSONObject.put("detail", (Object) jSONObject2);
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "widgetclick", jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements aax.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.aax.b
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            } else if (TRWidgetMiniAppEmbedView.this.getOuterPage() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) str);
                jSONObject.put("errorMessage", (Object) str2);
                TRWidgetMiniAppEmbedView.access$000(TRWidgetMiniAppEmbedView.this, "renderError", jSONObject);
            }
        }

        @Override // tb.aax.b
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.aax.b
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.aax.b
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements rde.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f2946a;

        public g(TRWidgetMiniAppEmbedView tRWidgetMiniAppEmbedView, BridgeCallback bridgeCallback) {
            this.f2946a = bridgeCallback;
        }

        @Override // tb.rde.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                this.f2946a.sendJSONResponse(jSONObject);
            }
        }
    }

    public static /* synthetic */ void access$000(TRWidgetMiniAppEmbedView tRWidgetMiniAppEmbedView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6c63e2", new Object[]{tRWidgetMiniAppEmbedView, str, jSONObject});
        } else {
            tRWidgetMiniAppEmbedView.e(str, jSONObject);
        }
    }

    public static /* synthetic */ void access$100(TRWidgetMiniAppEmbedView tRWidgetMiniAppEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f65a251", new Object[]{tRWidgetMiniAppEmbedView, new Boolean(z)});
        } else {
            tRWidgetMiniAppEmbedView.f(z);
        }
    }

    public static /* synthetic */ Object ipc$super(TRWidgetMiniAppEmbedView tRWidgetMiniAppEmbedView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        } else if (hashCode == 2111529549) {
            super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/cannal_engine/scene/TRWidgetMiniAppEmbedView");
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d906b3", new Object[]{this, str});
            return;
        }
        this.c = new FrameLayout(this.b);
        RenderContainer renderContainer = new RenderContainer(this.b);
        renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e = new WXSDKInstance(this.b);
        this.c.addView(renderContainer);
        aax.c(renderContainer, this.e, str, new f());
    }

    public final void b() {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac691ac", new Object[]{this});
        } else if (this.l != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.l);
            if (fbx.g(this.b, jSONObject)) {
                jSONObject.put("hasAttached", (Object) Boolean.valueOf(this.k));
                npt nptVar = new npt();
                this.i = nptVar;
                this.c = nptVar.h(jSONObject, this.b, new WebWidgetNestedRenderContainer(this.b, npt.d(jSONObject)), new a());
                f(true);
                return;
            }
            try {
                WidgetStartParams widgetStartParams = (WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class);
                this.h = widgetStartParams;
                widgetStartParams.build();
            } catch (Exception e2) {
                RVLogger.e(this.f2939a, e2);
            }
            if (getOuterPage() == null || !(getOuterPage().getPageContext() instanceof Fragment)) {
                fragment = null;
            } else {
                fragment = (Fragment) getOuterPage().getPageContext();
            }
            this.c = new com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer(this.b, fbx.a(this.h));
            FragmentActivity fragmentActivity = this.b;
            String groupId = this.h.getGroupId();
            TRWidgetInstance tRWidgetInstance = new TRWidgetInstance(fragmentActivity, groupId, "Canal" + this.f);
            this.d = tRWidgetInstance;
            tRWidgetInstance.setAttachStatus(this.k);
            this.d.registerWidgetInitListener(new b());
            this.d.registerWidgetRenderListener(new c());
            this.d.registerWidgetExceptionListener(new d());
            this.d.registerWidgetMonitorListener(new e());
            ((com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer) this.c).setWidget(this.d);
            this.d.setRootContainer((com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer) this.c);
            this.d.setFragment(fragment);
            this.d.render(this.h);
        }
    }

    public final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938441a8", new Object[]{this, map});
        } else if (map == null) {
            RVLogger.e(this.f2939a, "params null");
        } else {
            if (map.get("bridgeId") != null) {
                this.g = map.get("bridgeId");
            }
            if (map.get("renderUrl") != null) {
                this.j = map.get("renderUrl");
            }
            this.l = map;
        }
    }

    public final void d() {
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
            this.b = fragmentActivity;
        }
    }

    public final void e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a3bda9", new Object[]{this, str, jSONObject});
        } else if (getOuterPage() != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("bridgeId", (Object) this.g);
            try {
                sendEvent(str, jSONObject, null);
            } catch (Throwable th) {
                RVLogger.e(this.f2939a, th);
            }
        }
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd03fd91", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("display", (Object) Boolean.valueOf(z));
        e("widgetInit", jSONObject);
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
        return "widget";
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        this.f = str;
        if (this.b == null) {
            return null;
        }
        c(map);
        if (TextUtils.isEmpty(this.j)) {
            b();
        } else {
            a(this.j);
        }
        return this.c;
    }

    @Override // com.alibaba.ariver.app.api.point.app.AppDestroyPoint
    public void onAppDestroy(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ffc9373", new Object[]{this, app});
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
        d();
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.destroy();
        }
        WXSDKInstance wXSDKInstance = this.e;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityDestroy();
        }
        npt nptVar = this.i;
        if (nptVar != null) {
            nptVar.b();
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r9.equals("getMonitorData") == false) goto L_0x003a;
     */
    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceivedMessage(java.lang.String r9, com.alibaba.fastjson.JSONObject r10, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r11) {
        /*
            r8 = this;
            java.lang.String r0 = "detach"
            java.lang.String r1 = "attach"
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            com.android.alibaba.ip.runtime.IpChange r6 = com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x001f
            java.lang.String r0 = "231420a4"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r8
            r1[r4] = r9
            r1[r3] = r10
            r1[r2] = r11
            r6.ipc$dispatch(r0, r1)
            return
        L_0x001f:
            boolean r6 = r1.equals(r9)
            if (r6 == 0) goto L_0x0027
            r8.k = r4
        L_0x0027:
            boolean r6 = r0.equals(r9)
            if (r6 == 0) goto L_0x002f
            r8.k = r5
        L_0x002f:
            r9.hashCode()
            r6 = -1
            int r7 = r9.hashCode()
            switch(r7) {
                case -1407259067: goto L_0x005a;
                case -1335224429: goto L_0x0051;
                case -295960470: goto L_0x0045;
                case 938814190: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r2 = -1
            goto L_0x0062
        L_0x003c:
            java.lang.String r0 = "getMonitorData"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0062
            goto L_0x003a
        L_0x0045:
            java.lang.String r0 = "updateSize"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004f
            goto L_0x003a
        L_0x004f:
            r2 = 2
            goto L_0x0062
        L_0x0051:
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0058
            goto L_0x003a
        L_0x0058:
            r2 = 1
            goto L_0x0062
        L_0x005a:
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0061
            goto L_0x003a
        L_0x0061:
            r2 = 0
        L_0x0062:
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0089;
                case 2: goto L_0x0081;
                case 3: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x0080
        L_0x0066:
            if (r11 != 0) goto L_0x0069
            return
        L_0x0069:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.d
            if (r9 == 0) goto L_0x0074
            com.alibaba.fastjson.JSONObject r9 = r9.getWidgetMonitor()
            r11.sendJSONResponse(r9)
        L_0x0074:
            tb.npt r9 = r8.i
            if (r9 == 0) goto L_0x0080
            com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView$g r10 = new com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView$g
            r10.<init>(r8, r11)
            r9.e(r10)
        L_0x0080:
            return
        L_0x0081:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.d
            if (r9 == 0) goto L_0x0088
            r9.updateSize(r10)
        L_0x0088:
            return
        L_0x0089:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.d
            if (r9 == 0) goto L_0x0090
            r9.onDetach(r10)
        L_0x0090:
            tb.npt r9 = r8.i
            if (r9 == 0) goto L_0x0097
            r9.c()
        L_0x0097:
            return
        L_0x0098:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.d
            if (r9 == 0) goto L_0x009f
            r9.onAttach(r10)
        L_0x009f:
            tb.npt r9 = r8.i
            if (r9 == 0) goto L_0x00a6
            r9.a()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.cannal_engine.scene.TRWidgetMiniAppEmbedView.onReceivedMessage(java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
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
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
        npt nptVar = this.i;
        if (nptVar != null) {
            nptVar.f();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.resume();
        }
        npt nptVar = this.i;
        if (nptVar != null) {
            nptVar.g();
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        try {
            super.onParamChanged(strArr, strArr2);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < strArr.length; i++) {
                hashMap.put(strArr[i], strArr2[i]);
            }
        } catch (Exception e2) {
            RVLogger.e(this.f2939a, "onParamChanged exception:", e2);
        }
    }
}
