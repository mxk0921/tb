package com.taobao.android.promotion.content;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a65;
import tb.cu5;
import tb.dq4;
import tb.gq4;
import tb.il6;
import tb.odg;
import tb.pur;
import tb.qo4;
import tb.r0;
import tb.t2o;
import tb.xbl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TTDContentController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9198a;
    public ContentRequestClient b;
    public final gq4 d;
    public boolean h;
    public boolean j;
    public long k;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final qo4 c = new qo4();
    public final ContentRemoteListener e = new ContentRemoteListener(1);
    public final ContentRemoteListener f = new ContentRemoteListener(3);
    public final ContentRemoteListener g = new ContentRemoteListener(2);

    static {
        t2o.a(629145639);
    }

    public TTDContentController(Context context) {
        this.f9198a = context;
        DinamicXEngine a2 = il6.a();
        a2.W0(cu5.DX_EVENT_DCEVENT, new cu5(context, this));
        this.d = new gq4(context, a2);
    }

    public static /* synthetic */ qo4 a(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qo4) ipChange.ipc$dispatch("61539a71", new Object[]{tTDContentController});
        }
        return tTDContentController.c;
    }

    public static /* synthetic */ Handler b(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("59f810c3", new Object[]{tTDContentController});
        }
        return tTDContentController.i;
    }

    public static /* synthetic */ Context c(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8f278e3a", new Object[]{tTDContentController});
        }
        return tTDContentController.f9198a;
    }

    public static /* synthetic */ gq4 d(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gq4) ipChange.ipc$dispatch("51a45c8c", new Object[]{tTDContentController});
        }
        return tTDContentController.d;
    }

    public static /* synthetic */ void e(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd475be", new Object[]{tTDContentController});
        } else {
            tTDContentController.I();
        }
    }

    public static /* synthetic */ void f(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603fddd", new Object[]{tTDContentController});
        } else {
            tTDContentController.A();
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d2e351", new Object[]{this});
        } else {
            this.d.e(DXRecyclerLayout.LOAD_MORE_STOPED);
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03963ce", new Object[]{this});
        } else if (this.b != null) {
            y(this.c.r(), this.e);
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
        } else {
            this.d.j(0);
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71029e43", new Object[]{this, str});
        } else {
            this.c.J(str);
        }
    }

    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6ebae8", new Object[]{this, new Integer(i)});
        } else {
            this.c.K(i);
        }
    }

    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.c.L(str);
        }
    }

    public final void G(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ddd4bb5", new Object[]{this, new Boolean(z)});
        } else if (!z && xbl.a()) {
            this.k = SystemClock.elapsedRealtime();
        }
    }

    public final void H(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88833b4d", new Object[]{this, new Boolean(z)});
        } else if (!z && xbl.a()) {
            HashMap hashMap = new HashMap(l());
            hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.k));
            if (r0.a()) {
                str = PromotionFilterBean.SINGLE;
            } else {
                str = "normal";
            }
            hashMap.put("mode", str);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_DetailContent", 2201, "Page_DetailContent_Show_Page", null, null, hashMap).build());
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da15984", new Object[]{this});
        } else {
            this.d.e(DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e5be96", new Object[]{this, str});
        } else if (!TextUtils.equals(this.c.r(), str)) {
            this.c.c(str);
            this.d.m();
            this.d.q(this.c.k(), this.c.g());
            if (!this.c.y()) {
                I();
            } else {
                A();
            }
            if (this.c.z(str)) {
                y(str, this.g);
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[]{this});
            return;
        }
        this.h = false;
        this.c.D();
        this.d.l();
        ContentRequestClient contentRequestClient = this.b;
        if (contentRequestClient != null) {
            contentRequestClient.b();
        }
    }

    public int i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9381808", new Object[]{this, str})).intValue();
        }
        qo4 qo4Var = this.c;
        if (qo4Var.z(qo4Var.r())) {
            return 0;
        }
        qo4 qo4Var2 = this.c;
        JSONArray s = qo4Var2.s(qo4Var2.r());
        for (int i = 0; i < s.size(); i++) {
            if (str.equals(((JSONObject) s.get(i)).getString("id"))) {
                return i;
            }
        }
        return 0;
    }

    public View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a36f6900", new Object[]{this});
        }
        return this.d.i();
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206169f7", new Object[]{this});
        }
        return this.c.u();
    }

    public final Map<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e8a87743", new Object[]{this});
        }
        try {
            String n = this.c.n();
            String f = this.c.f();
            JSONObject v = this.c.v();
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(f)) {
                f = "";
            }
            hashMap.put("category_id", f);
            if (TextUtils.isEmpty(n)) {
                n = "";
            }
            hashMap.put("item_id", n);
            if (v != null && v.size() > 0) {
                for (String str : v.keySet()) {
                    hashMap.put(str, v.getString(str));
                }
            }
            return hashMap;
        } catch (Throwable unused) {
            return new HashMap();
        }
    }

    public void m(pur purVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839ae3", new Object[]{this, purVar});
            return;
        }
        h();
        this.c.w(this.f9198a, purVar);
        this.b = new ContentRequestClient(purVar.c(), this.c.u(), "contentList");
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec6a7c6a", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
            return;
        }
        p();
        y(this.c.r(), this.f);
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3797a768", new Object[]{this});
        } else {
            this.d.e("loading");
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        this.d.k();
        this.j = true;
        G(false);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            h();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
            return;
        }
        this.d.m();
        this.j = false;
        H(false);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.d.n();
        G(true ^ this.j);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.d.o();
        H(true ^ this.j);
    }

    public void v(boolean z, pur purVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd811834", new Object[]{this, new Boolean(z), purVar});
            return;
        }
        if (!TextUtils.equals(this.c.n(), purVar.c())) {
            if (z) {
                m(purVar);
            } else {
                h();
            }
        }
        w();
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275e0369", new Object[]{this});
        } else {
            this.d.p();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940e810a", new Object[]{this});
            return;
        }
        if (!this.h) {
            this.h = true;
            this.d.r(this.c.l(), this.c.g());
            y("all", this.e);
        } else if (!TextUtils.isEmpty(this.c.h())) {
            this.c.a();
            this.d.q(this.c.k(), this.c.g());
        }
        w();
    }

    public final void y(String str, ContentRemoteListener contentRemoteListener) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fdf8e9", new Object[]{this, str, contentRemoteListener});
            return;
        }
        if (!"all".equals(str) || !this.c.z(str)) {
            str2 = null;
        } else {
            str2 = this.c.q();
        }
        this.b.c(str2, str, contentRemoteListener, this.c.A(), this.c.p());
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.d.m();
        this.j = false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ContentRemoteListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int STATUS_CHANGE_TAB = 2;
        public static final int STATUS_INIT = 1;
        public static final int STATUS_LOAD_MORE = 3;
        private final int mStatus;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f9199a;

            public a(String str) {
                this.f9199a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!dq4.d(TTDContentController.c(TTDContentController.this))) {
                    DXTemplateItem k = TTDContentController.a(TTDContentController.this).k();
                    if (ContentRemoteListener.access$300(ContentRemoteListener.this) == 1) {
                        ContentRemoteListener.access$400(ContentRemoteListener.this, k);
                    } else if (ContentRemoteListener.access$300(ContentRemoteListener.this) == 2) {
                        TTDContentController.d(TTDContentController.this).q(k, TTDContentController.a(TTDContentController.this).g());
                    } else if (ContentRemoteListener.access$300(ContentRemoteListener.this) == 3) {
                        TTDContentController.d(TTDContentController.this).u(k, TTDContentController.a(TTDContentController.this).g());
                    }
                    if (!TTDContentController.a(TTDContentController.this).y() || TTDContentController.a(TTDContentController.this).F(this.f9199a) == null || TTDContentController.a(TTDContentController.this).F(this.f9199a).isEmpty()) {
                        TTDContentController.e(TTDContentController.this);
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!dq4.d(TTDContentController.c(TTDContentController.this))) {
                    if (ContentRemoteListener.access$300(ContentRemoteListener.this) == 3) {
                        TTDContentController.f(TTDContentController.this);
                    }
                    if (TTDContentController.a(TTDContentController.this).z(TTDContentController.a(TTDContentController.this).r())) {
                        TTDContentController.a(TTDContentController.this).b("error", "网络繁忙，请稍后重试");
                        DXTemplateItem k = TTDContentController.a(TTDContentController.this).k();
                        gq4 d = TTDContentController.d(TTDContentController.this);
                        if (k == null) {
                            k = TTDContentController.a(TTDContentController.this).l();
                        }
                        d.q(k, TTDContentController.a(TTDContentController.this).g());
                        return;
                    }
                    TTDContentController.d(TTDContentController.this).e("failed");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DXTemplateItem f9201a;

            public c(DXTemplateItem dXTemplateItem) {
                this.f9201a = dXTemplateItem;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int b = a65.b(TTDContentController.d(TTDContentController.this).h());
                if (b == 0) {
                    b = 650;
                }
                TTDContentController.a(TTDContentController.this).I(b);
                TTDContentController.d(TTDContentController.this).q(this.f9201a, TTDContentController.a(TTDContentController.this).g());
            }
        }

        static {
            t2o.a(629145640);
            t2o.a(589299719);
        }

        public ContentRemoteListener(int i) {
            this.mStatus = i;
        }

        public static /* synthetic */ int access$300(ContentRemoteListener contentRemoteListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fd50d005", new Object[]{contentRemoteListener})).intValue();
            }
            return contentRemoteListener.mStatus;
        }

        public static /* synthetic */ void access$400(ContentRemoteListener contentRemoteListener, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cd7e6da", new Object[]{contentRemoteListener, dXTemplateItem});
            } else {
                contentRemoteListener.initContentDX(dXTemplateItem);
            }
        }

        private void initContentDX(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb1ad64d", new Object[]{this, dXTemplateItem});
                return;
            }
            View i = TTDContentController.d(TTDContentController.this).i();
            if (i.getHeight() == 0) {
                i.post(new c(dXTemplateItem));
                return;
            }
            TTDContentController.a(TTDContentController.this).I(a65.b(TTDContentController.d(TTDContentController.this).h()));
            TTDContentController.d(TTDContentController.this).q(dXTemplateItem, TTDContentController.a(TTDContentController.this).g());
        }

        private void onRequestFailed(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
            } else {
                dq4.h(TTDContentController.b(TTDContentController.this), new b());
            }
        }

        private void onRequestSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3de2a084", new Object[]{this, str});
            } else {
                dq4.h(TTDContentController.b(TTDContentController.this), new a(str));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            odg.c("ContentController", "request data error : " + mtopResponse);
            onRequestFailed(mtopResponse);
            dq4.e(mtopResponse, "种草列表请求失败-" + this.mStatus);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                StringBuilder sb = new StringBuilder("mtop onSuccess, but data is empty, mtopResponse == null : ");
                sb.append(mtopResponse == null);
                odg.c("ContentController", sb.toString());
            } else {
                String str = new String(mtopResponse.getBytedata());
                TTDContentController.a(TTDContentController.this).H(str);
                if (TTDContentController.a(TTDContentController.this).d()) {
                    onRequestSuccess(str);
                } else {
                    onRequestFailed(mtopResponse);
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            odg.c("ContentController", "request data system error : " + mtopResponse);
            onRequestFailed(mtopResponse);
            dq4.e(mtopResponse, "种草列表请求失败-" + this.mStatus);
        }
    }
}
