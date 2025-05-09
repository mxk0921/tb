package com.alibaba.triver.cannal_engine.scene;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.widget.event.NativeWidgetNestedRenderContainer;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import tb.aax;
import tb.f84;
import tb.fbx;
import tb.fks;
import tb.m09;
import tb.npt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetWXView extends WXComponent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FragmentActivity mActivity;
    private String mRenderUrl;
    private WidgetStartParams mStartParams;
    private WXSDKInstance mWeexInstance;
    private npt mWidgetEmbedInstance;
    private TRWidgetInstance mWidgetInstance;
    private String TAG = "TRWidgetWXView";
    private ViewGroup mRootView = null;
    private boolean hasAttached = false;
    private boolean isThemisWidget = false;

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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/scene/TRWidgetWXView$1");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            String format = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
            jSONObject.put("data", (Object) (format + ":  " + str2));
            jSONObject.put(m09.TASK_TYPE_LEVEL, (Object) "error");
            TRWidgetWXView.access$000(TRWidgetWXView.this, "onDebugLog", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorCode", (Object) str);
            jSONObject2.put("errorMessage", (Object) str2);
            TRWidgetWXView.access$000(TRWidgetWXView.this, "onJsError", jSONObject2);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            super.l(str, str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMessage", (Object) str2);
            TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderError", jSONObject);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            } else {
                TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderFinish", new JSONObject());
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
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("display", (Object) Boolean.valueOf(z));
            TRWidgetWXView.access$000(TRWidgetWXView.this, "onWidgetInit", jSONObject);
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
            } else if (!TextUtils.equals(TRWidgetConstant.CL_TRIVER_INITING.f19372a, fksVar.f19372a)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("errorCode", (Object) fksVar.f19372a);
                jSONObject.put("errorMessage", (Object) fksVar.b);
                jSONObject.put("errorActionType", (Object) fksVar.c);
                jSONObject.put("errorType", (Object) fksVar.d);
                if (fksVar.d.equals("bizError")) {
                    jSONObject.put("bizErrorCode", (Object) Integer.valueOf(fksVar.e));
                    jSONObject.put("bizErrorMessage", (Object) fksVar.f);
                }
                TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderError", jSONObject);
                String access$100 = TRWidgetWXView.access$100(TRWidgetWXView.this);
                RVLogger.e(access$100, "Render ERROR" + fksVar.toString());
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
        public void onRenderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
            } else {
                TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderFinish", new JSONObject());
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
                return;
            }
            JSONObject jSONObject = new JSONObject();
            String format = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
            jSONObject.put("data", (Object) (format + ":  " + str2));
            jSONObject.put(m09.TASK_TYPE_LEVEL, (Object) "error");
            TRWidgetWXView.access$000(TRWidgetWXView.this, "onDebugLog", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorCode", (Object) str);
            jSONObject2.put("errorMessage", (Object) str2);
            TRWidgetWXView.access$000(TRWidgetWXView.this, "onJsError", jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements TRWidgetInstance.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c64d12", new Object[]{this, str});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            String format = new SimpleDateFormat("HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
            jSONObject.put("data", (Object) (format + ":  " + str));
            jSONObject.put(m09.TASK_TYPE_LEVEL, (Object) "info");
            TRWidgetWXView.access$000(TRWidgetWXView.this, "onDebugLog", jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements TRWidgetInstance.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
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
            TRWidgetWXView.access$000(TRWidgetWXView.this, "apicall", jSONObject2);
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.h
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("795348cd", new Object[]{this, jSONObject});
            } else {
                TRWidgetWXView.access$000(TRWidgetWXView.this, "widgettouch", jSONObject);
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
                TRWidgetWXView.access$000(TRWidgetWXView.this, "widgetclick", jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2961a;
        public final /* synthetic */ JSONObject b;

        public g(String str, JSONObject jSONObject) {
            this.f2961a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TRWidgetWXView.this.fireEvent(this.f2961a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class h implements aax.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.aax.b
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMessage", (Object) str2);
            TRWidgetWXView.access$000(TRWidgetWXView.this, "onRenderError", jSONObject);
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

    public TRWidgetWXView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        initParams();
    }

    public static /* synthetic */ void access$000(TRWidgetWXView tRWidgetWXView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7892974", new Object[]{tRWidgetWXView, str, jSONObject});
        } else {
            tRWidgetWXView.fireEventOnMainThread(str, jSONObject);
        }
    }

    public static /* synthetic */ String access$100(TRWidgetWXView tRWidgetWXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76c5316f", new Object[]{tRWidgetWXView});
        }
        return tRWidgetWXView.TAG;
    }

    private void doRenderWeex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d906b3", new Object[]{this, str});
            return;
        }
        this.mRootView = new FrameLayout(this.mActivity);
        RenderContainer renderContainer = new RenderContainer(this.mActivity);
        renderContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mWeexInstance = new WXSDKInstance(this.mActivity);
        this.mRootView.addView(renderContainer);
        aax.c(renderContainer, this.mWeexInstance, str, new h());
    }

    private void doRenderWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac691ac", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(getBasicComponentData().getAttrs());
        boolean g2 = fbx.g(this.mActivity, jSONObject);
        this.isThemisWidget = g2;
        if (g2) {
            npt nptVar = new npt();
            this.mWidgetEmbedInstance = nptVar;
            this.mRootView = nptVar.h(jSONObject, this.mActivity, new NativeWidgetNestedRenderContainer(this.mActivity, npt.d(jSONObject)), new a());
            return;
        }
        try {
            this.mStartParams = ((WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class)).build();
        } catch (Exception e2) {
            RVLogger.e(this.TAG, e2);
        }
        if (TextUtils.isEmpty(this.mStartParams.getWidgetId())) {
            this.mStartParams.setWidgetId(String.valueOf(getBasicComponentData().getAttrs().get("canalId")));
        }
        this.mRootView = new com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer(getContext(), fbx.a(this.mStartParams));
        TRWidgetInstance tRWidgetInstance = new TRWidgetInstance(this.mActivity, this.mStartParams.getGroupId());
        this.mWidgetInstance = tRWidgetInstance;
        tRWidgetInstance.setAttachStatus(this.hasAttached);
        this.mWidgetInstance.setRootContainer((com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer) this.mRootView);
        this.mWidgetInstance.registerWidgetInitListener(new b());
        this.mWidgetInstance.registerWidgetRenderListener(new c());
        this.mWidgetInstance.registerWidgetExceptionListener(new d());
        this.mWidgetInstance.registerWidgetJSLogListener(new e());
        this.mWidgetInstance.registerWidgetMonitorListener(new f());
        this.mWidgetInstance.render(this.mStartParams, TextUtils.equals("canal", getComponentType()));
    }

    private void fireEventOnMainThread(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1b5b39", new Object[]{this, str, jSONObject});
            return;
        }
        g gVar = new g(str, jSONObject);
        if (f84.a() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(gVar);
        } else {
            gVar.run();
        }
    }

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
        } else if (getBasicComponentData() != null && getBasicComponentData().getAttrs().containsKey("renderUrl")) {
            this.mRenderUrl = String.valueOf(getBasicComponentData().getAttrs().get("renderUrl"));
        }
    }

    public static /* synthetic */ Object ipc$super(TRWidgetWXView tRWidgetWXView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -475248713:
                super.onActivityStop();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/scene/TRWidgetWXView");
        }
    }

    @JSMethod
    public void attach(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599bac24", new Object[]{this, jSONObject});
            return;
        }
        this.hasAttached = true;
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.onAttach(jSONObject);
        }
        npt nptVar = this.mWidgetEmbedInstance;
        if (nptVar != null) {
            nptVar.a();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.destroy();
        }
        WXSDKInstance wXSDKInstance = this.mWeexInstance;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityDestroy();
        }
        npt nptVar = this.mWidgetEmbedInstance;
        if (nptVar != null) {
            nptVar.b();
        }
    }

    @JSMethod
    public void detach(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a71db96", new Object[]{this, jSONObject});
            return;
        }
        this.hasAttached = false;
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.onDetach(jSONObject);
        }
        npt nptVar = this.mWidgetEmbedInstance;
        if (nptVar != null) {
            nptVar.c();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public View getHostView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d4389aac", new Object[]{this});
        }
        return this.mRootView;
    }

    @JSMethod
    public void getMonitorData(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31b8ebf3", new Object[]{this, jSCallback});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null && jSCallback != null) {
            jSCallback.invoke(tRWidgetInstance.getWidgetMonitor());
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public View initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d4db689", new Object[]{this, context});
        }
        if (!(context instanceof FragmentActivity)) {
            return this.mRootView;
        }
        this.mActivity = (FragmentActivity) context;
        if (TextUtils.isEmpty(this.mRenderUrl)) {
            doRenderWidget();
        } else {
            doRenderWeex(this.mRenderUrl);
        }
        return this.mRootView;
    }

    @Override // com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
        npt nptVar = this.mWidgetEmbedInstance;
        if (nptVar != null) {
            nptVar.f();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.resume();
        }
        npt nptVar = this.mWidgetEmbedInstance;
        if (nptVar != null) {
            nptVar.g();
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent, tb.yae
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        super.onActivityStop();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.stop();
        }
    }

    @JSMethod
    public void ondestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e97842", new Object[]{this});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.destroy();
        }
        npt nptVar = this.mWidgetEmbedInstance;
        if (nptVar != null) {
            nptVar.b();
        }
    }

    @JSMethod
    public void updateSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1856811", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.updateSize(i, i2);
        }
    }
}
