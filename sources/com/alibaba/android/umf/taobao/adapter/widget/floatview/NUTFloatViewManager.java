package com.alibaba.android.umf.taobao.adapter.widget.floatview;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.ai;
import tb.aij;
import tb.ayc;
import tb.bij;
import tb.cij;
import tb.ck;
import tb.cyc;
import tb.dij;
import tb.dyc;
import tb.fij;
import tb.fyc;
import tb.gij;
import tb.guk;
import tb.hij;
import tb.iij;
import tb.t2o;
import tb.xh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NUTFloatViewManager implements fyc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NUTFloatViewManager";

    /* renamed from: a  reason: collision with root package name */
    public Builder f2412a;
    public hij b;
    public final Map<String, ayc> c;
    public final Map<String, dyc> d;
    public cyc e;
    public boolean f;
    public OnScreenChangedListener g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Builder implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Object> mFloatParams;
        private hij mFloatStyle;
        private String mFloatType;
        private boolean mInternalRecycleOnDismiss;
        private boolean mNeedLogin;
        private cyc.b mOnDismissListener;
        private cyc.d mOnShowListener;
        private cyc.c mRenderListener;
        private NUTFloatViewManager mReuseFloatViewManager;

        static {
            t2o.a(81789292);
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public static /* synthetic */ String access$500(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("12398fb1", new Object[]{builder});
            }
            return builder.mFloatType;
        }

        public static /* synthetic */ cyc.b access$700(Builder builder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cyc.b) ipChange.ipc$dispatch("7382ccec", new Object[]{builder});
            }
            return builder.mOnDismissListener;
        }

        public NUTFloatViewManager build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NUTFloatViewManager) ipChange.ipc$dispatch("d13b7ce7", new Object[]{this});
            }
            NUTFloatViewManager nUTFloatViewManager = this.mReuseFloatViewManager;
            if (nUTFloatViewManager == null) {
                return new NUTFloatViewManager(this, null);
            }
            NUTFloatViewManager.g(nUTFloatViewManager, this);
            return this.mReuseFloatViewManager;
        }

        public Builder floatParams(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1b40d157", new Object[]{this, map});
            }
            if (map != null) {
                this.mFloatParams = map;
            }
            return this;
        }

        public Builder floatStyle(hij hijVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9b5b6ad6", new Object[]{this, hijVar});
            }
            this.mFloatStyle = hijVar;
            return this;
        }

        public Builder floatType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b73b89c2", new Object[]{this, str});
            }
            this.mFloatType = str;
            return this;
        }

        public Map<String, Object> getFloatParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f1a95d48", new Object[]{this});
            }
            return this.mFloatParams;
        }

        public hij getFloatStyle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hij) ipChange.ipc$dispatch("a2f61d39", new Object[]{this});
            }
            if (this.mFloatStyle == null) {
                floatStyle(new hij());
            }
            return this.mFloatStyle;
        }

        public String getFloatType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2865c5f9", new Object[]{this});
            }
            return this.mFloatType;
        }

        public cyc.b getOnDismissListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cyc.b) ipChange.ipc$dispatch("b6082a49", new Object[]{this});
            }
            return this.mOnDismissListener;
        }

        public cyc.d getOnShowListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cyc.d) ipChange.ipc$dispatch("a54090db", new Object[]{this});
            }
            return this.mOnShowListener;
        }

        public cyc.c getRenderListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cyc.c) ipChange.ipc$dispatch("967c97bc", new Object[]{this});
            }
            return this.mRenderListener;
        }

        public Builder internalRecycleOnDismiss(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5e8f9a93", new Object[]{this, new Boolean(z)});
            }
            this.mInternalRecycleOnDismiss = z;
            return this;
        }

        public boolean isInternalRecycleOnDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3877878a", new Object[]{this})).booleanValue();
            }
            return this.mInternalRecycleOnDismiss;
        }

        public boolean isNeedLogin() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4272ce74", new Object[]{this})).booleanValue();
            }
            return this.mNeedLogin;
        }

        public Builder needLogin(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5d916f15", new Object[]{this, new Boolean(z)});
            }
            this.mNeedLogin = z;
            return this;
        }

        public Builder onDismissListener(cyc.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("db9073c4", new Object[]{this, bVar});
            }
            this.mOnDismissListener = bVar;
            return this;
        }

        public Builder onShowListener(cyc.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a3920ce2", new Object[]{this, dVar});
            }
            this.mOnShowListener = dVar;
            return this;
        }

        public Builder renderListener(cyc.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e01289cf", new Object[]{this, cVar});
            }
            this.mRenderListener = cVar;
            return this;
        }

        public Builder reuseFloatViewManager(NUTFloatViewManager nUTFloatViewManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("67af2836", new Object[]{this, nUTFloatViewManager});
            }
            this.mReuseFloatViewManager = nUTFloatViewManager;
            return this;
        }

        private Builder() {
            this.mFloatType = "umf";
            this.mFloatParams = Collections.emptyMap();
            this.mInternalRecycleOnDismiss = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            try {
                NUTFloatViewManager nUTFloatViewManager = NUTFloatViewManager.this;
                NUTFloatViewManager.b(nUTFloatViewManager, NUTFloatViewManager.c(nUTFloatViewManager).getFloatStyle().clone());
                if (i == 2) {
                    NUTFloatViewManager nUTFloatViewManager2 = NUTFloatViewManager.this;
                    NUTFloatViewManager.d(nUTFloatViewManager2, NUTFloatViewManager.a(nUTFloatViewManager2));
                }
                NUTFloatViewManager.e(NUTFloatViewManager.this);
                NUTFloatViewManager.f(NUTFloatViewManager.this).onScreenChanged(i, configuration);
            } catch (Throwable th) {
                ck.g().e(th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements cyc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.cyc.b
        public void onDismiss(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c369e62", new Object[]{this, new Boolean(z)});
                return;
            }
            cyc.b onDismissListener = NUTFloatViewManager.c(NUTFloatViewManager.this).getOnDismissListener();
            if (onDismissListener != null) {
                onDismissListener.onDismiss(false);
            }
        }
    }

    static {
        t2o.a(81789289);
        t2o.a(81789283);
    }

    public /* synthetic */ NUTFloatViewManager(Builder builder, a aVar) {
        this(builder);
    }

    public static /* synthetic */ hij a(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hij) ipChange.ipc$dispatch("8cfa3132", new Object[]{nUTFloatViewManager});
        }
        return nUTFloatViewManager.b;
    }

    public static /* synthetic */ hij b(NUTFloatViewManager nUTFloatViewManager, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hij) ipChange.ipc$dispatch("89e8f6d5", new Object[]{nUTFloatViewManager, hijVar});
        }
        nUTFloatViewManager.b = hijVar;
        return hijVar;
    }

    public static /* synthetic */ Builder c(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("4b982805", new Object[]{nUTFloatViewManager});
        }
        return nUTFloatViewManager.f2412a;
    }

    public static /* synthetic */ void d(NUTFloatViewManager nUTFloatViewManager, hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee153ece", new Object[]{nUTFloatViewManager, hijVar});
        } else {
            nUTFloatViewManager.r(hijVar);
        }
    }

    public static /* synthetic */ void e(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2f848", new Object[]{nUTFloatViewManager});
        } else {
            nUTFloatViewManager.t();
        }
    }

    public static /* synthetic */ cyc f(NUTFloatViewManager nUTFloatViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyc) ipChange.ipc$dispatch("239c376d", new Object[]{nUTFloatViewManager});
        }
        return nUTFloatViewManager.e;
    }

    public static /* synthetic */ void g(NUTFloatViewManager nUTFloatViewManager, Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab005c9", new Object[]{nUTFloatViewManager, builder});
        } else {
            nUTFloatViewManager.o(builder);
        }
    }

    public static Builder v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("2887b748", new Object[0]);
        }
        return new Builder(null);
    }

    @Override // tb.fyc
    public boolean dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae28e215", new Object[]{this})).booleanValue();
        }
        cyc cycVar = this.e;
        if (cycVar != null) {
            return cycVar.C1();
        }
        Builder builder = this.f2412a;
        if (!(builder == null || Builder.access$700(builder) == null)) {
            Builder.access$700(this.f2412a).onDismiss(false);
        }
        return false;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        cyc cycVar = this.e;
        if (cycVar != null) {
            cycVar.destroy();
            this.e = null;
        }
        if (this.g != null) {
            TBAutoSizeConfig.x().h0(this.g);
        }
    }

    public final cyc j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cyc) ipChange.ipc$dispatch("ee5d5a50", new Object[]{this});
        }
        if (this.f2412a != null) {
            if (this.e == null) {
                this.e = new NUTFragmentFloatContainer();
                dyc l = l(Builder.access$500(this.f2412a));
                l.a(this);
                this.e.L1(l);
                t();
            }
            return this.e;
        }
        throw new NullPointerException("make sure you have set Builder");
    }

    public final ayc k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayc) ipChange.ipc$dispatch("221d8915", new Object[]{this, str});
        }
        return this.c.get(str);
    }

    public final dyc l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dyc) ipChange.ipc$dispatch("708d2385", new Object[]{this, str});
        }
        dyc dycVar = this.d.get(str);
        if (dycVar == null) {
            return new bij();
        }
        return dycVar;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2f5cd3", new Object[]{this});
        } else if (this.b.b()) {
            this.g = new a();
            TBAutoSizeConfig.x().d0(this.g);
        }
    }

    @Override // tb.fyc
    public void n(cyc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89558af", new Object[]{this, aVar});
        } else {
            j().n(aVar);
        }
    }

    public final void o(Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874febc7", new Object[]{this, builder});
            return;
        }
        this.f2412a = builder;
        hij floatStyle = builder.getFloatStyle();
        this.b = floatStyle;
        this.e.c0(this.f2412a, floatStyle);
        dyc l = l(Builder.access$500(this.f2412a));
        l.a(this);
        this.e.L1(l);
        this.e.j1(k(this.b.c()));
    }

    public void p(String str, ayc aycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5792e0b0", new Object[]{this, str, aycVar});
        } else {
            this.c.put(str, aycVar);
        }
    }

    public void q(String str, dyc dycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e052a8e", new Object[]{this, str, dycVar});
        } else {
            this.d.put(str, dycVar);
        }
    }

    public boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99665f48", new Object[]{this, context})).booleanValue();
        }
        cyc j = j();
        u(context);
        t();
        return j.U(context);
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f81417", new Object[]{this});
            return;
        }
        ((NUTFragmentFloatContainer) this.e).c0(this.f2412a, this.b);
        ((NUTFragmentFloatContainer) this.e).Q2(new b());
        ((NUTFragmentFloatContainer) this.e).R2(this.f2412a.getOnShowListener());
        ((NUTFragmentFloatContainer) this.e).O2(k("nutFloatViewBackgroundAlphaIn"));
        ((NUTFragmentFloatContainer) this.e).j1(k(this.b.c()));
    }

    public final void u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f210f83", new Object[]{this, context});
        } else if (!xh.c(context)) {
            try {
                hij a2 = this.f2412a.getFloatStyle().clone();
                this.b = a2;
                r(a2);
            } catch (Throwable th) {
                ck.g().e(th.getMessage());
            }
        }
    }

    public NUTFloatViewManager() {
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = false;
    }

    public final void i(Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8768949", new Object[]{this, builder});
        } else if (!this.f) {
            this.f = true;
            Boolean i = this.b.i();
            if (i == null || !i.booleanValue()) {
                p("slideDown", new fij());
            } else {
                p("slideDown", new dij());
            }
            p("slideRight", new gij());
            p("nutFloatViewBackgroundAlphaIn", new aij());
            q("umf", new cij());
            q("aura", new bij());
        }
    }

    public final void r(hij hijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27b9145", new Object[]{this, hijVar});
            return;
        }
        int d = ai.d();
        hijVar.r(false);
        hijVar.m("slideRight");
        hijVar.v(0.0f);
        iij iijVar = new iij();
        iijVar.h(d / 2);
        hijVar.q(iijVar);
        p("slideDown", new fij());
    }

    public NUTFloatViewManager(Builder builder) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = false;
        this.f2412a = builder;
        this.b = builder.getFloatStyle();
        i(builder);
        m();
    }
}
