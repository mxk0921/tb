package com.taobao.cameralink.miniapp.skincamera;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.tb3dspace.util.TB3DSpace;
import com.taobao.cameralink.manager.Utils;
import com.taobao.cameralink.miniapp.MiniAppContainerView;
import com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView;
import java.util.Map;
import java.util.Objects;
import tb.c2x;
import tb.djb;
import tb.hld;
import tb.mae;
import tb.qn2;
import tb.qz9;
import tb.t2o;
import tb.t4p;
import tb.vbq;
import tb.w2x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class EmbedSkinCameraView extends AbsCLBaseEmbedView implements hld, mae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = EmbedSkinCameraView.class.getSimpleName();
    public static final String TYPE = "iskin-camera";
    private djb backSkinCameraBiz = null;
    private volatile djb currentBiz;
    private JSONObject currentParam;
    private MiniAppContainerView mCameraViewContainer;
    private qz9 mFrontSkinDetectImpl;
    private String mLoadUrl;
    private BroadcastReceiver mTb3dSpaceInstallReceiver;
    private Handler mWorkerHandler;
    private HandlerThread mWorkerThread;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements vbq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f10300a;
        public final /* synthetic */ w2x b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0545a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public class C0546a implements vbq {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0546a() {
                }

                @Override // tb.vbq
                public void onComplete(boolean z, org.json.JSONObject jSONObject) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject});
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("success", (Object) Boolean.TRUE);
                    EmbedSkinCameraView.this.sendEvent("init", jSONObject2, null);
                    if (EmbedSkinCameraView.access$300(EmbedSkinCameraView.this) != null) {
                        EmbedSkinCameraView.access$300(EmbedSkinCameraView.this).u();
                    }
                }
            }

            public RunnableC0545a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c2x c2xVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (EmbedSkinCameraView.access$200(EmbedSkinCameraView.this) == null) {
                    EmbedSkinCameraView embedSkinCameraView = EmbedSkinCameraView.this;
                    MiniAppContainerView access$400 = EmbedSkinCameraView.access$400(EmbedSkinCameraView.this);
                    a aVar = a.this;
                    Activity activity = aVar.f10300a;
                    w2x w2xVar = aVar.b;
                    if (w2xVar == null) {
                        c2xVar = null;
                    } else {
                        c2xVar = w2xVar.f30424a;
                    }
                    EmbedSkinCameraView.access$302(embedSkinCameraView, new qz9(access$400, activity, null, c2xVar));
                }
                EmbedSkinCameraView.access$300(EmbedSkinCameraView.this).B(EmbedSkinCameraView.this);
                EmbedSkinCameraView.access$300(EmbedSkinCameraView.this).v().resumeSkinDetectView(new C0546a());
            }
        }

        public a(Activity activity, w2x w2xVar) {
            this.f10300a = activity;
            this.b = w2xVar;
        }

        @Override // tb.vbq
        public void onComplete(boolean z, org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject});
            } else if (!z) {
                EmbedSkinCameraView.access$000();
            } else {
                EmbedSkinCameraView.access$400(EmbedSkinCameraView.this).post(new RunnableC0545a());
            }
        }
    }

    static {
        t2o.a(394264607);
        t2o.a(394264580);
        t2o.a(394264599);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ void access$100(EmbedSkinCameraView embedSkinCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5735f2", new Object[]{embedSkinCameraView});
        } else {
            embedSkinCameraView.realStartParam();
        }
    }

    public static /* synthetic */ djb access$200(EmbedSkinCameraView embedSkinCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (djb) ipChange.ipc$dispatch("c3873b46", new Object[]{embedSkinCameraView});
        }
        return embedSkinCameraView.currentBiz;
    }

    public static /* synthetic */ qz9 access$300(EmbedSkinCameraView embedSkinCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qz9) ipChange.ipc$dispatch("c2271cf3", new Object[]{embedSkinCameraView});
        }
        return embedSkinCameraView.mFrontSkinDetectImpl;
    }

    public static /* synthetic */ qz9 access$302(EmbedSkinCameraView embedSkinCameraView, qz9 qz9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qz9) ipChange.ipc$dispatch("bc0f8b80", new Object[]{embedSkinCameraView, qz9Var});
        }
        embedSkinCameraView.mFrontSkinDetectImpl = qz9Var;
        return qz9Var;
    }

    public static /* synthetic */ MiniAppContainerView access$400(EmbedSkinCameraView embedSkinCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniAppContainerView) ipChange.ipc$dispatch("16411c92", new Object[]{embedSkinCameraView});
        }
        return embedSkinCameraView.mCameraViewContainer;
    }

    private void addContainerVisibleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad463bcd", new Object[]{this});
            return;
        }
        MiniAppContainerView miniAppContainerView = this.mCameraViewContainer;
        if (miniAppContainerView != null) {
            miniAppContainerView.addVisibleListener(this);
        }
    }

    public static /* synthetic */ Object ipc$super(EmbedSkinCameraView embedSkinCameraView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/cameralink/miniapp/skincamera/EmbedSkinCameraView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4103fb15", new Object[]{this});
            return;
        }
        try {
            try {
                this.mWorkerHandler.removeCallbacksAndMessages(null);
                HandlerThread handlerThread = this.mWorkerThread;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                super.onDestroy();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Exception unused) {
            HandlerThread handlerThread2 = this.mWorkerThread;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceivedRender$3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3266e7", new Object[]{this, jSONObject});
            return;
        }
        try {
            this.currentParam = jSONObject;
            startBizByParam();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$realStartParam$0() {
        w2x w2xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b5c9699", new Object[]{this});
            return;
        }
        try {
            String string = this.currentParam.getString("devicePosition");
            if (string != null) {
                PageContext pageContext = this.mOuterPage.getPageContext();
                Objects.requireNonNull(pageContext);
                Activity activity = pageContext.getActivity();
                String string2 = this.currentParam.getString("loadUrl");
                if (TextUtils.equals(string2, this.mLoadUrl) || TextUtils.isEmpty(string2) || !string2.toLowerCase().startsWith("http")) {
                    w2xVar = null;
                } else {
                    this.mLoadUrl = string2;
                    if (this.currentBiz instanceof w2x) {
                        w2xVar = (w2x) this.currentBiz;
                    } else {
                        if (this.currentBiz != null) {
                            this.currentBiz.stop();
                        }
                        w2xVar = new w2x();
                        w2xVar.f(this, this, activity, this.mCameraViewContainer);
                        this.currentBiz = w2xVar;
                    }
                    w2xVar.h(this.mLoadUrl);
                }
                if (TextUtils.equals(string, "front")) {
                    TB3DSpace.initSkinDetect(new a(activity, w2xVar));
                } else {
                    TextUtils.equals(string, "back");
                }
                if (this.currentBiz != null) {
                    this.currentBiz.a(this.currentParam);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$realStartParam$1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6aae1a", new Object[]{this});
            return;
        }
        try {
            post(new Runnable() { // from class: tb.vb8
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$realStartParam$0();
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0012, B:9:0x001d, B:14:0x002c, B:19:0x0037, B:26:0x0047, B:27:0x004d), top: B:30:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void lambda$stopCurrentBiz$2() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "5ed5c4e"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.alibaba.fastjson.JSONObject r2 = r5.currentParam     // Catch: all -> 0x0035
            java.lang.String r3 = "devicePosition"
            java.lang.String r2 = r2.getString(r3)     // Catch: all -> 0x0035
            if (r2 != 0) goto L_0x001d
            return
        L_0x001d:
            int r3 = r2.hashCode()     // Catch: all -> 0x0035
            r4 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r3 == r4) goto L_0x0037
            r4 = 97705513(0x5d2de29, float:1.9829914E-35)
            if (r3 == r4) goto L_0x002c
            goto L_0x0041
        L_0x002c:
            java.lang.String r3 = "front"
            boolean r2 = r2.equals(r3)     // Catch: all -> 0x0035
            if (r2 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0035:
            r0 = move-exception
            goto L_0x0053
        L_0x0037:
            java.lang.String r0 = "back"
            boolean r0 = r2.equals(r0)     // Catch: all -> 0x0035
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = -1
        L_0x0042:
            if (r0 == 0) goto L_0x004d
            if (r0 == r1) goto L_0x0047
            goto L_0x0056
        L_0x0047:
            tb.djb r0 = r5.backSkinCameraBiz     // Catch: all -> 0x0035
            r0.stop()     // Catch: all -> 0x0035
            goto L_0x0056
        L_0x004d:
            tb.qz9 r0 = r5.mFrontSkinDetectImpl     // Catch: all -> 0x0035
            r0.A()     // Catch: all -> 0x0035
            goto L_0x0056
        L_0x0053:
            r0.printStackTrace()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView.lambda$stopCurrentBiz$2():void");
    }

    private void realStartParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05db190", new Object[]{this});
            return;
        }
        try {
            requestPermission(this.mOuterPage.getPageContext().getActivity(), new Runnable() { // from class: tb.ub8
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$realStartParam$1();
                }
            }, t4p.CAMERA, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        } catch (Throwable th) {
            th.printStackTrace();
            th.toString();
        }
    }

    private void startBizByParam() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7a21ec", new Object[]{this});
        } else if (!qn2.a()) {
            if (this.mTb3dSpaceInstallReceiver == null) {
                this.mTb3dSpaceInstallReceiver = new BroadcastReceiver() { // from class: com.taobao.cameralink.miniapp.skincamera.EmbedSkinCameraView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/cameralink/miniapp/skincamera/EmbedSkinCameraView$1");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent != null) {
                            EmbedSkinCameraView.access$000();
                            if ("TB3DSPACE_INSTALL_SUCCESS".equals(intent.getAction())) {
                                EmbedSkinCameraView.access$100(EmbedSkinCameraView.this);
                            }
                        }
                    }
                };
                LocalBroadcastManager.getInstance(this.mCameraViewContainer.getContext()).registerReceiver(this.mTb3dSpaceInstallReceiver, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
            }
            Nav.from(this.mCameraViewContainer.getContext()).toUri("https://go/installxrspace3d");
        } else {
            realStartParam();
        }
    }

    private void stopCurrentBiz() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585e5903", new Object[]{this});
        } else {
            post(new Runnable() { // from class: tb.xb8
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$stopCurrentBiz$2();
                }
            });
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        try {
            AppContext appContext = this.mOuterApp.getAppContext();
            Objects.requireNonNull(appContext);
            this.mCameraViewContainer = new MiniAppContainerView(appContext.getContext());
            this.mCameraViewContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            addContainerVisibleListener();
            return this.mCameraViewContainer;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
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
            AppContext appContext = this.mOuterApp.getAppContext();
            Objects.requireNonNull(appContext);
            Utils.setApplication(appContext.getContext());
            HandlerThread handlerThread = new HandlerThread("SkinCameraFrameThread");
            this.mWorkerThread = handlerThread;
            handlerThread.start();
            this.mWorkerHandler = new Handler(this.mWorkerThread.getLooper());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        MiniAppContainerView miniAppContainerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (!(this.mTb3dSpaceInstallReceiver == null || (miniAppContainerView = this.mCameraViewContainer) == null)) {
            LocalBroadcastManager.getInstance(miniAppContainerView.getContext()).unregisterReceiver(this.mTb3dSpaceInstallReceiver);
        }
        qz9 qz9Var = this.mFrontSkinDetectImpl;
        if (qz9Var != null) {
            qz9Var.t();
            this.mFrontSkinDetectImpl = null;
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.currentBiz != null) {
            stopCurrentBiz();
            try {
                post(new Runnable() { // from class: tb.wb8
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmbedSkinCameraView.this.lambda$onDestroy$4();
                    }
                });
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
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

    @Override // tb.mae
    public void onHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5669c70", new Object[]{this});
            return;
        }
        try {
            if (this.currentBiz != null) {
                stopCurrentBiz();
            }
        } catch (Throwable th) {
            th.printStackTrace();
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
            return;
        }
        Objects.toString(jSONObject);
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if ("stopCamera".equals(str)) {
            stopCurrentBiz();
        } else if ("startCamera".equals(str)) {
            startBizByParam();
        } else {
            if ("postMessage".equals(str) && (this.currentBiz instanceof w2x)) {
                ((w2x) this.currentBiz).k("ARSkinAnalysis.message", jSONObject);
                return;
            }
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(final JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
            return;
        }
        Objects.toString(jSONObject);
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        try {
            post(new Runnable() { // from class: tb.tb8
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedSkinCameraView.this.lambda$onReceivedRender$3(jSONObject);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // tb.mae
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        try {
            if (!(this.currentBiz == null || this.currentParam == null)) {
                startBizByParam();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
        }
    }

    @Override // tb.hld
    public void post(Runnable runnable) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
        } else if (this.mWorkerHandler != null && this.mWorkerThread.isAlive()) {
            if (Thread.currentThread() == this.mWorkerThread) {
                runnable.run();
            } else {
                this.mWorkerHandler.post(runnable);
            }
        }
    }
}
