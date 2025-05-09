package com.taobao.mytaobao.pagev2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.BasementExposureManager;
import com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade;
import com.taobao.mytaobao.scroll.WeexNestedScrollHelper;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a8x;
import tb.ckf;
import tb.h3j;
import tb.hqb;
import tb.ih4;
import tb.jpu;
import tb.o32;
import tb.opc;
import tb.pgj;
import tb.pl4;
import tb.pvh;
import tb.q32;
import tb.qyd;
import tb.r32;
import tb.r4v;
import tb.ryo;
import tb.s32;
import tb.s3j;
import tb.sc;
import tb.suv;
import tb.sxl;
import tb.t2o;
import tb.t32;
import tb.tib;
import tb.tvh;
import tb.u3j;
import tb.uib;
import tb.uuu;
import tb.uv6;
import tb.v32;
import tb.vib;
import tb.z6t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbWeexManager implements uib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeexNestedScrollHelper f11269a;
    public MTPtrRecyclerView b;
    public MTBBasementContainerView c;
    public boolean d;
    public BasementExposureManager f;
    public hqb g;
    public Runnable h;
    public boolean i;
    public final Lifecycle l;
    public final MtbBizProxyV2 m;
    public final ryo e = new ryo(this);
    public final v32 j = new v32();
    public final MtbWeexManager$scrollListener$1 k = new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.pagev2.MtbWeexManager$scrollListener$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MtbWeexManager$scrollListener$1 mtbWeexManager$scrollListener$1, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/pagev2/MtbWeexManager$scrollListener$1");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            MtbWeexManager.h(MtbWeexManager.this).e(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            ckf.h(recyclerView, OrderConfigs.RECYCLERVIEW);
            super.onScrolled(recyclerView, i, i2);
            boolean z2 = i2 < 0;
            boolean canScrollVertically = recyclerView.canScrollVertically(1);
            MTPtrRecyclerView u = MtbWeexManager.this.u();
            if (u != null) {
                boolean isCloseToTheBottom = u.isCloseToTheBottom();
                if (!canScrollVertically && !MtbWeexManager.f(MtbWeexManager.this) && !z2) {
                    MTPtrRecyclerView u2 = MtbWeexManager.this.u();
                    if (u2 != null) {
                        if (u2.calcVerticalScrollOffset() > 0) {
                            z = false;
                        }
                        MtbWeexManager.c(MtbWeexManager.this, "scroll", z);
                        return;
                    }
                    ckf.s();
                    throw null;
                } else if (z2 && !isCloseToTheBottom && MtbWeexManager.f(MtbWeexManager.this)) {
                    MtbWeexManager.this.q("scroll");
                }
            } else {
                ckf.s();
                throw null;
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b<T> implements o32<WeexInstance> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MTBBasementContainerView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ BasementWeexView f;
        public final /* synthetic */ Ref$ObjectRef g;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a extends opc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.mytaobao.pagev2.MtbWeexManager$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public static final class View$OnClickListenerC0633a implements View.OnClickListener {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public View$OnClickListenerC0633a() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    WeexNestedScrollHelper i = MtbWeexManager.i(MtbWeexManager.this);
                    if (i != null) {
                        i.k();
                    }
                    MtbWeexManager.k(MtbWeexManager.this, null);
                    if (b.this.b.getWeexView() != null) {
                        BasementWeexView weexView = b.this.b.getWeexView();
                        if (weexView != null) {
                            weexView.dispose();
                        }
                        b bVar = b.this;
                        MtbWeexManager.b(MtbWeexManager.this, bVar.b, bVar.c, bVar.d, bVar.e);
                    }
                }
            }

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -871580117) {
                    super.onRenderFailed((com.taobao.android.weex_framework.a) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                    return null;
                } else if (hashCode == 724233032) {
                    super.onRenderSuccess((com.taobao.android.weex_framework.a) objArr[0]);
                    return null;
                } else {
                    int hashCode2 = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/pagev2/MtbWeexManager$attachWeexView$1$renderListener$1");
                }
            }

            @Override // tb.opc, tb.npc
            public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                super.onRenderFailed(aVar, i, str, z);
                uv6.i("dsw", "onRenderFailed");
                s32 c = s32.c();
                String valueOf = String.valueOf(i);
                if (str == null) {
                    str = "errMsg";
                }
                c.j("TaoFriend_HomePage0", valueOf, str);
                b.this.b.showErrorPage(new View$OnClickListenerC0633a());
                qyd S = z6t.S();
                ckf.c(S, "TaoLiveStartLinkMonitor.getInstance()");
                if (!S.d()) {
                    z6t.S().e("WebLoad", z6t.Q());
                    z6t.S().f(3);
                }
            }

            @Override // tb.opc, tb.npc
            public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
                WeexNestedScrollHelper i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                    return;
                }
                super.onRenderSuccess(aVar);
                uv6.i("dsw", sxl.RENDER_SUCCESS_TIME);
                s32.c().k("TaoFriend_HomePage0");
                if (ih4.a("fixBasementTouchIncorrectIssue", true) && (i = MtbWeexManager.i(MtbWeexManager.this)) != null) {
                    i.k();
                }
                MtbWeexManager mtbWeexManager = MtbWeexManager.this;
                MTPtrRecyclerView u = MtbWeexManager.this.u();
                if (u != null) {
                    MtbWeexManager.k(mtbWeexManager, new WeexNestedScrollHelper(u, b.this.f));
                } else {
                    ckf.s();
                    throw null;
                }
            }
        }

        public b(MTBBasementContainerView mTBBasementContainerView, int i, int i2, String str, BasementWeexView basementWeexView, Ref$ObjectRef ref$ObjectRef) {
            this.b = mTBBasementContainerView;
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = basementWeexView;
            this.g = ref$ObjectRef;
        }

        /* renamed from: b */
        public final void a(boolean z, String str, WeexInstance weexInstance) {
            tvh tvhVar;
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73a2cc39", new Object[]{this, new Boolean(z), str, weexInstance});
                return;
            }
            Object obj = null;
            if (weexInstance == null) {
                uv6.l("getWxInstanceFailed");
                tvhVar = null;
            } else {
                tvh adapterMUSInstance = ((WeexInstanceImpl) weexInstance).getAdapterMUSInstance();
                if (adapterMUSInstance != null) {
                    obj = adapterMUSInstance.getTag("mtbRenderSuccess");
                }
                z2 = ckf.b("true", obj);
                uv6.l("getWxInstanceSuccess");
                tvhVar = adapterMUSInstance;
            }
            TLog.loge("mtbMainLink", "预取weexInstance回调，errorMsg=" + str);
            a aVar = new a();
            this.f.addRenderListener(new a8x());
            this.f.addRenderListener(aVar);
            this.f.setUp(MtbWeexManager.d(MtbWeexManager.this), (String) this.g.element, this.c, this.d, tvhVar, MtbWeexManager.g(MtbWeexManager.this).n().p(), MtbWeexManager.g(MtbWeexManager.this).n().q());
            if (z2) {
                TLog.loge("mtbMainLink", "补发renderSuccess");
                MtbWeexManager.this.y();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtbWeexManager.c(MtbWeexManager.this, "renderSuccessBackground", false);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MTBBasementContainerView b;

        public d(MTBBasementContainerView mTBBasementContainerView) {
            this.b = mTBBasementContainerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (MtbWeexManager.e(MtbWeexManager.this) == null) {
                MtbWeexManager mtbWeexManager = MtbWeexManager.this;
                MTPtrRecyclerView u = MtbWeexManager.this.u();
                if (u != null) {
                    MtbWeexManager.j(mtbWeexManager, new BasementExposureManager(u, this.b));
                } else {
                    ckf.s();
                    throw null;
                }
            }
        }
    }

    static {
        t2o.a(745537890);
        t2o.a(745537553);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.taobao.mytaobao.pagev2.MtbWeexManager$scrollListener$1] */
    public MtbWeexManager(Lifecycle lifecycle, MtbBizProxyV2 mtbBizProxyV2) {
        ckf.h(lifecycle, "lifecycle");
        ckf.h(mtbBizProxyV2, "mtbBizProxyV2");
        this.l = lifecycle;
        this.m = mtbBizProxyV2;
        a aVar = new a();
        MtbBasementWeexApiPlugin.setBasementWeexBridgeAbility(aVar, mtbBizProxyV2.m());
    }

    public static final /* synthetic */ void b(MtbWeexManager mtbWeexManager, MTBBasementContainerView mTBBasementContainerView, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715c4cb5", new Object[]{mtbWeexManager, mTBBasementContainerView, new Integer(i), new Integer(i2), str});
        } else {
            mtbWeexManager.l(mTBBasementContainerView, i, i2, str);
        }
    }

    public static final /* synthetic */ void c(MtbWeexManager mtbWeexManager, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d0b8a", new Object[]{mtbWeexManager, str, new Boolean(z)});
        } else {
            mtbWeexManager.p(str, z);
        }
    }

    public static final /* synthetic */ Lifecycle d(MtbWeexManager mtbWeexManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Lifecycle) ipChange.ipc$dispatch("3b19b43f", new Object[]{mtbWeexManager});
        }
        return mtbWeexManager.l;
    }

    public static final /* synthetic */ BasementExposureManager e(MtbWeexManager mtbWeexManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasementExposureManager) ipChange.ipc$dispatch("7a533e11", new Object[]{mtbWeexManager});
        }
        return mtbWeexManager.f;
    }

    public static final /* synthetic */ boolean f(MtbWeexManager mtbWeexManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca55e0a", new Object[]{mtbWeexManager})).booleanValue();
        }
        return mtbWeexManager.d;
    }

    public static final /* synthetic */ MtbBizProxyV2 g(MtbWeexManager mtbWeexManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbBizProxyV2) ipChange.ipc$dispatch("706ca156", new Object[]{mtbWeexManager});
        }
        return mtbWeexManager.m;
    }

    public static final /* synthetic */ ryo h(MtbWeexManager mtbWeexManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ryo) ipChange.ipc$dispatch("aae20f60", new Object[]{mtbWeexManager});
        }
        return mtbWeexManager.e;
    }

    public static final /* synthetic */ WeexNestedScrollHelper i(MtbWeexManager mtbWeexManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexNestedScrollHelper) ipChange.ipc$dispatch("58733bf0", new Object[]{mtbWeexManager});
        }
        return mtbWeexManager.f11269a;
    }

    public static final /* synthetic */ void j(MtbWeexManager mtbWeexManager, BasementExposureManager basementExposureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1970385", new Object[]{mtbWeexManager, basementExposureManager});
        } else {
            mtbWeexManager.f = basementExposureManager;
        }
    }

    public static final /* synthetic */ void k(MtbWeexManager mtbWeexManager, WeexNestedScrollHelper weexNestedScrollHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac10b928", new Object[]{mtbWeexManager, weexNestedScrollHelper});
        } else {
            mtbWeexManager.f11269a = weexNestedScrollHelper;
        }
    }

    public final void A() {
        MTPtrRecyclerView l;
        int b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c738e38a", new Object[]{this});
            return;
        }
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView != null && (l = this.m.l()) != null) {
            int height = l.getHeight();
            ViewGroup.LayoutParams layoutParams = mTBBasementContainerView.getLayoutParams();
            if (layoutParams != null && layoutParams.height != (b2 = height - pgj.b())) {
                layoutParams.height = b2;
                mTBBasementContainerView.setLayoutParams(layoutParams);
            }
        }
    }

    public final void B(String str, JSONObject jSONObject) {
        BasementWeexView weexView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.h(str, "eventName");
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView != null && (weexView = mTBBasementContainerView.getWeexView()) != null) {
            r32.d(weexView, str, jSONObject);
        }
    }

    public final void C(hqb hqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3948b497", new Object[]{this, hqbVar});
        } else {
            this.g = hqbVar;
        }
    }

    @Override // tb.uib
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4544ba49", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void m(MTPtrRecyclerView mTPtrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36059e74", new Object[]{this, mTPtrRecyclerView});
            return;
        }
        ckf.h(mTPtrRecyclerView, "rv");
        this.b = mTPtrRecyclerView;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd03bab", new Object[]{this});
        } else {
            this.m.n().m();
        }
    }

    public final void p(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6722dfdc", new Object[]{this, str, new Boolean(z)});
        } else if (!this.d && this.i && this.c != null) {
            this.d = true;
            BasementExposureManager basementExposureManager = this.f;
            if (basementExposureManager != null) {
                basementExposureManager.c(true);
            }
            if (this.g != null) {
                t32.b().c(str, this.m);
                hqb hqbVar = this.g;
                if (hqbVar != null) {
                    hqbVar.a();
                }
            }
            r32.b(this.c, true, z);
            r4v.a(s32.MODULE_NAME, 19997, "enterBasementCheck", Boolean.TRUE, str, null);
        }
    }

    public final JSONObject r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1c49e2c0", new Object[]{this, str});
        }
        ckf.h(str, pl4.KEY_NODE_ID);
        return this.j.a(str);
    }

    public final MTBBasementContainerView t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBBasementContainerView) ipChange.ipc$dispatch("ee2d461f", new Object[]{this});
        }
        return this.c;
    }

    public final MTPtrRecyclerView u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTPtrRecyclerView) ipChange.ipc$dispatch("3493d41", new Object[]{this});
        }
        return this.b;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        z();
        o();
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
        this.h = null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public final class a implements vib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: com.taobao.mytaobao.pagev2.MtbWeexManager$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class RunnableC0632a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ boolean b;

            public RunnableC0632a(boolean z) {
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view;
                int i = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View rootView = MtbWeexManager.g(MtbWeexManager.this).getRootView();
                View view2 = null;
                if (rootView != null) {
                    view = rootView.findViewById(R.id.mtb_back_to_mainpage);
                } else {
                    view = null;
                }
                if (view instanceof View) {
                    view2 = view;
                }
                if (view2 != null) {
                    if (this.b) {
                        i = 8;
                    }
                    view2.setVisibility(i);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b<T> implements o32<JSONObject> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pvh f11272a;

            public b(pvh pvhVar) {
                this.f11272a = pvhVar;
            }

            /* renamed from: b */
            public final void a(boolean z, String str, JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9bd050f5", new Object[]{this, new Boolean(z), str, jSONObject});
                    return;
                }
                pvh pvhVar = this.f11272a;
                if (pvhVar != null) {
                    pvhVar.b(jSONObject);
                }
            }
        }

        static {
            t2o.a(745537891);
            t2o.a(745537596);
        }

        public a() {
        }

        @Override // tb.vib
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fa7b794", new Object[]{this});
            } else {
                MtbWeexManager.this.y();
            }
        }

        @Override // tb.vib
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77a82e66", new Object[]{this, new Boolean(z)});
            } else {
                uuu.a(new RunnableC0632a(z));
            }
        }

        @Override // tb.vib
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c65f170a", new Object[]{this});
            } else {
                MtbWeexManager.g(MtbWeexManager.this).z();
            }
        }

        @Override // tb.vib
        public JSONObject d(pvh pvhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5c7159ad", new Object[]{this, pvhVar});
            }
            tib a2 = q32.Companion.a();
            if (a2 != null) {
                return a2.a(new b(pvhVar));
            }
            return null;
        }

        @Override // tb.vib
        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1d1cc3e", new Object[]{this, str, str2});
                return;
            }
            ckf.h(str, "url");
            if (!TextUtils.isEmpty(str2)) {
                UTAnalytics instance = UTAnalytics.getInstance();
                ckf.c(instance, "UTAnalytics.getInstance()");
                instance.getDefaultTracker().updateNextPageProperties(kotlin.collections.a.k(jpu.a("spm-url", str2)));
            }
            Nav.from(Globals.getApplication()).toUri(str);
            MtbGlobalEnv.i = str;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.taobao.mytaobao.basement.MTBBasementContainerView r12, int r13, int r14, java.lang.String r15) {
        /*
            r11 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.mytaobao.pagev2.MtbWeexManager.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0028
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r13)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r14)
            r14 = 5
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r0] = r11
            r0 = 1
            r14[r0] = r12
            r12 = 2
            r14[r12] = r2
            r12 = 3
            r14[r12] = r13
            r12 = 4
            r14[r12] = r15
            java.lang.String r12 = "ea1d46ff"
            r1.ipc$dispatch(r12, r14)
            return
        L_0x0028:
            com.taobao.mytaobao.basement.weex.BasementWeexView r8 = new com.taobao.mytaobao.basement.weex.BasementWeexView
            android.content.Context r3 = r12.getContext()
            java.lang.String r1 = "containerView.context"
            tb.ckf.c(r3, r1)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r12.installWeex(r8)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            java.lang.String r0 = tb.h9x.a(r0, r15)
            java.lang.String r1 = "WeexUtils.processUrl(false, weexUrl)"
            tb.ckf.c(r0, r1)
            r9.element = r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "renderMode"
            java.lang.String r2 = "texture"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
            java.lang.String r1 = "wx_opaque"
            java.lang.String r2 = "0"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Uri.parse(newWeexUrl).bu…      .build().toString()"
            tb.ckf.c(r0, r1)
            r9.element = r0
            com.taobao.mytaobao.pagev2.MtbBizProxyV2 r0 = r11.m
            com.taobao.mytaobao.basement.weex.WeexInstanceLoadHelper r0 = r0.n()
            android.content.Context r1 = r12.getContext()
            if (r1 == 0) goto L_0x0095
            android.app.Activity r1 = (android.app.Activity) r1
            com.taobao.mytaobao.pagev2.MtbWeexManager$b r10 = new com.taobao.mytaobao.pagev2.MtbWeexManager$b
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r4, r5, r6, r7, r8, r9)
            r0.s(r1, r10)
            return
        L_0x0095:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            java.lang.String r13 = "null cannot be cast to non-null type android.app.Activity"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mytaobao.pagev2.MtbWeexManager.l(com.taobao.mytaobao.basement.MTBBasementContainerView, int, int, java.lang.String):void");
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5818d1b5", new Object[]{this});
            return;
        }
        MTPtrRecyclerView mTPtrRecyclerView = this.b;
        if (mTPtrRecyclerView != null) {
            mTPtrRecyclerView.smoothScrollToPosition(0);
        }
        suv.d(u3j.b, "Page_MyTaobao_click-returnTop", "a2141.7631743.1102.1", null, null);
        if (this.d) {
            q("returnTopTap");
        }
    }

    public final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3005be", new Object[]{this, str});
            return;
        }
        ckf.h(str, "behavior");
        if (this.d && this.i && this.c != null) {
            WeexNestedScrollHelper weexNestedScrollHelper = this.f11269a;
            if (weexNestedScrollHelper != null) {
                weexNestedScrollHelper.h(false);
            }
            if (ckf.b(str, "returnTopTap") || ckf.b(str, "mtbTabTap") || ckf.b(str, "headerTap") || ckf.b(str, "mtbTabDoubleTap") || ckf.b(str, "backPress")) {
                String str2 = r32.f;
                ckf.c(str2, "BasementEventSender.EVEN…IFY_QUICK_BACK_FIRST_PAGE");
                B(str2, null);
            }
            this.d = false;
            BasementExposureManager basementExposureManager = this.f;
            if (basementExposureManager != null) {
                basementExposureManager.c(false);
            }
            r32.b(this.c, false, false);
            if (this.g != null) {
                t32.b().d(str, this.m);
                hqb hqbVar = this.g;
                if (hqbVar != null) {
                    hqbVar.c();
                }
            }
        }
    }

    public final MTBBasementContainerView s(Context context, int i, int i2, String str, h3j h3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBBasementContainerView) ipChange.ipc$dispatch("2de9cc59", new Object[]{this, context, new Integer(i), new Integer(i2), str, h3jVar});
        }
        ckf.h(context, "ctx");
        ckf.h(str, "weexUrl");
        ckf.h(h3jVar, "data");
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView != null) {
            mTBBasementContainerView.onDestroy();
        }
        MTPtrRecyclerView mTPtrRecyclerView = this.b;
        if (mTPtrRecyclerView != null) {
            mTPtrRecyclerView.setScrollEnable(true);
        }
        MTBBasementContainerView mTBBasementContainerView2 = new MTBBasementContainerView(context, null, 0, 6, null);
        this.c = mTBBasementContainerView2;
        mTBBasementContainerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
        l(mTBBasementContainerView2, i, i2, str);
        if (!this.i) {
            mTBBasementContainerView2.delayShowPlaceHolder(h3jVar);
        }
        MTPtrRecyclerView mTPtrRecyclerView2 = this.b;
        if (mTPtrRecyclerView2 != null) {
            mTPtrRecyclerView2.removeOnScrollListener(this.k);
        }
        MTPtrRecyclerView mTPtrRecyclerView3 = this.b;
        if (mTPtrRecyclerView3 != null) {
            mTPtrRecyclerView3.addOnScrollListener(this.k);
        }
        return mTBBasementContainerView2;
    }

    public final void y() {
        tib a2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa7b794", new Object[]{this});
            return;
        }
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView != null) {
            z6t.W("收到前端renderSuccess");
            JSONObject jSONObject = new JSONObject();
            s3j i = MtbDataServiceFacade.i();
            jSONObject.put("isDowngradePrestrain", (Object) Integer.valueOf((i == null || (a2 = q32.Companion.a()) == null || !a2.c(i)) ? 0 : 1));
            z6t.S().e("WebLoad", jSONObject);
            this.i = true;
            mTBBasementContainerView.hidePlaceHolder();
            MTPtrRecyclerView mTPtrRecyclerView = this.b;
            if (mTPtrRecyclerView != null) {
                if (mTPtrRecyclerView.canScrollVertically(1) || this.d) {
                    z = false;
                }
                MTPtrRecyclerView mTPtrRecyclerView2 = this.b;
                if (mTPtrRecyclerView2 != null) {
                    int calcVerticalScrollOffset = mTPtrRecyclerView2.calcVerticalScrollOffset();
                    if (z && calcVerticalScrollOffset <= 0) {
                        z = false;
                    }
                    if (z) {
                        if (this.m.m().isResumed()) {
                            p("renderSuccessForeground", false);
                        } else {
                            this.h = new c();
                        }
                    }
                    mTBBasementContainerView.post(new d(mTBBasementContainerView));
                    sc.c("basementRender");
                    s32.c().e();
                    z6t.W("renderSuccess");
                    return;
                }
                ckf.s();
                throw null;
            }
            ckf.s();
            throw null;
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209251a0", new Object[]{this});
            return;
        }
        TLog.loge("basementLog", "real resetData");
        this.i = false;
        this.h = null;
        this.d = false;
        BasementExposureManager basementExposureManager = this.f;
        if (basementExposureManager != null) {
            basementExposureManager.b();
        }
        this.f = null;
        MTBBasementContainerView mTBBasementContainerView = this.c;
        if (mTBBasementContainerView != null) {
            mTBBasementContainerView.onDestroy();
        }
        this.c = null;
        MTPtrRecyclerView mTPtrRecyclerView = this.b;
        if (mTPtrRecyclerView != null) {
            mTPtrRecyclerView.removeOnScrollListener(this.k);
        }
        TLog.loge("basementWeexLog", "resetData scrollEnable=true");
        MTPtrRecyclerView mTPtrRecyclerView2 = this.b;
        if (mTPtrRecyclerView2 != null) {
            mTPtrRecyclerView2.setScrollEnable(true);
        }
        tib a2 = q32.Companion.a();
        if (a2 != null) {
            a2.dispose();
        }
        WeexNestedScrollHelper weexNestedScrollHelper = this.f11269a;
        if (weexNestedScrollHelper != null) {
            weexNestedScrollHelper.k();
        }
        this.f11269a = null;
        this.e.b();
    }
}
