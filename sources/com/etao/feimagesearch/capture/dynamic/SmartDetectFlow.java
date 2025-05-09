package com.etao.feimagesearch.capture.dynamic;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.capture.scan.c;
import com.etao.feimagesearch.mnn.AutoDetectExtraInfoCache;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.a8m;
import tb.agh;
import tb.c4p;
import tb.c7q;
import tb.ckf;
import tb.fzb;
import tb.g1a;
import tb.h19;
import tb.hx8;
import tb.jh7;
import tb.jl0;
import tb.jzu;
import tb.l53;
import tb.lg4;
import tb.mzu;
import tb.o5q;
import tb.ok1;
import tb.pmf;
import tb.qu3;
import tb.rk1;
import tb.s63;
import tb.sk1;
import tb.t2o;
import tb.wsq;
import tb.wxi;
import tb.x9d;
import tb.xhv;
import tb.yr3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SmartDetectFlow implements fzb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int EVENT_HIDE_ALL_TIPS = 5;
    public static final int EVENT_HINT_MOVE = 1;
    public static final int EVENT_NO_SILENT_STATUS = 4;
    public static final String TAG = "_scancode_SmartDetectFlow";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4631a;
    public final s63 b;
    public final c c;
    public final CaptureManager d;
    public final jh7 g;
    public final String h;
    public final String i;
    public final String k;
    public volatile boolean l;
    public final Handler o;
    public String p;
    public long e = System.currentTimeMillis();
    public final long f = lg4.o2();
    public final long j = lg4.v3();
    public final float m = lg4.D3();
    public final SparseArray<String> n = rk1.b.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(730857543);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f6db3226", new Object[]{aVar});
            }
            return aVar.b();
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2626559b", new Object[]{this});
            }
            JSONObject W1 = lg4.W1();
            ckf.f(W1, "getCaptureTipsConfig()");
            String i = h19.i(W1, "deviceMoveHint", Localization.q(R.string.taobao_app_1007_1_19037));
            ckf.f(i, "parseString(tipsConfig,\n…app_1007_1_19037)\n      )");
            return i;
        }

        public final String c(CaptureManager captureManager) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("14a7fb96", new Object[]{this, captureManager});
            }
            ckf.g(captureManager, "captureManager");
            JSONObject W1 = lg4.W1();
            ckf.f(W1, "getCaptureTipsConfig()");
            if (lg4.u4()) {
                if (captureManager.G()) {
                    str = h19.i(W1, "takePhotoTabMergeHintLowDevice", Localization.q(R.string.taobao_app_1007_1_19038));
                } else {
                    str = h19.i(W1, "takePhotoHint", Localization.q(R.string.taobao_app_1007_1_19042));
                }
                ckf.f(str, "{\n        if (captureMan…      )\n        }\n      }");
            } else {
                if (captureManager.G()) {
                    str = h19.i(W1, "detectScanMergeHint", Localization.q(R.string.taobao_app_1007_1_19034));
                } else {
                    str = h19.i(W1, "autoDetectHint", Localization.q(R.string.taobao_app_1007_1_19056));
                }
                ckf.f(str, "{\n        if (captureMan…      )\n        }\n      }");
            }
            return str;
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/SmartDetectFlow$handler$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            int i = message.what;
            if (i == 1) {
                SmartDetectFlow smartDetectFlow = SmartDetectFlow.this;
                SmartDetectFlow.m(smartDetectFlow, SmartDetectFlow.k(smartDetectFlow), 1000L, TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (i == 4) {
                SmartDetectFlow smartDetectFlow2 = SmartDetectFlow.this;
                SmartDetectFlow.m(smartDetectFlow2, SmartDetectFlow.l(smartDetectFlow2), 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (i == 5) {
                SmartDetectFlow.m(SmartDetectFlow.this, "", 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            }
        }
    }

    static {
        t2o.a(730857542);
        t2o.a(481297501);
    }

    public SmartDetectFlow(Activity activity, s63 s63Var, c cVar) {
        ckf.g(activity, "context");
        ckf.g(s63Var, "paiPresenter");
        ckf.g(cVar, "scancodeBizManager");
        this.f4631a = activity;
        this.b = s63Var;
        this.c = cVar;
        this.d = s63Var.m().m();
        jh7 jh7Var = new jh7();
        this.g = jh7Var;
        this.k = "baseline";
        jh7Var.c();
        a aVar = Companion;
        this.h = a.a(aVar);
        CaptureManager m = s63Var.m().m();
        ckf.f(m, "paiPresenter.view.manager");
        String c = aVar.c(m);
        this.i = c;
        String B3 = lg4.B3();
        ckf.f(B3, "getSmartLensBackTipConfig()");
        List z0 = wsq.z0(B3, new String[]{":"}, false, 0, 6, null);
        if (!z0.isEmpty()) {
            this.k = (String) z0.get(0);
        }
        t(c, 0L, TipShowMsg.TipShowType.TEXT_TYPE);
        this.o = new b(Looper.getMainLooper());
    }

    public static final /* synthetic */ String k(SmartDetectFlow smartDetectFlow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67c1a092", new Object[]{smartDetectFlow});
        }
        return smartDetectFlow.h;
    }

    public static final /* synthetic */ String l(SmartDetectFlow smartDetectFlow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97c41113", new Object[]{smartDetectFlow});
        }
        return smartDetectFlow.i;
    }

    public static final /* synthetic */ void m(SmartDetectFlow smartDetectFlow, String str, long j, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b427ad3", new Object[]{smartDetectFlow, str, new Long(j), tipShowType});
        } else {
            smartDetectFlow.t(str, j, tipShowType);
        }
    }

    @Override // tb.fzb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83328a9b", new Object[]{this});
        }
    }

    @Override // tb.fzb
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("374c397a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.fzb
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa39abd", new Object[]{this});
        } else {
            this.b.Z(false);
        }
    }

    @Override // tb.fzb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7f650e", new Object[]{this});
        } else {
            this.g.f();
        }
    }

    @Override // tb.fzb
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59db7629", new Object[]{this});
        } else if (r()) {
            q();
        }
    }

    @Override // tb.fzb
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1addcb85", new Object[]{this});
            return;
        }
        q();
        this.o.sendEmptyMessage(4);
    }

    @Override // tb.fzb
    public void g(PhotoFrom.Values values, jl0 jl0Var, Bitmap bitmap, List<RectF> list, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ee3a9a", new Object[]{this, values, jl0Var, bitmap, list, hashMap});
            return;
        }
        ckf.g(values, "photoFrom");
        ckf.g(jl0Var, "algoInfo");
        ckf.g(bitmap, IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP);
        ckf.g(list, "multiParts");
        ckf.g(hashMap, "extraInfoMap");
        agh.h(TAG, ckf.p("onObjectDetect ", Boolean.valueOf(this.l)));
        Activity activity = this.f4631a;
        yr3 p = this.b.m().p();
        ckf.f(p, "paiPresenter.view.pageModel");
        p(activity, values, bitmap, list, jl0Var, hashMap, p);
    }

    @Override // tb.fzb
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ffe1f3", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.fzb
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f4c8ff", new Object[]{this});
        } else {
            this.b.Z(true);
        }
    }

    public final boolean n(Bitmap bitmap, PhotoFrom.Values values, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5eb0f6d", new Object[]{this, bitmap, values, cVar})).booleanValue();
        }
        if (this.b.m() == null) {
            return false;
        }
        cVar.v(bitmap, this.b.m().P(), values, 0L, ScanFromEnum.SYS_CAMERA.getScanFrom(), true);
        return true;
    }

    public final s63 o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s63) ipChange.ipc$dispatch("9f1fb04a", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.fzb
    public void onDeviceMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c6e40d", new Object[]{this});
        } else if (r()) {
            q();
            this.o.sendEmptyMessage(1);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b14651", new Object[]{this});
            return;
        }
        this.o.removeMessages(1);
        this.o.removeMessages(4);
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5264fbf5", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.e <= this.f) {
            return false;
        }
        this.e = currentTimeMillis;
        return true;
    }

    public final void s(String str, int i, long j, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569091ad", new Object[]{this, str, new Integer(i), new Long(j), tipShowType});
        } else if (!this.l && !this.b.m().m().Q() && !ckf.b(this.p, str) && this.b.m().m().B().q()) {
            this.p = str;
            this.b.m().m().B().t(new TipShowMsg(str, Long.valueOf(j), l53.b.SCENE_AUTO_DETECT, tipShowType));
        }
    }

    public final void t(String str, long j, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95506b6", new Object[]{this, str, new Long(j), tipShowType});
        } else {
            s(str, -1, j, tipShowType);
        }
    }

    @Override // tb.fzb
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        agh.h(TAG, "release");
        this.l = true;
    }

    @Override // tb.fzb
    public void j(rk1 rk1Var, g1a<? super Boolean, xhv> g1aVar, qu3 qu3Var) {
        Set<Integer> b2;
        Set<Integer> b3;
        Set<Integer> b4;
        Set<Integer> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a6a29c", new Object[]{this, rk1Var, g1aVar, qu3Var});
            return;
        }
        ckf.g(rk1Var, "result");
        ckf.g(g1aVar, "processEnd");
        ckf.g(qu3Var, qu3.KEY);
        ok1 ok1Var = this.b.m().m().X;
        if (ok1Var != null) {
            ok1Var.f(rk1Var.p());
        }
        if (rk1Var.l() == 3 || rk1Var.l() == 6) {
            String str = this.k;
            if (ckf.b(str, "test1")) {
                s(rk1Var.q(this.n), rk1Var.l(), 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (ckf.b(str, "test2")) {
                this.b.m().m().B().t(new c7q());
            }
        } else {
            String q = rk1Var.q(this.n);
            if (!TextUtils.isEmpty(q)) {
                s(q, rk1Var.l(), 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            } else {
                t(this.i, 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            }
        }
        if (rk1Var.l() >= 0) {
            ok1 ok1Var2 = this.d.X;
            if (!(ok1Var2 == null || (c = ok1Var2.c()) == null)) {
                c.add(Integer.valueOf(rk1Var.l()));
            }
            mzu.q("Page_PhotoSearchTake", "tipExpose", "tipID", String.valueOf(rk1Var.l()));
        }
        String k = rk1Var.k();
        if (k != null) {
            switch (k.hashCode()) {
                case 1906701455:
                    if (k.equals(sk1.NEW_ALGORITHM_CODE)) {
                        if (lg4.H4()) {
                            g1aVar.invoke(Boolean.TRUE);
                            return;
                        }
                        Activity activity = this.f4631a;
                        PhotoFrom.Values values = PhotoFrom.Values.AUTO_DETECT;
                        Bitmap e = rk1Var.e();
                        List<RectF> a2 = rk1Var.a();
                        String M3 = lg4.M3();
                        ckf.f(M3, "getTrustTerminalAlgoConfig()");
                        jl0 jl0Var = new jl0("plt_smart_camera", M3);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(qu3.KEY, qu3Var.a());
                        String f = rk1Var.f();
                        if (f != null) {
                            linkedHashMap.put(AutoDetectExtraInfoCache.EXTRA_INFO_KEY, f);
                        }
                        xhv xhvVar = xhv.INSTANCE;
                        yr3 p = this.b.m().p();
                        ckf.f(p, "paiPresenter.view.pageModel");
                        p(activity, values, e, a2, jl0Var, linkedHashMap, p);
                        g1aVar.invoke(Boolean.TRUE);
                        return;
                    }
                    break;
                case 1906701456:
                    if (k.equals(sk1.INVALID_RESULT_CODE)) {
                        ok1 ok1Var3 = this.d.X;
                        if (!(ok1Var3 == null || (b2 = ok1Var3.b()) == null)) {
                            b2.add(0);
                        }
                        this.b.m().m().c0(false);
                        x9d n = this.b.m().m().n();
                        if (n != null) {
                            n.g(rk1Var.r(this.m), 1);
                        }
                        g1aVar.invoke(Boolean.TRUE);
                        mzu.i("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "0");
                        return;
                    }
                    break;
                case 1906701457:
                    if (k.equals(sk1.OLD_ALGORITHM_CODE)) {
                        ok1 ok1Var4 = this.d.X;
                        if (!(ok1Var4 == null || (b3 = ok1Var4.b()) == null)) {
                            b3.add(1);
                        }
                        Point g = rk1Var.g(this.b.m().m().o());
                        if (g != null) {
                            x9d n2 = this.b.m().m().n();
                            if (n2 != null) {
                                n2.n(g);
                            }
                            g1aVar.invoke(Boolean.TRUE);
                            mzu.i("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "1");
                            return;
                        }
                        return;
                    }
                    break;
                case 1906701458:
                    if (k.equals("A00003")) {
                        ok1 ok1Var5 = this.d.X;
                        if (!(ok1Var5 == null || (b4 = ok1Var5.b()) == null)) {
                            b4.add(4);
                        }
                        this.c.w(rk1Var.e(), this.b.m().m().o(), this.j, new SmartDetectFlow$onDetectResultCall$2(g1aVar, this));
                        mzu.i("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "4");
                        return;
                    }
                    break;
            }
        }
        g1aVar.invoke(Boolean.TRUE);
    }

    public final void p(Context context, PhotoFrom.Values values, Bitmap bitmap, List<RectF> list, jl0 jl0Var, Map<String, String> map, yr3 yr3Var) {
        int i;
        int i2 = 1;
        i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3247496", new Object[]{this, context, values, bitmap, list, jl0Var, map, yr3Var});
        } else if (!this.l && this.b.m().m().U()) {
            pmf.e0();
            this.g.b();
            jzu.e("AutoDetect", new String[0]);
            agh.r("AutoDetect", "onObjectDetect", JSON.toJSONString(map));
            jzu.e("AutoDetectMultiObject", "count", String.valueOf(list == null ? 0 : list.size()));
            map.put(l53.KEY_EXTRA_VERIFY, values.getValue());
            c4p.C("自动识别", "触发跳转", new Object[0]);
            IrpParamModel irpParamModel = new IrpParamModel(yr3Var);
            irpParamModel.addExtraParam(wxi.KEY_FORCE_NEW_IRP, "true");
            irpParamModel.setPhotoFrom(values);
            irpParamModel.updateSessionId();
            int i3 = -1;
            if (values == PhotoFrom.Values.AUTO_DETECT && lg4.C()) {
                if (n(bitmap, values, this.c)) {
                    i3 = bitmap.hashCode();
                } else {
                    i2 = 0;
                }
                agh.h("_scancode_", ckf.p("token is ", Integer.valueOf(i3)));
            }
            if (!this.b.m().m().F() || !hx8.g(hx8.Companion.a(), bitmap, null, 2, null)) {
                i = i2;
            } else {
                i3 = bitmap.hashCode();
                i = i2 | 16;
            }
            a8m.e(bitmap, values, list, jl0Var, yr3Var, irpParamModel.getSessionId(), map, this.d.d(yr3Var), Integer.valueOf(i3), i);
            this.o.post(new o5q(context, irpParamModel));
            this.g.e();
        }
    }
}
