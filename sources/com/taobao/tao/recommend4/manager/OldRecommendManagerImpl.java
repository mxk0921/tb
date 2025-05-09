package com.taobao.tao.recommend4.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.tao.recommend4.manager.c;
import com.taobao.tao.recommend4.manager.utils.FinalConfig;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.RecommendRecyclerAdapter;
import com.taobao.tao.recommend4.recyclerview.RecommendViewExposureListener;
import com.taobao.tao.recommend4.recyclerview.a;
import com.taobao.tao.util.DensityUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.ael;
import tb.b5a;
import tb.b9b;
import tb.bqa;
import tb.cew;
import tb.cw6;
import tb.d11;
import tb.dji;
import tb.duk;
import tb.e5o;
import tb.emn;
import tb.f4b;
import tb.fgm;
import tb.fo2;
import tb.fqm;
import tb.fve;
import tb.gh0;
import tb.gj7;
import tb.gmn;
import tb.h6b;
import tb.hmn;
import tb.imi;
import tb.imn;
import tb.jmn;
import tb.jon;
import tb.khd;
import tb.kmn;
import tb.knn;
import tb.ks8;
import tb.lh0;
import tb.lmn;
import tb.lrj;
import tb.m0b;
import tb.m5a;
import tb.mhd;
import tb.mmn;
import tb.pb6;
import tb.q4a;
import tb.qwo;
import tb.raj;
import tb.rjj;
import tb.ron;
import tb.s5a;
import tb.smn;
import tb.t2o;
import tb.tmn;
import tb.umn;
import tb.unn;
import tb.uve;
import tb.uyt;
import tb.vls;
import tb.vnn;
import tb.vxl;
import tb.wmn;
import tb.wnn;
import tb.won;
import tb.x4a;
import tb.xmn;
import tb.xsl;
import tb.y4a;
import tb.yhx;
import tb.ymn;
import tb.z4a;
import tb.zmn;
import tb.zpk;
import tb.zza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class OldRecommendManagerImpl extends com.taobao.tao.recommend4.manager.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_INFO = "apiInfo";
    public static final int DEFAULT_COLUMN_COUNT = 2;
    public static final String NATIVE_CUSTOM_PARAMS = "nativeCustomParams";
    public static y4a R = null;
    public static final String RMD_CONTAINER = "rmd_container";
    public static final x4a S = new x4a(D0());
    public static final x4a T = new x4a(D0() + ".error");
    public static final x4a U = new x4a(D0() + ".loading");
    public static final x4a V = new x4a(D0() + ".*.overlay");
    public int A;
    public DinamicXEngine B;
    public OnScreenChangedListener C;
    public boolean D;
    public boolean E;
    public JSONObject F;
    public boolean G;
    public int H;
    public final boolean I;
    public boolean J;
    public HomeChildRecyclerView.a K;
    public dji L;
    public WeakReference<Context> b;
    public z4a c;
    public JSONObject d;
    public khd e;
    public com.taobao.tao.recommend4.recyclerview.a f;
    public yhx g;
    public e5o h;
    public q4a l;
    public imn m;
    public wmn n;
    public imi o;
    public JSONObject p;
    public d11 q;
    public boolean r;
    public final wnn s;
    public final fo2 t;
    public final lh0 v;
    public View.OnAttachStateChangeListener w;
    public final fgm x;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean W = false;
    public com.taobao.tao.recommend4.manager.c u = null;
    public int y = 0;
    public int z = 0;
    public String M = null;
    public int N = 0;
    public final RecyclerView.OnScrollListener O = new RecyclerView.OnScrollListener() { // from class: com.taobao.tao.recommend4.manager.OldRecommendManagerImpl.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
            if (str.hashCode() == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/manager/OldRecommendManagerImpl$6");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                return;
            }
            super.onScrolled(recyclerView, i2, i3);
            OldRecommendManagerImpl oldRecommendManagerImpl = OldRecommendManagerImpl.this;
            OldRecommendManagerImpl.c0(oldRecommendManagerImpl, OldRecommendManagerImpl.b0(oldRecommendManagerImpl) + i3);
            if (OldRecommendManagerImpl.b0(OldRecommendManagerImpl.this) > OldRecommendManagerImpl.d0(OldRecommendManagerImpl.this).a(s5a.a(OldRecommendManagerImpl.i0(OldRecommendManagerImpl.this)), 0)) {
                OldRecommendManagerImpl.S(OldRecommendManagerImpl.this);
                if (cw6.b()) {
                    bqa.a("jimbo", "request net data because scroll instance is " + OldRecommendManagerImpl.b0(OldRecommendManagerImpl.this));
                }
                OldRecommendManagerImpl.f0(OldRecommendManagerImpl.this);
            }
        }
    };
    public final View.OnAttachStateChangeListener P = new i();
    public final hmn.d Q = new j();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements won {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.won
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3778b943", new Object[]{this, new Integer(i)});
            } else {
                OldRecommendManagerImpl.m0(OldRecommendManagerImpl.this, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements zpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zpk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("710f571c", new Object[]{this});
            } else if (OldRecommendManagerImpl.l0(OldRecommendManagerImpl.this) != null) {
                OldRecommendManagerImpl.l0(OldRecommendManagerImpl.this).f();
            }
        }

        @Override // tb.zpk
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a17feca1", new Object[]{this});
            } else if (OldRecommendManagerImpl.l0(OldRecommendManagerImpl.this) != null) {
                OldRecommendManagerImpl.l0(OldRecommendManagerImpl.this).g();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$autosize$WindowType;

        static {
            int[] iArr = new int[WindowType.values().length];
            $SwitchMap$com$taobao$android$autosize$WindowType = iArr;
            try {
                iArr[WindowType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements duk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.duk
        public void a(dji.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33366006", new Object[]{this, cVar});
            } else if (OldRecommendManagerImpl.P(OldRecommendManagerImpl.this) && OldRecommendManagerImpl.T(OldRecommendManagerImpl.this) && OldRecommendManagerImpl.U(OldRecommendManagerImpl.this) != null) {
                if (OldRecommendManagerImpl.V(OldRecommendManagerImpl.this) != OldRecommendManagerImpl.U(OldRecommendManagerImpl.this).h()) {
                    OldRecommendManagerImpl oldRecommendManagerImpl = OldRecommendManagerImpl.this;
                    OldRecommendManagerImpl.W(oldRecommendManagerImpl, OldRecommendManagerImpl.P(oldRecommendManagerImpl));
                }
                bqa.d("RecommendManagerImpl", "ScaleGestureDetector onChange: " + cVar);
            }
        }

        @Override // tb.duk
        public void onScale(ScaleGestureDetector scaleGestureDetector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2015500", new Object[]{this, scaleGestureDetector});
            } else {
                bqa.d("RecommendManagerImpl", "ScaleGestureDetector onScale");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements qwo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f12668a;

        public f(OldRecommendManagerImpl oldRecommendManagerImpl, Context context) {
            this.f12668a = context;
        }

        @Override // tb.qwo
        public WindowType a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WindowType) ipChange.ipc$dispatch("e9085da8", new Object[]{this});
            }
            if (!(this.f12668a instanceof Activity)) {
                return WindowType.MEDIUM;
            }
            return TBAutoSizeConfig.x().M((Activity) this.f12668a);
        }

        @Override // tb.qwo
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f0ca8d0", new Object[]{this})).booleanValue();
            }
            if (!b9b.e()) {
                return false;
            }
            return !b9b.g(this.f12668a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements HomeChildRecyclerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView.a
        public void onTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9b14c36", new Object[]{this, motionEvent});
            } else if (OldRecommendManagerImpl.P(OldRecommendManagerImpl.this)) {
                OldRecommendManagerImpl.X(OldRecommendManagerImpl.this).l(motionEvent);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f12671a;

            public a(int i) {
                this.f12671a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b9b.h() || b9b.e()) {
                    if (this.f12671a == 1 || b9b.g(OldRecommendManagerImpl.this.getContext())) {
                        z = true;
                    }
                    boolean isAdaptHudScreen = OldRecommendManagerImpl.this.isAdaptHudScreen();
                    if (z != OldRecommendManagerImpl.Y(OldRecommendManagerImpl.this)) {
                        OldRecommendManagerImpl.Z(OldRecommendManagerImpl.this, z);
                        OldRecommendManagerImpl.W(OldRecommendManagerImpl.this, isAdaptHudScreen);
                        if (b9b.e()) {
                            OldRecommendManagerImpl.a0(OldRecommendManagerImpl.this);
                        }
                    } else {
                        OldRecommendManagerImpl.W(OldRecommendManagerImpl.this, isAdaptHudScreen);
                    }
                    bqa.d("RecommendManagerImpl", "onScreenChange, isPortrait: " + z);
                }
            }
        }

        public h() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else {
                m5a.a().g(new a(i), 0L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            if (!OldRecommendManagerImpl.g0(OldRecommendManagerImpl.this)) {
                OldRecommendManagerImpl.S(OldRecommendManagerImpl.this);
            }
            OldRecommendManagerImpl.f0(OldRecommendManagerImpl.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements hmn.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.hmn.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bf6e97d", new Object[]{this, str});
            } else if (TextUtils.equals(str, OldRecommendManagerImpl.i0(OldRecommendManagerImpl.this).f32522a)) {
                gh0.j().n();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else if (OldRecommendManagerImpl.l0(OldRecommendManagerImpl.this) != null && OldRecommendManagerImpl.i0(OldRecommendManagerImpl.this) != null) {
                OldRecommendManagerImpl.l0(OldRecommendManagerImpl.this).h(OldRecommendManagerImpl.i0(OldRecommendManagerImpl.this));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else if (OldRecommendManagerImpl.l0(OldRecommendManagerImpl.this) != null) {
                OldRecommendManagerImpl.l0(OldRecommendManagerImpl.this).i();
            }
        }
    }

    static {
        t2o.a(729809953);
    }

    public OldRecommendManagerImpl(z4a z4aVar) {
        vnn.a(z4aVar.b(), this);
        wnn wnnVar = new wnn();
        this.s = wnnVar;
        this.t = new fo2(z4aVar, wnnVar);
        new raj(z4aVar, wnnVar);
        this.v = new lh0(wnnVar);
        wnnVar.m(new fqm());
        this.x = new fgm(wnnVar);
        boolean x0 = x0();
        this.I = x0;
        if (!x0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.B = knn.g().d(z4aVar.b());
            fve.k("RecommendManagerImpl", "构建DX耗时： " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        H0(z4aVar);
        bqa.d("RecommendManagerImpl", "create RecommendManagerImpl: " + hashCode());
    }

    public static String D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edcc83ca", new Object[0]);
        }
        return "recommend_home_main";
    }

    public static /* synthetic */ boolean P(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39ff1c8f", new Object[]{oldRecommendManagerImpl})).booleanValue();
        }
        return oldRecommendManagerImpl.E;
    }

    public static /* synthetic */ boolean Q(OldRecommendManagerImpl oldRecommendManagerImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a16417af", new Object[]{oldRecommendManagerImpl, new Boolean(z)})).booleanValue();
        }
        oldRecommendManagerImpl.E = z;
        return z;
    }

    public static /* synthetic */ void R(OldRecommendManagerImpl oldRecommendManagerImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a6a36a", new Object[]{oldRecommendManagerImpl, new Boolean(z)});
        } else {
            oldRecommendManagerImpl.T0(z);
        }
    }

    public static /* synthetic */ void S(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926465fc", new Object[]{oldRecommendManagerImpl});
        } else {
            oldRecommendManagerImpl.R0();
        }
    }

    public static /* synthetic */ boolean T(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc93ee1f", new Object[]{oldRecommendManagerImpl})).booleanValue();
        }
        return oldRecommendManagerImpl.J;
    }

    public static /* synthetic */ com.taobao.tao.recommend4.recyclerview.a U(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.recommend4.recyclerview.a) ipChange.ipc$dispatch("52539b80", new Object[]{oldRecommendManagerImpl});
        }
        return oldRecommendManagerImpl.f;
    }

    public static /* synthetic */ int V(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0f2fe4c", new Object[]{oldRecommendManagerImpl})).intValue();
        }
        return oldRecommendManagerImpl.E0();
    }

    public static /* synthetic */ void W(OldRecommendManagerImpl oldRecommendManagerImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292efb5c", new Object[]{oldRecommendManagerImpl, new Boolean(z)});
        } else {
            oldRecommendManagerImpl.z0(z);
        }
    }

    public static /* synthetic */ dji X(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dji) ipChange.ipc$dispatch("23719d57", new Object[]{oldRecommendManagerImpl});
        }
        return oldRecommendManagerImpl.L;
    }

    public static /* synthetic */ boolean Y(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8196ba", new Object[]{oldRecommendManagerImpl})).booleanValue();
        }
        return oldRecommendManagerImpl.D;
    }

    public static /* synthetic */ boolean Z(OldRecommendManagerImpl oldRecommendManagerImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c30e2e4", new Object[]{oldRecommendManagerImpl, new Boolean(z)})).booleanValue();
        }
        oldRecommendManagerImpl.D = z;
        return z;
    }

    public static /* synthetic */ boolean Z0(OldRecommendManagerImpl oldRecommendManagerImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f6ff5b7", new Object[]{oldRecommendManagerImpl, new Boolean(z)})).booleanValue();
        }
        oldRecommendManagerImpl.j = z;
        return z;
    }

    public static /* synthetic */ void a0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b11ed5", new Object[]{oldRecommendManagerImpl});
        } else {
            oldRecommendManagerImpl.S0();
        }
    }

    public static /* synthetic */ void a1(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5aae5a2", new Object[]{oldRecommendManagerImpl});
        } else {
            oldRecommendManagerImpl.O0();
        }
    }

    public static /* synthetic */ int b0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3e0a6e7", new Object[]{oldRecommendManagerImpl})).intValue();
        }
        return oldRecommendManagerImpl.N;
    }

    public static /* synthetic */ int c0(OldRecommendManagerImpl oldRecommendManagerImpl, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33b39a84", new Object[]{oldRecommendManagerImpl, new Integer(i2)})).intValue();
        }
        oldRecommendManagerImpl.N = i2;
        return i2;
    }

    public static /* synthetic */ e5o d0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e5o) ipChange.ipc$dispatch("fb77383a", new Object[]{oldRecommendManagerImpl});
        }
        return oldRecommendManagerImpl.h;
    }

    public static /* synthetic */ void e0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e2cc9", new Object[]{oldRecommendManagerImpl});
        } else {
            oldRecommendManagerImpl.F0();
        }
    }

    public static /* synthetic */ void f0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e25e1bd", new Object[]{oldRecommendManagerImpl});
        } else {
            oldRecommendManagerImpl.X0();
        }
    }

    public static /* synthetic */ boolean g0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d85569e0", new Object[]{oldRecommendManagerImpl})).booleanValue();
        }
        return oldRecommendManagerImpl.k;
    }

    public static /* synthetic */ khd h0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khd) ipChange.ipc$dispatch("754f8f2e", new Object[]{oldRecommendManagerImpl});
        }
        return oldRecommendManagerImpl.e;
    }

    public static /* synthetic */ z4a i0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("8b43fd81", new Object[]{oldRecommendManagerImpl});
        }
        return oldRecommendManagerImpl.c;
    }

    public static /* synthetic */ Object ipc$super(OldRecommendManagerImpl oldRecommendManagerImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/manager/OldRecommendManagerImpl");
    }

    public static /* synthetic */ boolean j0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cecc52a", new Object[]{oldRecommendManagerImpl})).booleanValue();
        }
        return oldRecommendManagerImpl.W;
    }

    public static /* synthetic */ boolean k0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b71c4d49", new Object[]{oldRecommendManagerImpl})).booleanValue();
        }
        return oldRecommendManagerImpl.b1();
    }

    public static /* synthetic */ fgm l0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fgm) ipChange.ipc$dispatch("d5146729", new Object[]{oldRecommendManagerImpl});
        }
        return oldRecommendManagerImpl.x;
    }

    public static /* synthetic */ void m0(OldRecommendManagerImpl oldRecommendManagerImpl, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9db3c29", new Object[]{oldRecommendManagerImpl, new Integer(i2)});
        } else {
            oldRecommendManagerImpl.r0(i2);
        }
    }

    public static /* synthetic */ boolean n0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214bd568", new Object[]{oldRecommendManagerImpl})).booleanValue();
        }
        return oldRecommendManagerImpl.i;
    }

    public static /* synthetic */ boolean o0(OldRecommendManagerImpl oldRecommendManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b7b5d87", new Object[]{oldRecommendManagerImpl})).booleanValue();
        }
        return oldRecommendManagerImpl.j;
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7e486c", new Object[]{this});
            return;
        }
        AwesomeGetContainerData u = this.m.u(getContainerId());
        if (u != null) {
            u.base = null;
            u.delta = null;
            u.totalSectionList.clear();
        }
    }

    public final JSONObject A0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("851967ea", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = this.d;
        if (jSONObject3 != null) {
            jSONObject2.putAll(jSONObject3);
            jSONObject.put("bizParam", (Object) jSONObject2);
        }
        if (Localization.o()) {
            this.q = uyt.a();
            StringBuilder sb = new StringBuilder("海外多语言问海外要对应的api,api是: ");
            d11 d11Var = this.q;
            if (d11Var != null) {
                str = d11Var.a();
            } else {
                str = "";
            }
            sb.append(str);
            bqa.d("RecommendManagerImpl", sb.toString());
        }
        d11 d11Var2 = this.q;
        if (d11Var2 != null && !d11Var2.c()) {
            jSONObject.put("apiInfo", (Object) this.q);
        }
        return jSONObject;
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73a1e84", new Object[]{this});
            return;
        }
        Q0();
        this.j = true;
        kmn.v("ViewCreate", S, this.p, -1, A0());
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void C(d11 d11Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984c3ee", new Object[]{this, d11Var, jSONObject});
            return;
        }
        if (d11Var == null || d11Var.c()) {
            this.q = null;
        } else {
            this.q = d11Var;
        }
        a(jSONObject);
    }

    public final JSONObject C0() {
        imn imnVar;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("98f9155", new Object[]{this});
        }
        try {
            z4a z4aVar = this.c;
            if (!(z4aVar == null || (imnVar = this.m) == null)) {
                AwesomeGetContainerInnerData q = imnVar.q(z4aVar.f32522a);
                if (q == null || q.getExt() == null || (string = q.getExt().getString("columnCountConfig")) == null) {
                    return JSON.parseObject("{\"min\":\"2\",\"small\":\"2\",\"medium\":\"4\",\"large\":\"5\",\"max\":\"5\"}");
                }
                return JSON.parseObject(string);
            }
            return JSON.parseObject("{\"min\":\"2\",\"small\":\"2\",\"medium\":\"4\",\"large\":\"5\",\"max\":\"5\"}");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340f8e2", new Object[]{this, jSONObject});
            return;
        }
        JSONObject A0 = A0();
        if (A0 != null) {
            JSONObject jSONObject2 = A0.getJSONObject("bizParam");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.putAll(jSONObject);
            kmn.v("PullToRefresh", S, this.p, -1, A0);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void E() {
        HomeChildRecyclerView homeChildRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419fa3d3", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null && (homeChildRecyclerView = aVar.f12717a) != null) {
            RecommendViewExposureListener exposureListener = homeChildRecyclerView.getExposureListener();
            if (exposureListener != null) {
                exposureListener.C();
            }
            this.y = 0;
            this.z = 0;
        }
    }

    public final int E0() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0c9df84", new Object[]{this})).intValue();
        }
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 2;
        }
        dji.c p = dji.c.p(context);
        if (b9b.e() && !b9b.g(context)) {
            return p.o();
        }
        int i3 = c.$SwitchMap$com$taobao$android$autosize$WindowType[TBAutoSizeConfig.x().M((Activity) context).ordinal()];
        if (i3 == 1) {
            i2 = p.t();
        } else if (i3 == 2) {
            i2 = p.v();
        } else if (i3 == 3) {
            i2 = p.s();
        } else if (i3 == 4) {
            i2 = p.q();
        } else if (i3 != 5) {
            i2 = 2;
        } else {
            i2 = p.r();
        }
        if (i2 <= 0) {
            return 2;
        }
        bqa.d("RecommendManagerImpl", "getScaleColumn: " + i2);
        return i2;
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a291138d", new Object[]{this, str});
        } else {
            this.M = str;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void G(a.AbstractC0720a aVar) {
        lh0 lh0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb83085e", new Object[]{this, aVar});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar2 = this.f;
        if (aVar2 != null && (lh0Var = this.v) != null) {
            aVar2.o(aVar, lh0Var);
        }
    }

    public final void H0(z4a z4aVar) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17488b93", new Object[]{this, z4aVar});
            return;
        }
        this.c = z4aVar;
        I0(z4aVar, this.s);
        JSONObject jSONObject = new JSONObject();
        this.p = jSONObject;
        jSONObject.put("containerId", (Object) this.c.f32522a);
        yhx yhxVar = new yhx(this);
        this.g = yhxVar;
        zza.k(this.c.f32522a, yhxVar);
        e5o e5oVar = new e5o();
        this.h = e5oVar;
        this.i = e5oVar.b(s5a.a(this.c), false);
        gh0.j().k(this, this.m);
        gh0.j().p(z4aVar.f32522a);
        this.E = isAdaptHudScreen();
        this.D = gj7.c(Globals.getApplication());
        if (b9b.e() || b9b.h()) {
            z = true;
        } else {
            z = false;
        }
        this.G = z;
        if (!z || !y0()) {
            z2 = false;
        }
        this.J = z2;
        unn.b();
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void I(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c782b44", new Object[]{this, new Integer(i2)});
            return;
        }
        this.H = i2;
        if (i2 > 0 && this.G) {
            f().d().J(this.H);
            com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
            if (aVar != null) {
                aVar.r(i2);
            }
            bqa.d("RecommendManagerImpl", "setContainerWidth: " + i2);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void J(a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129092a0", new Object[]{this, eVar});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null) {
            aVar.s(eVar);
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f03755", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null && aVar.f12717a != null) {
            View.OnAttachStateChangeListener t0 = t0();
            this.w = t0;
            this.f.f12717a.addOnAttachStateChangeListener(t0);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null) {
            aVar.t(z);
        }
    }

    public final int K0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{this, str})).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable th) {
            bqa.b("RecommendManagerImpl", "parseColor failed", th);
            return -1;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void M(z4a z4aVar) {
        RecommendRecyclerAdapter recommendRecyclerAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb065cc3", new Object[]{this, z4aVar});
            return;
        }
        gh0.j().p(z4aVar.f32522a);
        if (z4aVar != this.c) {
            H0(z4aVar);
            com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
            if (!(aVar == null || (recommendRecyclerAdapter = aVar.b) == null)) {
                recommendRecyclerAdapter.g0(z4aVar);
            }
            gh0.j().s();
        } else {
            gh0.j().r();
        }
        com.taobao.tao.recommend4.recyclerview.a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.l();
            this.f.v(z4aVar);
            HomeChildRecyclerView homeChildRecyclerView = this.f.f12717a;
            if (homeChildRecyclerView != null) {
                homeChildRecyclerView.updateContainerType(this.c);
            }
        }
        fo2 fo2Var = this.t;
        if (fo2Var != null) {
            fo2Var.v(z4aVar);
        }
    }

    public final void M0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825f3995", new Object[]{this, context});
        } else if (this.J) {
            dji djiVar = new dji(context);
            this.L = djiVar;
            djiVar.o(new e());
            this.L.r(new f(this, context));
            com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
            if (aVar != null) {
                if (this.K == null) {
                    this.K = new g();
                }
                aVar.b(this.K);
            }
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bf5038", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null) {
            aVar.w();
        }
    }

    public final void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
        } else if ((b9b.h() || b9b.e()) && this.C == null) {
            this.C = w0();
            TBAutoSizeConfig.x().d0(this.C);
            bqa.b("RecommendManagerImpl", "fold or pad device register screen change listener: " + hashCode(), new Throwable().fillInStackTrace());
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9c5abf", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null) {
            aVar.x();
        }
    }

    public final void P0() {
        HomeChildRecyclerView homeChildRecyclerView;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0820c9", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null && (homeChildRecyclerView = aVar.f12717a) != null && (onAttachStateChangeListener = this.w) != null) {
            homeChildRecyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    public final void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d1427e", new Object[]{this});
            return;
        }
        bqa.d("RecommendManagerImpl", "replaceRegister");
        z4a z4aVar = this.c;
        if (z4aVar != null) {
            imi imiVar = this.o;
            if (imiVar != null) {
                zza.h(z4aVar.f32522a, imiVar);
                zza.i(this.c.b, this.o);
            }
            imn imnVar = this.m;
            if (imnVar != null) {
                zza.j(this.c.f32522a, imnVar);
            }
            yhx yhxVar = this.g;
            if (yhxVar != null) {
                zza.k(this.c.f32522a, yhxVar);
            }
        }
    }

    public final void R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189685df", new Object[]{this});
            return;
        }
        Q0();
        this.j = false;
        this.k = true;
        kmn.v("ViewAppear", S, this.p, -1, A0());
    }

    public final void T0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc15eff", new Object[]{this, new Boolean(z)});
            return;
        }
        DinamicXEngine.H0(true);
        f().k1();
        unn.b();
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null) {
            aVar.m(z, g());
        }
    }

    public final int U0(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534ecdfb", new Object[]{this, jSONObject, str})).intValue();
        }
        try {
            return jSONObject.getIntValue(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22111fe6", new Object[]{this})).booleanValue();
        }
        AwesomeGetContainerData u = this.m.u(this.c.f32522a);
        if (u == null || !u.supportInsertSections()) {
            return false;
        }
        return true;
    }

    public final void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1a80e8", new Object[]{this});
        } else if ((b9b.h() || b9b.e()) && this.C != null) {
            TBAutoSizeConfig.x().h0(this.C);
            this.C = null;
            bqa.d("RecommendManagerImpl", "fold or pad device unregister screen change listener: " + hashCode());
        }
    }

    public final void X0() {
        HomeChildRecyclerView homeChildRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null && (homeChildRecyclerView = aVar.f12717a) != null) {
            lrj nestedScrollParent = homeChildRecyclerView.getNestedScrollParent();
            if (nestedScrollParent != null && (nestedScrollParent instanceof RecyclerView)) {
                ((RecyclerView) nestedScrollParent).removeOnScrollListener(this.O);
            }
            this.f.f12717a.removeOnAttachStateChangeListener(this.P);
        }
    }

    public final void Y0() {
        HomeChildRecyclerView.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5b475a", new Object[]{this});
            return;
        }
        dji djiVar = this.L;
        if (djiVar != null) {
            djiVar.j();
        }
        com.taobao.tao.recommend4.recyclerview.a aVar2 = this.f;
        if (aVar2 != null && (aVar = this.K) != null) {
            aVar2.k(aVar);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, tb.nhd
    public void b(khd khdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c035d38", new Object[]{this, khdVar});
        } else {
            this.e = khdVar;
        }
    }

    public final boolean b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a68828cc", new Object[]{this})).booleanValue();
        }
        z4a z4aVar = this.c;
        if (z4aVar == null) {
            return false;
        }
        return TextUtils.equals(z4a.REC_ORDER_LIST.f32522a, z4aVar.f32522a);
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public RecyclerView e(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ef4e8da7", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        this.b = new WeakReference<>(context);
        com.taobao.tao.recommend4.recyclerview.a c2 = com.taobao.tao.recommend4.recyclerview.a.c(this);
        this.f = c2;
        c2.g(this.s);
        this.f.p(this.A);
        if (this.G) {
            this.f.r(this.H);
        }
        RecommendViewExposureListener exposureListener = this.f.f12717a.getExposureListener();
        if (exposureListener != null) {
            exposureListener.E(v0());
        }
        com.taobao.tao.recommend4.manager.c cVar = new com.taobao.tao.recommend4.manager.c(this.c, this.f.f12717a, this.s);
        this.u = cVar;
        cVar.i(new d());
        zza.a(this.c.f32522a).d(this.u.d(), this.u);
        this.f.q(u0());
        this.s.u();
        J0();
        if (!vxl.b().z() || !(context instanceof cew)) {
            f().l1((Activity) context);
        } else {
            f().l1((Activity) ((cew) context).a());
        }
        N0();
        if (this.G) {
            M0(context);
        }
        if (b1()) {
            this.W = true;
            if (this.f.f12717a != null) {
                z = false;
            }
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "after_buy_old_framework", "createContainer", String.valueOf(z), null);
        }
        return this.f.f12717a;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        DinamicXEngine dinamicXEngine = this.B;
        if (dinamicXEngine == null || (!dinamicXEngine.q() && this.I)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.B = knn.g().d(getContainerId());
            fve.k("RecommendManagerImpl", "构建DX耗时： " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        return this.B;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f9d31c7", new Object[]{this})).intValue();
        }
        if (!this.E) {
            return 2;
        }
        if (b9b.e() && b9b.g(getContext())) {
            return 2;
        }
        if (this.J) {
            return E0();
        }
        return B0();
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.c.f32522a;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public z4a getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("acca2aa6", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        WeakReference<Context> weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        AwesomeGetContainerData u = this.m.u(this.c.f32522a);
        if (u == null) {
            return null;
        }
        return u.getExt();
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public AwesomeGetPageData getPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("8667d832", new Object[]{this});
        }
        AwesomeGetContainerData u = this.m.u(this.c.f32522a);
        if (u == null) {
            return null;
        }
        return u.getPageParams();
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar == null) {
            return null;
        }
        return aVar.f12717a;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0b739e", new Object[]{this, jSONObject});
            return;
        }
        this.z = this.y;
        bqa.d("RecommendManagerImpl", "on item click");
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2889a22", new Object[]{this});
            return;
        }
        Q0();
        kmn.v("ViewAppear", U, this.p, -1, A0());
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public boolean isAdaptHudScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        z4a z4aVar = this.c;
        if (z4aVar == null || TextUtils.isEmpty(z4aVar.f32522a)) {
            return false;
        }
        return b9b.c(this.c.f32522a);
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public boolean isLastPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3afa9a", new Object[]{this})).booleanValue();
        }
        return this.m.u(this.c.f32522a).isLastPage();
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e389cb4e", new Object[]{this, jSONObject});
            return;
        }
        JSONObject A0 = A0();
        if (A0 != null && jSONObject != null) {
            A0.getJSONObject("bizParam").putAll(jSONObject);
            A0.put("isCurrentPage", (Object) Boolean.TRUE);
            kmn.v("NewInteractive", S, this.p, -1, A0);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73b2f286", new Object[]{this})).intValue();
        }
        return this.H;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public d11 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d11) ipChange.ipc$dispatch("4332921f", new Object[]{this});
        }
        return this.q;
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6fd718", new Object[]{this});
            return;
        }
        Q0();
        kmn.v("ViewClick", T, this.p, -1, A0());
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public List<SectionModel> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a50ccf7e", new Object[]{this});
        }
        return this.m.H(this.c.f32522a);
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public mhd p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhd) ipChange.ipc$dispatch("38ecf3b8", new Object[]{this});
        }
        return this.s;
    }

    public final JSONObject p0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed044f3f", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (ron.a(this)) {
            jSONObject.put("isNeedSubSelectionData", (Object) Boolean.TRUE);
        }
        return jSONObject;
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed34e23e", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerId", (Object) this.c.f32522a);
        jSONObject2.put("deleteModel", (Object) jSONObject);
        b5a b5aVar = new b5a("DeleteOperation", V, jSONObject2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b5aVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message != null) {
            this.o.c(message);
        }
    }

    public final int q0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abda2704", new Object[]{this, new Integer(i2)})).intValue();
        }
        if (this.B == null || getContext() == null) {
            return 16;
        }
        return pb6.d(this.B, getContext(), i2);
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public String s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f316ffc", new Object[]{this, str, str2});
        }
        String containerId = getContainerId();
        if (containerId == null) {
            bqa.d("RecommendManagerImpl", "containerId == null");
            return str2;
        }
        JSONObject a2 = xsl.a(containerId);
        if (a2 == null) {
            bqa.d("RecommendManagerImpl", "passParams == null");
            return str2;
        }
        JSONObject jSONObject = a2.getJSONObject(vls.OPTIMIZATION_CONFIG);
        if (jSONObject == null) {
            bqa.d("RecommendManagerImpl", "optimizationConfig == null");
            return str2;
        }
        String string = jSONObject.getString(str);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        bqa.d("RecommendManagerImpl", "value == null");
        return str2;
    }

    public final void s0(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ca4193", new Object[]{this, num});
            return;
        }
        IBizDataModel<AwesomeGetContainerData> c2 = ael.c();
        Map<String, AwesomeGetContainerData> containers = c2.getContainers();
        if (containers != null) {
            if (num.intValue() > 0) {
                containers.put("recommend_orderlist_catapult_main", containers.remove("recommend_orderlist_main"));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataModel", (Object) c2);
            kmn.v("OrderListPrefetchDataConsume", S, this.p, -1, jSONObject);
        }
    }

    public final View.OnAttachStateChangeListener t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("3f6af2f0", new Object[]{this});
        }
        return new k();
    }

    public final zpk u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zpk) ipChange.ipc$dispatch("76d1736c", new Object[]{this});
        }
        return new b();
    }

    public final won v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (won) ipChange.ipc$dispatch("fd20434a", new Object[]{this});
        }
        return new a();
    }

    public final OnScreenChangedListener w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnScreenChangedListener) ipChange.ipc$dispatch("fec41ee8", new Object[]{this});
        }
        return new h();
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f3aa2a", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("forceRequest", (Object) "true");
        JSONObject p0 = p0(null);
        if (p0 != null) {
            p0.put("is_orderlist_prefetch", "true");
        }
        jSONObject.put("bizParam", (Object) p0);
        kmn.v(ael.GROUP, S, this.p, -1, jSONObject);
    }

    public final boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f43a927d", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableDelayCreateAfterBuyDxEngine", true);
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void y(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20cc848", new Object[]{this, map});
        } else if (this.m.J(this.c.f32522a)) {
            this.r = true;
            a(this.d);
        } else if (ron.d(this)) {
            Q0();
            kmn.v("PageBack", S, this.p, -1, A0());
            fgm fgmVar = this.x;
            if (fgmVar != null) {
                fgmVar.j();
            }
        }
    }

    public final boolean y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9831f6", new Object[]{this})).booleanValue();
        }
        return f4b.b("enableHudDeviceInfoFlowZoom", true);
    }

    public final void z0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a3589", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null) {
            int i2 = aVar.i();
            T0(z);
            this.f.f();
            if (i2 > 0) {
                this.f.n(i2);
                bqa.d("RecommendManagerImpl", "scroll to position: " + i2);
            }
            bqa.d("RecommendManagerImpl", "force refresh ui");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void c(boolean z) {
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("400a44b3", new Object[]{this, new Boolean(z)});
            } else if (z) {
                boolean isAdaptHudScreen = OldRecommendManagerImpl.this.isAdaptHudScreen();
                if (OldRecommendManagerImpl.P(OldRecommendManagerImpl.this) != isAdaptHudScreen) {
                    OldRecommendManagerImpl.Q(OldRecommendManagerImpl.this, isAdaptHudScreen);
                    DXEngineConfig d = OldRecommendManagerImpl.this.f().d();
                    if (!isAdaptHudScreen || !b9b.f()) {
                        z2 = false;
                    }
                    d.b(isAdaptHudScreen, z2);
                    OldRecommendManagerImpl.R(OldRecommendManagerImpl.this, isAdaptHudScreen);
                    bqa.d("RecommendManagerImpl", "hud screen status changed: " + isAdaptHudScreen);
                }
                OldRecommendManagerImpl.e0(OldRecommendManagerImpl.this);
                bqa.d("RecommendManagerImpl", "current is hud screen: " + isAdaptHudScreen);
            }
        }

        public void a() {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            if (OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this) != null) {
                try {
                    OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this).onError();
                } catch (Throwable unused) {
                }
            }
            if (OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this) != null) {
                z = false;
            }
            uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "after_buy_old_framework", "add_rv_fail", String.valueOf(z), null);
            if (OldRecommendManagerImpl.o0(OldRecommendManagerImpl.this)) {
                OldRecommendManagerImpl.S(OldRecommendManagerImpl.this);
                if (cw6.b()) {
                    bqa.a("jimbo", "request cache failed, so request net");
                }
            }
            OldRecommendManagerImpl.Z0(OldRecommendManagerImpl.this, false);
        }

        public void b(boolean z, boolean z2, boolean z3) {
            boolean z4 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a612f0c9", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
                return;
            }
            if (OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this) != null) {
                try {
                    if (OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this) instanceof ks8) {
                        ((ks8) OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this)).a(z2);
                    }
                    if (!Boolean.parseBoolean(h6b.a(OldRecommendManagerImpl.i0(OldRecommendManagerImpl.this).f32522a, "isNextPageToDeltaRefresh", "true"))) {
                        OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this).onSuccess();
                    } else if (z) {
                        OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this).onSuccess();
                    }
                } catch (Throwable unused) {
                }
            }
            if (OldRecommendManagerImpl.j0(OldRecommendManagerImpl.this) && OldRecommendManagerImpl.k0(OldRecommendManagerImpl.this)) {
                if (OldRecommendManagerImpl.h0(OldRecommendManagerImpl.this) != null) {
                    z4 = false;
                }
                uve.a("Page_Home", UtUtils.CHANGED_UPP_EVENT_ID, "after_buy_old_framework", "add_rv_success", String.valueOf(z4), null);
            }
            if (OldRecommendManagerImpl.n0(OldRecommendManagerImpl.this) && OldRecommendManagerImpl.o0(OldRecommendManagerImpl.this) && z2) {
                OldRecommendManagerImpl.a1(OldRecommendManagerImpl.this);
            }
            OldRecommendManagerImpl.Z0(OldRecommendManagerImpl.this, false);
        }
    }

    public final int B0() {
        WindowType windowType;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f82f76df", new Object[]{this})).intValue();
        }
        if (this.F == null) {
            this.F = C0();
        }
        if (this.F == null) {
            return 2;
        }
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 2;
        }
        if (this.H > 0) {
            windowType = TBAutoSizeConfig.x().L(DensityUtil.px2dip(context, this.H));
        } else {
            windowType = TBAutoSizeConfig.x().M((Activity) context);
        }
        try {
            i3 = c.$SwitchMap$com$taobao$android$autosize$WindowType[windowType.ordinal()];
        } catch (Exception unused) {
        }
        if (i3 == 1) {
            i2 = this.F.getIntValue("min");
        } else if (i3 == 2) {
            i2 = this.F.getIntValue("small");
        } else if (i3 == 3) {
            i2 = this.F.getIntValue("medium");
        } else if (i3 != 4) {
            i2 = i3 != 5 ? 2 : this.F.getIntValue("max");
        } else {
            i2 = this.F.getIntValue("large");
        }
        if (i2 <= 0) {
            return 2;
        }
        bqa.d("RecommendManagerImpl", "getColumnByConfig: " + i2);
        return i2;
    }

    public final void F0() {
        AwesomeGetContainerInnerData q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f430d4", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null && aVar.f12717a != null && (q = this.m.q(this.c.f32522a)) != null && q.getExt() != null) {
            JSONObject ext = q.getExt();
            String string = ext.getString("channelBgColor");
            if (string != null) {
                this.f.j(K0(string), 0);
            } else if (TextUtils.equals(ext.getString("removeBannerTitle"), "true")) {
                String str = this.M;
                int i2 = 8;
                if (str != null) {
                    this.f.j(K0(str), q0(8));
                } else if (TextUtils.equals(ext.getString("openPostBuyLabStyle"), "true")) {
                    String string2 = ext.getString("backgroundColor");
                    String string3 = ext.getString("marginTop");
                    int K0 = string2 != null ? K0(string2) : -1;
                    if (string3 != null) {
                        i2 = Integer.parseInt(string3);
                    }
                    this.f.j(K0, q0(i2));
                }
            }
        }
    }

    public final void I0(z4a z4aVar, mhd mhdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b2ddd0", new Object[]{this, z4aVar, mhdVar});
            return;
        }
        try {
            bqa.d("RecommendManagerImpl", "initGateway");
            Application c2 = m0b.c();
            String str = z4aVar.b;
            if (R == null) {
                bqa.d("RecommendManagerImpl", "create new GatewayConfigCenter");
                R = new y4a(str, "gateway2/recmd_r4_gateway2.json", FinalConfig.GATEWAY_R4_DEFAULT_CONFIG_JSON, true);
            }
            this.l = new q4a(str, R.e());
            imi imiVar = new imi();
            this.o = imiVar;
            zza.h(z4aVar.f32522a, imiVar);
            com.taobao.tao.recommend4.manager.c cVar = this.u;
            if (cVar != null) {
                cVar.k(z4aVar);
                this.o.d(this.u.d(), this.u);
            }
            zza.i(z4aVar.b, this.o);
            this.l.d(this.o);
            imn imnVar = new imn(c2, str);
            this.m = imnVar;
            zza.j(z4aVar.f32522a, imnVar);
            this.n = new wmn();
            this.n.g(new jon(mhdVar));
            this.l.b(new jmn(this.m), "recmd.expireTabs");
            this.l.b(new mmn(this.m), "recmd.loadCache");
            this.l.b(new hmn(this.m, this.Q), "recmd.dataProcess");
            this.l.b(new ymn(this.m), "recmd.uiRefresh");
            this.l.b(new umn(this.m, this.n), "recmd.request");
            this.l.b(new xmn(this.m), "recmd.scrollToTop");
            this.l.b(new gmn(this.m), "recmd.dataDelete");
            this.l.b(new smn(), "recmd.playerQueue");
            this.l.b(new zmn(), "recmd.widgetPostMsg");
            this.l.b(new tmn(), "recmd.prefetchDataProcess");
            this.l.c(new lmn(this.m), "recmdItemLastIndex");
            this.l.c(new emn(this.m), "recmdClickId");
        } catch (GatewayException e2) {
            bqa.b("RecommendManagerImpl", "init Gateway failed", e2);
        }
    }

    public final void L0(int i2, int i3) {
        JSONObject W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4d7e70", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        String str = this.c.f32522a;
        AwesomeGetContainerData u = this.m.u(str);
        if (u != null) {
            List<SectionModel> insertSections = u.getInsertSections();
            if (insertSections == null || insertSections.isEmpty()) {
                bqa.d("RecommendManagerImpl", "invalid insert data");
            } else if (this.f.f12717a.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                if (i3 < i2 - 1) {
                    bqa.d("RecommendManagerImpl", "insert pos invalid: " + i2);
                    return;
                }
                int i4 = (i3 + 1) - i2;
                RecyclerView.Adapter adapter = this.f.f12717a.getAdapter();
                if ((adapter instanceof RecommendRecyclerAdapter) && (W = ((RecommendRecyclerAdapter) adapter).W(i4)) != null) {
                    String string = W.getString("sectionBizCode");
                    if (!TextUtils.isEmpty(string)) {
                        int f2 = kmn.f(string, this.m.r(str));
                        if (f2 >= 0) {
                            List<SectionModel> r = this.m.r(str);
                            r.addAll(f2, insertSections);
                            this.m.u(str).updateBaseSections(r);
                            bqa.d("RecommendManagerImpl", "perform insert into base");
                        } else {
                            int f3 = kmn.f(string, this.m.y(str));
                            if (f3 == -1) {
                                bqa.d("RecommendManagerImpl", "not found insert pos");
                                return;
                            }
                            List<SectionModel> y = this.m.y(str);
                            SectionModel sectionModel = y.get(f3);
                            if (sectionModel != null) {
                                for (SectionModel sectionModel2 : insertSections) {
                                    sectionModel2.put("invalidType", sectionModel.get("invalidType"));
                                    sectionModel2.put("updateRules", (Object) sectionModel.getJSONArray("updateRules"));
                                }
                                y.addAll(f3, insertSections);
                                this.m.u(str).updateDeltaSections(y);
                                bqa.d("RecommendManagerImpl", "perform insert into delta");
                            } else {
                                return;
                            }
                        }
                        int i5 = i4;
                        for (SectionModel sectionModel3 : insertSections) {
                            sectionModel3.getArgs().put("realExposeIndex", (Object) Integer.valueOf(i5));
                            i5++;
                        }
                        JSONObject insertParam = this.m.u(str).getInsertParam();
                        if (insertParam != null) {
                            insertParam.put("hasInsert", (Object) Boolean.TRUE);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("containerModel", (Object) this.m.u(str));
                        jSONObject.put("_msgType", (Object) "uiRefresh");
                        jSONObject.put("dataChangeType", (Object) "delta");
                        jSONObject.put("dataSourceType", (Object) "remote");
                        jSONObject.put("containerId", (Object) str);
                        zza.a(str).c(RecmdContainerMsg.getMessage(jSONObject));
                        bqa.d("RecommendManagerImpl", "perform insert card , pos:" + i4);
                    }
                }
            }
        }
    }

    public final void O0() {
        HomeChildRecyclerView homeChildRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b75a22a", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null && (homeChildRecyclerView = aVar.f12717a) != null) {
            lrj nestedScrollParent = homeChildRecyclerView.getNestedScrollParent();
            if (nestedScrollParent != null && (nestedScrollParent instanceof RecyclerView)) {
                ((RecyclerView) nestedScrollParent).addOnScrollListener(this.O);
            } else if (nestedScrollParent == null) {
                bqa.d("registerOnScrollListener scrollParent == null", new String[0]);
            }
            this.f.f12717a.addOnAttachStateChangeListener(this.P);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, tb.nhd
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fecb010", new Object[]{this, jSONObject});
            return;
        }
        this.d = jSONObject;
        if (jSONObject == null) {
            this.d = new JSONObject();
        }
        if (ron.a(this)) {
            this.d.put("isNeedSubSelectionData", (Object) Boolean.TRUE);
        } else {
            this.d.put("isNeedSubSelectionData", (Object) Boolean.FALSE);
        }
        this.m.a(this.c.f32522a, "manualRequest");
        if (this.c.f32522a.contains(OrderBizCode.orderList) && ael.e().booleanValue() && ael.g().booleanValue()) {
            if (jSONObject == null || !jSONObject.containsKey("orderIdsStr")) {
                s0(0);
                return;
            }
            String string = jSONObject.getString("orderIdsStr");
            if (string != null && !string.trim().isEmpty()) {
                String[] split = string.split(",");
                if (split.length < 3) {
                    s0(Integer.valueOf(split.length));
                    return;
                }
            }
        }
        if (!this.i || this.r) {
            this.r = false;
            R0();
            return;
        }
        B();
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        vnn.c(this.c.f32522a, this);
        if (vnn.b(this.c.f32522a)) {
            bqa.d("RecommendManagerImpl", "购后单例内容移除 containerId : " + this.c.f32522a);
            boolean b2 = f4b.b("buyAfterRecmdMessageCenter", true);
            imi imiVar = this.o;
            if (imiVar != null && b2) {
                imiVar.b();
            }
            zza.n(this.c.f32522a);
            zza.o(this.c.b);
            zza.p(this.c.f32522a);
            zza.q(this.c.f32522a);
        }
        gh0.j().q();
        this.s.v();
        this.s.w();
        fo2 fo2Var = this.t;
        if (fo2Var != null) {
            fo2Var.k();
        }
        lh0 lh0Var = this.v;
        if (lh0Var != null) {
            lh0Var.h();
        }
        com.taobao.tao.recommend4.recyclerview.a aVar = this.f;
        if (aVar != null) {
            aVar.e();
        }
        fgm fgmVar = this.x;
        if (fgmVar != null) {
            fgmVar.d();
        }
        P0();
        this.s.t();
        W0();
        Y0();
        bqa.d("RecommendManagerImpl", "destroy RecommendManagerImpl: " + hashCode());
    }

    public final void r0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f4ed6b", new Object[]{this, new Integer(i2)});
            return;
        }
        if (G0()) {
            this.y = i2 - 1;
        } else {
            this.y = i2;
        }
        if (V0()) {
            JSONObject insertParam = this.m.u(this.c.f32522a).getInsertParam();
            int U0 = U0(insertParam, "notClickCardsCount");
            int U02 = U0(insertParam, "invertedInsertPos");
            if (U0 <= 0 || U02 <= 0) {
                bqa.d("RecommendManagerImpl", "insert param is invalid");
                return;
            }
            bqa.d("RecommendManagerImpl", "cur exposure count: " + this.y + " last insert exposure count: " + this.z);
            if (this.y - this.z >= U0) {
                bqa.d("RecommendManagerImpl", "perform insert cards, expose cards count: " + this.y);
                L0(U02, i2 - 1);
                this.z = this.y;
            }
        }
    }

    public final boolean G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ee4ced2", new Object[]{this})).booleanValue();
        }
        List<SectionModel> o = o();
        if (o == null || o.isEmpty()) {
            return false;
        }
        String string = o.get(0).getString("sectionBizCode");
        if (!TextUtils.isEmpty(string)) {
            return string.endsWith("_head") || string.endsWith("_tabs");
        }
        return false;
    }

    @Override // com.taobao.tao.recommend4.manager.d
    public void H(int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c14273c", new Object[]{this, new Integer(i2)});
            return;
        }
        StringBuilder sb = new StringBuilder("setBottomOffset : ");
        sb.append(i2);
        sb.append(", wrapper is null ? ");
        if (this.f != null) {
            z = false;
        }
        sb.append(z);
        bqa.d("RecommendManagerImpl", sb.toString());
        this.A = i2;
    }

    public final void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb208bb2", new Object[]{this});
        } else if (this.d != null) {
            Q0();
            this.j = false;
            this.k = true;
            JSONObject A0 = A0();
            A0.put("strategy", "cancelOther");
            A0.put("forceRequest", "true");
            kmn.v("ViewAppear", S, this.p, -1, A0);
            bqa.d("RecommendManagerImpl", "requestNetDataByScreenChange");
        }
    }

    @Override // com.taobao.tao.recommend4.manager.d, com.taobao.tao.recommend4.manager.a
    public void l(rjj rjjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe22137a", new Object[]{this, rjjVar, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.d;
        if (jSONObject2 != null) {
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            this.j = false;
            this.k = true;
            JSONObject A0 = A0();
            A0.put("forceRequest", "true");
            A0.put("nativeCustomParams", (Object) rjjVar);
            kmn.v("ViewClick", S, this.p, -1, A0);
        }
    }
}
