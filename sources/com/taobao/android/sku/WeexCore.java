package com.taobao.android.sku;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.sku.weex.WeexMessageHandler;
import com.taobao.android.sku.weex.WeexWrapper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import tb.all;
import tb.cjz;
import tb.go2;
import tb.jxh;
import tb.k7m;
import tb.l8x;
import tb.m0u;
import tb.nfb;
import tb.nr0;
import tb.o2q;
import tb.q2q;
import tb.q3q;
import tb.t2o;
import tb.to8;
import tb.txl;
import tb.uq4;
import tb.vkb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9430a;
    public final SkuCore b;
    public final AliXSkuCore c;
    public final nr0 d;
    public final AliXSkuPresenterEngine e;
    public ViewGroup f;
    public final WeexWrapper g;
    public volatile boolean h;
    public boolean i;
    public WeexMessageHandler j;
    public String n;
    public boolean o;
    public String p;
    public String q;
    public a.h r;
    public AliXSkuCore.h s;
    public final int x;
    public final Handler k = new Handler(Looper.getMainLooper());
    public String l = "";
    public String m = "ADDCART_AND_BUYNOW";
    public boolean t = true;
    public volatile boolean u = SkuCore.l;
    public int v = 1;
    public final Runnable w = new a();

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface SkuWeexType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WeexCore.this.N();
            if (WeexCore.a(WeexCore.this) != null && o2q.c("setPageVisibleCallShowSku")) {
                WeexCore.a(WeexCore.this).X(WeexCore.b(WeexCore.this).v(), true);
            }
            SkuLogUtils.t(SkuLogUtils.UM_SKU_SILENT_TIMEOUT);
            WeexCore.b(WeexCore.this).V(-700005, "TimeOutCallSetPageVisible");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements nfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.nfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4ac0136", new Object[]{this});
            } else {
                WeexCore.c(WeexCore.this).i();
            }
        }

        @Override // tb.nfb
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c52bc43b", new Object[]{this});
            } else {
                WeexCore.c(WeexCore.this).h();
            }
        }

        @Override // tb.nfb
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14d14ca7", new Object[]{this});
            } else {
                WeexCore.c(WeexCore.this).j();
            }
        }

        @Override // tb.nfb
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d643270b", new Object[]{this});
            } else {
                WeexCore.c(WeexCore.this).k();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(WeexCore weexCore) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Log.e("Weex SKU", "Weex SKU Container Clicked");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements WeexWrapper.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                WeexCore.g(WeexCore.this, true);
                if (!WeexCore.b(WeexCore.this).q()) {
                    WeexCore.b(WeexCore.this).o();
                }
                if (WeexCore.a(WeexCore.this) != null) {
                    WeexCore.a(WeexCore.this).x();
                }
            }
        }

        static {
            t2o.a(442499134);
            t2o.a(442499356);
        }

        public d() {
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            } else if (WeexCore.f(WeexCore.this) != null && view != null) {
                WeexCore.f(WeexCore.this).removeAllViews();
                WeexCore.f(WeexCore.this).addView(view, -1, -1);
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.a
        public void b(WeexWrapper.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707d97ef", new Object[]{this, bVar});
            } else {
                WeexCore.h(WeexCore.this).post(new a());
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.a
        public void c(WeexWrapper.b bVar, String str, String str2) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c7d0201", new Object[]{this, bVar, str, str2});
                return;
            }
            WeexCore weexCore = WeexCore.this;
            weexCore.p("Active=" + str, str2);
            if ("BUYNOW".equals(WeexCore.d(WeexCore.this))) {
                i = -700001;
            } else {
                i = -700002;
            }
            WeexCore.b(WeexCore.this).V(i, "WeexRenderException");
        }

        public /* synthetic */ d(WeexCore weexCore, a aVar) {
            this();
        }
    }

    static {
        t2o.a(442499125);
    }

    public WeexCore(SkuCore skuCore, AliXSkuCore aliXSkuCore, Context context, nr0 nr0Var, AliXSkuPresenterEngine aliXSkuPresenterEngine, int i) {
        this.b = skuCore;
        this.c = aliXSkuCore;
        this.f9430a = context;
        this.e = aliXSkuPresenterEngine;
        this.d = nr0Var;
        this.x = i;
        this.g = new WeexWrapper(context, i, aliXSkuCore.L());
        y();
    }

    public static boolean B(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7437df17", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (!TextUtils.equals(parse.getHost(), parse2.getHost()) || !TextUtils.equals(parse.getPath(), parse2.getPath())) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ WeexMessageHandler a(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexMessageHandler) ipChange.ipc$dispatch("c3e50ef3", new Object[]{weexCore});
        }
        return weexCore.j;
    }

    public static /* synthetic */ AliXSkuCore b(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuCore) ipChange.ipc$dispatch("a680e4e4", new Object[]{weexCore});
        }
        return weexCore.c;
    }

    public static /* synthetic */ WeexWrapper c(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexWrapper) ipChange.ipc$dispatch("c24d528b", new Object[]{weexCore});
        }
        return weexCore.g;
    }

    public static /* synthetic */ String d(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aac6689f", new Object[]{weexCore});
        }
        return weexCore.m;
    }

    public static /* synthetic */ String e(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d05a71a0", new Object[]{weexCore});
        }
        return weexCore.l;
    }

    public static /* synthetic */ ViewGroup f(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f0135b56", new Object[]{weexCore});
        }
        return weexCore.f;
    }

    public static /* synthetic */ boolean g(WeexCore weexCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4fd745c", new Object[]{weexCore, new Boolean(z)})).booleanValue();
        }
        weexCore.i = z;
        return z;
    }

    public static /* synthetic */ Handler h(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("77ea5209", new Object[]{weexCore});
        }
        return weexCore.k;
    }

    public static boolean q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee095c6b", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2) || B(str, str2) || !o2q.c("enable_newbuy_downto_skuv3")) {
            return false;
        }
        return true;
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("168919", new Object[]{this})).booleanValue();
        }
        boolean C = this.u | nr0.C(this.n);
        this.u = C;
        return C;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d82c08b", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6189b22", new Object[]{this})).booleanValue();
        }
        WeexMessageHandler weexMessageHandler = this.j;
        if (weexMessageHandler != null) {
            return weexMessageHandler.w(this.c.L());
        }
        return false;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        return this.g.g();
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f1544b", new Object[]{this});
            return;
        }
        WeexMessageHandler weexMessageHandler = this.j;
        if (weexMessageHandler != null) {
            weexMessageHandler.P(null);
            this.k.removeCallbacksAndMessages(null);
        }
    }

    public void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661bc890", new Object[]{this, new Boolean(z)});
            return;
        }
        txl.h().q("onPreSkuShow", "afterMtop");
        j();
        if (TextUtils.isEmpty(this.n)) {
            SkuLogUtils.k("TouchDown preShowSku return because url empty weexType=" + this.x);
            return;
        }
        SkuLogUtils.k("TouchDown WeexCore preShowSku");
        if (!this.h) {
            m();
            if (!this.g.f()) {
                K(z);
            }
        }
        WeexMessageHandler weexMessageHandler = this.j;
        if (weexMessageHandler != null) {
            weexMessageHandler.V(null, s());
            txl.h().p("onPreSkuShow", null);
            SkuLogUtils.k("TouchDown WeexCore mMessageHandler.postPreSkuShow");
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4366d", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = this.c.z().e().getJSONObject("skuTimeStamp");
            if (jSONObject != null) {
                jSONObject.put(SkuLogUtils.P_SKU_INIT, (Object) "-1");
                jSONObject.put(SkuLogUtils.P_WEEX_NEW, (Object) "-1");
                jSONObject.put(SkuLogUtils.P_WEEX_RENDER, (Object) "-1");
            }
        } catch (Throwable unused) {
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bfd112", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = this.c.z().e().getJSONObject("skuTimeStamp");
            if (jSONObject != null) {
                jSONObject.put("isNotPreloaded", (Object) Boolean.valueOf(WeexWrapper.e));
                jSONObject.put("isPreloadedButNotReady", (Object) Boolean.valueOf(WeexWrapper.f));
            }
        } catch (Throwable unused) {
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2dbd28", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        this.k.removeCallbacks(this.w);
        this.c.o();
    }

    public final void O(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb9a840", new Object[]{this, str, new Long(j)});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = this.c.z().e().getJSONObject("skuTimeStamp");
                if (jSONObject != null) {
                    jSONObject.put(str, (Object) (j + ""));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean P(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("966d04ac", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (this.c.q()) {
            return true;
        }
        if (z) {
            return false;
        }
        if (!o2q.e()) {
            return true;
        }
        return !z2;
    }

    public void Q(boolean z, String str, String str2, a.h hVar, AliXSkuCore.h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb34d2f", new Object[]{this, new Boolean(z), str, str2, hVar, hVar2});
            return;
        }
        i(str, str2, hVar, hVar2);
        j();
        txl.h().p("beforeWeexInitInShow", null);
        if (!this.h) {
            m();
            if (!this.g.f()) {
                K(z);
            }
        }
        txl.h().q("afterWeexRenderInShow", "afterMtop");
        boolean z2 = this.t;
        if (!z2) {
            L();
            this.t = false;
        }
        if (this.f != null) {
            if (this.c.q()) {
                this.f.setVisibility(4);
                this.k.removeCallbacks(this.w);
                this.k.postDelayed(this.w, 5000L);
            } else {
                this.f.setVisibility(0);
            }
        }
        if (hVar2 != null) {
            hVar2.a();
        }
        if (P(this.i, z2)) {
            this.c.d0();
        }
        txl.h().p("afterWeexRenderInShow", null);
        txl.h().p("afterMtop", null);
        I();
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b72f36a", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85a4b9c", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (P(this.i, this.t)) {
            this.c.d0();
        }
        txl.h().p("beforeWeexInitInUpdate", null);
        m();
        K(false);
        txl.h().p("afterMtop", null);
        I();
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5cc2fa", new Object[]{this, new Boolean(z)});
            return;
        }
        j();
        WeexMessageHandler weexMessageHandler = this.j;
        if (weexMessageHandler != null) {
            weexMessageHandler.K(this.d.n(), z);
        }
    }

    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6be760", new Object[]{this, str});
            return;
        }
        WeexMessageHandler weexMessageHandler = this.j;
        if (weexMessageHandler != null) {
            weexMessageHandler.L(str);
        }
    }

    public String V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.n;
    }

    public final void i(String str, String str2, a.h hVar, AliXSkuCore.h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25734021", new Object[]{this, str, str2, hVar, hVar2});
            return;
        }
        this.p = str;
        this.q = str2;
        this.r = hVar;
        this.s = hVar2;
    }

    public final void j() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7e946", new Object[]{this});
            return;
        }
        this.l = this.d.i();
        if (this.x == 3) {
            this.n = this.d.x();
        } else {
            this.n = this.d.s();
        }
        JSONObject e = this.d.e();
        if (e != null && (jSONObject = e.getJSONObject("id_biz_bottom")) != null) {
            String string = jSONObject.getString("bottomMode");
            if (TextUtils.isEmpty(string)) {
                string = "ADDCART_AND_BUYNOW";
            }
            this.m = string;
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feef094c", new Object[]{this});
            return;
        }
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d3aec4", new Object[]{this});
            return;
        }
        vkb w = this.c.w();
        if (w != null) {
            w.a(u("CLOSE_BTN", null, null, null, null, null, null, null));
        }
        this.e.j();
    }

    public final String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f007f04d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("_sku_token_", this.c.L());
        all allVar = all.INSTANCE;
        String c2 = allVar.c(this.f9430a);
        if (c2 != null && allVar.f(this.f9430a)) {
            buildUpon.appendQueryParameter(k7m.KEY_DEVICE_TYPE, c2);
        }
        return buildUpon.build().toString();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.k.removeCallbacksAndMessages(null);
        this.g.b();
        l8x.c(this.c.L() + this.x);
        this.h = false;
        this.i = false;
        WeexMessageHandler weexMessageHandler = this.j;
        if (weexMessageHandler != null) {
            weexMessageHandler.m();
            this.j = null;
        }
    }

    public final int r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17290622", new Object[]{this, str})).intValue();
        }
        if (jxh.d(str)) {
            return 2;
        }
        return 1;
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9df6315", new Object[]{this});
        }
        return this.m;
    }

    public final JSONObject t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3536efff", new Object[]{this});
        }
        JSONObject n = this.c.z().n();
        if (n == null) {
            return new JSONObject();
        }
        return n;
    }

    public final JSONObject u(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e2530e9", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8});
        }
        return new JSONObject(str, str2, str3, str4, str5, str6, str7, str8) { // from class: com.taobao.android.sku.WeexCore.5
            public final /* synthetic */ String val$actionFrom;
            public final /* synthetic */ String val$bookingDate;
            public final /* synthetic */ String val$entranceDate;
            public final /* synthetic */ String val$exParams;
            public final /* synthetic */ String val$quantity;
            public final /* synthetic */ String val$serviceId;
            public final /* synthetic */ String val$skuId;
            public final /* synthetic */ String val$tgKey;

            {
                this.val$actionFrom = str;
                this.val$skuId = str2;
                this.val$quantity = str3;
                this.val$serviceId = str4;
                this.val$tgKey = str5;
                this.val$bookingDate = str6;
                this.val$entranceDate = str7;
                this.val$exParams = str8;
                put("actionFrom", (Object) (TextUtils.isEmpty(str) ? "NULL" : str));
                put("inputMode", (Object) WeexCore.d(WeexCore.this));
                put(go2.EVENT_TYPE, (Object) new JSONObject() { // from class: com.taobao.android.sku.WeexCore.5.1
                    {
                        put("itemId", (Object) WeexCore.e(WeexCore.this));
                        put(q2q.KEY_SKU_ID, (Object) AnonymousClass5.this.val$skuId);
                        put("quantity", (Object) AnonymousClass5.this.val$quantity);
                        String str9 = "";
                        put("serviceId", (Object) (!TextUtils.isEmpty(AnonymousClass5.this.val$serviceId) ? AnonymousClass5.this.val$serviceId : str9));
                        put("tgKey", (Object) (!TextUtils.isEmpty(AnonymousClass5.this.val$tgKey) ? AnonymousClass5.this.val$tgKey : str9));
                        put("bookingDate", (Object) (!TextUtils.isEmpty(AnonymousClass5.this.val$bookingDate) ? AnonymousClass5.this.val$bookingDate : str9));
                        put("entranceDate", (Object) (!TextUtils.isEmpty(AnonymousClass5.this.val$entranceDate) ? AnonymousClass5.this.val$entranceDate : str9));
                        put("exParams", (Object) (!TextUtils.isEmpty(AnonymousClass5.this.val$exParams) ? AnonymousClass5.this.val$exParams : str9));
                    }
                });
                put(to8.ADD_CART, (Object) new JSONObject() { // from class: com.taobao.android.sku.WeexCore.5.2
                    {
                        put("itemId", (Object) WeexCore.e(WeexCore.this));
                        put(q2q.KEY_SKU_ID, (Object) AnonymousClass5.this.val$skuId);
                        put("quantity", (Object) AnonymousClass5.this.val$quantity);
                    }
                });
            }
        };
    }

    public final String v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ee0de47", new Object[]{this, new Integer(i)});
        }
        if (i == 3) {
            if (this.v == 2) {
                return SkuLogUtils.UM_WEEX2_E_PREFIX;
            }
            return SkuLogUtils.UM_WEEX_E_PREFIX;
        } else if (this.v == 2) {
            return SkuLogUtils.UM_WEEX2_E_SKU_V3_PREFIX;
        } else {
            return SkuLogUtils.UM_WEEX_E_SKU_V3_PREFIX;
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4bb62f", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else {
            j();
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8876706b", new Object[]{this});
        } else {
            this.e.t(new b());
        }
    }

    public void z(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5600888b", new Object[]{this, linearLayout});
        } else if (linearLayout != null) {
            this.f = linearLayout;
            linearLayout.setClickable(true);
            this.f.setOnClickListener(new c(this));
        }
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93c91d1c", new Object[]{this})).booleanValue();
        }
        try {
            return Uri.parse(this.n).getBooleanQueryParameter("sku_use_fullscreen", false);
        } catch (Throwable th) {
            SkuLogUtils.i(th.toString());
            return false;
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f438b881", new Object[]{this});
        } else if (this.j != null) {
            String v = this.c.v();
            boolean q = this.c.q();
            this.j.X(v, true ^ q);
            if (q) {
                SkuLogUtils.t(SkuLogUtils.UM_SKU_SILENT_CALL);
            }
        }
    }

    public final void K(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9105ef5", new Object[]{this, new Boolean(z)});
            return;
        }
        txl.h().q(SkuLogUtils.P_WEEX_RENDER, "afterMtop");
        long currentTimeMillis = System.currentTimeMillis();
        O(SkuLogUtils.P_WEEX_RENDER, currentTimeMillis);
        Log.e("SKU trace", "weex render time " + currentTimeMillis);
        JSONObject t = t();
        if (o2q.c("enable_weex_trade_params_opt")) {
            t.put("tradeParamStr", (Object) q3q.a(this.f9430a));
        }
        WeexWrapper weexWrapper = this.g;
        String n = n(this.n);
        if (!A() || !z) {
            z2 = false;
        }
        weexWrapper.l(n, t, z2);
        txl.h().p(SkuLogUtils.P_WEEX_RENDER, null);
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb2c2e5d", new Object[]{this})).booleanValue();
        }
        if (uq4.a(this.f9430a)) {
            return false;
        }
        txl.h().q("weexInit", "afterMtop");
        o();
        long currentTimeMillis = System.currentTimeMillis();
        O(SkuLogUtils.P_WEEX_NEW, currentTimeMillis);
        Log.e("SKU trace", "new weex time " + currentTimeMillis);
        int r = r(this.n);
        this.v = r;
        this.g.a(r, this.n);
        this.g.e();
        this.g.m(new d(this, null));
        this.i = false;
        this.h = true;
        this.j = new WeexMessageHandler(this.c, this, this.g, this.x);
        l8x.b(this.c.L() + this.x, this.j);
        txl.h().p("weexInit", null);
        this.o = false;
        if (!this.g.f()) {
            M();
        }
        return true;
    }

    public void p(String str, String str2) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6960ba70", new Object[]{this, str, str2});
        } else if (!this.o) {
            this.c.o();
            this.o = true;
            SkuLogUtils.b(this.c.u(), v(this.x) + str, str2, SkuLogUtils.UM_WEEX_E_SERVICE_ID);
            if (this.x == 3) {
                str3 = "newbuy";
            } else {
                str3 = "sku3.0";
            }
            String s = this.d.s();
            if (this.x == 3 && q(this.n, s)) {
                this.b.K(this.p, this.q, this.r, this.s);
                str4 = str3 + " 降级至 sku3.0 || errorCode: " + str + " msg: " + str2;
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", str);
                hashMap.put("msg", str2);
                SkuLogUtils.d(19999, "Downgrade_Newbuy2SkuV3", hashMap);
                this.c.X(3, 4);
            } else if (cjz.b()) {
                this.b.L(this.x, this.p, this.q, this.r, this.s);
                str4 = str3 + " 降级至 native || errorCode: " + str + " msg: " + str2;
            } else {
                this.b.P(this.p, this.q, this.r, this.s);
                str4 = str3 + " 降级至 h5 || errorCode: " + str + " msg: " + str2;
            }
            m0u.a(this.f9430a, str4);
            SkuLogUtils.j("weexMode", str4);
            k();
            o();
            if (this.x == 3) {
                SkuLogUtils.n();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r3.equals("pv_sku_update") == false) goto L_0x0046;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(com.alibaba.fastjson.JSONObject r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.sku.WeexCore.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "98de7839"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            if (r8 == 0) goto L_0x00ca
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x001f
            goto L_0x00ca
        L_0x001f:
            java.lang.String r3 = "action"
            java.lang.String r3 = r8.getString(r3)
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
            r4.<init>()
            java.lang.String r5 = "params"
            com.alibaba.fastjson.JSONObject r5 = r8.getJSONObject(r5)     // Catch: all -> 0x0035
            r4.putAll(r5)     // Catch: all -> 0x0035
            goto L_0x0036
        L_0x0035:
        L_0x0036:
            com.taobao.android.sku.weex.WeexMessageHandler r5 = r7.j
            if (r5 != 0) goto L_0x003b
            return
        L_0x003b:
            r3.hashCode()
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case -1833539181: goto L_0x008c;
                case -989506044: goto L_0x0082;
                case 143373165: goto L_0x0076;
                case 836241576: goto L_0x006a;
                case 865159886: goto L_0x005f;
                case 1090279755: goto L_0x0054;
                case 1828388125: goto L_0x0048;
                default: goto L_0x0046;
            }
        L_0x0046:
            r0 = -1
            goto L_0x0097
        L_0x0048:
            java.lang.String r0 = "sku_id_selected"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x0046
        L_0x0052:
            r0 = 6
            goto L_0x0097
        L_0x0054:
            java.lang.String r0 = "dart_curtain_close"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x005d
            goto L_0x0046
        L_0x005d:
            r0 = 5
            goto L_0x0097
        L_0x005f:
            java.lang.String r0 = "dark_curtain_sku_action"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0068
            goto L_0x0046
        L_0x0068:
            r0 = 4
            goto L_0x0097
        L_0x006a:
            java.lang.String r0 = "size_chart_update_detail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x0046
        L_0x0074:
            r0 = 3
            goto L_0x0097
        L_0x0076:
            java.lang.String r0 = "pvs_selected"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0080
            goto L_0x0046
        L_0x0080:
            r0 = 2
            goto L_0x0097
        L_0x0082:
            java.lang.String r1 = "pv_sku_update"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0097
            goto L_0x0046
        L_0x008c:
            java.lang.String r0 = "service_update"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0096
            goto L_0x0046
        L_0x0096:
            r0 = 0
        L_0x0097:
            switch(r0) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a8;
                case 5: goto L_0x00a1;
                case 6: goto L_0x009b;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x00ca
        L_0x009b:
            com.taobao.android.sku.weex.WeexMessageHandler r8 = r7.j
            r8.W(r4)
            goto L_0x00ca
        L_0x00a1:
            com.taobao.android.sku.weex.WeexMessageHandler r8 = r7.j
            r0 = 0
            r8.Q(r0)
            goto L_0x00ca
        L_0x00a8:
            com.taobao.android.sku.weex.WeexMessageHandler r8 = r7.j
            r8.S(r4)
            goto L_0x00ca
        L_0x00ae:
            com.taobao.android.sku.weex.WeexMessageHandler r8 = r7.j
            r8.F(r4)
            goto L_0x00ca
        L_0x00b4:
            com.taobao.android.sku.weex.WeexMessageHandler r8 = r7.j
            r8.U(r4)
            goto L_0x00ca
        L_0x00ba:
            com.taobao.android.sku.weex.WeexMessageHandler r8 = r7.j
            com.taobao.android.sku.WeexCore$4 r0 = new com.taobao.android.sku.WeexCore$4
            r0.<init>(r4)
            r8.R(r0)
            goto L_0x00ca
        L_0x00c5:
            com.taobao.android.sku.weex.WeexMessageHandler r0 = r7.j
            r0.E(r8)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.sku.WeexCore.G(com.alibaba.fastjson.JSONObject):void");
    }
}
