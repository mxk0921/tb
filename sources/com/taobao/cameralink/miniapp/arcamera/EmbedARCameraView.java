package com.taobao.cameralink.miniapp.arcamera;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
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
import com.taobao.cameralink.miniapp.arcamera.EmbedARCameraView;
import com.taobao.cameralink.miniapp.skincamera.AbsCLBaseEmbedView;
import java.util.Map;
import java.util.Objects;
import tb.djb;
import tb.fx8;
import tb.hld;
import tb.mae;
import tb.qn2;
import tb.t2o;
import tb.t4p;
import tb.vbq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class EmbedARCameraView extends AbsCLBaseEmbedView implements hld, mae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BODYETECTION_BIZ_NAME = "bodyDetection";
    private static final String FACEDETECTION2D_BIZ_NAME = "faceDetection2D";
    private static final String HANDETECTION_BIZ_NAME = "handDetection";
    private static final String IMU_BIZ_NAME = "motionTracking";
    private static final String MARK_BIZ_NAME = "imageTracking";
    private static final String OT_BIZ_NAME = "orientationTracking";
    private static final String TAG = "EmbedARCameraView";
    public static final String TYPE = "ar-camera";
    private volatile djb currentBiz;
    private JSONObject currentParam;
    private MiniAppContainerView mCameraViewContainer;
    private fx8 mFaceDetect2DImpl;
    private BroadcastReceiver mTb3dSpaceInstallReceiver;
    private Handler mWorkerHandler;
    private HandlerThread mWorkerThread;
    private boolean isFrontCamera = false;
    private boolean mIsStarted = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements vbq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.vbq
        public void onComplete(boolean z, org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject});
            } else if (z) {
                EmbedARCameraView.access$000(EmbedARCameraView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10297a;

        public b(boolean z) {
            this.f10297a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            EmbedARCameraView.access$102(EmbedARCameraView.this, new fx8());
            EmbedARCameraView.access$100(EmbedARCameraView.this).K(EmbedARCameraView.access$200(EmbedARCameraView.this));
            EmbedARCameraView.access$100(EmbedARCameraView.this).L(this.f10297a);
            EmbedARCameraView.access$100(EmbedARCameraView.this).s(EmbedARCameraView.access$300(EmbedARCameraView.this), EmbedARCameraView.access$400(EmbedARCameraView.this).getPageContext().getActivity(), EmbedARCameraView.this);
            EmbedARCameraView.access$100(EmbedARCameraView.this).H();
        }
    }

    static {
        t2o.a(394264601);
        t2o.a(394264580);
        t2o.a(394264599);
    }

    public static /* synthetic */ void access$000(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed384c29", new Object[]{embedARCameraView});
        } else {
            embedARCameraView.reaalStartInit();
        }
    }

    public static /* synthetic */ fx8 access$100(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fx8) ipChange.ipc$dispatch("973fdf44", new Object[]{embedARCameraView});
        }
        return embedARCameraView.mFaceDetect2DImpl;
    }

    public static /* synthetic */ fx8 access$102(EmbedARCameraView embedARCameraView, fx8 fx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fx8) ipChange.ipc$dispatch("94ec6a98", new Object[]{embedARCameraView, fx8Var});
        }
        embedARCameraView.mFaceDetect2DImpl = fx8Var;
        return fx8Var;
    }

    public static /* synthetic */ boolean access$200(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88b73c2f", new Object[]{embedARCameraView})).booleanValue();
        }
        return embedARCameraView.isFrontCamera;
    }

    public static /* synthetic */ MiniAppContainerView access$300(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiniAppContainerView) ipChange.ipc$dispatch("6180477b", new Object[]{embedARCameraView});
        }
        return embedARCameraView.mCameraViewContainer;
    }

    public static /* synthetic */ Page access$400(EmbedARCameraView embedARCameraView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Page) ipChange.ipc$dispatch("ab06b2c9", new Object[]{embedARCameraView});
        }
        return embedARCameraView.mOuterPage;
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

    public static /* synthetic */ Object ipc$super(EmbedARCameraView embedARCameraView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/cameralink/miniapp/arcamera/EmbedARCameraView");
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
            PageContext pageContext = this.mOuterPage.getPageContext();
            Objects.requireNonNull(pageContext);
            pageContext.getActivity();
            this.currentParam = jSONObject;
            Log.e("embedARCameraView", "currentParam" + this.currentParam.toJSONString());
            startBizByParam();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reaalStartInit$0(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f42b8b", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            String string = this.currentParam.getString("mode");
            if (string != null) {
                switch (string.hashCode()) {
                    case -1658216142:
                        str = MARK_BIZ_NAME;
                        string.equals(str);
                        break;
                    case -1650677593:
                        str = OT_BIZ_NAME;
                        string.equals(str);
                        break;
                    case 29387002:
                        if (string.equals(FACEDETECTION2D_BIZ_NAME)) {
                            this.mCameraViewContainer.post(new b(z));
                            break;
                        }
                        break;
                    case 358558861:
                        str = IMU_BIZ_NAME;
                        string.equals(str);
                        break;
                    case 1054422742:
                        str = HANDETECTION_BIZ_NAME;
                        string.equals(str);
                        break;
                    case 1284859651:
                        str = BODYETECTION_BIZ_NAME;
                        string.equals(str);
                        break;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reaalStartInit$1(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a9042a", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            post(new Runnable() { // from class: tb.lb8
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$reaalStartInit$0(z);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopCurrentBiz$2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed5c4e", new Object[]{this});
            return;
        }
        try {
            String string = this.currentParam.getString("mode");
            if (string != null) {
                switch (string.hashCode()) {
                    case -1658216142:
                        str = MARK_BIZ_NAME;
                        break;
                    case -1650677593:
                        str = OT_BIZ_NAME;
                        break;
                    case 29387002:
                        str = FACEDETECTION2D_BIZ_NAME;
                        break;
                    case 358558861:
                        str = IMU_BIZ_NAME;
                        break;
                    case 1054422742:
                        str = HANDETECTION_BIZ_NAME;
                        break;
                    case 1284859651:
                        str = BODYETECTION_BIZ_NAME;
                        break;
                    default:
                        return;
                }
                string.equals(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void startBizByParam() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7a21ec", new Object[]{this});
        } else if (!this.mIsStarted) {
            this.mIsStarted = true;
            if (!qn2.a()) {
                if (this.mTb3dSpaceInstallReceiver == null) {
                    this.mTb3dSpaceInstallReceiver = new BroadcastReceiver() { // from class: com.taobao.cameralink.miniapp.arcamera.EmbedARCameraView.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/cameralink/miniapp/arcamera/EmbedARCameraView$1");
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            } else if (intent != null && "TB3DSPACE_INSTALL_SUCCESS".equals(intent.getAction())) {
                                EmbedARCameraView.this.startBizByParamInit();
                            }
                        }
                    };
                    LocalBroadcastManager.getInstance(this.mCameraViewContainer.getContext()).registerReceiver(this.mTb3dSpaceInstallReceiver, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
                }
                Nav.from(this.mCameraViewContainer.getContext()).toUri("https://go/installxrspace3d");
                return;
            }
            startBizByParamInit();
        }
    }

    private void stopCurrentBiz() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585e5903", new Object[]{this});
        } else {
            post(new Runnable() { // from class: tb.nb8
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$stopCurrentBiz$2();
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
            HandlerThread handlerThread = new HandlerThread("ARCameraFrameThread");
            this.mWorkerThread = handlerThread;
            handlerThread.start();
            this.mWorkerHandler = new Handler(this.mWorkerThread.getLooper());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        MiniAppContainerView miniAppContainerView = this.mCameraViewContainer;
        if (miniAppContainerView != null) {
            LocalBroadcastManager.getInstance(miniAppContainerView.getContext()).unregisterReceiver(this.mTb3dSpaceInstallReceiver);
        }
        fx8 fx8Var = this.mFaceDetect2DImpl;
        if (fx8Var != null) {
            fx8Var.o();
            this.mFaceDetect2DImpl = null;
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.currentBiz != null) {
            stopCurrentBiz();
            try {
                post(new Runnable() { // from class: tb.mb8
                    @Override // java.lang.Runnable
                    public final void run() {
                        EmbedARCameraView.this.lambda$onDestroy$4();
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
        } else {
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
        bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        try {
            post(new Runnable() { // from class: tb.ob8
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$onReceivedRender$3(jSONObject);
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

    public void startBizByParamInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b25a89c", new Object[]{this});
        } else {
            TB3DSpace.initSkinDetect(new a());
        }
    }

    private void reaalStartInit() {
        final boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71156360", new Object[]{this});
            return;
        }
        try {
            if (this.currentParam.containsKey("devicePosition")) {
                this.isFrontCamera = "front".equals(this.currentParam.getString("devicePosition"));
            }
            try {
                if (this.currentParam.containsKey("useCapturedImage")) {
                    z = this.currentParam.getBoolean("useCapturedImage").booleanValue();
                }
            } catch (Throwable unused) {
            }
            requestPermission(this.mOuterPage.getPageContext().getActivity(), new Runnable() { // from class: tb.kb8
                @Override // java.lang.Runnable
                public final void run() {
                    EmbedARCameraView.this.lambda$reaalStartInit$1(z);
                }
            }, t4p.CAMERA, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
