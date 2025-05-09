package com.alibaba.triver.cannal_engine.scene;

import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
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
import com.taobao.themis.widget.event.WebWidgetNestedRenderContainer;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.uc.webview.export.extension.EmbedViewConfig;
import java.io.Serializable;
import java.util.Map;
import tb.aax;
import tb.fbx;
import tb.fks;
import tb.npt;
import tb.rde;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TRWidgetWVEmbedView extends BaseEmbedView implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FragmentActivity mActivity;
    private String mBridgeId;
    private String mRenderUrl;
    private ViewGroup mRootView;
    private WidgetStartParams mStartParams;
    private WXSDKInstance mWeexInstance;
    private npt mWidgetEmbedInstance;
    private TRWidgetInstance mWidgetInstance;
    private String mViewType = "widget";
    private String TAG = "TRWidgetWVEmbedView";
    private String mId = "";
    private boolean hasAttached = false;
    private boolean isThemisWidget = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements rde.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f2947a;

        public a(TRWidgetWVEmbedView tRWidgetWVEmbedView, WVCallBackContext wVCallBackContext) {
            this.f2947a = wVCallBackContext;
        }

        @Override // tb.rde.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                this.f2947a.success(jSONObject.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 2123836685) {
                super.l((String) objArr[0], (String) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/cannal_engine/scene/TRWidgetWVEmbedView$2");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMsg", (Object) str2);
            TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "jsError", jSONObject);
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
            jSONObject.put("widgetId", (Object) jSONObject.getString("widgetId"));
            jSONObject.put("id", (Object) TRWidgetWVEmbedView.access$100(TRWidgetWVEmbedView.this));
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMessage", (Object) str2);
            TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderError", jSONObject);
            TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "onRenderError", jSONObject);
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            } else {
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderFinish", null);
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
            } else if (!TextUtils.equals(TRWidgetConstant.CL_TRIVER_INITING.f19372a, fksVar.f19372a)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("widgetId", (Object) TRWidgetWVEmbedView.access$200(TRWidgetWVEmbedView.this).getWidgetId());
                jSONObject.put("id", (Object) TRWidgetWVEmbedView.access$100(TRWidgetWVEmbedView.this));
                jSONObject.put("errorCode", (Object) fksVar.f19372a);
                jSONObject.put("errorMessage", (Object) fksVar.b);
                jSONObject.put("errorActionType", (Object) fksVar.c);
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderError", jSONObject);
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "onRenderError", jSONObject);
            }
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
        public void onRenderSuccess(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
            } else {
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderFinish", null);
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
            jSONObject.put("errorCode", (Object) str);
            jSONObject.put("errorMsg", (Object) str2);
            TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "jsError", jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements TRWidgetInstance.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.f
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c48665a", new Object[]{this, new Boolean(z)});
            } else {
                TRWidgetWVEmbedView.access$300(TRWidgetWVEmbedView.this, z);
            }
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
            TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "apicall", jSONObject2);
        }

        @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.h
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("795348cd", new Object[]{this, jSONObject});
            } else {
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "widgettouch", jSONObject);
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
                TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "widgetclick", jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements aax.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
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
            TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "renderError", jSONObject);
            TRWidgetWVEmbedView.access$000(TRWidgetWVEmbedView.this, "onRenderError", jSONObject);
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

    public static /* synthetic */ void access$000(TRWidgetWVEmbedView tRWidgetWVEmbedView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a0062d", new Object[]{tRWidgetWVEmbedView, str, jSONObject});
        } else {
            tRWidgetWVEmbedView.sendEventToJS(str, jSONObject);
        }
    }

    public static /* synthetic */ String access$100(TRWidgetWVEmbedView tRWidgetWVEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18168886", new Object[]{tRWidgetWVEmbedView});
        }
        return tRWidgetWVEmbedView.mId;
    }

    public static /* synthetic */ WidgetStartParams access$200(TRWidgetWVEmbedView tRWidgetWVEmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetStartParams) ipChange.ipc$dispatch("768ea036", new Object[]{tRWidgetWVEmbedView});
        }
        return tRWidgetWVEmbedView.mStartParams;
    }

    public static /* synthetic */ void access$300(TRWidgetWVEmbedView tRWidgetWVEmbedView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5739cb78", new Object[]{tRWidgetWVEmbedView, new Boolean(z)});
        } else {
            tRWidgetWVEmbedView.sendWidgetInit(z);
        }
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
        aax.c(renderContainer, this.mWeexInstance, str, new g());
    }

    private void doRenderWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac691ac", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(this.params.mObjectParam);
        boolean g2 = fbx.g(this.mActivity, jSONObject);
        this.isThemisWidget = g2;
        if (g2) {
            this.mWidgetEmbedInstance = new npt();
            jSONObject.put("hasAttached", (Object) Boolean.valueOf(this.hasAttached));
            this.mRootView = this.mWidgetEmbedInstance.h(jSONObject, this.mActivity, new WebWidgetNestedRenderContainer(this.mActivity, npt.d(jSONObject)), new b());
            sendWidgetInit(true);
            return;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class);
        this.mStartParams = widgetStartParams;
        widgetStartParams.build();
        TRWidgetInstance tRWidgetInstance = new TRWidgetInstance(this.mActivity, this.mStartParams.getGroupId());
        this.mWidgetInstance = tRWidgetInstance;
        tRWidgetInstance.setAttachStatus(this.hasAttached);
        this.mWidgetInstance.registerWidgetRenderListener(new c());
        this.mWidgetInstance.registerWidgetExceptionListener(new d());
        this.mWidgetInstance.registerWidgetInitListener(new e());
        this.mWidgetInstance.registerWidgetMonitorListener(new f());
        com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer webWidgetNestedRenderContainer = new com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer(this.mActivity, fbx.a(this.mStartParams));
        this.mRootView = webWidgetNestedRenderContainer;
        webWidgetNestedRenderContainer.setWidget(this.mWidgetInstance);
        this.mWidgetInstance.setRootContainer((com.alibaba.triver.cannal_engine.event.webembed.WebWidgetNestedRenderContainer) this.mRootView);
        this.mWidgetInstance.render(this.mStartParams);
    }

    private void initParams() {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        EmbedViewConfig embedViewConfig = this.params;
        if (embedViewConfig == null || (map = embedViewConfig.mObjectParam) == null) {
            RVLogger.e(this.TAG, "params  null");
            return;
        }
        if (map.get("id") != null) {
            this.mId = this.params.mObjectParam.get("id").toString();
        }
        if (this.params.mObjectParam.get("renderUrl") != null) {
            this.mRenderUrl = this.params.mObjectParam.get("renderUrl").toString();
        }
        if (this.params.mObjectParam.get("bridgeId") != null) {
            this.mBridgeId = this.params.mObjectParam.get("bridgeId").toString();
        }
    }

    public static /* synthetic */ Object ipc$super(TRWidgetWVEmbedView tRWidgetWVEmbedView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/cannal_engine/scene/TRWidgetWVEmbedView");
        }
    }

    private void sendEventToJS(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a3bda9", new Object[]{this, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("bridgeId", (Object) this.mBridgeId);
        WVStandardEventCenter.postNotificationToJS(this.webView, str, jSONObject.toJSONString());
    }

    private void sendWidgetInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd03fd91", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.mId);
        jSONObject.put("display", (Object) Boolean.valueOf(z));
        sendEventToJS("widgetInit", jSONObject);
        sendEventToJS("onWidgetInit", jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r9.equals("getMonitorData") == false) goto L_0x0051;
     */
    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r9, java.lang.String r10, android.taobao.windvane.jsbridge.WVCallBackContext r11) {
        /*
            r8 = this;
            java.lang.String r0 = "detach"
            java.lang.String r1 = "attach"
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            com.android.alibaba.ip.runtime.IpChange r6 = com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0026
            java.lang.String r0 = "bcd41fd1"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r8
            r1[r4] = r9
            r1[r3] = r10
            r1[r2] = r11
            java.lang.Object r9 = r6.ipc$dispatch(r0, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0026:
            boolean r6 = r1.equals(r9)
            if (r6 == 0) goto L_0x002e
            r8.hasAttached = r4
        L_0x002e:
            boolean r6 = r0.equals(r9)
            if (r6 == 0) goto L_0x0036
            r8.hasAttached = r5
        L_0x0036:
            com.alibaba.fastjson.JSONObject r6 = new com.alibaba.fastjson.JSONObject
            r6.<init>()
            com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSON.parseObject(r10)     // Catch: all -> 0x0040
            goto L_0x0046
        L_0x0040:
            r10 = move-exception
            java.lang.String r7 = r8.TAG
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r7, r10)
        L_0x0046:
            r9.hashCode()
            r10 = -1
            int r7 = r9.hashCode()
            switch(r7) {
                case -1407259067: goto L_0x0071;
                case -1335224429: goto L_0x0068;
                case -295960470: goto L_0x005c;
                case 938814190: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            r2 = -1
            goto L_0x0079
        L_0x0053:
            java.lang.String r0 = "getMonitorData"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0079
            goto L_0x0051
        L_0x005c:
            java.lang.String r0 = "updateSize"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0066
            goto L_0x0051
        L_0x0066:
            r2 = 2
            goto L_0x0079
        L_0x0068:
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x006f
            goto L_0x0051
        L_0x006f:
            r2 = 1
            goto L_0x0079
        L_0x0071:
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0078
            goto L_0x0051
        L_0x0078:
            r2 = 0
        L_0x0079:
            switch(r2) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00a4;
                case 2: goto L_0x009c;
                case 3: goto L_0x007d;
                default: goto L_0x007c;
            }
        L_0x007c:
            return r5
        L_0x007d:
            if (r11 != 0) goto L_0x0080
            return r5
        L_0x0080:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.mWidgetInstance
            if (r9 == 0) goto L_0x008f
            com.alibaba.fastjson.JSONObject r9 = r9.getWidgetMonitor()
            java.lang.String r9 = r9.toString()
            r11.success(r9)
        L_0x008f:
            tb.npt r9 = r8.mWidgetEmbedInstance
            if (r9 == 0) goto L_0x009b
            com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView$a r10 = new com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView$a
            r10.<init>(r8, r11)
            r9.e(r10)
        L_0x009b:
            return r4
        L_0x009c:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.mWidgetInstance
            if (r9 == 0) goto L_0x00a3
            r9.updateSize(r6)
        L_0x00a3:
            return r4
        L_0x00a4:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.mWidgetInstance
            if (r9 == 0) goto L_0x00ab
            r9.onDetach(r6)
        L_0x00ab:
            tb.npt r9 = r8.mWidgetEmbedInstance
            if (r9 == 0) goto L_0x00b2
            r9.c()
        L_0x00b2:
            return r4
        L_0x00b3:
            com.alibaba.triver.cannal_engine.TRWidgetInstance r9 = r8.mWidgetInstance
            if (r9 == 0) goto L_0x00ba
            r9.onAttach(r6)
        L_0x00ba:
            tb.npt r9 = r8.mWidgetEmbedInstance
            if (r9 == 0) goto L_0x00c1
            r9.a()
        L_0x00c1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        initParams();
        if (!(context instanceof FragmentActivity)) {
            return null;
        }
        this.mActivity = (FragmentActivity) context;
        if (TextUtils.isEmpty(this.mRenderUrl)) {
            doRenderWidget();
        } else {
            doRenderWeex(this.mRenderUrl);
        }
        return this.mRootView;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return this.mViewType;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
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

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
        npt nptVar = this.mWidgetEmbedInstance;
        if (nptVar != null) {
            nptVar.f();
        }
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TRWidgetInstance tRWidgetInstance = this.mWidgetInstance;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.resume();
        }
        npt nptVar = this.mWidgetEmbedInstance;
        if (nptVar != null) {
            nptVar.g();
        }
    }
}
