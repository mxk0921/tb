package com.taobao.android.artry.arflow;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp;
import com.taobao.android.artry.constants.ResultCode;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.nav.Nav;
import com.taobao.android.nnrruntime.OpenGLUtils;
import com.taobao.android.tb3dspace.artry.ArTryJSFlowMiniAppBundleImpl;
import com.taobao.android.tb3dspace.artry.SetupAREngineLifeListener;
import com.taobao.android.tb3dspace.artry.TryShoeScreenShotCallBack;
import com.taobao.android.tb3dspace.artry.TryShoeScreenShotEventReceiver;
import com.taobao.android.tb3dspace.makeup.XRMakeupView;
import com.taobao.android.tb3dspace.tryshoe.TryShoeView;
import com.taobao.android.tb3dspace.util.TB3DSpace;
import com.taobao.android.tb3dspace.view.ErrorPageView;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.android.xrappos.scene.Scene;
import com.taobao.android.xrappos.threads.SequenceExecutor;
import com.taobao.android.xrappos.v2.view.XRAppOSView;
import com.taobao.android.xrspace.XRSpace;
import com.taobao.cameralink.manager.interfaces.ICLLifeListener;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a2i;
import tb.amo;
import tb.c6a;
import tb.dxv;
import tb.ie;
import tb.q2s;
import tb.suc;
import tb.t2o;
import tb.vbq;
import tb.xao;
import tb.zwp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ARTryJSFlowForMiniApp implements suc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String m = ARTryJSFlowForMiniApp.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f6355a;
    public Activity b;
    public String c;
    public String d;
    public String e;
    public BroadcastReceiver g;
    public TryShoeView h;
    public String i;
    public XRMakeupView f = null;
    public final Handler j = new Handler(Looper.getMainLooper());
    public ie k = null;
    public ie l = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements vbq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c6a f6357a;

        public a(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, c6a c6aVar) {
            this.f6357a = c6aVar;
        }

        @Override // tb.vbq
        public void onComplete(boolean z, JSONObject jSONObject) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject});
                return;
            }
            if (jSONObject != null && jSONObject.has("snapshotInfo")) {
                try {
                    this.f6357a.addExtraParam("snapshotInfo", jSONObject.get("snapshotInfo"));
                } catch (JSONException unused) {
                }
            }
            try {
                i = Integer.parseInt(jSONObject.getString("code"));
            } catch (Throwable unused2) {
            }
            xao.c(z, ResultCode.values()[i], this.f6357a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this) != null) {
                if (ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this) != null) {
                    ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this));
                }
                ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this).destroy();
                ARTryJSFlowForMiniApp.m(ARTryJSFlowForMiniApp.this, null);
            }
            if (ARTryJSFlowForMiniApp.r(ARTryJSFlowForMiniApp.this) != null) {
                ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = ARTryJSFlowForMiniApp.this;
                ARTryJSFlowForMiniApp.t(aRTryJSFlowForMiniApp, ARTryJSFlowForMiniApp.n(aRTryJSFlowForMiniApp), ARTryJSFlowForMiniApp.r(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                ARTryJSFlowForMiniApp.s(ARTryJSFlowForMiniApp.this, null);
            }
            if (ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this) != null) {
                ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this).destroy();
                ARTryJSFlowForMiniApp.v(ARTryJSFlowForMiniApp.this, null);
            }
            if (ARTryJSFlowForMiniApp.A(ARTryJSFlowForMiniApp.this) != null && ARTryJSFlowForMiniApp.A(ARTryJSFlowForMiniApp.this).equals("MAKEUP_ONLY") && ARTryJSFlowForMiniApp.p(ARTryJSFlowForMiniApp.this) != null) {
                ARTryJSFlowForMiniApp.p(ARTryJSFlowForMiniApp.this).destroy();
                if (ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this) != null) {
                    ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.p(ARTryJSFlowForMiniApp.this));
                }
                ARTryJSFlowForMiniApp.q(ARTryJSFlowForMiniApp.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements vbq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c6a f6359a;

        public c(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, c6a c6aVar) {
            this.f6359a = c6aVar;
        }

        @Override // tb.vbq
        public void onComplete(boolean z, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f409ee9", new Object[]{this, new Boolean(z), jSONObject});
            } else if (jSONObject != null) {
                try {
                    xao.c(z, ResultCode.values()[Integer.parseInt(jSONObject.getString("code"))], this.f6359a);
                } catch (Throwable th) {
                    ARTryJSFlowForMiniApp.o();
                    new StringBuilder("onComplete: e ").append(th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this) != null) {
                ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this));
                ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this).destroy();
                ARTryJSFlowForMiniApp.m(ARTryJSFlowForMiniApp.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ARTryJSFlowForMiniApp.r(ARTryJSFlowForMiniApp.this) != null) {
                ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = ARTryJSFlowForMiniApp.this;
                ARTryJSFlowForMiniApp.t(aRTryJSFlowForMiniApp, ARTryJSFlowForMiniApp.n(aRTryJSFlowForMiniApp), ARTryJSFlowForMiniApp.r(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                ARTryJSFlowForMiniApp.s(ARTryJSFlowForMiniApp.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this) != null) {
                ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this).destroy();
                ARTryJSFlowForMiniApp.v(ARTryJSFlowForMiniApp.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.fastjson.JSONObject f6363a;
        public final /* synthetic */ c6a b;

        public g(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
            this.f6363a = jSONObject;
            this.b = c6aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ARTryJSFlowForMiniApp.w(ARTryJSFlowForMiniApp.this, this.f6363a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this) != null) {
                if (ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this) != null) {
                    ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this));
                }
                ARTryJSFlowForMiniApp.l(ARTryJSFlowForMiniApp.this).destroy();
                ARTryJSFlowForMiniApp.m(ARTryJSFlowForMiniApp.this, null);
            }
            if (ARTryJSFlowForMiniApp.r(ARTryJSFlowForMiniApp.this) != null) {
                ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp = ARTryJSFlowForMiniApp.this;
                ARTryJSFlowForMiniApp.t(aRTryJSFlowForMiniApp, ARTryJSFlowForMiniApp.n(aRTryJSFlowForMiniApp), ARTryJSFlowForMiniApp.r(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                ARTryJSFlowForMiniApp.s(ARTryJSFlowForMiniApp.this, null);
            }
            if (ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this) != null) {
                ARTryJSFlowForMiniApp.n(ARTryJSFlowForMiniApp.this).removeView(ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this).getXRAppOSView());
                ARTryJSFlowForMiniApp.u(ARTryJSFlowForMiniApp.this).destroy();
                ARTryJSFlowForMiniApp.v(ARTryJSFlowForMiniApp.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.fastjson.JSONObject f6365a;
        public final /* synthetic */ c6a b;

        public i(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
            this.f6365a = jSONObject;
            this.b = c6aVar;
        }

        @Override // com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.l
        public void a(boolean z, ResultCode resultCode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6063b896", new Object[]{this, new Boolean(z), resultCode});
            } else if (z) {
                ARTryJSFlowForMiniApp.x(ARTryJSFlowForMiniApp.this, this.f6365a, this.b);
            } else {
                c6a c6aVar = this.b;
                if (c6aVar != null) {
                    c6aVar.addExtraParam("exceptionDescribe", "fetchModular failed");
                    xao.c(false, ResultCode.FAILURE_NULL_RESULT, this.b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c6a f6366a;

        public j(c6a c6aVar) {
            this.f6366a = c6aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                r0 = -1
                r1 = 1
                com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.j.$ipChange
                boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r3 == 0) goto L_0x0013
                java.lang.String r0 = "5c510192"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                r1[r3] = r5
                r2.ipc$dispatch(r0, r1)
                return
            L_0x0013:
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                tb.ie r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.r(r2)
                if (r2 == 0) goto L_0x0034
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                android.widget.FrameLayout r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.n(r2)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r4 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                tb.ie r4 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.r(r4)
                com.taobao.android.xrappos.v2.view.XRAppOSView r4 = r4.getXRAppOSView()
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.t(r2, r3, r4)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                r3 = 0
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.s(r2, r3)
            L_0x0034:
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                com.taobao.android.xrspace.artry.impl.ARTryWatchImpl r3 = new com.taobao.android.xrspace.artry.impl.ARTryWatchImpl
                r3.<init>()
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.s(r2, r3)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                tb.ie r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.r(r2)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                android.app.Activity r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.y(r3)
                r2.init(r3)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                android.widget.FrameLayout r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.n(r2)
                int r2 = r2.getChildCount()
                int r2 = r2 - r1
            L_0x0058:
                if (r2 < 0) goto L_0x0085
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                android.widget.FrameLayout r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.n(r3)
                android.view.View r3 = r3.getChildAt(r2)
                boolean r4 = r3 instanceof com.taobao.android.tb3dspace.makeup.XRMakeupView
                if (r4 != 0) goto L_0x0073
                boolean r4 = r3 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
                if (r4 != 0) goto L_0x0073
                boolean r4 = r3 instanceof android.opengl.GLSurfaceView
                if (r4 == 0) goto L_0x0071
                goto L_0x0073
            L_0x0071:
                int r2 = r2 + r0
                goto L_0x0058
            L_0x0073:
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                android.widget.FrameLayout r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.n(r2)
                r2.removeView(r3)
                boolean r2 = r3 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
                if (r2 == 0) goto L_0x0085
                com.taobao.android.xrappos.v2.view.XRAppOSView r3 = (com.taobao.android.xrappos.v2.view.XRAppOSView) r3
                r3.destroy()
            L_0x0085:
                tb.c6a r2 = r5.f6366a
                if (r2 == 0) goto L_0x009c
                java.lang.String r3 = "currentGraphType"
                java.lang.String r4 = "AR_WATCH"
                r2.addExtraParam(r3, r4)
                tb.c6a r2 = r5.f6366a
                r3 = 5
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r4 = "graphVersion"
                r2.addExtraParam(r4, r3)
            L_0x009c:
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                java.lang.String r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.z(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x00c7
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                java.lang.String r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.z(r2)
                java.lang.String r2 = r2.i0(r3)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                java.lang.String r2 = r3.E(r2)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                tb.ie r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.r(r3)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r4 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                java.lang.String r4 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.z(r4)
                r3.loadModel(r4, r2)
            L_0x00c7:
                android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
                r2.<init>(r0, r0)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                android.widget.FrameLayout r0 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.n(r0)
                com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.this
                tb.ie r3 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.r(r3)
                com.taobao.android.xrappos.v2.view.XRAppOSView r3 = r3.getXRAppOSView()
                r0.addView(r3, r2)
                tb.c6a r0 = r5.f6366a
                tb.xao.d(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.j.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c6a f6367a;
        public final /* synthetic */ Set b;
        public final /* synthetic */ com.alibaba.fastjson.JSONObject c;

        public k(c6a c6aVar, Set set, com.alibaba.fastjson.JSONObject jSONObject) {
            this.f6367a = c6aVar;
            this.b = set;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            char[] cArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (ARTryJSFlowForMiniApp.A(ARTryJSFlowForMiniApp.this) == null || !ARTryJSFlowForMiniApp.A(ARTryJSFlowForMiniApp.this).equals("MAKEUP_ONLY")) {
                z = false;
            } else {
                z = true;
            }
            if ("AR_SHOE_2".equals(ARTryJSFlowForMiniApp.A(ARTryJSFlowForMiniApp.this))) {
                xao.d(true, this.f6367a);
                return;
            }
            for (String str : this.b) {
                if (!z || str.equals("LIPSTICK")) {
                    try {
                        JSONArray jSONArray = this.c.getJSONArray(str);
                        int size = jSONArray.size();
                        cArr = new char[size];
                        for (int i = 0; i < size; i++) {
                            cArr[i] = (char) jSONArray.getIntValue(i);
                        }
                    } catch (Throwable unused) {
                        Log.e(ARTryJSFlowForMiniApp.o(), "failed to parse flat buffer binary array...");
                        cArr = null;
                    }
                    if (cArr != null && z && str.equals("LIPSTICK")) {
                        ARTryJSFlowForMiniApp.p(ARTryJSFlowForMiniApp.this).applyLipstickConfig(ARTryJSFlowForMiniApp.p(ARTryJSFlowForMiniApp.this).convertLipstickConfigWithFlatBuffer(cArr));
                        return;
                    }
                }
            }
            xao.d(true, this.f6367a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface l {
        void a(boolean z, ResultCode resultCode);
    }

    static {
        t2o.a(396361742);
        t2o.a(396361766);
    }

    public static /* synthetic */ String A(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20e60ee9", new Object[]{aRTryJSFlowForMiniApp});
        }
        return aRTryJSFlowForMiniApp.e;
    }

    public static /* synthetic */ void P(c6a c6aVar, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979a2dc1", new Object[]{c6aVar, new Boolean(z), jSONObject});
        } else if (c6aVar != null) {
            c6aVar.addExtraParam("currentGraphType", "MAKEUP_ONLY");
            c6aVar.addExtraParam("graphVersion", 2);
            c6aVar.addExtraParam("isDownload", 0);
            try {
                xao.c(z, ResultCode.values()[Integer.parseInt(jSONObject.getString("code"))], c6aVar);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ TryShoeView l(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TryShoeView) ipChange.ipc$dispatch("15f1357e", new Object[]{aRTryJSFlowForMiniApp});
        }
        return aRTryJSFlowForMiniApp.h;
    }

    public static /* synthetic */ TryShoeView m(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, TryShoeView tryShoeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TryShoeView) ipChange.ipc$dispatch("f2d6e9d8", new Object[]{aRTryJSFlowForMiniApp, tryShoeView});
        }
        aRTryJSFlowForMiniApp.h = tryShoeView;
        return tryShoeView;
    }

    public static /* synthetic */ FrameLayout n(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e34473da", new Object[]{aRTryJSFlowForMiniApp});
        }
        return aRTryJSFlowForMiniApp.f6355a;
    }

    public static /* synthetic */ String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6ae20ba", new Object[0]);
        }
        return m;
    }

    public static /* synthetic */ XRMakeupView p(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRMakeupView) ipChange.ipc$dispatch("1acedbc2", new Object[]{aRTryJSFlowForMiniApp});
        }
        return aRTryJSFlowForMiniApp.f;
    }

    public static /* synthetic */ XRMakeupView q(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, XRMakeupView xRMakeupView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XRMakeupView) ipChange.ipc$dispatch("9a931dc8", new Object[]{aRTryJSFlowForMiniApp, xRMakeupView});
        }
        aRTryJSFlowForMiniApp.f = xRMakeupView;
        return xRMakeupView;
    }

    public static /* synthetic */ ie r(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ie) ipChange.ipc$dispatch("bdb5370e", new Object[]{aRTryJSFlowForMiniApp});
        }
        return aRTryJSFlowForMiniApp.k;
    }

    public static /* synthetic */ ie s(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, ie ieVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ie) ipChange.ipc$dispatch("c1f259a", new Object[]{aRTryJSFlowForMiniApp, ieVar});
        }
        aRTryJSFlowForMiniApp.k = ieVar;
        return ieVar;
    }

    public static /* synthetic */ void t(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, ViewGroup viewGroup, XRAppOSView xRAppOSView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67591849", new Object[]{aRTryJSFlowForMiniApp, viewGroup, xRAppOSView});
        } else {
            aRTryJSFlowForMiniApp.G(viewGroup, xRAppOSView);
        }
    }

    public static /* synthetic */ ie u(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ie) ipChange.ipc$dispatch("3e0b0490", new Object[]{aRTryJSFlowForMiniApp});
        }
        return aRTryJSFlowForMiniApp.l;
    }

    public static /* synthetic */ ie v(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, ie ieVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ie) ipChange.ipc$dispatch("b85d9f9c", new Object[]{aRTryJSFlowForMiniApp, ieVar});
        }
        aRTryJSFlowForMiniApp.l = ieVar;
        return ieVar;
    }

    public static /* synthetic */ void w(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d7486f", new Object[]{aRTryJSFlowForMiniApp, jSONObject, c6aVar});
        } else {
            aRTryJSFlowForMiniApp.h0(jSONObject, c6aVar);
        }
    }

    public static /* synthetic */ void x(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp, com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60601670", new Object[]{aRTryJSFlowForMiniApp, jSONObject, c6aVar});
        } else {
            aRTryJSFlowForMiniApp.b0(jSONObject, c6aVar);
        }
    }

    public static /* synthetic */ Activity y(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("7f5bf4ef", new Object[]{aRTryJSFlowForMiniApp});
        }
        return aRTryJSFlowForMiniApp.b;
    }

    public static /* synthetic */ String z(ARTryJSFlowForMiniApp aRTryJSFlowForMiniApp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19bd2ca8", new Object[]{aRTryJSFlowForMiniApp});
        }
        return aRTryJSFlowForMiniApp.i;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3637f", new Object[]{this});
            return;
        }
        View errorPageView = new ErrorPageView(this.b);
        Button refreshButton = errorPageView.getRefreshButton();
        if (refreshButton != null) {
            refreshButton.setVisibility(8);
        }
        TextView tipText = errorPageView.getTipText();
        if (tipText != null) {
            tipText.setText("当前机型不支持该功能");
        }
        this.f6355a.addView(errorPageView, new FrameLayout.LayoutParams(-1, -1));
    }

    public void C(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d27304", new Object[]{this, jSONObject, c6aVar});
            return;
        }
        String str = this.e;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            XRMakeupView xRMakeupView = this.f;
            if (xRMakeupView == null) {
                xao.c(false, ResultCode.FAILURE_INTERNAL, c6aVar);
            } else {
                xRMakeupView.applyEffect(jSONObject, new c(this, c6aVar));
            }
        }
    }

    public void D() {
        XRMakeupView xRMakeupView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273e6ccc", new Object[]{this});
            return;
        }
        String str = this.e;
        if (str != null && str.equals("MAKEUP_ONLY") && (xRMakeupView = this.f) != null) {
            xRMakeupView.clearAllEffect();
        }
    }

    public String E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1670ec3c", new Object[]{this, str});
        }
        return "/Uniq/" + str + q2s.JSON;
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae200e8b", new Object[]{this});
            return;
        }
        ie ieVar = this.k;
        if (ieVar != null) {
            ieVar.destroy();
            this.k = null;
        }
        ie ieVar2 = this.l;
        if (ieVar2 != null) {
            ieVar2.destroy();
            this.l = null;
        }
        XRMakeupView xRMakeupView = this.f;
        if (xRMakeupView != null) {
            xRMakeupView.destroy();
            this.f = null;
        }
    }

    public final void G(ViewGroup viewGroup, XRAppOSView xRAppOSView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff9bae9", new Object[]{this, viewGroup, xRAppOSView});
        } else if (viewGroup != null && xRAppOSView != null) {
            viewGroup.removeView(xRAppOSView);
            xRAppOSView.destroy();
        }
    }

    public final void H(final com.alibaba.fastjson.JSONObject jSONObject, final c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caea4f7", new Object[]{this, jSONObject, c6aVar});
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("arViewParam");
        final int intValue = jSONObject2.getIntValue("arViewLeft");
        final int intValue2 = jSONObject2.getIntValue("arViewTop");
        final int intValue3 = jSONObject2.getIntValue("arViewWidth");
        final int intValue4 = jSONObject2.getIntValue("arViewHeight");
        if (this.f == null) {
            this.f = new XRMakeupView(this.b);
        }
        TB3DSpace.initMakeUp(new Runnable() { // from class: tb.ce
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.this.M(intValue, intValue2, intValue3, intValue4, jSONObject, c6aVar);
            }
        }, new Runnable() { // from class: tb.de
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.this.N(c6aVar);
            }
        });
    }

    public final void J(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222a23d4", new Object[]{this, jSONObject, c6aVar});
        } else if (c6aVar != null) {
            c6aVar.addExtraParam("fps", Float.valueOf(0.0f));
            xao.d(true, c6aVar);
        }
    }

    public View K(String str, Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8e45ec0f", new Object[]{this, str, activity, map});
        }
        this.b = activity;
        this.c = str;
        if (this.f6355a == null) {
            this.f6355a = new FrameLayout(activity.getApplicationContext());
        }
        return this.f6355a;
    }

    public void L(String str, Activity activity, Map<String, String> map, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853b5b10", new Object[]{this, str, activity, map, frameLayout});
            return;
        }
        this.f6355a = frameLayout;
        K(str, activity, map);
    }

    public final /* synthetic */ void M(final int i2, final int i3, final int i4, final int i5, final com.alibaba.fastjson.JSONObject jSONObject, final c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6346046", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), jSONObject, c6aVar});
        } else {
            a2i.a().post(new Runnable() { // from class: tb.fe
                @Override // java.lang.Runnable
                public final void run() {
                    ARTryJSFlowForMiniApp.this.Q(i2, i3, i4, i5, jSONObject, c6aVar);
                }
            });
        }
    }

    public final /* synthetic */ void N(c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78144c9f", new Object[]{this, c6aVar});
            return;
        }
        for (int childCount = this.f6355a.getChildCount() - 1; childCount >= 0; childCount--) {
            XRAppOSView childAt = this.f6355a.getChildAt(childCount);
            if ((childAt instanceof XRMakeupView) || (childAt instanceof XRAppOSView)) {
                this.f6355a.removeView(childAt);
                if (childAt instanceof XRAppOSView) {
                    childAt.destroy();
                }
                B();
                xao.d(false, c6aVar);
            }
        }
        B();
        xao.d(false, c6aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void Q(int r17, int r18, int r19, int r20, com.alibaba.fastjson.JSONObject r21, final tb.c6a r22) {
        /*
            r16 = this;
            r0 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = -1
            r1 = 1
            r15 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0047
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r8)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r9)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r10)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r11)
            r7 = 7
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r15] = r0
            r7[r1] = r3
            r1 = 2
            r7[r1] = r4
            r1 = 3
            r7[r1] = r5
            r1 = 4
            r7[r1] = r6
            r1 = 5
            r7[r1] = r12
            r1 = 6
            r7[r1] = r13
            java.lang.String r1 = "5b63490c"
            r2.ipc$dispatch(r1, r7)
            return
        L_0x0047:
            android.widget.FrameLayout r2 = r0.f6355a
            int r2 = r2.getChildCount()
            int r2 = r2 - r1
        L_0x004e:
            if (r2 < 0) goto L_0x006f
            android.widget.FrameLayout r1 = r0.f6355a
            android.view.View r1 = r1.getChildAt(r2)
            boolean r3 = r1 instanceof com.taobao.android.tb3dspace.makeup.XRMakeupView
            if (r3 != 0) goto L_0x0061
            boolean r3 = r1 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
            if (r3 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            int r2 = r2 + r14
            goto L_0x004e
        L_0x0061:
            android.widget.FrameLayout r2 = r0.f6355a
            r2.removeView(r1)
            boolean r2 = r1 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
            if (r2 == 0) goto L_0x006f
            com.taobao.android.xrappos.v2.view.XRAppOSView r1 = (com.taobao.android.xrappos.v2.view.XRAppOSView) r1
            r1.destroy()
        L_0x006f:
            com.taobao.android.tb3dspace.makeup.XRMakeupView r1 = r0.f
            android.widget.FrameLayout r2 = r0.f6355a
            r7 = 0
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r1.realAdd(r2, r3, r4, r5, r6, r7)
            if (r10 > 0) goto L_0x0082
            r10 = -1
        L_0x0082:
            if (r11 > 0) goto L_0x0085
            r11 = -1
        L_0x0085:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r10, r11)
            if (r8 >= 0) goto L_0x008d
            r8 = 0
        L_0x008d:
            r1.leftMargin = r8
            if (r9 >= 0) goto L_0x0092
            r9 = 0
        L_0x0092:
            r1.topMargin = r9
            com.taobao.android.tb3dspace.makeup.XRMakeupView r2 = r0.f
            r2.setLayoutParams(r1)
            com.taobao.android.tb3dspace.makeup.XRMakeupView r1 = r0.f
            tb.xd r2 = new tb.xd
            r2.<init>()
            r1.setup(r12, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.Q(int, int, int, int, com.alibaba.fastjson.JSONObject, tb.c6a):void");
    }

    public final /* synthetic */ void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b67d6ee", new Object[]{this});
            return;
        }
        ie ieVar = this.l;
        if (ieVar != null) {
            this.f6355a.removeView(ieVar.getXRAppOSView());
            this.l.destroy();
            this.l = null;
        }
        for (int childCount = this.f6355a.getChildCount() - 1; childCount >= 0; childCount--) {
            XRAppOSView childAt = this.f6355a.getChildAt(childCount);
            if ((childAt instanceof XRMakeupView) || (childAt instanceof XRAppOSView)) {
                if (childAt instanceof XRAppOSView) {
                    childAt.destroy();
                }
                this.f6355a.removeView(childAt);
                B();
            }
        }
        B();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void S(tb.c6a r6) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0016
            java.lang.String r0 = "71695229"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r1] = r6
            r2.ipc$dispatch(r0, r3)
            return
        L_0x0016:
            tb.ie r2 = r5.l
            if (r2 == 0) goto L_0x0028
            android.widget.FrameLayout r3 = r5.f6355a
            com.taobao.android.xrappos.v2.view.XRAppOSView r2 = r2.getXRAppOSView()
            r3.removeView(r2)
            tb.ie r2 = r5.l
            r2.destroy()
        L_0x0028:
            com.taobao.android.xrspace.artry.impl.ARTryGlassImpl r2 = new com.taobao.android.xrspace.artry.impl.ARTryGlassImpl
            r2.<init>()
            r5.l = r2
            android.app.Activity r3 = r5.b
            r2.init(r3)
            android.widget.FrameLayout r2 = r5.f6355a
            int r2 = r2.getChildCount()
            int r2 = r2 - r1
        L_0x003b:
            if (r2 < 0) goto L_0x005c
            android.widget.FrameLayout r3 = r5.f6355a
            android.view.View r3 = r3.getChildAt(r2)
            boolean r4 = r3 instanceof com.taobao.android.tb3dspace.makeup.XRMakeupView
            if (r4 != 0) goto L_0x004e
            boolean r4 = r3 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
            if (r4 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            int r2 = r2 + r0
            goto L_0x003b
        L_0x004e:
            android.widget.FrameLayout r2 = r5.f6355a
            r2.removeView(r3)
            boolean r2 = r3 instanceof com.taobao.android.xrappos.v2.view.XRAppOSView
            if (r2 == 0) goto L_0x005c
            com.taobao.android.xrappos.v2.view.XRAppOSView r3 = (com.taobao.android.xrappos.v2.view.XRAppOSView) r3
            r3.destroy()
        L_0x005c:
            if (r6 == 0) goto L_0x006f
            java.lang.String r2 = "currentGraphType"
            java.lang.String r3 = "AR_GLASS"
            r6.addExtraParam(r2, r3)
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "graphVersion"
            r6.addExtraParam(r3, r2)
        L_0x006f:
            java.lang.String r2 = r5.i
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0088
            java.lang.String r2 = r5.i
            java.lang.String r2 = r5.i0(r2)
            java.lang.String r2 = r5.E(r2)
            tb.ie r3 = r5.l
            java.lang.String r4 = r5.i
            r3.loadModel(r4, r2)
        L_0x0088:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r0, r0)
            android.widget.FrameLayout r0 = r5.f6355a
            tb.ie r3 = r5.l
            com.taobao.android.xrappos.v2.view.XRAppOSView r3 = r3.getXRAppOSView()
            r0.addView(r3, r2)
            tb.xao.d(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.S(tb.c6a):void");
    }

    public final /* synthetic */ void T(final c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20b1f88", new Object[]{this, c6aVar});
        } else {
            this.j.post(new Runnable() { // from class: tb.ee
                @Override // java.lang.Runnable
                public final void run() {
                    ARTryJSFlowForMiniApp.this.O(c6aVar);
                }
            });
        }
    }

    public final /* synthetic */ void U(c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5f74c9", new Object[]{this, c6aVar});
            return;
        }
        this.j.post(new Runnable() { // from class: tb.ge
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.this.B();
            }
        });
        xao.d(false, c6aVar);
    }

    public final /* synthetic */ void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca06920", new Object[]{this});
            return;
        }
        ie ieVar = this.k;
        if (ieVar != null) {
            G(this.f6355a, ieVar.getXRAppOSView());
            this.k = null;
        }
        B();
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.j.post(new b());
        if (this.g != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.g);
        }
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        String str = this.e;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            XRMakeupView xRMakeupView = this.f;
            if (xRMakeupView != null) {
                xRMakeupView.pause();
            }
        } else if ("AR_SHOE_2".equals(this.e)) {
            TryShoeView tryShoeView = this.h;
            if (tryShoeView != null) {
                tryShoeView.pause();
            }
        } else {
            a0(true);
        }
    }

    public void Y(String str, com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c725312", new Object[]{this, str, jSONObject, c6aVar});
        } else if (TextUtils.equals(str, "applyEffect")) {
            c0(jSONObject.getString("apiName"), jSONObject.getJSONObject("apiParam"), c6aVar);
        }
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        String str = this.e;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            XRMakeupView xRMakeupView = this.f;
            if (xRMakeupView != null) {
                xRMakeupView.resume();
            }
        } else if ("AR_SHOE_2".equals(this.e)) {
            TryShoeView tryShoeView = this.h;
            if (tryShoeView != null) {
                tryShoeView.resume();
            }
        } else {
            a0(false);
        }
    }

    public final void a0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda171a5", new Object[]{this, new Boolean(z)});
        }
    }

    public final void b0(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951755d1", new Object[]{this, jSONObject, c6aVar});
            return;
        }
        try {
            List createGraphParamsByJson = ArTryJSFlowMiniAppBundleImpl.createGraphParamsByJson(jSONObject, this.b);
            String string = jSONObject.getString(FluidInstanceAnalysis.KEY_SOURCE);
            if (!TextUtils.equals(string, this.d)) {
                this.d = string;
            }
            if (!dxv.h(createGraphParamsByJson)) {
                ArTryJSFlowMiniAppBundleImpl.createSourceAndViewParam(jSONObject, (zwp) createGraphParamsByJson.get(createGraphParamsByJson.size() - 1), this.f6355a);
                if (createGraphParamsByJson.size() > 0) {
                    zwp zwpVar = (zwp) createGraphParamsByJson.get(0);
                    String str3 = this.e;
                    if ((str3 == null || !str3.equals("MAKEUP_ONLY")) && (str2 = zwpVar.b) != null && str2.equals("MAKEUP_ONLY")) {
                        if ("AR_SHOE_2".equals(this.e)) {
                            this.j.post(new d());
                        }
                        if ("AR_WATCH".equals(this.e)) {
                            this.j.post(new e());
                        }
                        if ("AR_GLASS".equals(this.e)) {
                            this.j.post(new f());
                        }
                        this.e = zwpVar.b;
                        this.j.post(new g(jSONObject, c6aVar));
                        return;
                    }
                    String str4 = this.e;
                    if ((str4 == null || str4.equals("MAKEUP_ONLY")) && (str = zwpVar.b) != null && !str.equals("MAKEUP_ONLY")) {
                        XRMakeupView xRMakeupView = this.f;
                        if (xRMakeupView != null) {
                            xRMakeupView.destroy();
                            FrameLayout frameLayout = this.f6355a;
                            if (frameLayout != null) {
                                frameLayout.removeView(this.f);
                            }
                            this.f = null;
                        }
                        this.e = zwpVar.b;
                    }
                }
                ICLLifeListener setupAREngineLifeListener = new SetupAREngineLifeListener();
                ((SetupAREngineLifeListener) setupAREngineLifeListener).mCallback = c6aVar;
                ((zwp) createGraphParamsByJson.get(createGraphParamsByJson.size() - 1)).b(setupAREngineLifeListener);
                if (createGraphParamsByJson.size() >= 1) {
                    String str5 = ((zwp) createGraphParamsByJson.get(0)).b;
                    this.e = str5;
                    this.j.post(new h());
                    if (str5.equals("AR_SHOE_2")) {
                        e0(c6aVar);
                    }
                    if (str5.equals("AR_WATCH")) {
                        f0(c6aVar);
                    }
                    if ("AR_GLASS".equals(str5)) {
                        d0(c6aVar);
                    }
                }
            }
        } catch (Throwable th) {
            if (c6aVar != null) {
                c6aVar.addExtraParam("exceptionDescribe", dxv.n(th));
                xao.c(false, ResultCode.ENGINE_GRAPH_NULL_FROM_WALLE, c6aVar);
            }
        }
    }

    public final void e0(final c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fbccfe", new Object[]{this, c6aVar});
            return;
        }
        this.i = null;
        if (!TB3DSpace.init3dSpace()) {
            Log.e(m, "tb3dspace init failed");
            B();
            return;
        }
        OpenGLUtils.b(new Runnable() { // from class: tb.zd
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.this.T(c6aVar);
            }
        }, new Runnable() { // from class: tb.ae
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.this.U(c6aVar);
            }
        });
    }

    public final void g0(final com.alibaba.fastjson.JSONObject jSONObject, final c6a c6aVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c607", new Object[]{this, jSONObject, c6aVar});
            return;
        }
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("graphParams");
                int i3 = 0;
                while (i2 < jSONObject.size()) {
                    try {
                        com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        if (jSONObject2 != null && "MAKEUP_ONLY".equals(jSONObject2.getString("graphType"))) {
                            i3 = 1;
                        }
                        i2++;
                    } catch (Throwable unused) {
                    }
                }
                i2 = i3;
            } catch (Throwable unused2) {
            }
        }
        if (dxv.m()) {
            b0(jSONObject, c6aVar);
        } else if (i2 != 0) {
            ARTryViewContainer.fetchModular(this.b, "TB3DSpace", new i(jSONObject, c6aVar));
        } else {
            if (this.g == null) {
                this.g = new BroadcastReceiver() { // from class: com.taobao.android.artry.arflow.ARTryJSFlowForMiniApp.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/artry/arflow/ARTryJSFlowForMiniApp$7");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else {
                            ARTryJSFlowForMiniApp.x(ARTryJSFlowForMiniApp.this, jSONObject, c6aVar);
                        }
                    }
                };
                LocalBroadcastManager.getInstance(this.b).registerReceiver(this.g, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
            }
            Nav.from(this.b).toUri("https://go/installxrspace3d");
        }
    }

    public final void h0(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a03f82", new Object[]{this, jSONObject, c6aVar});
        } else {
            H(jSONObject, c6aVar);
        }
    }

    public String i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9efb3d65", new Object[]{this, str});
        }
        return str.substring(str.lastIndexOf("/") + 1, str.lastIndexOf("."));
    }

    public final void k0(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b694cc50", new Object[]{this, jSONObject, c6aVar});
            return;
        }
        String str = this.e;
        if ((str == null || !str.equals("MAKEUP_ONLY")) && !"AR_SHOE_2".equals(this.e) && jSONObject != null) {
            jSONObject.getJSONObject("arFrameItems");
        }
    }

    public final void l0(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8870ee", new Object[]{this, jSONObject, c6aVar});
        } else if (dxv.m()) {
            com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("effectConfigArray");
            if (dxv.i(jSONObject2)) {
                xao.d(true, c6aVar);
            } else {
                SequenceExecutor.getInstance().post(new k(c6aVar, jSONObject2.keySet(), jSONObject2));
            }
        }
    }

    public void c0(String str, com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95b4213", new Object[]{this, str, jSONObject, c6aVar});
        } else if (TextUtils.equals(str, "setupOrUpdateAREngine")) {
            g0(jSONObject, c6aVar);
        } else if (TextUtils.equals(str, "fetchPageUrl")) {
            if (c6aVar != null) {
                c6aVar.addExtraParam("pageUrl", this.c);
                xao.d(true, c6aVar);
            }
        } else if (TextUtils.equals(str, "fetchFps")) {
            J(jSONObject, c6aVar);
        } else if (TextUtils.equals(str, "downloadResources")) {
            I(jSONObject, c6aVar);
        } else if (TextUtils.equals(str, "pauseOrResumeARFoundation")) {
            a0(!jSONObject.getBooleanValue("active"));
        } else if (TextUtils.equals(str, "updateARFrameConfig")) {
            l0(jSONObject, c6aVar);
            k0(jSONObject, c6aVar);
        } else if (TextUtils.equals(str, "takeARTryFrameSnapshot")) {
            j0(jSONObject, c6aVar);
        }
    }

    public final void d0(final c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3443c6b5", new Object[]{this, c6aVar});
            return;
        }
        this.i = null;
        if (!XRSpace.init(this.b)) {
            Log.e(m, "tb3dspace init failed");
            xao.d(false, c6aVar);
            this.j.post(new Runnable() { // from class: tb.wd
                @Override // java.lang.Runnable
                public final void run() {
                    ARTryJSFlowForMiniApp.this.R();
                }
            });
            return;
        }
        this.j.post(new Runnable() { // from class: tb.yd
            @Override // java.lang.Runnable
            public final void run() {
                ARTryJSFlowForMiniApp.this.S(c6aVar);
            }
        });
    }

    public final void f0(c6a c6aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456b1e68", new Object[]{this, c6aVar});
            return;
        }
        this.i = null;
        if (!XRSpace.init(this.b)) {
            Log.e(m, "tb3dspace init failed");
            this.j.post(new Runnable() { // from class: tb.be
                @Override // java.lang.Runnable
                public final void run() {
                    ARTryJSFlowForMiniApp.this.V();
                }
            });
            xao.d(false, c6aVar);
            return;
        }
        this.j.post(new j(c6aVar));
    }

    public final void j0(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        Scene scene;
        ie ieVar;
        ie ieVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbd4955", new Object[]{this, jSONObject, c6aVar});
            return;
        }
        String str = this.e;
        if (str != null && str.equals("MAKEUP_ONLY")) {
            XRMakeupView xRMakeupView = this.f;
            if (xRMakeupView == null) {
                xao.c(false, ResultCode.FAILURE_INTERNAL, c6aVar);
            } else {
                xRMakeupView.takePicture(new a(this, c6aVar));
            }
        } else if ("AR_SHOE_2".equals(this.e)) {
            this.h.getScreenShot(new TryShoeScreenShotCallBack(this.b, c6aVar, jSONObject.getString("uploadBizId"), jSONObject.getBooleanValue("needBase64Output"), jSONObject.getBooleanValue("needUploadPicture")));
        } else if ("AR_WATCH".equals(this.e) || "AR_GLASS".equals(this.e)) {
            boolean booleanValue = jSONObject.getBooleanValue("needUploadPicture");
            boolean booleanValue2 = jSONObject.getBooleanValue("needBase64Output");
            String string = jSONObject.getString("uploadBizId");
            if (!"AR_WATCH".equals(this.e) || (ieVar2 = this.k) == null) {
                scene = (!"AR_GLASS".equals(this.e) || (ieVar = this.l) == null) ? null : ieVar.getScene();
            } else {
                scene = ieVar2.getScene();
            }
            if (scene == null || scene.isExpired()) {
                xao.c(false, ResultCode.FAILURE_TAKE_PICTURE_ERROR, c6aVar);
                return;
            }
            scene.setEventReceiver(new TryShoeScreenShotEventReceiver(booleanValue2, booleanValue, c6aVar, this.b, string));
            scene.takeScreenshot(0);
        }
    }

    public final void I(com.alibaba.fastjson.JSONObject jSONObject, c6a c6aVar) {
        TryShoeView tryShoeView;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485c9966", new Object[]{this, jSONObject, c6aVar});
            return;
        }
        try {
            jSONArray = jSONObject.getJSONArray("needDownloadResources");
        } catch (Throwable th) {
            new StringBuilder("downloadResources: throwable ").append(th);
        }
        if (!(jSONArray == null || jSONArray.size() == 0)) {
            String string = jSONArray.getString(0);
            if (string == null || !string.endsWith(WeexZipModule.NAME)) {
                this.i = string;
                if (!TextUtils.isEmpty(this.i)) {
                    xao.d(true, c6aVar);
                    if ("AR_SHOE_2".equals(this.e) && (tryShoeView = this.h) != null) {
                        tryShoeView.updateNNRPathWithUrl(this.i);
                        return;
                    } else if (!"AR_GLASS".equals(this.e) || this.l == null) {
                        if ("AR_WATCH".equals(this.e) && this.k != null && !TextUtils.isEmpty(this.i)) {
                            this.k.loadModel(this.i, E(i0(this.i)));
                            return;
                        }
                        return;
                    } else if (!TextUtils.isEmpty(this.i)) {
                        this.l.loadModel(this.i, E(i0(this.i)));
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.i = "";
    }

    public final /* synthetic */ void O(c6a c6aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f63e11", new Object[]{this, c6aVar});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        TryShoeView tryShoeView = this.h;
        if (tryShoeView == null) {
            TryShoeView tryShoeView2 = new TryShoeView(this.b, true);
            this.h = tryShoeView2;
            for (int childCount = this.f6355a.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f6355a.getChildAt(childCount);
                if ((childAt instanceof XRMakeupView) || (childAt instanceof XRAppOSView)) {
                    if (childAt instanceof XRAppOSView) {
                        ((XRAppOSView) childAt).destroy();
                    }
                    this.f6355a.removeView(childAt);
                    F();
                    this.f6355a.addView((View) tryShoeView2, (ViewGroup.LayoutParams) layoutParams);
                    str = this.i;
                    if (str != null && str.endsWith("nnr")) {
                        tryShoeView2.updateNNRPathWithUrl(this.i);
                    }
                }
            }
            this.f6355a.addView((View) tryShoeView2, (ViewGroup.LayoutParams) layoutParams);
            str = this.i;
            if (str != null) {
                tryShoeView2.updateNNRPathWithUrl(this.i);
            }
        } else {
            tryShoeView.resume();
        }
        JSONArray jSONArray = new JSONArray(2);
        jSONArray.addAll(Arrays.asList("output_video", "foot_visible"));
        if (c6aVar != null) {
            c6aVar.addExtraParam("supportedDataNameArrayInFrame", jSONArray).addExtraParam("currentGraphType", "AR_SHOE_2").addExtraParam("isDownload", "false").addExtraParam("walleTime", "100").addExtraParam("sourceDuration", "100").addExtraParam(amo.c.POINT_NAME, "100");
        }
        if (!TextUtils.isEmpty("5") && TextUtils.isDigitsOnly("5") && c6aVar != null) {
            c6aVar.addExtraParam("graphVersion", Integer.valueOf("5"));
        }
        if (!TextUtils.isEmpty(null) && c6aVar != null) {
            c6aVar.addExtraParam("monitorSessionId", null);
        }
        xao.d(true, c6aVar);
    }
}
