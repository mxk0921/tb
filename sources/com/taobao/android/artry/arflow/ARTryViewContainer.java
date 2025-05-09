package com.taobao.android.artry.arflow;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.android.tb3dspace.makeup.XRMakeupView;
import com.taobao.android.tb3dspace.util.TB3DSpace;
import com.taobao.tao.TaoPackageInfo;
import tb.bcq;
import tb.bdq;
import tb.c6a;
import tb.dxv;
import tb.edq;
import tb.gvk;
import tb.pkd;
import tb.rqk;
import tb.t2o;
import tb.ucq;
import tb.vbq;
import tb.xao;
import tb.xcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ARTryViewContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ARTryViewContainer";
    private static int mSessionId = -100;
    private static edq mSplitInstallStateUpdatedListener;
    private ARTryJSFlowForMiniApp mARTryJSFlowForMiniApp;
    private String mBizUrl;
    private String mCurrentGraphType;
    private boolean mInitARSimplestGraph = false;
    private boolean mForbidSimplestGraph = true;
    private long mSimpleGraphStartDuration = -1;
    private long mSimpleGraphStartStartLoadingTime = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements pkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pkd f6368a;

        public a(pkd pkdVar) {
            this.f6368a = pkdVar;
        }

        @Override // tb.pkd
        public void sendResult(boolean z, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
                return;
            }
            pkd pkdVar = this.f6368a;
            if (pkdVar != null) {
                pkdVar.sendResult(z, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements ARTryJSFlowForMiniApp.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6369a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ c6a c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.artry.arflow.ARTryViewContainer$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class C0331a implements vbq {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0331a() {
                }

                @Override // tb.vbq
                public void onComplete(boolean z, org.json.JSONObject jSONObject) {
                    ResultCode resultCode;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject});
                        return;
                    }
                    b.this.c.addExtraParam("info", jSONObject);
                    if (z) {
                        resultCode = ResultCode.SUCCESS;
                    } else {
                        resultCode = ResultCode.CV_ALGORITHM_ERROR;
                    }
                    xao.c(z, resultCode, b.this.c);
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MNNCV.init(b.this.f6369a);
                XRMakeupView.downloadResources(b.this.b, new C0331a());
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.artry.arflow.ARTryViewContainer$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0332b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0332b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    xao.c(false, ResultCode.ENGINE_FAILED_LOAD_SO, b.this.c);
                }
            }
        }

        public b(Context context, JSONObject jSONObject, c6a c6aVar) {
            this.f6369a = context;
            this.b = jSONObject;
            this.c = c6aVar;
        }

        @Override // com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.l
        public void a(boolean z, ResultCode resultCode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6063b896", new Object[]{this, new Boolean(z), resultCode});
            } else if (z) {
                TB3DSpace.initMakeUp(new a(), new RunnableC0332b());
            } else {
                xao.c(false, ResultCode.ENGINE_SO_DOWNLOAD_ERROR, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ARTryJSFlowForMiniApp.l f6374a;

        public d(ARTryJSFlowForMiniApp.l lVar) {
            this.f6374a = lVar;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            ARTryJSFlowForMiniApp.l lVar = this.f6374a;
            if (lVar != null) {
                lVar.a(false, ResultCode.ENGINE_SO_DOWNLOAD_ERROR);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
            } else if (num != null) {
                ARTryViewContainer.access$002(num.intValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements pkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pkd f6375a;

        public f(ARTryViewContainer aRTryViewContainer, pkd pkdVar) {
            this.f6375a = pkdVar;
        }

        @Override // tb.pkd
        public void sendResult(boolean z, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
                return;
            }
            pkd pkdVar = this.f6375a;
            if (pkdVar != null) {
                pkdVar.sendResult(z, jSONObject);
            }
        }
    }

    static {
        t2o.a(396361756);
    }

    public ARTryViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return mSessionId;
    }

    public static /* synthetic */ int access$002(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
        }
        mSessionId = i;
        return i;
    }

    private void captureScreenshot(boolean z, boolean z2, String str, pkd pkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9492a9", new Object[]{this, new Boolean(z), new Boolean(z2), str, pkdVar});
            return;
        }
        c6a c6aVar = new c6a();
        c6aVar.setResultSender(new f(this, pkdVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("needUploadPicture", (Object) Boolean.valueOf(z));
        jSONObject.put("needBase64Output", (Object) Boolean.valueOf(z2));
        jSONObject.put("uploadBizId", (Object) str);
        this.mARTryJSFlowForMiniApp.c0("takeARTryFrameSnapshot", jSONObject, c6aVar);
    }

    public static void downloadResources(Context context, JSONObject jSONObject, pkd pkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f29bb8", new Object[]{context, jSONObject, pkdVar});
            return;
        }
        c6a c6aVar = new c6a();
        c6aVar.setResultSender(new a(pkdVar));
        fetchModular(context, "TB3DSpace", new b(context, jSONObject, c6aVar));
    }

    public static void fetchModular(Context context, String str, ARTryJSFlowForMiniApp.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e4bd01", new Object[]{context, str, lVar});
        } else if (!"TB3DSpace".equals(str) || !dxv.l(TaoPackageInfo.sTTID)) {
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            if (h != null) {
                try {
                    bcq.a().g(context, false, str);
                    if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null || !h.f().contains(str)) {
                        c cVar = new c(str, lVar);
                        mSplitInstallStateUpdatedListener = cVar;
                        h.g(cVar);
                        h.c(xcq.c().l(str).n()).c(new e()).b(new d(lVar));
                    } else if (lVar != null) {
                        lVar.a(true, ResultCode.SUCCESS);
                    }
                } catch (Throwable unused) {
                    if (lVar != null) {
                        lVar.a(false, ResultCode.FAILURE_INTERNAL);
                    }
                }
            } else if (lVar != null) {
                lVar.a(false, ResultCode.FAILURE_INTERNAL);
            }
        } else if (lVar != null) {
            lVar.a(true, ResultCode.SUCCESS);
        }
    }

    public static /* synthetic */ Object ipc$super(ARTryViewContainer aRTryViewContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/arflow/ARTryViewContainer");
    }

    public boolean applyAREffect(JSONObject jSONObject, pkd pkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd6e28c9", new Object[]{this, jSONObject, pkdVar})).booleanValue();
        }
        if (this.mARTryJSFlowForMiniApp == null) {
            return false;
        }
        c6a c6aVar = new c6a();
        c6aVar.setResultSender(pkdVar);
        String str = this.mCurrentGraphType;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            this.mARTryJSFlowForMiniApp.C(jSONObject, c6aVar);
        }
        return true;
    }

    public boolean clearAllEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("273e6cd0", new Object[]{this})).booleanValue();
        }
        if (this.mARTryJSFlowForMiniApp == null) {
            return false;
        }
        String str = this.mCurrentGraphType;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            this.mARTryJSFlowForMiniApp.D();
        }
        return true;
    }

    public void destroy() {
        edq edqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = this.mARTryJSFlowForMiniApp;
        if (aRTryJSFlowForMiniApp != null) {
            aRTryJSFlowForMiniApp.W();
            this.mARTryJSFlowForMiniApp = null;
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        if (h != null && (edqVar = mSplitInstallStateUpdatedListener) != null) {
            h.e(edqVar);
        }
    }

    public void forbidSimplestGraph(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de54946", new Object[]{this, new Boolean(z)});
        } else {
            this.mForbidSimplestGraph = z;
        }
    }

    public void init(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470fda9", new Object[]{this, activity});
            return;
        }
        ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = new ARTryJSFlowForMiniApp();
        this.mARTryJSFlowForMiniApp = aRTryJSFlowForMiniApp;
        aRTryJSFlowForMiniApp.L(this.mBizUrl, activity, null, this);
        if (!this.mForbidSimplestGraph) {
            this.mInitARSimplestGraph = true;
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = this.mARTryJSFlowForMiniApp;
        if (aRTryJSFlowForMiniApp != null) {
            aRTryJSFlowForMiniApp.X();
        }
    }

    public void resume() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (this.mInitARSimplestGraph || ((str = this.mCurrentGraphType) != null && str.equals("MAKEUP_ONLY"))) {
            ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = this.mARTryJSFlowForMiniApp;
            if (aRTryJSFlowForMiniApp != null) {
                aRTryJSFlowForMiniApp.Z();
            }
        } else {
            this.mInitARSimplestGraph = true;
        }
    }

    public void setBizUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1daa6f", new Object[]{this, str});
        } else {
            this.mBizUrl = str;
        }
    }

    public void takePicture(pkd pkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2957438a", new Object[]{this, pkdVar});
        } else {
            captureScreenshot(false, false, null, pkdVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6373a;
        public final /* synthetic */ ARTryJSFlowForMiniApp.l b;

        public c(String str, ARTryJSFlowForMiniApp.l lVar) {
            this.f6373a = str;
            this.b = lVar;
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            ARTryJSFlowForMiniApp.l lVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
                return;
            }
            bdqVar.f();
            if (bdqVar.h() == ARTryViewContainer.access$000()) {
                int i = bdqVar.i();
                if (i == 5) {
                    Log.e(ARTryViewContainer.TAG, "模块安装完成：" + this.f6373a);
                    ARTryJSFlowForMiniApp.l lVar2 = this.b;
                    if (lVar2 != null) {
                        lVar2.a(true, ResultCode.SUCCESS);
                    }
                } else if (i == 6 && (lVar = this.b) != null) {
                    lVar.a(false, ResultCode.FAILURE_INTERNAL);
                }
            }
        }
    }

    public boolean setupAREngine(JSONObject jSONObject, pkd pkdVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2df5a809", new Object[]{this, jSONObject, pkdVar})).booleanValue();
        }
        c6a c6aVar = new c6a();
        c6aVar.setResultSender(pkdVar);
        if (!(jSONObject == null || jSONObject.getJSONArray("graphParams") == null || (jSONArray = jSONObject.getJSONArray("graphParams")) == null || jSONArray.size() <= 0)) {
            this.mCurrentGraphType = jSONArray.getJSONObject(0).getString("graphType");
        }
        return onAction("setupOrUpdateAREngine", jSONObject, c6aVar);
    }

    private boolean onAction(String str, JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a56c0e8", new Object[]{this, str, jSONObject, c6aVar})).booleanValue();
        }
        if (this.mARTryJSFlowForMiniApp == null) {
            return false;
        }
        if (TextUtils.equals(str, "fetchSimpleGraphLoadingDuration")) {
            c6aVar.addExtraParam("simpleGraphLoadingDuration", Long.valueOf(this.mSimpleGraphStartDuration));
            xao.d(true, c6aVar);
            return true;
        }
        this.mARTryJSFlowForMiniApp.c0(str, jSONObject, c6aVar);
        return true;
    }

    public ARTryViewContainer(Activity activity, String str) {
        super(activity.getApplicationContext());
        setBizUrl(str);
        init(activity);
    }
}
