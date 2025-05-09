package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.taobao.R;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class rke implements fzb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int EVENT_HIDE_ALL_TIPS = 5;
    public static final int EVENT_HINT_MOVE = 1;
    public static final int EVENT_NO_SILENT_STATUS = 4;
    public static final int EVENT_TO_IRP = 3;
    public static final String TAG = "_scancode_ImageDetectV2Flow";

    /* renamed from: a  reason: collision with root package name */
    public final Context f27437a;
    public final s63 b;
    public final com.etao.feimagesearch.capture.scan.c c;
    public final jh7 f;
    public final String g;
    public final String h;
    public volatile boolean i;
    public String k;
    public long d = System.currentTimeMillis();
    public final long e = lg4.o2();
    public final Handler j = new b(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(730857539);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("13c524d4", new Object[]{aVar});
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/ImageDetectV2Flow$handler$1");
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
                rke rkeVar = rke.this;
                rke.m(rkeVar, rke.k(rkeVar), 1000L, "center", TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (i == 3) {
                Object obj = message.obj;
                if (!(obj instanceof Runnable)) {
                    return;
                }
                if (obj != null) {
                    ((Runnable) obj).run();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable");
            } else if (i == 4) {
                rke rkeVar2 = rke.this;
                rke.m(rkeVar2, rke.l(rkeVar2), 0L, "center", TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (i == 5) {
                rke.m(rke.this, "", 0L, "center", TipShowMsg.TipShowType.TEXT_TYPE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context c;
        public final /* synthetic */ IrpParamModel d;

        public c(Context context, IrpParamModel irpParamModel) {
            this.c = context;
            this.d = irpParamModel;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/ImageDetectV2Flow$jump2NewIrp$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            o4w.a();
            nmj.e(this.c, this.d);
        }
    }

    static {
        t2o.a(730857538);
        t2o.a(481297501);
    }

    public rke(Context context, s63 s63Var, com.etao.feimagesearch.capture.scan.c cVar) {
        ckf.g(context, "context");
        ckf.g(s63Var, "paiPresenter");
        ckf.g(cVar, "scancodeBizManager");
        this.f27437a = context;
        this.b = s63Var;
        this.c = cVar;
        jh7 jh7Var = new jh7();
        this.f = jh7Var;
        jh7Var.c();
        a aVar = Companion;
        this.g = a.a(aVar);
        CaptureManager m = s63Var.m().m();
        ckf.f(m, "paiPresenter.view.manager");
        this.h = aVar.c(m);
    }

    public static final /* synthetic */ String k(rke rkeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7337b7c0", new Object[]{rkeVar});
        }
        return rkeVar.g;
    }

    public static final /* synthetic */ String l(rke rkeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac600c01", new Object[]{rkeVar});
        }
        return rkeVar.h;
    }

    public static final /* synthetic */ void m(rke rkeVar, String str, long j, String str2, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a805e95b", new Object[]{rkeVar, str, new Long(j), str2, tipShowType});
        } else {
            rkeVar.r(str, j, str2, tipShowType);
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
            this.f.f();
        }
    }

    @Override // tb.fzb
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59db7629", new Object[]{this});
        } else if (q()) {
            p();
        }
    }

    @Override // tb.fzb
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1addcb85", new Object[]{this});
            return;
        }
        p();
        this.j.sendEmptyMessage(4);
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

    @Override // tb.fzb
    public void j(rk1 rk1Var, g1a<? super Boolean, xhv> g1aVar, qu3 qu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a6a29c", new Object[]{this, rk1Var, g1aVar, qu3Var});
            return;
        }
        ckf.g(rk1Var, "result");
        ckf.g(g1aVar, "processEnd");
        ckf.g(qu3Var, qu3.KEY);
    }

    public final boolean n(Bitmap bitmap, PhotoFrom.Values values, com.etao.feimagesearch.capture.scan.c cVar) {
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

    @Override // tb.fzb
    public void onDeviceMove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c6e40d", new Object[]{this});
        } else if (q()) {
            p();
            this.j.sendEmptyMessage(1);
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b14651", new Object[]{this});
            return;
        }
        this.j.removeMessages(1);
        this.j.removeMessages(3);
        this.j.removeMessages(4);
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5264fbf5", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.d <= this.e) {
            return false;
        }
        this.d = currentTimeMillis;
        return true;
    }

    public final void r(String str, long j, String str2, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d3cc2c", new Object[]{this, str, new Long(j), str2, tipShowType});
        } else if (!this.i && !this.b.m().m().Q() && !ckf.b(this.k, str) && this.b.m().m().B().q()) {
            this.k = str;
            this.b.m().m().B().t(new TipShowMsg(str, Long.valueOf(j), l53.b.SCENE_AUTO_DETECT, tipShowType));
        }
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
        agh.h(TAG, ckf.p("onObjectDetect ", Boolean.valueOf(this.i)));
        if (!this.i && this.b.m().m().U()) {
            pmf.e0();
            this.f.b();
            jzu.e("AutoDetect", new String[0]);
            agh.r("AutoDetect", "onObjectDetect", JSON.toJSONString(hashMap));
            jzu.e("AutoDetectMultiObject", "count", String.valueOf(list.size()));
            hashMap.put(l53.KEY_EXTRA_VERIFY, values.getValue());
            Context context = this.f27437a;
            yr3 p = this.b.m().p();
            ckf.f(p, "paiPresenter.view.pageModel");
            o(context, values, bitmap, list, jl0Var, hashMap, p);
            this.f.e();
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
        this.i = true;
    }

    public final void o(Context context, PhotoFrom.Values values, Bitmap bitmap, List<RectF> list, jl0 jl0Var, Map<String, String> map, yr3 yr3Var) {
        int i = 1;
        i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3247496", new Object[]{this, context, values, bitmap, list, jl0Var, map, yr3Var});
            return;
        }
        IrpParamModel irpParamModel = new IrpParamModel(yr3Var);
        irpParamModel.addExtraParam(wxi.KEY_FORCE_NEW_IRP, "true");
        irpParamModel.setPhotoFrom(values);
        irpParamModel.updateSessionId();
        int i2 = -1;
        if (values == PhotoFrom.Values.AUTO_DETECT) {
            if (lg4.C()) {
                if (n(bitmap, values, this.c)) {
                    i2 = bitmap.hashCode();
                } else {
                    i = 0;
                }
                agh.h("_scancode_", ckf.p("token is ", Integer.valueOf(i2)));
            }
            if (this.b.m().m().H()) {
                hre.INSTANCE.f(new y39(bitmap, null, 2, null));
                i2 = bitmap.hashCode();
                i = 261;
            }
        } else {
            i = 0;
        }
        a8m.e(bitmap, values, list, jl0Var, yr3Var, irpParamModel.getSessionId(), map, null, Integer.valueOf(i2), i);
        vpt.g("_scancode_ImageDetectV2Flow_jump2NewIrp", new c(context, irpParamModel));
    }
}
