package tb;

import android.view.View;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class pm extends bp<AURARenderIO, AURARenderOutput> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RENDER_SERVICE_CODE = "aura.service.render";
    public em c;
    public final boolean d = fj.d("enableHighPerformanceStagePerf", true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
            hl.a("开始渲染freeNode");
            pm.m0(pm.this).m(pm.L(pm.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements vcb<ncb> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f26168a;

        public b(pm pmVar, View view) {
            this.f26168a = view;
        }

        /* renamed from: b */
        public void a(ncb ncbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbeb35c0", new Object[]{this, ncbVar});
            } else if (ncbVar instanceof ucb) {
                ((ucb) ncbVar).W(this.f26168a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements vcb<ncb> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: b */
        public void a(ncb ncbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbeb35c0", new Object[]{this, ncbVar});
            } else if (ncbVar instanceof ucb) {
                ((ucb) ncbVar).T(pm.m0(pm.this).e());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements vcb<ncb> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURARenderComponent f26170a;

        public d(pm pmVar, AURARenderComponent aURARenderComponent) {
            this.f26170a = aURARenderComponent;
        }

        /* renamed from: b */
        public void a(ncb ncbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbeb35c0", new Object[]{this, ncbVar});
            } else if (ncbVar instanceof ucb) {
                ((ucb) ncbVar).J(this.f26170a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements vcb<ncb> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAInputData f26171a;

        public e(pm pmVar, AURAInputData aURAInputData) {
            this.f26171a = aURAInputData;
        }

        /* renamed from: b */
        public void a(ncb ncbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbeb35c0", new Object[]{this, ncbVar});
            } else if (ncbVar instanceof ucb) {
                ((ucb) ncbVar).A0(this.f26171a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26172a;

        public f(String str) {
            this.f26172a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", (Object) pm.J0(pm.this).f());
            qbv.j().a(this.f26172a, pm.K0(pm.this).d(), jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", (Object) pm.L0(pm.this).f());
            qbv.j().a(UltronTradeHybridStage.ON_RENDER_START, pm.M0(pm.this).d(), jSONObject);
            qbv.j().a(UltronTradeHybridStage.ON_RENDER_END, pm.N0(pm.this).d(), jSONObject);
        }
    }

    static {
        t2o.a(80740534);
    }

    public static /* synthetic */ lo J0(pm pmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("647912cf", new Object[]{pmVar});
        }
        return pmVar.x();
    }

    public static /* synthetic */ lo K0(pm pmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("a4a3f990", new Object[]{pmVar});
        }
        return pmVar.x();
    }

    public static /* synthetic */ yi L(pm pmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yi) ipChange.ipc$dispatch("5847d157", new Object[]{pmVar});
        }
        return pmVar.r();
    }

    public static /* synthetic */ lo L0(pm pmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("e4cee051", new Object[]{pmVar});
        }
        return pmVar.x();
    }

    public static /* synthetic */ lo M0(pm pmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("24f9c712", new Object[]{pmVar});
        }
        return pmVar.x();
    }

    public static /* synthetic */ lo N0(pm pmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("6524add3", new Object[]{pmVar});
        }
        return pmVar.x();
    }

    public static /* synthetic */ Object ipc$super(pm pmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -576780562) {
            super.B((AURAInputData) objArr[0], (pt) objArr[1]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/render/AURARenderService");
        }
    }

    public static /* synthetic */ em m0(pm pmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (em) ipChange.ipc$dispatch("fc461d7c", new Object[]{pmVar});
        }
        return pmVar.c;
    }

    public final void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90ffa8a", new Object[]{this});
        } else {
            S0(new c());
        }
    }

    public final void P0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a1e19", new Object[]{this, view});
        } else {
            S0(new b(this, view));
        }
    }

    public final void Q0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400d63ee", new Object[]{this, aURARenderComponent});
        } else {
            S0(new d(this, aURARenderComponent));
        }
    }

    public final void R0(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc63fa5", new Object[]{this, aURAInputData});
        } else {
            S0(new e(this, aURAInputData));
        }
    }

    public final void S0(vcb<ncb> vcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f901527e", new Object[]{this, vcbVar});
            return;
        }
        for (ncb ncbVar : r().f(ncb.class)) {
            vcbVar.a(ncbVar);
        }
    }

    public final void T0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
        } else {
            S0(new qm(this, view));
        }
    }

    public final void U0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25056840", new Object[]{this, str});
        } else {
            dn.e(new f(str));
        }
    }

    public final void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df03faff", new Object[]{this});
        } else {
            dn.e(new g());
        }
    }

    @Override // tb.gn, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        pcb pcbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        if (loVar.c().a(new AURANodeBranchModel("aura.branch.render.layoutDataProcessor.v2", false, "default"))) {
            pcbVar = new jm();
        } else {
            pcbVar = new im();
        }
        this.c = new em(pcbVar);
    }

    @Override // tb.gn, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        em emVar = this.c;
        if (emVar != null) {
            emVar.c();
        }
        U0(UltronTradeHybridStage.ON_CONTAINER_DESTROY);
    }

    @Override // tb.bp
    public void B(AURAInputData<AURARenderIO> aURAInputData, pt<AURARenderOutput> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9f06ee", new Object[]{this, aURAInputData, ptVar});
            return;
        }
        super.B(aURAInputData, ptVar);
        AURATraceUtil.a(3, "AURARenderService");
        this.c.g(r());
        if (!this.d) {
            U0(UltronTradeHybridStage.ON_RENDER_START);
        }
        AURATraceUtil.a(3, "执行beforeRender 扩展点");
        R0(aURAInputData);
        AURATraceUtil.b(3);
        AURATraceUtil.a(3, "getRenderTree");
        AURARenderComponent renderTree = aURAInputData.getData().getRenderTree();
        AURATraceUtil.b(3);
        if (renderTree == null) {
            AURATraceUtil.b(3);
            ptVar.b(new mi(0, "AURARenderServiceDomain", "-1000_EMPTY_RENDER_TREE", "渲染树参数为null"));
            return;
        }
        AURATraceUtil.a(3, "执行beforeBindData 扩展点");
        Q0(renderTree);
        AURATraceUtil.b(3);
        AURATraceUtil.a(3, "onDataChanged");
        this.c.n(ptVar);
        this.c.h(renderTree, aURAInputData.getFlowData(), aURAInputData.getGlobalData());
        AURATraceUtil.b(3);
        AURATraceUtil.a(3, "执行afterBindData 扩展点");
        O0();
        AURATraceUtil.b(3);
        AURATraceUtil.a(3, "provideContentView");
        View l = this.c.l(x().f());
        AURATraceUtil.b(3);
        AURATraceUtil.a(3, "执行onContentViewCreated 扩展点");
        T0(l);
        AURATraceUtil.b(3);
        AURATraceUtil.a(3, "执行bindData");
        this.c.b();
        AURATraceUtil.b(3);
        if (((Boolean) x().h("enableIdleRender", Boolean.class, Boolean.FALSE)).booleanValue()) {
            dn.e(new a());
        } else {
            this.c.m(r());
        }
        AURARenderOutput aURARenderOutput = new AURARenderOutput();
        aURARenderOutput.setView(l);
        yk<AURARenderOutput> a2 = yk.a(aURARenderOutput, aURAInputData);
        aURAInputData.getGlobalData().update("render_view", l);
        P0(l);
        AURATraceUtil.b(3);
        ptVar.c(a2);
        if (!new File("/data/local/tmp/.disPreWeex").exists()) {
            return;
        }
        if (!this.d) {
            U0(UltronTradeHybridStage.ON_RENDER_END);
        } else {
            V0();
        }
    }
}
