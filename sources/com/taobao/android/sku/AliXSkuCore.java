package com.taobao.android.sku;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.ultron.vfw.dataloader.a;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.detail.ttdetail.TBSkuWrapper;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.sku.dinamicx.widget.RichTextView;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.android.tbsku.dialog.SkuLightoffProxy;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.global.SDKUtils;
import tb.a3q;
import tb.a8v;
import tb.ag0;
import tb.all;
import tb.b8v;
import tb.byj;
import tb.cjz;
import tb.dyw;
import tb.e0r;
import tb.evb;
import tb.hxj;
import tb.iyo;
import tb.jmb;
import tb.jo7;
import tb.kuk;
import tb.lr6;
import tb.mfb;
import tb.mvb;
import tb.nlt;
import tb.nr0;
import tb.o2q;
import tb.o3c;
import tb.on4;
import tb.or0;
import tb.q2q;
import tb.qub;
import tb.ra6;
import tb.rq6;
import tb.t2o;
import tb.vkb;
import tb.wl0;
import tb.yo0;
import tb.yv6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AliXSkuCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "AliXSkuCore";
    public static final String MARK_SHARED_PREFERENCES_KEY = "type";
    public static final String MARK_SHARED_PREFERENCES_NAME = "sku_mark_type";
    public static final String ULTRON_CONFIG_MODULE_NAME = "sku";
    public jmb A;
    public final String c;
    public final Context d;
    public final SkuCore e;
    public final com.alibaba.android.ultron.vfw.instance.a f;
    public final nr0 g;
    public final AliXSkuPresenterEngine h;
    public final or0 i;
    public on4 j;
    public m k;
    public l l;
    public j m;
    public g o;
    public String p;
    public final String r;
    public vkb s;
    public String t;
    public String u;
    public i w;
    public long x;
    public k y;
    public o3c z;

    /* renamed from: a  reason: collision with root package name */
    public int f9416a = 1002;
    public Map<String, Integer> b = new ConcurrentHashMap();
    public final Handler n = new Handler(Looper.getMainLooper());
    public String v = QueryParamsManager.DEFAULT_CART_FROM;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.sku.AliXSkuCore$10  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class AnonymousClass10 extends JSONObject {
        public final /* synthetic */ String val$pvIds;

        public AnonymousClass10(String str) {
            this.val$pvIds = str;
            put("subType", "check_prop_value");
            put("payload", (Object) new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore.10.1
                {
                    put("checkedPVs", (Object) AnonymousClass10.this.val$pvIds);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.sku.AliXSkuCore$9  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class AnonymousClass9 extends JSONObject {
        public final /* synthetic */ String val$pvIds;

        public AnonymousClass9(String str) {
            this.val$pvIds = str;
            put("action", "pvs_selected");
            put("params", (Object) new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore.9.1
                {
                    put("pvs", (Object) AnonymousClass9.this.val$pvIds);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f9417a;

        public a(boolean z) {
            this.f9417a = z;
        }

        @Override // com.taobao.android.sku.AliXSkuCore.h
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa861863", new Object[]{this});
                return;
            }
            if (this.f9417a) {
                AliXSkuCore.i(AliXSkuCore.this).q();
            }
            if (AliXSkuCore.this.q()) {
                if (o2q.c("enableWeexSilentLoadingOpt")) {
                    AliXSkuCore.i(AliXSkuCore.this).z(R.style.Alix_Sku_TranslucentPopupDialog);
                    AliXSkuCore.i(AliXSkuCore.this).w(-1);
                }
                AliXSkuCore.i(AliXSkuCore.this).q();
            } else {
                AliXSkuCore.i(AliXSkuCore.this).z(R.style.Alix_Sku_PopupDialog);
                AliXSkuCore.i(AliXSkuCore.this).w(R.style.Alix_Sku_PopupDialog_Animation);
                AliXSkuCore.i(AliXSkuCore.this).q();
                AliXSkuCore.this.o();
            }
            AliXSkuCore.d(AliXSkuCore.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f9418a;

        public b(h hVar) {
            this.f9418a = hVar;
        }

        @Override // com.taobao.android.sku.AliXSkuCore.h
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa861863", new Object[]{this});
                return;
            }
            AliXSkuCore.c(AliXSkuCore.this).removeCallbacks(AliXSkuCore.j(AliXSkuCore.this));
            h hVar = this.f9418a;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ra6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(AliXSkuCore aliXSkuCore) {
        }

        @Override // tb.ra6
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("403ecf43", new Object[]{this})).longValue();
            }
            return SDKUtils.getCorrectionTimeMillis();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements o3c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(AliXSkuCore aliXSkuCore) {
        }

        @Override // tb.o3c
        public void a(b8v b8vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7df442d7", new Object[]{this, b8vVar});
            }
        }

        @Override // tb.o3c
        public void b(b8v b8vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75de91b2", new Object[]{this, b8vVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                RecyclerView bodyView = AliXSkuCore.this.I().n().getBodyView();
                bodyView.smoothScrollToPosition(bodyView.getAdapter().getItemCount() - 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements a.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.g
        public void a(String str, a8v.d dVar) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc069103", new Object[]{this, str, dVar});
            } else if (dVar != null && (jSONObject = dVar.f15606a) != null) {
                jSONObject.getJSONObject("sku_script");
            }
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.i
        public void b(com.alibaba.android.ultron.vfw.dataloader.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b672491", new Object[]{this, aVar});
            }
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.g
        public void c(String str, com.alibaba.android.ultron.vfw.dataloader.a aVar) {
            JSONObject b;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18579e87", new Object[]{this, str, aVar});
                return;
            }
            AliXSkuCore.b(AliXSkuCore.this);
            if (aVar != null) {
                a.C0075a d = aVar.d();
                if (d != null) {
                    AliXSkuCore.e(AliXSkuCore.this).I(d.c);
                    AliXSkuCore.e(AliXSkuCore.this).G(d.b);
                }
                Object e = aVar.e(rq6.KEY_DATA_PARSER_RESULT);
                if ((e instanceof lr6) && (b = ((lr6) e).b()) != null && (jSONObject = b.getJSONObject("sku_script")) != null) {
                    AliXSkuCore.e(AliXSkuCore.this).E(jSONObject);
                    AliXSkuCore.f(AliXSkuCore.this, jSONObject.getJSONObject("id_biz_installment"));
                }
            }
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.i
        public void d(UltronError ultronError) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5f75dec", new Object[]{this, ultronError});
                return;
            }
            AliXSkuCore.b(AliXSkuCore.this);
            if (ultronError != null) {
                str = "domain: " + ultronError.domain + " code: " + ultronError.code + " msg: " + ultronError.getMessage();
            } else {
                str = "unknown UltronError is null";
            }
            SkuLogUtils.a(AliXSkuCore.g(AliXSkuCore.this), SkuLogUtils.UM_DOWNGRADE_E, str);
            if (AliXSkuCore.h(AliXSkuCore.this) != null) {
                AliXSkuCore.h(AliXSkuCore.this).onError(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(442499094);
        }

        private g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                AliXSkuCore.this.A0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface h {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface i {
        void onError(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface j {
        void a(Map<String, String> map, int i, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface k {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface l {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface m {
    }

    static {
        t2o.a(442499073);
    }

    public AliXSkuCore(Context context, String str, String str2) {
        if (context != null) {
            this.x = System.currentTimeMillis();
            str = TextUtils.isEmpty(str) ? "sku" : str;
            this.c = str;
            this.d = context;
            this.r = str2;
            if (cjz.b()) {
                UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
                ultronInstanceConfig.K(yv6.b(context));
                ultronInstanceConfig.z(str);
                ultronInstanceConfig.A(R(context));
                ultronInstanceConfig.b(UltronInstanceConfig.ExposureStrategy.EXPOSURE_ONCE);
                ultronInstanceConfig.n(true);
                ultronInstanceConfig.H(D());
                this.f = com.alibaba.android.ultron.vfw.instance.a.q(ultronInstanceConfig, context);
            }
            nr0 nr0Var = new nr0(this, context, this.f);
            this.g = nr0Var;
            AliXSkuPresenterEngine aliXSkuPresenterEngine = new AliXSkuPresenterEngine(context, this);
            this.h = aliXSkuPresenterEngine;
            com.alibaba.android.ultron.vfw.instance.a aVar = this.f;
            this.i = new or0(context, this, aVar == null ? null : aVar.getEventHandler());
            this.e = new SkuCore(this, context, this.f, nr0Var, aliXSkuPresenterEngine);
            this.j = new on4();
            if (cjz.b()) {
                Q();
                T();
                f0();
            }
            U();
            P();
            if (cjz.b()) {
                p0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("params context can not be null");
    }

    public static /* synthetic */ String a(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f57aeef7", new Object[]{aliXSkuCore});
        }
        return aliXSkuCore.v;
    }

    public static /* synthetic */ void b(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501cff8a", new Object[]{aliXSkuCore});
        } else {
            aliXSkuCore.s0();
        }
    }

    public static /* synthetic */ Handler c(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("f8dd194e", new Object[]{aliXSkuCore});
        }
        return aliXSkuCore.n;
    }

    public static /* synthetic */ void d(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa59810", new Object[]{aliXSkuCore});
        } else {
            aliXSkuCore.b0();
        }
    }

    public static /* synthetic */ nr0 e(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nr0) ipChange.ipc$dispatch("574bf06d", new Object[]{aliXSkuCore});
        }
        return aliXSkuCore.g;
    }

    public static /* synthetic */ void f(AliXSkuCore aliXSkuCore, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbb2f64", new Object[]{aliXSkuCore, jSONObject});
        } else {
            aliXSkuCore.l(jSONObject);
        }
    }

    public static /* synthetic */ String g(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8a1c73", new Object[]{aliXSkuCore});
        }
        return aliXSkuCore.c;
    }

    public static void g0(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb602955", new Object[]{sVar});
        } else if (sVar != null) {
            sVar.u(dyw.DX_WIDGET_ID, new dyw());
            sVar.u(RichTextView.DX_WIDGET_ID, new RichTextView());
            sVar.u(a3q.DX_WIDGET_ID, new a3q());
            sVar.u(nlt.DX_WIDGET_ID, new nlt());
            sVar.r(e0r.DX_PARSER_ID, new e0r());
            sVar.r(iyo.DX_PARSER_ID, new iyo(null));
            sVar.s(kuk.DX_WIDGET_ID, new kuk(null));
        }
    }

    public static /* synthetic */ i h(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("62ed4da5", new Object[]{aliXSkuCore});
        }
        return aliXSkuCore.w;
    }

    public static /* synthetic */ AliXSkuPresenterEngine i(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuPresenterEngine) ipChange.ipc$dispatch("8bf9f12d", new Object[]{aliXSkuCore});
        }
        return aliXSkuCore.h;
    }

    public static /* synthetic */ g j(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ea0e8795", new Object[]{aliXSkuCore});
        }
        return aliXSkuCore.o;
    }

    public or0 A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (or0) ipChange.ipc$dispatch("1035257b", new Object[]{this});
        }
        return this.i;
    }

    public void A0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11dc0b32", new Object[]{this});
        } else {
            this.h.q();
        }
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.g.i();
    }

    public final void B0(String str, JSONObject jSONObject, String str2, a.h hVar, boolean z, h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259018", new Object[]{this, str, jSONObject, str2, hVar, new Boolean(z), hVar2});
            return;
        }
        if (z) {
            if (this.o == null) {
                this.o = new g();
            }
            this.n.postDelayed(this.o, 500L);
        }
        b bVar = new b(hVar2);
        if (!cjz.b()) {
            this.e.H(str, str2, hVar, bVar);
        } else if (!TextUtils.isEmpty(this.g.w())) {
            this.e.H(str, str2, hVar, bVar);
        } else {
            H0(jSONObject, str2, hVar, bVar);
        }
        r();
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af04c717", new Object[]{this})).intValue();
        }
        return this.f9416a;
    }

    public void C0(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb56fa", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        this.p = str2;
        B0(str, null, null, null, z, new a(z));
    }

    public void D0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e6a141", new Object[]{this, new Integer(i2)});
        } else if (cjz.a()) {
            SkuLogUtils.x("AliXSkuCore.switchMarkType");
        } else {
            this.f9416a = i2;
            this.f.u0(i2);
        }
    }

    public JSONObject E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b45ceb8", new Object[]{this});
        }
        return this.g.n();
    }

    public void E0(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a314b9", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        o();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            this.b = new ConcurrentHashMap();
            this.g.J(jSONObject);
            this.e.M(str, this.g, z);
        }
    }

    public Map<String, Integer> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2e234e2", new Object[]{this});
        }
        return this.b;
    }

    public void F0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864098d9", new Object[]{this, str, str2});
        } else {
            o();
        }
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f273c75b", new Object[]{this});
        }
        return this.g.q();
    }

    public void G0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b61a39", new Object[]{this, str});
        } else {
            this.e.N("", str);
        }
    }

    public String H() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c61a6d7", new Object[]{this});
        }
        JSONObject c2 = this.g.c();
        if (c2 == null || (jSONObject = c2.getJSONObject("global_data")) == null) {
            return "0";
        }
        String string = jSONObject.getString(q2q.KEY_SKU_ID);
        return TextUtils.isEmpty(string) ? "0" : string;
    }

    public void H0(JSONObject jSONObject, String str, a.h hVar, h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e200e68d", new Object[]{this, jSONObject, str, hVar, hVar2});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("AliXSkuCore.updateSku");
        } else {
            this.g.b(jSONObject);
            this.f.f0(this.g.n(), str, hVar);
        }
        if (hVar2 != null) {
            hVar2.a();
        }
    }

    public AliXSkuPresenterEngine I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuPresenterEngine) ipChange.ipc$dispatch("9b52a008", new Object[]{this});
        }
        return this.h;
    }

    public on4 J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (on4) ipChange.ipc$dispatch("7cd189ea", new Object[]{this});
        }
        return this.j;
    }

    public com.alibaba.android.ultron.vfw.instance.a K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("53dc8f1e", new Object[]{this});
        }
        return this.f;
    }

    public String L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206169f7", new Object[]{this});
        }
        return this.r;
    }

    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3001b5e", new Object[]{this});
        }
        return this.u;
    }

    public void N(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfef506b", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("AliXSkuCore.initDataConfig");
        }
        this.g.z(str, str2, str3, str4);
        this.e.w(this.g);
    }

    public void O(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed9d4f4", new Object[]{this, jSONObject});
            return;
        }
        this.g.y(jSONObject);
        this.e.v(this.g);
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e054b661", new Object[]{this});
        } else {
            this.g.H(new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore.1
                {
                    put("addCartFrom", (Object) AliXSkuCore.a(AliXSkuCore.this));
                }
            });
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd66f8ff", new Object[]{this});
            return;
        }
        this.z = new d(this);
        if (cjz.b()) {
            this.f.n(this.z);
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa0044", new Object[]{this});
            return;
        }
        mfb n = this.h.n();
        if (n != null) {
            if (cjz.b()) {
                this.f.O(n.a(), n.getBodyView(), n.c());
            }
            this.e.y(this.h);
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c27b121", new Object[]{this});
        } else {
            this.f.v0(new f());
        }
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfeec483", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.r)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(hxj.UNIQID, (Object) this.r);
            x0(jSONObject);
        }
    }

    public void V(int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5745673", new Object[]{this, new Integer(i2), str});
        } else {
            W(null, i2, str);
        }
    }

    public void W(Map<String, String> map, int i2, String str) {
        j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39a3942", new Object[]{this, map, new Integer(i2), str});
        } else if (o2q.c("enable_sku_mtop_monitor") && (jVar = this.m) != null) {
            jVar.a(map, i2, str);
        }
    }

    public void X(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a721428", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        l lVar = this.l;
        if (lVar != null) {
            ((SkuLightoffProxy.b) lVar).a(i2, i3);
        }
    }

    public void Y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104573c3", new Object[]{this, jSONObject});
            return;
        }
        k kVar = this.y;
        if (kVar != null) {
            ((TBXSkuCore.g) kVar).a(jSONObject);
        }
    }

    public void Z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98de7839", new Object[]{this, jSONObject});
        } else {
            this.e.C(jSONObject);
        }
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f1544b", new Object[]{this});
            return;
        }
        this.e.D();
        m mVar = this.k;
        if (mVar != null) {
            ((OpenSkuImplementor.AnonymousClass4) mVar).a();
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7f9e91", new Object[]{this});
            return;
        }
        Log.e("SKU trace", "show dialog time " + System.currentTimeMillis());
        if (this.x > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.x;
            String str = this.c;
            SkuLogUtils.a(str, SkuLogUtils.UM_PERFORMANCE_M, "开启耗时：" + ((currentTimeMillis / 50) * 50));
            this.x = 0L;
        }
    }

    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d42c4", new Object[]{this});
        } else {
            this.e.E();
        }
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2666408", new Object[]{this});
        } else {
            this.h.r();
        }
    }

    public void e0(mfb mfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff41e3c", new Object[]{this, mfbVar});
        } else {
            this.h.u(mfbVar);
        }
    }

    public final void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b535d4", new Object[]{this});
            return;
        }
        j0(dyw.DX_WIDGET_ID, new dyw());
        j0(RichTextView.DX_WIDGET_ID, new RichTextView());
        j0(a3q.DX_WIDGET_ID, new a3q());
        j0(nlt.DX_WIDGET_ID, new nlt());
        i0(e0r.DX_PARSER_ID, new e0r());
        i0(iyo.DX_PARSER_ID, new iyo(this.b));
        h0(kuk.DX_WIDGET_ID, new kuk(this.b));
    }

    public void h0(long j2, mvb mvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc875eb", new Object[]{this, new Long(j2), mvbVar});
        } else {
            this.f.A0(j2, mvbVar);
        }
    }

    public void i0(long j2, evb evbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772f6e32", new Object[]{this, new Long(j2), evbVar});
        } else {
            this.f.B0(j2, evbVar);
        }
    }

    public void j0(long j2, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54f8a96", new Object[]{this, new Long(j2), qubVar});
        } else {
            this.f.C0(j2, qubVar);
        }
    }

    public void k0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfe67f5", new Object[]{this, str, jSONObject});
        } else {
            this.g.D(str, jSONObject);
        }
    }

    public final void l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c655", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty() && Boolean.parseBoolean(jSONObject.getString("shouldScrollToBankPeriod"))) {
            this.n.postDelayed(new e(), 15L);
        }
    }

    public void l0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb992ba", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.v = str;
            x0(new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore.3
                {
                    put("addCartFrom", (Object) AliXSkuCore.a(AliXSkuCore.this));
                }
            });
        }
    }

    public void m(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827b6981", new Object[]{this, str});
            return;
        }
        Z(new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore.11
            {
                put("action", "sku_id_selected");
                put("params", (Object) new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore.11.1
                    {
                        put(q2q.KEY_SKU_ID, (Object) str);
                    }
                });
            }
        });
        if (cjz.a()) {
            SkuLogUtils.x("AliXSkuCore.checkSkuId");
            return;
        }
        b8v e2 = this.f.getEventHandler().e();
        e2.t(ag0.EVENT_TYPE);
        e2.r(new DMEvent(ag0.EVENT_TYPE, new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore.12
            {
                put("subType", "check_prop_value");
                put("payload", (Object) new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore.12.1
                    {
                        put("checkedSkuId", (Object) str);
                    }
                });
            }
        }, null));
        this.f.getEventHandler().k(e2);
    }

    public void m0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
            return;
        }
        p();
        if (cjz.b()) {
            this.f.d0(this.z);
            this.f.r();
        }
        this.e.n();
        this.j.b();
        all.INSTANCE.a();
    }

    public void n0(vkb vkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b921c82a", new Object[]{this, vkbVar});
        } else {
            this.s = vkbVar;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else {
            this.h.k();
        }
    }

    public void o0(jmb jmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329bf58", new Object[]{this, jmbVar});
        } else {
            this.A = jmbVar;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130ba0c5", new Object[]{this});
        } else {
            this.h.j();
        }
    }

    public final void p0() {
        s b2;
        DinamicXEngine k2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d68310", new Object[]{this});
            return;
        }
        jo7 A = this.f.A();
        if (A != null && (b2 = A.b()) != null && (k2 = b2.k()) != null) {
            k2.T0(new c(this));
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dffe3a", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.p) || !o2q.c("enable_weex_silent_action") || !this.g.r()) {
            return false;
        }
        String v = v();
        boolean p = this.g.p();
        boolean m2 = this.g.m();
        if ("BUYNOW".equals(v) && !p && !m2 && this.g.A()) {
            return true;
        }
        if (!"ADDCART".equals(v) || p || !this.g.B()) {
            return false;
        }
        return true;
    }

    public void q0(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a99af26", new Object[]{this, iVar});
        } else {
            this.w = iVar;
        }
    }

    public void r0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21928974", new Object[]{this, jSONObject});
            return;
        }
        this.g.F(jSONObject);
        this.e.B(this.g);
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a73b0a4", new Object[]{this});
        }
        return this.v;
    }

    public final void s0() {
        a8v E;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92d454e", new Object[]{this});
        } else if (yv6.b(this.d) && (E = this.f.E()) != null) {
            if (E.j()) {
                this.h.x(new HashMap<String, String>() { // from class: com.taobao.android.sku.AliXSkuCore.7
                    {
                        put("engineType", "JSI");
                    }
                });
            } else if (E.k()) {
                this.h.x(new HashMap<String, String>() { // from class: com.taobao.android.sku.AliXSkuCore.8
                    {
                        put("engineType", "Web");
                    }
                });
            }
        }
    }

    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.t;
    }

    public void t0(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9431e3b", new Object[]{this, kVar});
        } else {
            this.y = kVar;
        }
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.c;
    }

    public void u0(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932099da", new Object[]{this, lVar});
        } else {
            this.l = lVar;
        }
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9df6315", new Object[]{this});
        }
        return this.e.o();
    }

    public void v0(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4e0601", new Object[]{this, jVar});
        } else {
            this.m = jVar;
        }
    }

    public vkb w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vkb) ipChange.ipc$dispatch("bdda98ea", new Object[]{this});
        }
        return this.s;
    }

    public void w0(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9978deba", new Object[]{this, mVar});
        } else {
            this.k = mVar;
        }
    }

    public Rect x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("3fdf28af", new Object[]{this});
        }
        jmb jmbVar = this.A;
        if (jmbVar == null) {
            return null;
        }
        return ((TBSkuWrapper.a) jmbVar).a();
    }

    public void x0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37798f30", new Object[]{this, jSONObject});
            return;
        }
        this.g.H(jSONObject);
        this.e.B(this.g);
    }

    public Context y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.d;
    }

    public void y0(on4 on4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced8282e", new Object[]{this, on4Var});
        } else if (on4Var != null && on4Var != this.j) {
            this.j = on4Var;
        }
    }

    public nr0 z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nr0) ipChange.ipc$dispatch("ddbdbfab", new Object[]{this});
        }
        return this.g;
    }

    public void z0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0aad8", new Object[]{this, str});
        } else {
            this.u = str;
        }
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e71efb", new Object[]{this})).booleanValue();
        }
        AliConfigInterface b2 = yo0.b();
        if (b2 == null) {
            return false;
        }
        return Boolean.parseBoolean(b2.getConfig(byj.DETAIL_TAOBAO_GROUP_NAME, "sku_multi_js_engine", "true"));
    }

    public final int R(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65de6b9d", new Object[]{this, context})).intValue();
        }
        int i2 = context.getApplicationContext().getSharedPreferences(MARK_SHARED_PREFERENCES_NAME, 0).getInt("type", this.f9416a);
        this.f9416a = i2;
        return i2;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7140201d", new Object[]{this});
        } else if (this.g.n() == null) {
            SkuLogUtils.k("exposureSku return because mDataEngine originData null");
        } else {
            SkuCore skuCore = this.e;
            SkuLogUtils.e(this.g.i(), this.g.o(), M(), G(), skuCore.l(skuCore.s(this.g, false)));
            this.e.m();
            try {
                wl0.a().commitEnter(SkuLogUtils.PAGE_NAME, B(), this.d, "itemId=" + this.g.i(), "sellerId=" + this.g.o());
            } catch (Throwable th) {
                SkuLogUtils.k(" AbstractBehaviRProtocol.commitEnter exception " + th);
            }
        }
    }
}
