package com.alibaba.android.ultron.vfw.instance;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.spindle.stage.StageType;
import com.alibaba.android.ultron.event.base.CustomLoadRenderParser;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.perf.asynccomponent.PreloadAsyncComponent;
import com.alibaba.android.ultron.vfw.perf.asynccomponent.PreloadAsyncOnScrollListener;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.UemAnalysis;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a0o;
import tb.a8v;
import tb.av;
import tb.coc;
import tb.d07;
import tb.esb;
import tb.et6;
import tb.evb;
import tb.f8v;
import tb.fce;
import tb.fsb;
import tb.hsb;
import tb.i5e;
import tb.jc4;
import tb.jo7;
import tb.lbq;
import tb.lr6;
import tb.mgw;
import tb.mi6;
import tb.mr;
import tb.mvb;
import tb.o3c;
import tb.o5e;
import tb.ojd;
import tb.ou1;
import tb.p6j;
import tb.ppi;
import tb.qcv;
import tb.qub;
import tb.qvk;
import tb.re1;
import tb.rjc;
import tb.rq6;
import tb.rtd;
import tb.sav;
import tb.sn2;
import tb.t2o;
import tb.tnf;
import tb.tq6;
import tb.u55;
import tb.uq6;
import tb.ux;
import tb.v55;
import tb.vcv;
import tb.w15;
import tb.wq6;
import tb.y6v;
import tb.z9e;
import tb.z9v;
import tb.znf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a implements o5e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 127;
    public static final int BODY = 2;
    public static final int FOOTER = 4;
    public static final int HEADER = 1;
    @Deprecated
    public static final int TYPE_DIALOG_MARK = 1002;
    public static final int TYPE_NONE_MARK = 0;
    public static final int TYPE_WATER_MARK = 1001;

    /* renamed from: a  reason: collision with root package name */
    public UltronInstanceConfig f2328a;
    public ViewEngine b;
    public a8v c;
    public Context d;
    public u55 e;
    public ParseResponseHelper f;
    public f8v g;
    public Dialog j;
    public com.alibaba.android.ultron.vfw.dataloader.a o;
    public tq6 p;
    public i q;
    public sav r;
    public final Map<String, w15> h = new HashMap();
    public final Map<String, CustomLoadRenderParser> i = new HashMap();
    public final Map<String, Object> k = new HashMap();
    public final rq6 l = new rq6(this);
    public boolean m = false;
    public final tnf n = new tnf();

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.android.ultron.vfw.instance.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class C0076a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0076a(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(C0076a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/instance/UltronInstance$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UnifyLog.d(PreloadAsyncComponent.TAG, "loadAsyncComponentRunnbale triger mItemCreateStrategy.lazyLoadAllOnce");
            a aVar = a.this;
            aVar.n.c(aVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ojd f2330a;
        public final /* synthetic */ i5e b;
        public final /* synthetic */ h c;

        public b(ojd ojdVar, i5e i5eVar, h hVar) {
            this.f2330a = ojdVar;
            this.b = i5eVar;
            this.c = hVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/instance/UltronInstance$2");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            ojd ojdVar = this.f2330a;
            if (ojdVar != null) {
                ojdVar.a(i, mtopResponse, obj, z, map);
            }
            i5e i5eVar = this.b;
            if (i5eVar != null) {
                i5eVar.a("Page_Ultron", mr.PRE_PROCESS, StageType.STAGE_END);
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            i5e i5eVar = this.b;
            if (i5eVar != null) {
                i5eVar.a("Page_Ultron", mr.PRE_PROCESS, StageType.STAGE_END);
                this.b.a("Page_Ultron", p6j.MTOP_STAGE_DATAPARSE, StageType.STAGE_START);
            }
            a.i(a.this).r(mtopResponse);
            i5e i5eVar2 = this.b;
            if (i5eVar2 != null) {
                i5eVar2.a("Page_Ultron", p6j.MTOP_STAGE_DATAPARSE, StageType.STAGE_END);
            }
            a.this.getEventHandler().h(a.j(a.this).getComponents(), null);
            a.this.T(this.c);
            a.this.V(127);
            ojd ojdVar = this.f2330a;
            if (ojdVar != null) {
                ojdVar.b(i, mtopResponse, obj, fsbVar, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends uq6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uq6 f2331a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.android.ultron.vfw.instance.a$c$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0077a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ wq6 f2332a;

            public RunnableC0077a(wq6 wq6Var) {
                this.f2332a = wq6Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.this.f0(this.f2332a.b().c, this.f2332a.a().h(), this.f2332a.a().g());
                i C = a.this.C();
                if (C != null) {
                    C.b(this.f2332a.a());
                    if (C instanceof g) {
                        ((g) C).c(c.this.b, this.f2332a.a());
                    }
                }
            }
        }

        public c(uq6 uq6Var, String str) {
            this.f2331a = uq6Var;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == 653374083) {
                return super.c((lr6) objArr[0]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/instance/UltronInstance$3");
        }

        @Override // tb.uq6, tb.sq6
        public void a(wq6 wq6Var) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d2b290d", new Object[]{this, wq6Var});
                return;
            }
            uq6 uq6Var = this.f2331a;
            if (uq6Var != null) {
                z = uq6Var.d(wq6Var);
            }
            if (wq6Var != null && a.k(a.this) && z) {
                qcv.e(new RunnableC0077a(wq6Var));
            }
            uq6 uq6Var2 = this.f2331a;
            if (uq6Var2 != null) {
                uq6Var2.a(wq6Var);
            }
        }

        @Override // tb.uq6, tb.sq6
        public void b(wq6 wq6Var, UltronError ultronError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc6672d", new Object[]{this, wq6Var, ultronError});
                return;
            }
            uq6 uq6Var = this.f2331a;
            if (uq6Var != null) {
                uq6Var.b(wq6Var, ultronError);
            }
        }

        @Override // tb.uq6, tb.kr6
        public lr6 c(lr6 lr6Var) {
            a8v.d dVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lr6) ipChange.ipc$dispatch("26f1b283", new Object[]{this, lr6Var});
            }
            uq6 uq6Var = this.f2331a;
            if (uq6Var instanceof g) {
                g gVar = (g) uq6Var;
                String str = this.b;
                if (lr6Var != null) {
                    dVar = lr6Var.a();
                } else {
                    dVar = null;
                }
                gVar.a(str, dVar);
            }
            uq6 uq6Var2 = this.f2331a;
            if (uq6Var2 != null) {
                return uq6Var2.c(lr6Var);
            }
            return super.c(lr6Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(a aVar) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            } else {
                dialogInterface.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements a8v.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.a8v.b
        public void a(UltronError ultronError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ef52f6e", new Object[]{this, ultronError});
                return;
            }
            i iVar = a.this.q;
            if (iVar != null) {
                iVar.d(ultronError);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2334a;
        private com.alibaba.android.ultron.vfw.dataloader.a b;
        private uq6 c;

        static {
            t2o.a(157286651);
        }

        public f(String str, com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var) {
            super("asyncRenderWithContext");
            this.f2334a = str;
            this.b = aVar;
            this.c = uq6Var;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/instance/UltronInstance$AsyncRenderWithContextRunnable");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.l(a.this, this.f2334a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface g extends i {
        void a(String str, a8v.d dVar);

        void c(String str, com.alibaba.android.ultron.vfw.dataloader.a aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface h {
        void a(List<IDMComponent> list, et6 et6Var, u55 u55Var);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface i {
        void b(com.alibaba.android.ultron.vfw.dataloader.a aVar);

        void d(UltronError ultronError);
    }

    static {
        t2o.a(157286644);
        t2o.a(157286640);
    }

    public a() {
        new HashMap();
        y6v.d();
    }

    public static /* synthetic */ ParseResponseHelper i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParseResponseHelper) ipChange.ipc$dispatch("d5832dcf", new Object[]{aVar});
        }
        return aVar.f;
    }

    public static /* synthetic */ u55 j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u55) ipChange.ipc$dispatch("1e7313ac", new Object[]{aVar});
        }
        return aVar.e;
    }

    public static /* synthetic */ boolean k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14135deb", new Object[]{aVar})).booleanValue();
        }
        return aVar.m;
    }

    public static /* synthetic */ void l(a aVar, String str, com.alibaba.android.ultron.vfw.dataloader.a aVar2, uq6 uq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff59979b", new Object[]{aVar, str, aVar2, uq6Var});
        } else {
            aVar.U(str, aVar2, uq6Var);
        }
    }

    public static a q(UltronInstanceConfig ultronInstanceConfig, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("73565154", new Object[]{ultronInstanceConfig, context});
        }
        if (ultronInstanceConfig == null || context == null) {
            throw new IllegalArgumentException("UltronInstance params can not be null");
        }
        a aVar = new a();
        aVar.f2328a = ultronInstanceConfig;
        aVar.d = context;
        aVar.H();
        return aVar;
    }

    public jo7 A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jo7) ipChange.ipc$dispatch("a5f8292f", new Object[]{this});
        }
        return this.b.Q();
    }

    public void A0(long j, mvb mvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fc1f1b", new Object[]{this, new Long(j), mvbVar});
        } else {
            this.b.Q().b().s(j, mvbVar);
        }
    }

    public com.alibaba.android.ultron.vfw.dataloader.a B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.dataloader.a) ipChange.ipc$dispatch("ca109ba6", new Object[]{this});
        }
        return this.o;
    }

    public void B0(long j, evb evbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1651a5f2", new Object[]{this, new Long(j), evbVar});
        } else {
            this.b.Q().b().r(j, evbVar);
        }
    }

    public i C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("59063d8b", new Object[]{this});
        }
        return this.q;
    }

    public void C0(long j, qub qubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9669256", new Object[]{this, new Long(j), qubVar});
        } else {
            this.b.Q().b().u(j, qubVar);
        }
    }

    public ParseResponseHelper D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ParseResponseHelper) ipChange.ipc$dispatch("f75a6e36", new Object[]{this});
        }
        return this.f;
    }

    public a8v E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a8v) ipChange.ipc$dispatch("fc5b25e9", new Object[]{this});
        }
        return this.c;
    }

    public UltronInstanceConfig F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronInstanceConfig) ipChange.ipc$dispatch("ad5f2dda", new Object[]{this});
        }
        return this.f2328a;
    }

    public ViewEngine G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewEngine) ipChange.ipc$dispatch("f202aec", new Object[]{this});
        }
        return this.b;
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ViewEngine viewEngine = new ViewEngine(this.d, this.f2328a.i(), null, this.f2328a.r(), this.f2328a.m());
        this.b = viewEngine;
        viewEngine.d1(this.f2328a.i());
        this.b.n1(this.f2328a.g(), this.f2328a.h());
        this.g = new f8v(this);
        u55 u55Var = new u55(this.f2328a.e(), this.d);
        this.e = u55Var;
        u55Var.a(this.f2328a.i());
        this.e.v().o(this.f2328a.j());
        this.f = new ParseResponseHelper(this.e);
        this.b.o1(this.f2328a.c());
        this.b.t1(this.f2328a.x());
        this.b.O0(this.g);
        this.b.p1(this.f2328a.s());
        this.b.e1(this.f2328a.f());
        this.b.s1(this.f2328a.w());
        this.b.r1(this.f2328a.t());
        K();
        N();
        I();
        L();
        Z();
        M();
        if (this.f2328a.p()) {
            this.r = new sav(this.f2328a.i() + "-UltronAsyncRenderContextExecute");
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c86c200", new Object[]{this});
        } else {
            B0(9422011105736515L, new mi6());
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c56baf9", new Object[]{this});
        } else if (this.c == null) {
            this.c = new a8v(this.d, this.f2328a.v(), this, this.p, getBizName(), new e());
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73de3e4d", new Object[]{this});
        } else if (TextUtils.isEmpty(this.f2328a.k())) {
            String traceId = UemAnalysis.getTraceId();
            UltronInstanceConfig ultronInstanceConfig = this.f2328a;
            if (TextUtils.isEmpty(traceId)) {
                traceId = "";
            }
            ultronInstanceConfig.F(traceId);
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbf1ba6", new Object[]{this});
        } else {
            znf.a(this.f2328a.d(), this.b, getEventHandler(), this);
        }
    }

    public final void N() {
        Map<String, Class<? extends rtd>> a2 = ou1.a();
        if (a2 != null && !a2.isEmpty()) {
            try {
                for (Map.Entry<String, Class<? extends rtd>> entry : a2.entrySet()) {
                    this.g.d(entry.getKey(), (rtd) entry.getValue().newInstance());
                }
            } catch (Throwable th) {
                lbq.c(getBizName(), "UltronInstance.initSubsriber", th);
            }
        }
    }

    public void O(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656015b", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.b.u(linearLayout, recyclerView, linearLayout2);
        this.b.a1(new RecyclerViewAdapter(this.b));
        this.m = true;
    }

    public void P(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05e390d", new Object[]{this, list, iDMComponent});
        } else {
            this.b.i0(list, iDMComponent);
        }
    }

    public void Q(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53b13e9", new Object[]{this, iDMComponent});
        } else {
            this.n.a(iDMComponent, this);
        }
    }

    public void R(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8bbc123", new Object[]{this, jSONObject, str});
            return;
        }
        ParseResponseHelper parseResponseHelper = this.f;
        if (parseResponseHelper != null) {
            parseResponseHelper.t(jSONObject, str);
        }
    }

    public void S(JSONObject jSONObject, String str, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3cb2021", new Object[]{this, jSONObject, str, hVar});
            return;
        }
        this.e.D0(str);
        this.f.q(jSONObject);
    }

    public void T(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2e45ba", new Object[]{this, hVar});
            return;
        }
        et6 et6Var = new et6();
        if (hVar == null) {
            hVar = new d07(this.e);
        }
        hVar.a(this.e.getComponents(), et6Var, this.e);
        et6Var.n(this.e.h());
        et6Var.m(this.e);
        this.n.b(et6Var.a(), this);
        r0(et6Var);
    }

    public final void U(String str, com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866f4fa7", new Object[]{this, str, aVar, uq6Var});
            return;
        }
        UnifyLog.g(PreloadAsyncComponent.TAG, "realRenderWithContext");
        i5e l = this.f2328a.l();
        if (l != null) {
            l.a("Page_Ultron", mr.PRE_PROCESS, StageType.STAGE_START);
        }
        boolean g2 = this.p.g();
        this.o = aVar;
        if ("initial".equals(aVar.f())) {
            this.n.d();
        }
        c cVar = new c(uq6Var, str);
        if (g2) {
            this.l.i(aVar, cVar);
        } else {
            this.l.g(aVar, cVar);
        }
    }

    public void V(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76b821", new Object[]{this, new Integer(i2)});
        } else {
            this.b.z0(i2);
        }
    }

    public void W(int i2, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451f9570", new Object[]{this, new Integer(i2), vcvVar});
        } else {
            this.b.A0(i2, vcvVar);
        }
    }

    public void X(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa697d61", new Object[]{this, new Integer(i2)});
        } else {
            this.b.H0(i2);
        }
    }

    public void Y(String str, w15 w15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baab2e54", new Object[]{this, str, w15Var});
        } else {
            ((HashMap) this.h).put(str, w15Var);
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b3a76", new Object[]{this});
        } else {
            a0(BundleLineComponent.COMPONENT_TAG, sn2.CREATOR);
        }
    }

    @Override // tb.o5e
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbb6018", new Object[]{this, iDMComponent});
        }
    }

    public void a0(String str, z9e z9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722c4c73", new Object[]{this, str, z9eVar});
        } else {
            this.b.R0(str, z9eVar);
        }
    }

    @Override // tb.o5e
    public fsb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsb) ipChange.ipc$dispatch("b8d7dd5a", new Object[]{this});
        }
        return this.e;
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1947502f", new Object[]{this});
        } else {
            this.d = null;
        }
    }

    @Override // tb.o5e
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf6b8d0", new Object[]{this, str});
            return;
        }
        try {
            Dialog dialog = new Dialog(getContext(), R.style.Dialog_Status_Container);
            this.j = dialog;
            dialog.setContentView(View.inflate(getContext(), R.layout.ultron_loading, null));
            if (!TextUtils.isEmpty(str)) {
                ((TextView) this.j.findViewById(R.id.text)).setText(str);
            }
            Window window = this.j.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = -1;
            attributes.height = -1;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            int d2 = mgw.d(getContext());
            int e2 = mgw.e(getContext());
            int i2 = d2 - e2;
            if (d2 > 0 && e2 > 0 && i2 > 0) {
                this.j.getWindow().setLayout(-1, i2);
            }
            this.j.setOnCancelListener(new d(this));
            this.j.show();
        } catch (Throwable th) {
            UnifyLog.m(getBizName(), "UltronInstance", "showLoading exception ", th.toString());
            lbq.c(getBizName(), "UltronInstance.showLoading", th);
        }
    }

    public void c0(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e650532", new Object[]{this, list});
        } else {
            this.b.W0(list);
        }
    }

    @Override // tb.o5e
    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7f6b169e", new Object[]{this});
        }
        return this.k;
    }

    public void d0(o3c o3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a2adec", new Object[]{this, o3cVar});
        } else {
            this.g.p(o3cVar);
        }
    }

    @Override // tb.o5e
    public void e(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1f2d49", new Object[]{this, list});
        } else {
            this.b.K0(list);
        }
    }

    public void e0(JSONObject jSONObject, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb04ccc", new Object[]{this, jSONObject, hVar});
            return;
        }
        UnifyLog.g(PreloadAsyncComponent.TAG, " renderData ");
        if (jSONObject != null) {
            this.f.q(jSONObject);
            a0o.c(this.e, z(), hVar, this);
        }
    }

    @Override // tb.o5e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a182530a", new Object[]{this});
        } else {
            this.b.H0(127);
        }
    }

    public void f0(JSONObject jSONObject, String str, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44f9702", new Object[]{this, jSONObject, str, hVar});
            return;
        }
        this.e.D0(str);
        e0(jSONObject, hVar);
    }

    @Override // tb.o5e
    public ppi g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ppi) ipChange.ipc$dispatch("3aa53fac", new Object[]{this});
        }
        return this.b.V();
    }

    public void g0(hsb hsbVar, Object obj, ojd ojdVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93f9916", new Object[]{this, hsbVar, obj, ojdVar, hVar});
        } else if (hsbVar != null) {
            i5e l = this.f2328a.l();
            if (l != null) {
                l.a("Page_Ultron", mr.PRE_PROCESS, StageType.STAGE_START);
            }
            hsbVar.a(obj, new b(ojdVar, l, hVar));
        } else {
            throw new IllegalArgumentException("requester can not be null");
        }
    }

    @Override // tb.o5e
    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        ViewEngine viewEngine = this.b;
        if (viewEngine != null) {
            return viewEngine.I();
        }
        return "default";
    }

    @Override // tb.o5e
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.o5e
    public f8v getEventHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8v) ipChange.ipc$dispatch("558f0945", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.o5e
    public Map<String, String> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e259437", new Object[]{this});
        }
        return null;
    }

    @Override // tb.o5e
    public qvk h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvk) ipChange.ipc$dispatch("c052dcd4", new Object[]{this});
        }
        return null;
    }

    public void h0(com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5e3ef3", new Object[]{this, aVar, uq6Var});
        } else {
            i0(null, aVar, uq6Var);
        }
    }

    @Override // tb.o5e
    public void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        try {
            Dialog dialog = this.j;
            if (dialog != null && dialog.isShowing()) {
                this.j.dismiss();
            }
        } catch (Throwable th) {
            UnifyLog.m(getBizName(), "UltronInstance", "hideLoading exception ", th.toString());
            lbq.c(getBizName(), "UltronInstance.hideLoading", th);
        }
    }

    public void i0(String str, com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var) {
        UltronInstanceConfig ultronInstanceConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a44169", new Object[]{this, str, aVar, uq6Var});
        } else if (str == null || (ultronInstanceConfig = this.f2328a) == null || !ultronInstanceConfig.p()) {
            U(str, aVar, uq6Var);
            UnifyLog.d(PreloadAsyncComponent.TAG, " renderWithContext end");
        } else {
            p(str, aVar, uq6Var);
        }
    }

    public void j0(String str, rtd rtdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c48d2", new Object[]{this, str, rtdVar});
            return;
        }
        f8v f8vVar = this.g;
        if (f8vVar != null) {
            f8vVar.q(str, rtdVar);
        }
    }

    public void k0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        this.d = context;
        this.b.X0(context);
        this.g.r(context);
        this.e.q0(context);
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8504a57e", new Object[]{this});
            return;
        }
        u55 u55Var = new u55(this.f2328a.e(), this.d);
        this.e = u55Var;
        u55Var.a(this.f2328a.i());
        v55 v = this.e.v();
        if (v != null) {
            v.o(this.f2328a.j());
        }
        this.f = new ParseResponseHelper(this.e);
        getEventHandler().h(null, null);
    }

    public void m(String str, String str2, coc cocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdb35f2", new Object[]{this, str, str2, cocVar});
            return;
        }
        a8v a8vVar = this.c;
        if (a8vVar != null) {
            a8vVar.b(str, str2, cocVar);
        }
    }

    public void m0(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23fcf2dc", new Object[]{this, iDMComponent});
        } else {
            this.b.Z0(iDMComponent);
        }
    }

    public void n(o3c o3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7112ab2f", new Object[]{this, o3cVar});
        } else {
            this.g.c(o3cVar);
        }
    }

    public void n0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74f5fd2", new Object[]{this, viewGroup});
            return;
        }
        ViewEngine viewEngine = this.b;
        if (viewEngine != null && viewGroup != null) {
            viewEngine.c1(viewGroup);
        }
    }

    public void o(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1415fc", new Object[]{this, iDMComponent, jSONObject});
        } else {
            this.c.c(iDMComponent, jSONObject);
        }
    }

    public void o0(jc4 jc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b785387d", new Object[]{this, jc4Var});
        } else {
            this.b.f1(jc4Var);
        }
    }

    public final void p(String str, com.alibaba.android.ultron.vfw.dataloader.a aVar, uq6 uq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13df6105", new Object[]{this, str, aVar, uq6Var});
            return;
        }
        UnifyLog.d(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor asyncRenderWithContext runnable");
        s(new f(str, aVar, uq6Var));
    }

    public void p0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5844f535", new Object[]{this, new Integer(i2)});
            return;
        }
        u55 u55Var = this.e;
        if (u55Var != null) {
            u55Var.F0(i2);
        }
    }

    public void q0(tq6 tq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205b0a08", new Object[]{this, tq6Var});
        } else if (this.p == null) {
            this.p = tq6Var;
            try {
                J();
            } catch (Throwable th) {
                UnifyLog.m(getBizName(), "UltronInstance", "initEngine exception: ", th.getMessage());
            }
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.l.b();
        this.b.y();
        a8v a8vVar = this.c;
        if (a8vVar != null) {
            a8vVar.f();
        }
        Context context = this.d;
        if (context != null) {
            z9v.u(context).k(this.d);
        }
    }

    public final void r0(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea82aa", new Object[]{this, et6Var});
            return;
        }
        this.b.i1(et6Var);
        x0(et6Var.a());
    }

    public final void s(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22089d33", new Object[]{this, runnable});
        } else if (runnable == null) {
            UnifyLog.e(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor runnable is NULL");
        } else if (this.r == null) {
            UnifyLog.e(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor mUltronSerialExecutor is NULL");
            UnifyLog.n(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor sync run the runnbale");
            runnable.run();
        } else {
            UnifyLog.d(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor");
            this.r.a(runnable);
        }
    }

    public void s0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b13275d", new Object[]{this, viewGroup});
            return;
        }
        ViewEngine viewEngine = this.b;
        if (viewEngine != null && viewGroup != null) {
            viewEngine.k1(viewGroup);
        }
    }

    public re1 t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (re1) ipChange.ipc$dispatch("6c253c73", new Object[]{this});
        }
        return null;
    }

    public void t0(rjc rjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f85fdc5", new Object[]{this, rjcVar});
        } else {
            this.b.m1(rjcVar);
        }
    }

    public CustomLoadRenderParser u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomLoadRenderParser) ipChange.ipc$dispatch("35bf7bd7", new Object[]{this, str});
        }
        return (CustomLoadRenderParser) ((HashMap) this.i).get(str);
    }

    public void u0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46af6d3", new Object[]{this, new Integer(i2)});
        } else {
            this.b.o1(i2);
        }
    }

    public w15 v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w15) ipChange.ipc$dispatch("4ba49f3f", new Object[]{this, str});
        }
        return (w15) ((HashMap) this.h).get(str);
    }

    public void v0(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6999621", new Object[]{this, iVar});
        } else {
            this.q = iVar;
        }
    }

    public u55 w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u55) ipChange.ipc$dispatch("5a61a29d", new Object[]{this});
        }
        return this.e;
    }

    public void w0(fce fceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b343ef", new Object[]{this, fceVar});
        } else {
            this.b.u1(fceVar);
        }
    }

    public tq6 x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tq6) ipChange.ipc$dispatch("517da71a", new Object[]{this});
        }
        return this.p;
    }

    public final void x0(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be2f3d1", new Object[]{this, list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                JSONObject b2 = esb.b(iDMComponent);
                if (b2 != null) {
                    for (String str : b2.keySet()) {
                        IDMComponent componentByName = b().getComponentByName(str);
                        if (!(componentByName == null || componentByName.getMessageChannel() == null || iDMComponent.getMessageChannel() == null)) {
                            componentByName.getMessageChannel().a(iDMComponent.getMessageChannel());
                        }
                    }
                }
            }
        }
    }

    public uq6 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq6) ipChange.ipc$dispatch("7a5c536", new Object[]{this});
        }
        return null;
    }

    public void y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993c0da8", new Object[]{this});
            return;
        }
        u55 u55Var = this.e;
        if (u55Var != null) {
            u55Var.K0();
        }
    }

    public et6 z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et6) ipChange.ipc$dispatch("5bbeafb0", new Object[]{this});
        }
        return this.b.N();
    }

    public void z0(String str, av avVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d22537", new Object[]{this, str, avVar});
            return;
        }
        try {
            this.b.Q().b().D(str, avVar);
        } catch (DinamicException e2) {
            UnifyLog.m(getBizName(), "UltronInstance", "v2RegisterDinamicXParser error: ", e2.getMessage());
            lbq.c(getBizName(), "UltronInstance.v2RegisterDinamicXParser", e2);
        }
    }

    public final void M() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372b8ad3", new Object[]{this});
            return;
        }
        UltronInstanceConfig ultronInstanceConfig = this.f2328a;
        if (ultronInstanceConfig != null && ultronInstanceConfig.J()) {
            z = true;
        }
        UnifyLog.n(PreloadAsyncComponent.TAG, "shouldPreloadAsyncComponent is:" + z);
        if (z) {
            this.b.s(new PreloadAsyncOnScrollListener(new C0076a("loadAsyncComponentRunnbale"), this.f2328a.o()));
            UnifyLog.d(PreloadAsyncComponent.TAG, "init ScrollListener for PreloadComponent");
        }
    }
}
