package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.bw7;
import tb.eo7;
import tb.l38;
import tb.mr7;
import tb.nb4;
import tb.nj7;
import tb.oa4;
import tb.owo;
import tb.pb6;
import tb.q84;
import tb.t2o;
import tb.tgh;
import tb.xo7;
import tb.yc4;
import tb.ze7;
import tb.zy9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DinamicXComponent extends oa4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public volatile long k;
    public volatile long l;
    public volatile ViewGroup n;
    public volatile boolean o;
    public volatile boolean q;
    public boolean w;

    /* renamed from: a  reason: collision with root package name */
    public final zy9 f6701a = new zy9(-1, -1, 17);
    public final StringBuilder b = new StringBuilder();
    public long i = -1;
    public long j = -1;
    public final boolean m = Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sShowDxRenderCost));
    public volatile boolean p = false;
    public volatile boolean r = false;
    public volatile boolean s = false;
    public int u = 0;
    public final c x = new c(this, null);
    public ComponentViewMeta t = this.mDetailContext.d().d(this.mComponentData.j());
    public final String v = b0();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ObserverFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc3c9bc8", new Object[]{this, new Integer(i)});
            } else if (DinamicXComponent.u(DinamicXComponent.this) != i) {
                DinamicXComponent.v(DinamicXComponent.this, i);
                DinamicXComponent.this.updateComponent();
            }
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
            } else {
                q84.f(DinamicXComponent.this.mContext, new DescNativeController.c(DinamicXComponent.this.mComponentData.g()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f6707a;

        static {
            t2o.a(912261413);
        }

        private c() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec368958", new Object[]{this, new Boolean(z)});
            } else {
                this.f6707a = z;
            }
        }

        public /* synthetic */ c(DinamicXComponent dinamicXComponent, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DinamicXComponent.G(DinamicXComponent.this) != null) {
                if (DinamicXComponent.K(DinamicXComponent.this)) {
                    if (DinamicXComponent.M(DinamicXComponent.this)) {
                        DinamicXComponent.N(DinamicXComponent.this);
                    }
                } else if (!this.f6707a || !DinamicXComponent.O(DinamicXComponent.this)) {
                    DinamicXComponent.P(DinamicXComponent.this, false);
                    if (DinamicXComponent.M(DinamicXComponent.this)) {
                        DinamicXComponent.Q(DinamicXComponent.this);
                    }
                } else {
                    tgh.b(xo7.TAG_DINAMICX_VIEW_COMPONENT, "renderDinamicX() failure: dinamicXView measuredHeight > 1.0086f * screenHeight");
                    DinamicXComponent.P(DinamicXComponent.this, true);
                    if (DinamicXComponent.M(DinamicXComponent.this)) {
                        DinamicXComponent.N(DinamicXComponent.this);
                        tgh.b(xo7.TAG_DINAMICX_VIEW_COMPONENT, "renderDinamicX() failure: hide dx view");
                    }
                }
            }
        }
    }

    static {
        t2o.a(912261402);
    }

    public DinamicXComponent(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
    }

    public static /* synthetic */ ViewGroup G(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("142fc6e3", new Object[]{dinamicXComponent});
        }
        return dinamicXComponent.n;
    }

    public static /* synthetic */ ViewGroup I(DinamicXComponent dinamicXComponent, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f5f84346", new Object[]{dinamicXComponent, viewGroup});
        }
        dinamicXComponent.n = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ boolean K(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66b97495", new Object[]{dinamicXComponent})).booleanValue();
        }
        return dinamicXComponent.r;
    }

    public static /* synthetic */ boolean L(DinamicXComponent dinamicXComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7212cd69", new Object[]{dinamicXComponent, new Boolean(z)})).booleanValue();
        }
        dinamicXComponent.r = z;
        return z;
    }

    public static /* synthetic */ boolean M(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fbac634", new Object[]{dinamicXComponent})).booleanValue();
        }
        return dinamicXComponent.g0();
    }

    public static /* synthetic */ void N(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98bc17cf", new Object[]{dinamicXComponent});
        } else {
            dinamicXComponent.c0();
        }
    }

    public static /* synthetic */ boolean O(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1bd6972", new Object[]{dinamicXComponent})).booleanValue();
        }
        return dinamicXComponent.d0();
    }

    public static /* synthetic */ boolean P(DinamicXComponent dinamicXComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb6566d", new Object[]{dinamicXComponent, new Boolean(z)})).booleanValue();
        }
        dinamicXComponent.p = z;
        return z;
    }

    public static /* synthetic */ void Q(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c00cac", new Object[]{dinamicXComponent});
        } else {
            dinamicXComponent.i0();
        }
    }

    public static /* synthetic */ boolean R(DinamicXComponent dinamicXComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d081aef", new Object[]{dinamicXComponent, new Boolean(z)})).booleanValue();
        }
        dinamicXComponent.o = z;
        return z;
    }

    public static /* synthetic */ boolean a(DinamicXComponent dinamicXComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2bbd4f3", new Object[]{dinamicXComponent, jSONObject})).booleanValue();
        }
        return dinamicXComponent.j(jSONObject);
    }

    public static /* synthetic */ void b(DinamicXComponent dinamicXComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e6eb14", new Object[]{dinamicXComponent, new Boolean(z)});
        } else {
            dinamicXComponent.h0(z);
        }
    }

    public static /* synthetic */ void c(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f53115f", new Object[]{dinamicXComponent});
        } else {
            dinamicXComponent.j0();
        }
    }

    public static /* synthetic */ boolean d(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58546302", new Object[]{dinamicXComponent})).booleanValue();
        }
        return dinamicXComponent.e0();
    }

    public static /* synthetic */ boolean e(DinamicXComponent dinamicXComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bafe8edd", new Object[]{dinamicXComponent, new Boolean(z)})).booleanValue();
        }
        dinamicXComponent.q = z;
        return z;
    }

    public static /* synthetic */ boolean f(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a570640", new Object[]{dinamicXComponent})).booleanValue();
        }
        return dinamicXComponent.s;
    }

    public static /* synthetic */ void g(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07409e6", new Object[]{dinamicXComponent});
        } else {
            dinamicXComponent.k0();
        }
    }

    public static /* synthetic */ void h(DinamicXComponent dinamicXComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5871dd2d", new Object[]{dinamicXComponent, view});
        } else {
            dinamicXComponent.S(view);
        }
    }

    public static /* synthetic */ long i(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e276ad18", new Object[]{dinamicXComponent})).longValue();
        }
        return dinamicXComponent.k;
    }

    public static /* synthetic */ Object ipc$super(DinamicXComponent dinamicXComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case 369461610:
                super.updateRenderType((String) objArr[0]);
                return null;
            case 1252518699:
                super.onDisAppear();
                return null;
            case 1652629691:
                super.updateComponent();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/component/module/DinamicXComponent");
        }
    }

    public static /* synthetic */ int u(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bb57fa7", new Object[]{dinamicXComponent})).intValue();
        }
        return dinamicXComponent.u;
    }

    public static /* synthetic */ int v(DinamicXComponent dinamicXComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c97e6c4", new Object[]{dinamicXComponent, new Integer(i)})).intValue();
        }
        dinamicXComponent.u = i;
        return i;
    }

    public static /* synthetic */ void w(DinamicXComponent dinamicXComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618b5d0d", new Object[]{dinamicXComponent, view});
        } else {
            dinamicXComponent.l0(view);
        }
    }

    public static /* synthetic */ c x(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("a4f269f5", new Object[]{dinamicXComponent});
        }
        return dinamicXComponent.x;
    }

    public static /* synthetic */ ComponentViewMeta y(DinamicXComponent dinamicXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentViewMeta) ipChange.ipc$dispatch("640f50c0", new Object[]{dinamicXComponent});
        }
        return dinamicXComponent.t;
    }

    public static /* synthetic */ void z(DinamicXComponent dinamicXComponent, ComponentViewMeta componentViewMeta, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcff4239", new Object[]{dinamicXComponent, componentViewMeta, str});
        } else {
            dinamicXComponent.m0(componentViewMeta, str);
        }
    }

    public final void S(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54c9109", new Object[]{this, view});
        } else if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ll_dinamicx_container);
            if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != this.n) {
                frameLayout.removeAllViews();
                if (this.n != null) {
                    ViewParent parent = this.n.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(this.n);
                    }
                    frameLayout.addView(this.n, new FrameLayout.LayoutParams(-2, -2, 83));
                }
            }
        }
    }

    public View T(View view) {
        boolean z;
        View view2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.ll_dinamicx_with_time_container) {
            PreRenderManager g = PreRenderManager.g(this.mContext);
            if (g != null) {
                view = g.j(this.mContext, R.layout.tt_detail_dinamicx_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_dinamicx_component, (ViewGroup) null);
            }
        }
        if (this.m) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.vs_time_container);
            if (viewStub != null) {
                view2 = viewStub.inflate();
            } else {
                view2 = view.findViewById(R.id.ll_time_container);
            }
            this.c = (TextView) view2.findViewById(R.id.tv_dx_create_time);
            this.d = (TextView) view2.findViewById(R.id.tv_dx_render_time);
            this.e = (TextView) view2.findViewById(R.id.tv_dx_ultron_name);
            this.f = (TextView) view2.findViewById(R.id.tv_dx_name);
            this.g = (TextView) view2.findViewById(R.id.tv_dx_version);
            this.h = (TextView) view2.findViewById(R.id.tv_dx_detail_info);
            view2.setVisibility(0);
        }
        ViewGroup a0 = a0(view);
        if (this.n == null || a0 != this.n) {
            z = false;
        } else {
            z = true;
        }
        this.o = z;
        if (this.o && !U()) {
            this.o = false;
        }
        ViewGroup viewGroup = this.n;
        this.n = a0;
        if ((viewGroup != null || f0()) && !this.w) {
            z2 = false;
        }
        this.s = z2;
        S(view);
        if (this.r || this.p || (d0() && this.n.getChildCount() <= 0)) {
            c0();
        } else {
            i0();
        }
        view.setTag(R.id.tt_detail_dx_view_bind_component_id, Integer.valueOf(hashCode()));
        if (nj7.i(this.mContext) && (view instanceof ObserverFrameLayout)) {
            ((ObserverFrameLayout) view).setOnSizeChangedListener(new a());
        }
        return view;
    }

    public final boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bfcdae3", new Object[]{this})).booleanValue();
        }
        View view = this.mView;
        if (view == null) {
            return true;
        }
        int i = R.id.tt_detail_dx_view_bind_component_data_id;
        if (view.getTag(i) instanceof String) {
            return ((String) this.mView.getTag(i)).equals(this.mComponentData.g());
        }
        return true;
    }

    public final void V() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a95b70c", new Object[]{this});
        } else if ((this.n == null || this.s) && this.t != null) {
            l38 e = new l38().d(this.t.getName()).f(this.t.getVersion()).e(this.t.getUrl());
            long currentTimeMillis = System.currentTimeMillis();
            final boolean p = yc4.p(this.mComponentData);
            this.n = this.mDetailContext.g().g(e, Z(), new eo7.r() { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.eo7.r
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                        return;
                    }
                    bw7.b(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent.6.1
                        {
                            put("DxName", DinamicXComponent.y(DinamicXComponent.this).getName());
                            put("DxVersion", DinamicXComponent.y(DinamicXComponent.this).getVersion());
                            put("isAsyncDx", String.valueOf(p));
                        }
                    }, -100006, str);
                    tgh.b(xo7.TAG_DINAMICX_VIEW_COMPONENT, "createDinamicX() failure: " + str);
                }

                @Override // tb.eo7.r
                public void b(ViewGroup viewGroup) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
                        return;
                    }
                    boolean M = DinamicXComponent.M(DinamicXComponent.this);
                    if (M && !DinamicXComponent.f(DinamicXComponent.this)) {
                        DinamicXComponent.g(DinamicXComponent.this);
                    }
                    DinamicXComponent.I(DinamicXComponent.this, viewGroup);
                    DinamicXComponent.R(DinamicXComponent.this, false);
                    if (M) {
                        DinamicXComponent dinamicXComponent = DinamicXComponent.this;
                        DinamicXComponent.h(dinamicXComponent, dinamicXComponent.mView);
                        DinamicXComponent.b(DinamicXComponent.this, false);
                        if (DinamicXComponent.i(DinamicXComponent.this) >= 1) {
                            DinamicXComponent.c(DinamicXComponent.this);
                        }
                    }
                }
            });
            this.k++;
            long currentTimeMillis2 = System.currentTimeMillis();
            this.i = currentTimeMillis2 - currentTimeMillis;
            PerformanceUtils.b(this.mDetailContext, "lastDxRender", currentTimeMillis2);
            S(this.mView);
            if (this.m && (textView = this.c) != null) {
                StringBuilder sb = new StringBuilder("create: ");
                sb.append(this.i);
                sb.append("(ms);N: ");
                sb.append(this.k);
                textView.setText(sb);
            }
            this.s = false;
            this.w = false;
        }
    }

    public final int W(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54ae11ff", new Object[]{this, new Integer(i), new Float(f)})).intValue();
        }
        return DXWidgetNode.DXMeasureSpec.c((i - owo.b(this.mContext, f)) / 2, 1073741824);
    }

    public DXRootView X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("39124f9f", new Object[]{this});
        }
        if (this.n instanceof DXRootView) {
            return (DXRootView) this.n;
        }
        return null;
    }

    public final String Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f914758e", new Object[]{this});
        }
        String d = RuntimeUtils.d(this);
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        return "dxUltronName: error";
    }

    public final ViewGroup Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e4d15c35", new Object[]{this});
        }
        View view = this.mView;
        if (view == null) {
            return null;
        }
        return (ViewGroup) view.findViewById(R.id.ll_dinamicx_container);
    }

    public final ViewGroup a0(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("22d6e573", new Object[]{this, view});
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ll_dinamicx_container);
        if (frameLayout.getChildCount() == 1) {
            view2 = frameLayout.getChildAt(0);
        } else {
            view2 = null;
        }
        if (view2 instanceof ViewGroup) {
            return (ViewGroup) view2;
        }
        return null;
    }

    public final String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d6845de", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f == null || f.isEmpty()) {
            return null;
        }
        return f.getString("style");
    }

    public final void c0() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c1042", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null && (findViewById = view.findViewById(R.id.ll_dinamicx_container)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public final boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49ebce33", new Object[]{this})).booleanValue();
        }
        if (this.n == null || this.n.getMeasuredHeight() <= mr7.e(this.mContext) * 1.0086f) {
            return false;
        }
        return true;
    }

    public final boolean f0() {
        DXTemplateItem dxTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a4ea41", new Object[]{this})).booleanValue();
        }
        if (this.t == null) {
            return true;
        }
        if (this.n == null || !(this.n instanceof DXRootView) || (dxTemplateItem = ((DXRootView) this.n).getDxTemplateItem()) == null || !TextUtils.equals(dxTemplateItem.e(), this.t.getName())) {
            return false;
        }
        if (TextUtils.equals(dxTemplateItem.h() + "", this.t.getVersion())) {
            return true;
        }
        return false;
    }

    public final boolean g0() {
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c0affb", new Object[]{this})).booleanValue();
        }
        View view = this.mView;
        if (view == null || (tag = view.getTag(R.id.tt_detail_dx_view_bind_component_id)) == null || tag.hashCode() != hashCode()) {
            return false;
        }
        return true;
    }

    @Override // tb.oa4
    public String getRenderName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50aa3a22", new Object[]{this});
        }
        ComponentViewMeta componentViewMeta = this.t;
        if (componentViewMeta != null) {
            return componentViewMeta.getName();
        }
        return null;
    }

    @Override // tb.oa4
    public String getRenderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
        }
        ComponentViewMeta componentViewMeta = this.t;
        if (componentViewMeta != null) {
            return componentViewMeta.getUrl();
        }
        return null;
    }

    @Override // tb.oa4
    public String getRenderVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7e977cd", new Object[]{this});
        }
        ComponentViewMeta componentViewMeta = this.t;
        if (componentViewMeta != null) {
            return componentViewMeta.getVersion();
        }
        return null;
    }

    public final void i0() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d7603d", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null && (findViewById = view.findViewById(R.id.ll_dinamicx_container)) != null) {
            findViewById.setVisibility(0);
        }
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d8f70f", new Object[]{this});
        } else if (this.n instanceof DXRootView) {
            this.mDetailContext.g().y((DXRootView) this.n);
        }
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319a9a57", new Object[]{this});
        } else if (this.n instanceof DXRootView) {
            this.mDetailContext.g().z((DXRootView) this.n);
        }
    }

    public final void l0(View view) {
        DXTemplateItem dxTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46278f00", new Object[]{this, view});
        } else if (this.m && this.e != null && this.f != null && this.g != null && this.h != null) {
            String str = "dxName: error";
            String str2 = "dxVersion: error";
            String str3 = "";
            if (view instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) view;
                if (dXRootView.getDxTemplateItem() != null) {
                    str = "dxName: " + dxTemplateItem.e();
                    str2 = "dxVersion: " + dxTemplateItem.h();
                }
                Map<String, String> perfromTrackData = dXRootView.getPerfromTrackData();
                if (perfromTrackData != null) {
                    StringBuilder sb = this.b;
                    sb.delete(0, sb.length());
                    for (Map.Entry<String, String> entry : perfromTrackData.entrySet()) {
                        StringBuilder sb2 = this.b;
                        sb2.append(", ");
                        sb2.append(entry.getKey());
                        sb2.append(": ");
                        sb2.append(entry.getValue());
                    }
                    if (this.b.length() >= 2) {
                        str3 = this.b.substring(2);
                    }
                }
            }
            this.e.setText(Y());
            this.f.setText(str);
            this.g.setText(str2);
            this.h.setText(str3);
        }
    }

    public final void m0(ComponentViewMeta componentViewMeta, String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fdae49", new Object[]{this, componentViewMeta, str});
        } else if (this.m && this.e != null && this.f != null && this.g != null && this.h != null) {
            if (componentViewMeta != null) {
                str3 = "dxName: " + componentViewMeta.getName();
                str2 = "dxVersion: " + componentViewMeta.getVersion();
            } else {
                str3 = "dxName: error";
                str2 = "dxVersion: error";
            }
            if (TextUtils.isEmpty(str)) {
                str = "no info";
            }
            this.e.setText(Y());
            this.f.setText(str3);
            this.g.setText(str2);
            this.h.setText(str);
        }
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        boolean r = yc4.r(this.mComponentData);
        if (r) {
            super.onDidAppear();
        }
        V();
        h0(true);
        if (r) {
            j0();
        }
    }

    @Override // tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        if (yc4.r(this.mComponentData)) {
            k0();
        }
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return T(view);
    }

    @Override // tb.oa4
    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.f6701a;
    }

    @Override // tb.oa4
    public void updateComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628120bb", new Object[]{this});
            return;
        }
        super.updateComponent();
        this.o = false;
        if (g0()) {
            h0(true);
        }
    }

    @Override // tb.oa4
    public void updateRenderType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1605896a", new Object[]{this, str});
            return;
        }
        super.updateRenderType(str);
        this.w = true;
        this.t = this.mDetailContext.d().d(this.mComponentData.j());
    }

    public final boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8a056d1", new Object[]{this})).booleanValue();
        }
        try {
            T t = this.mComponentData;
            if (!(t == 0 || t.d() == null || this.mComponentData.d().getJSONObject("fields") == null)) {
                return this.mComponentData.d().getJSONObject("fields").getBoolean("showErrorView").booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c22648f", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("fields")) == null) {
            return false;
        }
        return "price".equalsIgnoreCase(jSONObject2.getString("bizId"));
    }

    public final void h0(boolean z) {
        final JSONObject jSONObject;
        String str;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cb86ee", new Object[]{this, new Boolean(z)});
        } else if (this.n != null && this.t != null) {
            if (!this.o) {
                long currentTimeMillis = System.currentTimeMillis();
                int j = pb6.j();
                int i = pb6.i();
                int i2 = this.u;
                if (i2 != 0) {
                    j = DXWidgetNode.DXMeasureSpec.c(i2, 1073741824);
                } else {
                    int f = mr7.f(this.mContext);
                    boolean i3 = nj7.i(this.mContext);
                    if (TextUtils.equals("doubleColumn", this.v)) {
                        if (i3) {
                            f /= 2;
                        }
                        j = W(f, i3 ? 12.0f : 24.0f);
                    } else if (i3) {
                        j = W(f, 32.0f);
                    }
                }
                JSONObject d = this.mComponentData.d();
                if (d == null || !DataUtils.Q(this.mComponentData.c())) {
                    jSONObject = d;
                } else {
                    JSONObject jSONObject2 = new JSONObject(d.size());
                    jSONObject2.putAll(d);
                    jSONObject2.put("fields", new JSONObject(d.getJSONObject("fields")) { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent.2
                        public final /* synthetic */ JSONObject val$fields;

                        {
                            this.val$fields = r2;
                            if (r2 != null) {
                                putAll(r2);
                            }
                            put("_enableChain", "true");
                        }
                    });
                    jSONObject = jSONObject2;
                }
                this.mDetailContext.g().H(this.n, j, i, jSONObject, new eo7.t() { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.eo7.t
                    public void b(ViewGroup viewGroup) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("24eeaeea", new Object[]{this, viewGroup});
                            return;
                        }
                        DinamicXComponent.R(DinamicXComponent.this, true);
                        DinamicXComponent.w(DinamicXComponent.this, viewGroup);
                        DinamicXComponent.x(DinamicXComponent.this).a(false);
                        DinamicXComponent.this.mDetailContext.h().g(DinamicXComponent.x(DinamicXComponent.this));
                        DinamicXComponent dinamicXComponent = DinamicXComponent.this;
                        dinamicXComponent.mView.setTag(R.id.tt_detail_dx_view_bind_component_data_id, dinamicXComponent.mComponentData.g());
                    }

                    @Override // tb.eo7.t
                    public void a(String str2) {
                        int i4;
                        JSONObject jSONObject3;
                        boolean z2 = true;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ef4d4afc", new Object[]{this, str2});
                            return;
                        }
                        DinamicXComponent.R(DinamicXComponent.this, false);
                        DinamicXComponent dinamicXComponent = DinamicXComponent.this;
                        DinamicXComponent.z(dinamicXComponent, DinamicXComponent.y(dinamicXComponent), str2);
                        DinamicXComponent.x(DinamicXComponent.this).a(true);
                        DinamicXComponent.this.mDetailContext.h().g(DinamicXComponent.x(DinamicXComponent.this));
                        tgh.b(xo7.TAG_DINAMICX_VIEW_COMPONENT, "renderDinamicX() failure: " + str2);
                        ze7 ze7Var = DinamicXComponent.this.mDetailContext;
                        if (ze7Var == null || ze7Var.i() == null) {
                            z2 = false;
                        }
                        String str3 = "";
                        String str4 = z2 ? (String) DinamicXComponent.this.mDetailContext.i().c("traceId") : str3;
                        String str5 = z2 ? (String) DinamicXComponent.this.mDetailContext.i().c("requestItemId") : str3;
                        if (z2) {
                            str3 = (String) DinamicXComponent.this.mDetailContext.i().c("sellerId");
                        }
                        T t = DinamicXComponent.this.mComponentData;
                        if (!(t == 0 || t.h() == null)) {
                            String h = DinamicXComponent.this.mComponentData.h();
                            if (h.contains("bottomBar")) {
                                i4 = -100001;
                                try {
                                    JSONObject jSONObject4 = DinamicXComponent.this.mComponentData.d().getJSONObject("fields");
                                    if (!(jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("middleButton")) == null)) {
                                        if (!jSONObject3.isEmpty()) {
                                            i4 = -100042;
                                        }
                                    }
                                } catch (Exception unused) {
                                    tgh.b(xo7.TAG_DINAMICX_VIEW_COMPONENT, "parse middleButton error");
                                }
                            } else if (DinamicXComponent.a(DinamicXComponent.this, jSONObject) || h.contains("detail3Price") || h.contains("detail3Atmosphere")) {
                                i4 = -100002;
                            } else if (h.contains("detailOpt3Gift")) {
                                i4 = -100041;
                            } else {
                                i4 = h.contains("detail3Gift") ? -100040 : -1;
                            }
                            if (i4 != -1) {
                                bw7.b(new HashMap<String, String>(str5, str4, str3) { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent.3.1
                                    public final /* synthetic */ String val$itemId;
                                    public final /* synthetic */ String val$sellerId;
                                    public final /* synthetic */ String val$traceId;

                                    {
                                        this.val$itemId = str5;
                                        this.val$traceId = str4;
                                        this.val$sellerId = str3;
                                        put("itemId", str5);
                                        put("traceId", str4);
                                        put("sellerId", str3);
                                        put("DxName", DinamicXComponent.y(DinamicXComponent.this).getName());
                                        put("DxVersion", DinamicXComponent.y(DinamicXComponent.this).getVersion());
                                        put("isAsyncDx", String.valueOf(yc4.p(DinamicXComponent.this.mComponentData)));
                                        put("isPreloadData", String.valueOf(DinamicXComponent.this.mDetailContext.e().o()));
                                    }
                                }, i4, str2);
                                return;
                            }
                        }
                        bw7.b(new HashMap<String, String>(str5, str4, str3) { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent.3.2
                            public final /* synthetic */ String val$itemId;
                            public final /* synthetic */ String val$sellerId;
                            public final /* synthetic */ String val$traceId;

                            {
                                this.val$itemId = str5;
                                this.val$traceId = str4;
                                this.val$sellerId = str3;
                                put("itemId", str5);
                                put("traceId", str4);
                                put("sellerId", str3);
                                put("DxName", DinamicXComponent.y(DinamicXComponent.this).getName());
                                put("DxVersion", DinamicXComponent.y(DinamicXComponent.this).getVersion());
                                put("isAsyncDx", String.valueOf(yc4.p(DinamicXComponent.this.mComponentData)));
                            }
                        }, -100007, str2);
                    }
                });
                this.l++;
                if (!z) {
                    this.mDetailContext.h().g(new b());
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                this.j = currentTimeMillis2 - currentTimeMillis;
                if (this.mDetailContext.e().o()) {
                    str = "preDxRender";
                } else {
                    str = "dxRender";
                }
                PerformanceUtils.d(this.mDetailContext, str, this.j);
                PerformanceUtils.b(this.mDetailContext, "lastDxRender", currentTimeMillis2);
                if (this.m && (textView = this.d) != null) {
                    StringBuilder sb = new StringBuilder("render: ");
                    sb.append(this.j);
                    sb.append("(ms);N: ");
                    sb.append(this.l);
                    textView.setText(sb);
                }
            }
            if (yc4.p(this.mComponentData) && !this.q) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                new AsyncProcessor(this.mDetailContext).u(this.mComponentData, new AsyncProcessor.d() { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.ttdetail.async.AsyncProcessor.d
                    public void a(JSONObject jSONObject3, JSONObject jSONObject4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fe679aeb", new Object[]{this, jSONObject3, jSONObject4});
                        } else if (yc4.q(DinamicXComponent.this.mComponentData)) {
                            DinamicXComponent.R(DinamicXComponent.this, false);
                            if (DinamicXComponent.M(DinamicXComponent.this)) {
                                DinamicXComponent.this.fireExposeEvent(new RuntimeAbilityParam[0]);
                                DinamicXComponent.b(DinamicXComponent.this, false);
                                DinamicXComponent.c(DinamicXComponent.this);
                                T t = DinamicXComponent.this.mComponentData;
                                if (t != 0 && !TextUtils.isEmpty(t.k())) {
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    DinamicXComponent dinamicXComponent = DinamicXComponent.this;
                                    PerformanceUtils.l(dinamicXComponent.mContext, dinamicXComponent.mComponentData.k(), elapsedRealtime2);
                                    tgh.b(xo7.TAG_DINAMICX_VIEW_COMPONENT, "AsyncProcessor().process() success: " + DinamicXComponent.this.mComponentData.k() + " cost: " + elapsedRealtime2);
                                }
                            }
                        } else {
                            onFail("not set component fields asyncStatus=success");
                        }
                    }

                    @Override // com.taobao.android.detail.ttdetail.async.AsyncProcessor.d
                    public void onFail(String str2) {
                        boolean z2 = true;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("239cc86e", new Object[]{this, str2});
                            return;
                        }
                        DinamicXComponent.L(DinamicXComponent.this, true);
                        ze7 ze7Var = DinamicXComponent.this.mDetailContext;
                        if (ze7Var == null || ze7Var.i() == null) {
                            z2 = false;
                        }
                        String str3 = "";
                        String str4 = z2 ? (String) DinamicXComponent.this.mDetailContext.i().c("traceId") : str3;
                        String str5 = z2 ? (String) DinamicXComponent.this.mDetailContext.i().c("requestItemId") : str3;
                        if (z2) {
                            str3 = (String) DinamicXComponent.this.mDetailContext.i().c("sellerId");
                        }
                        bw7.b(new HashMap<String, String>(str5, str4, str3) { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent.5.1
                            public final /* synthetic */ String val$itemId;
                            public final /* synthetic */ String val$sellerId;
                            public final /* synthetic */ String val$traceId;

                            {
                                this.val$itemId = str5;
                                this.val$traceId = str4;
                                this.val$sellerId = str3;
                                put("itemId", str5);
                                put("traceId", str4);
                                put("sellerId", str3);
                                put("DxName", DinamicXComponent.y(DinamicXComponent.this).getName());
                                put("DxVersion", DinamicXComponent.y(DinamicXComponent.this).getVersion());
                                put("isAsyncDx", Boolean.TRUE.toString());
                            }
                        }, -100008, str2);
                        tgh.b(xo7.TAG_DINAMICX_VIEW_COMPONENT, "AsyncProcessor().process() failure: " + str2);
                        if (!DinamicXComponent.M(DinamicXComponent.this)) {
                            return;
                        }
                        if (DinamicXComponent.d(DinamicXComponent.this)) {
                            DinamicXComponent.L(DinamicXComponent.this, false);
                            DinamicXComponent.R(DinamicXComponent.this, false);
                            DinamicXComponent.b(DinamicXComponent.this, false);
                            DinamicXComponent.e(DinamicXComponent.this, false);
                            return;
                        }
                        DinamicXComponent.N(DinamicXComponent.this);
                    }
                }, appendTriggerComponent(true, new RuntimeAbilityParam[0]));
                this.q = true;
            }
        }
    }
}
