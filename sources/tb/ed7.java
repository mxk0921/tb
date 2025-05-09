package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.VesselViewHolder;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.WebStartParams;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ed7 implements ozc, xyb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "DescThemisController";

    /* renamed from: a  reason: collision with root package name */
    public String f18495a;
    public TMSEmbed b;
    public FrameLayout c;
    public TextView d;
    public m3e e;
    public boolean f;
    public vyb g;
    public ze7 h;
    public lcd i;
    public boolean m;
    public long o;
    public boolean p;
    public rc7 q;
    public rc7 r;
    public final Context t;
    public final ff7 u;
    public boolean j = true;
    public final float k = vbl.N0();
    public final boolean l = vbl.Z();
    public boolean n = true;
    public final Handler s = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262542);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean a(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5988e3d", new Object[]{this, context, str})).booleanValue();
            }
            ckf.h(context, "context");
            ckf.h(str, "targetUrl");
            if (TextUtils.isEmpty(str) || wsq.O(str, "innerWebview", false, 2, null)) {
                return false;
            }
            xq0.c().a(context.getApplicationContext()).c(str);
            return true;
        }

        public final boolean b(Context context, String str) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dee5ac0", new Object[]{this, context, str})).booleanValue();
            }
            ckf.h(context, "context");
            ckf.h(str, "targetUrl");
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = str.charAt(!z ? i : length) <= ' ';
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str.subSequence(i, length + 1).toString();
            if (TextUtils.isEmpty(obj)) {
                return true;
            }
            if (!tsq.I(obj, "tel:", false, 2, null) && !tsq.I(obj, "mailto:", false, 2, null)) {
                for (String str2 : toj.NAV_URL_DETAIL) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2 == null) {
                            ckf.s();
                            throw null;
                        } else if (tsq.I(obj, str2, false, 2, null)) {
                            xq0.c().a(context.getApplicationContext()).c(obj);
                            return true;
                        }
                    }
                }
                if (!TextUtils.isEmpty(toj.NAV_URL_SHOP) && tsq.I(obj, toj.NAV_URL_SHOP, false, 2, null)) {
                    xq0.c().a(context.getApplicationContext()).c(obj);
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff7 f18496a;
        public final /* synthetic */ ed7 b;
        public final /* synthetic */ Context c;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/detail/ttdetail/skeleton/desc/web/DescThemisController$$special$$inlined$apply$lambda$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!tq4.e(b.this.c)) {
                        tgh.b(ed7.TAG, sxl.RENDER_SUCCESS_TIME);
                        vyb j = ed7.j(b.this.b);
                        if (j != null) {
                            j.a();
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime() - ed7.l(b.this.b);
                        PerformanceUtils.l(b.this.c, "descH5ThemisPostTime", elapsedRealtime);
                        tgh.b(ed7.TAG, "postCost:" + elapsedRealtime);
                    }
                } catch (Exception e) {
                    tgh.c(ed7.TAG, "onRenderSuccess error:", e);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/detail/ttdetail/skeleton/desc/web/DescThemisController$$special$$inlined$apply$lambda$1$2", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: tb.ed7$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class RunnableC0913b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.ed7$b$b$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public static final class a extends izw {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/web/DescThemisController$initView$$inlined$let$lambda$1$2$1");
                }

                @Override // tb.izw
                public Boolean a(MotionEvent motionEvent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Boolean) ipChange.ipc$dispatch("8ffcab0e", new Object[]{this, motionEvent});
                    }
                    return null;
                }

                @Override // tb.izw
                public Boolean b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Boolean) ipChange.ipc$dispatch("d48718f2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
                    }
                    return null;
                }
            }

            /* compiled from: Taobao */
            /* renamed from: tb.ed7$b$b$b  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public static final class C0914b extends fu {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0914b(String str) {
                    super(str);
                }

                public static /* synthetic */ Object ipc$super(C0914b bVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/web/DescThemisController$initView$$inlined$let$lambda$1$2$2");
                }

                @Override // tb.vbe
                public boolean a(Context context, String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("4d724263", new Object[]{this, context, str})).booleanValue();
                    }
                    ckf.h(context, "context");
                    ckf.h(str, "url");
                    if (b.this.b.u()) {
                        return ed7.Companion.b(context, str);
                    }
                    return ed7.Companion.a(context, str);
                }
            }

            public RunnableC0913b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!tq4.e(b.this.c)) {
                        tgh.b(ed7.TAG, sxl.RENDER_START_TIME);
                        vyb j = ed7.j(b.this.b);
                        if (j != null) {
                            j.start();
                        }
                        TMSEmbed i = ed7.i(b.this.b);
                        m3e m3eVar = null;
                        if (i != null) {
                            pbe pbeVar = (pbe) i.g(pbe.class);
                            ed7 ed7Var = b.this.b;
                            if (pbeVar != null) {
                                m3eVar = pbeVar.e0();
                            }
                            ed7.o(ed7Var, m3eVar);
                            m3e m = ed7.m(b.this.b);
                            if (m != null) {
                                m.b(new a());
                            }
                            if (pbeVar != null) {
                                pbeVar.E0(new C0914b("tt_detail_desc"));
                                return;
                            }
                            return;
                        }
                        ckf.s();
                        throw null;
                    }
                } catch (Exception e) {
                    tgh.c(ed7.TAG, "onRenderStart error:", e);
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/detail/ttdetail/skeleton/desc/web/DescThemisController$$special$$inlined$apply$lambda$1$3", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            public c(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                viq i;
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!tq4.e(b.this.c)) {
                        tgh.b(ed7.TAG, "onRenderFailed:" + this.b + ", " + this.c);
                        vyb j = ed7.j(b.this.b);
                        if (j != null) {
                            j.error();
                        }
                        HashMap hashMap = new HashMap();
                        if (ed7.n(b.this.b)) {
                            tgh.b(ed7.TAG, "from native degrade, descUrl:" + ed7.f(b.this.b) + ", errorCode:" + this.b + ", errorMsg:" + this.c);
                        } else {
                            tgh.b(ed7.TAG, "don't from native degrade, descUrl:" + ed7.f(b.this.b) + ", errorCode:" + this.b + ", errorMsg:" + this.c);
                        }
                        String str2 = b.this.f18496a.c;
                        ckf.c(str2, "it.mItemId");
                        hashMap.put("itemId", str2);
                        hashMap.put("errorCode", this.b);
                        hashMap.put("errorMsg", this.c);
                        String f = ed7.f(b.this.b);
                        String str3 = "";
                        if (f == null) {
                            f = str3;
                        }
                        hashMap.put("url", f);
                        hashMap.put("isFromNativeDegrade", String.valueOf(ed7.n(b.this.b)));
                        ze7 g = ed7.g(b.this.b);
                        if (!(g == null || (i = g.i()) == null || (str = (String) i.c("sellerId")) == null)) {
                            str3 = str;
                        }
                        hashMap.put("sellerId", str3);
                        bw7.b(hashMap, -900004, "H5图文详情加载失败");
                    }
                } catch (Exception e) {
                    tgh.c(ed7.TAG, "onRenderFailed error:", e);
                }
            }
        }

        public b(ff7 ff7Var, ed7 ed7Var, Context context) {
            this.f18496a = ff7Var;
            this.b = ed7Var;
            this.c = context;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/web/DescThemisController$initView$$inlined$let$lambda$1");
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.h(str, "errorCode");
            ckf.h(str2, "errorMsg");
            ed7.h(this.b).post(new c(str, str2));
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
            } else {
                ed7.h(this.b).post(new RunnableC0913b());
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            if (!tq4.e(this.c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - ed7.l(this.b);
                PerformanceUtils.l(this.c, "descH5ThemisLoadTime", elapsedRealtime);
                tgh.b(ed7.TAG, "cost:" + elapsedRealtime);
            }
            ed7.h(this.b).post(new a());
        }
    }

    static {
        t2o.a(912262541);
        t2o.a(912261426);
        t2o.a(912262556);
    }

    public ed7(Context context, ff7 ff7Var) {
        ckf.h(context, "context");
        this.t = context;
        this.u = ff7Var;
        v(context, ff7Var);
    }

    public static final /* synthetic */ String f(ed7 ed7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91d66f37", new Object[]{ed7Var});
        }
        return ed7Var.f18495a;
    }

    public static final /* synthetic */ ze7 g(ed7 ed7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("33293011", new Object[]{ed7Var});
        }
        return ed7Var.h;
    }

    public static final /* synthetic */ Handler h(ed7 ed7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("f2a5b7c9", new Object[]{ed7Var});
        }
        return ed7Var.s;
    }

    public static final /* synthetic */ TMSEmbed i(ed7 ed7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("56e83674", new Object[]{ed7Var});
        }
        return ed7Var.b;
    }

    public static final /* synthetic */ vyb j(ed7 ed7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vyb) ipChange.ipc$dispatch("daf13d11", new Object[]{ed7Var});
        }
        return ed7Var.g;
    }

    public static final /* synthetic */ long l(ed7 ed7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8c03ea6", new Object[]{ed7Var})).longValue();
        }
        return ed7Var.o;
    }

    public static final /* synthetic */ m3e m(ed7 ed7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m3e) ipChange.ipc$dispatch("82c50538", new Object[]{ed7Var});
        }
        return ed7Var.e;
    }

    public static final /* synthetic */ boolean n(ed7 ed7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33f50a0a", new Object[]{ed7Var})).booleanValue();
        }
        return ed7Var.p;
    }

    public static final /* synthetic */ void o(ed7 ed7Var, m3e m3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("813e7e04", new Object[]{ed7Var, m3eVar});
        } else {
            ed7Var.e = m3eVar;
        }
    }

    @Override // tb.ozc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
        } else if (!this.f) {
            w();
        }
    }

    @Override // tb.xyb
    public void b(lcd lcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a37f6", new Object[]{this, lcdVar});
            return;
        }
        ckf.h(lcdVar, "recommendPreloadListener");
        this.i = lcdVar;
    }

    @Override // tb.xyb
    public void c(ze7 ze7Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da58e47", new Object[]{this, ze7Var});
            return;
        }
        ckf.h(ze7Var, "detailContext");
        this.h = ze7Var;
        this.m = DataUtils.T(ze7Var);
        if (!nj7.h() || vbl.f0()) {
            z = false;
        }
        this.n = z;
    }

    @Override // tb.xyb
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca9b6fa", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    @Override // tb.ozc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.b != null) {
            UserBehaviorTracker.m(this.t, "detail_desc_max_scroll", String.valueOf(s()));
            try {
                TMSEmbed tMSEmbed = this.b;
                if (tMSEmbed != null) {
                    tMSEmbed.d();
                    xhv xhvVar = xhv.INSTANCE;
                }
            } catch (Throwable th) {
                tgh.c("[WebView-Destroy]DescH5Controller", "WebView-Destroy error", th);
                xhv xhvVar2 = xhv.INSTANCE;
            }
        }
    }

    @Override // tb.xyb
    public void e(vyb vybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b655b5f", new Object[]{this, vybVar});
            return;
        }
        ckf.h(vybVar, "descLoadListener");
        this.g = vybVar;
    }

    @Override // tb.ozc
    public View getComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5308061", new Object[]{this, view});
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            return frameLayout;
        }
        return new View(this.t);
    }

    public final String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e617d4d3", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !tsq.I(str, itw.URL_SEPARATOR, false, 2, null)) {
            return str;
        }
        return uyv.HTTPS_SCHEMA.concat(str);
    }

    @Override // tb.ozc
    public View r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c3161e04", new Object[]{this});
        }
        View view = null;
        try {
            m3e m3eVar = this.e;
            if (m3eVar != null) {
                view = m3eVar.a();
            }
        } catch (Exception e) {
            tgh.c(TAG, "getScrollItemView error:", e);
        }
        if (view != null) {
            return view;
        }
        tgh.b(TAG, "web core view is null");
        View view2 = this.c;
        if (view2 == null) {
            view2 = new View(this.t);
        }
        return view2;
    }

    public final int s() {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3024a98", new Object[]{this})).intValue();
        }
        try {
            m3e m3eVar = this.e;
            if (m3eVar == null || (a2 = m3eVar.a()) == null) {
                return 0;
            }
            return a2.getScrollY();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // tb.ozc
    public void t(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9588d6ca", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.q();
        }
        if (this.q != null && this.r == null) {
            rc7 rc7Var = this.q;
            if (rc7Var != null) {
                this.r = new rc7("disappear", rc7Var.c(), new RuntimeAbilityParam[0]);
            } else {
                ckf.s();
                throw null;
            }
        }
        rc7 rc7Var2 = this.r;
        if (rc7Var2 != null) {
            q84.f(this.t, rc7Var2);
        }
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1171556f", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void v(Context context, ff7 ff7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b574e3", new Object[]{this, context, ff7Var});
            return;
        }
        String str = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_themis, (ViewGroup) null);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            frameLayout.setDescendantFocusability(393216);
            this.c = frameLayout;
            TextView textView = (TextView) frameLayout.findViewById(R.id.detail_desc_empty_tips);
            this.d = textView;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (ff7Var != null) {
                String q = q(ff7Var.e);
                if (q != null) {
                    p(q);
                    str = q;
                }
                this.f18495a = str;
                if (context != null) {
                    TMSEmbed tMSEmbed = new TMSEmbed((Activity) context);
                    WebStartParams webStartParams = new WebStartParams();
                    webStartParams.setUrl(this.f18495a);
                    tMSEmbed.i(webStartParams);
                    tMSEmbed.r(new b(ff7Var, this, context));
                    this.b = tMSEmbed;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, tb.tz8] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w() {
        /*
            r6 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.ed7.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "d7389eb0"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r6
            r1.ipc$dispatch(r2, r0)
            return
        L_0x0012:
            boolean r1 = r6.f
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = r6.f18495a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x001f
            goto L_0x0061
        L_0x001f:
            com.taobao.themis.external.embed.TMSEmbed r1 = r6.b
            if (r1 == 0) goto L_0x0061
            r6.f = r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            r6.o = r2
            long r2 = java.lang.System.currentTimeMillis()
            boolean r0 = tb.vbl.z()
            if (r0 == 0) goto L_0x004a
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            tb.tz8 r4 = com.taobao.analysis.v3.FalcoGlobalTracer.get()
            r0.element = r4
            if (r4 == 0) goto L_0x004a
            tb.fd7 r5 = new tb.fd7
            r5.<init>(r0, r2, r1)
            r4.j(r5)
        L_0x004a:
            android.view.View r0 = r1.h()
            r1.u()
            android.widget.FrameLayout r1 = r6.c
            if (r1 == 0) goto L_0x0058
            r1.addView(r0)
        L_0x0058:
            android.widget.TextView r0 = r6.d
            if (r0 == 0) goto L_0x0061
            r1 = 8
            r0.setVisibility(r1)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ed7.w():void");
    }

    public final void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d55950", new Object[]{this, new Integer(i)});
        } else {
            y();
        }
    }

    @Override // tb.ozc
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        if (!this.f) {
            a();
        }
        TMSEmbed tMSEmbed = this.b;
        if (tMSEmbed != null) {
            tMSEmbed.p();
        }
        if (this.q == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "trackPage", VesselViewHolder.UT_SHOW_ARG1);
            jSONObject.put((JSONObject) "spm", "a2141.7631564.1999077549");
            this.q = new rc7("ut_exposure", jSONObject, new RuntimeAbilityParam[0]);
        }
        q84.f(this.t, this.q);
    }

    @Override // tb.ozc
    public void k(int i) {
        View a2;
        m3e m3eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            m3e m3eVar2 = this.e;
            if (m3eVar2 != null && (a2 = m3eVar2.a()) != null) {
                a2.scrollTo(0, (i == Integer.MAX_VALUE && (m3eVar = this.e) != null) ? m3eVar.getContentHeight() : 0);
            }
        } catch (Exception e) {
            tgh.c(TAG, "themis scrollToPos:" + i, e);
        }
    }

    public final void y() {
        View a2;
        lcd lcdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82666fba", new Object[]{this});
        } else if (this.l && this.m && !this.n && this.j) {
            try {
                m3e m3eVar = this.e;
                if (m3eVar != null && (a2 = m3eVar.a()) != null) {
                    int scrollY = a2.getScrollY();
                    m3e m3eVar2 = this.e;
                    if (m3eVar2 != null) {
                        int contentHeight = m3eVar2.getContentHeight();
                        int e = mr7.e(this.t);
                        float f = this.k;
                        float f2 = e;
                        if (contentHeight > f * f2 && contentHeight - scrollY <= f * f2 && (lcdVar = this.i) != null) {
                            lcdVar.a();
                            this.j = false;
                            tgh.b(TAG, "H5图文详情提前发推荐请求");
                            return;
                        }
                        return;
                    }
                    ckf.s();
                    throw null;
                }
            } catch (Throwable th) {
                tgh.b(TAG, "preloadRecommend error: " + th);
            }
        }
    }

    public final String q(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32822447", new Object[]{this, str});
        }
        if (str != null) {
            ff7 ff7Var = this.u;
            if (ff7Var == null || !ff7Var.g) {
                z = false;
            }
            vnv vnvVar = new vnv(str);
            vnvVar.a("hidPriceDesc", String.valueOf(z));
            vnvVar.a("newdetail", "1");
            vnvVar.a("fromdetail", "1");
            vnvVar.a("shopRec", "false");
            vnvVar.a("relatedRec", "false");
            vnvVar.a("hideFullBtn", "true");
            vnvVar.a("hideBtmLine", "true");
            String vnvVar2 = vnvVar.toString();
            if (vnvVar2 != null) {
                return vnvVar2;
            }
        }
        return null;
    }
}
