package com.taobao.android.turbo.service.pop;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.base.service.pop.PopType;
import com.taobao.android.turbo.core.service.lifecycle.EngineState;
import com.taobao.android.turbo.model.PageModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.b7d;
import tb.byb;
import tb.cgm;
import tb.ckf;
import tb.cz1;
import tb.eyb;
import tb.g1a;
import tb.m2h;
import tb.mqu;
import tb.n7k;
import tb.o2c;
import tb.p6d;
import tb.q2c;
import tb.qpu;
import tb.rlc;
import tb.t2o;
import tb.tpu;
import tb.vad;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PopMsgService implements vad, eyb, p6d, rlc, o2c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "PopService";

    /* renamed from: a  reason: collision with root package name */
    public qpu f9767a;
    public final List<cgm> b = new ArrayList();
    public HashMap<PopType, Class<? extends cz1>> c;
    public cz1 d;
    public LiveMsgBoxManager e;
    public FrameLayout f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455594);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455593);
        t2o.a(916455451);
        t2o.a(919601268);
        t2o.a(919601322);
        t2o.a(916455585);
        t2o.a(919601295);
    }

    public static final /* synthetic */ boolean M(PopMsgService popMsgService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc15640f", new Object[]{popMsgService})).booleanValue();
        }
        return popMsgService.g1();
    }

    public static final /* synthetic */ void T0(PopMsgService popMsgService, cz1 cz1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424f39be", new Object[]{popMsgService, cz1Var});
        } else {
            popMsgService.d = cz1Var;
        }
    }

    public static final /* synthetic */ LiveMsgBoxManager x(PopMsgService popMsgService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveMsgBoxManager) ipChange.ipc$dispatch("22c500b0", new Object[]{popMsgService});
        }
        return popMsgService.e;
    }

    @Override // tb.eyb
    public void B(Object obj) {
        Map<String, Object> capsuleMsg;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0098e0", new Object[]{this, obj});
        } else if (obj != null && (capsuleMsg = ((PageModel) obj).getCapsuleMsg()) != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, TAG, "onPageDataLoaded msgbox " + capsuleMsg, null, 4, null);
            int d = mqu.Companion.d(capsuleMsg.get("disappearTime"), 10) * 1000;
            K1(new cgm(PopType.POP_NORMAL, d <= 0 ? 10000 : d, capsuleMsg, false, 8, null));
        }
    }

    public void K1(cgm cgmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcada4e", new Object[]{this, cgmVar});
            return;
        }
        ckf.g(cgmVar, "msg");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "push " + cgmVar, null, 4, null);
        ((ArrayList) this.b).add(cgmVar);
        M1();
    }

    public final void L1(g1a<? super cgm, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297a842a", new Object[]{this, g1aVar});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            cgm cgmVar = (cgm) it.next();
            if (g1aVar.invoke(cgmVar).booleanValue()) {
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, TAG, "removeMsg " + cgmVar, null, 4, null);
                it.remove();
            }
        }
    }

    public final void N1(cgm cgmVar) {
        e1();
        HashMap<PopType, Class<? extends cz1>> hashMap = this.c;
        ckf.d(hashMap);
        Class<? extends cz1> cls = hashMap.get(cgmVar.c());
        if (cls != null) {
            cz1 cz1Var = (cz1) cls.newInstance();
            this.d = cz1Var;
            qpu qpuVar = this.f9767a;
            if (qpuVar != null) {
                cz1Var.i(qpuVar, cgmVar, new PopMsgService$showPop$1(this, cgmVar));
            } else {
                ckf.y("engineContext");
                throw null;
            }
        }
    }

    public final void U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a69b896", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, TAG, "dismissCurrent pop", null, 4, null);
        cz1 cz1Var = this.d;
        if (cz1Var != null) {
            cz1Var.a();
        }
    }

    public final void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2e515a", new Object[]{this});
        } else if (this.c == null) {
            HashMap<PopType, Class<? extends cz1>> hashMap = new HashMap<>();
            this.c = hashMap;
            hashMap.put(PopType.POP_NORMAL, n7k.class);
            HashMap<PopType, Class<? extends cz1>> hashMap2 = this.c;
            ckf.d(hashMap2);
            hashMap2.put(PopType.POP_LIVE, m2h.class);
        }
    }

    public final boolean g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7274d649", new Object[]{this})).booleanValue();
        }
        qpu qpuVar = this.f9767a;
        if (qpuVar == null) {
            ckf.y("engineContext");
            throw null;
        } else if (((b7d) qpuVar.getService(b7d.class)).getPageState() == 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override // tb.vad
    public ViewGroup i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("198e09eb", new Object[]{this});
        }
        if (this.f == null) {
            qpu qpuVar = this.f9767a;
            if (qpuVar != null) {
                this.f = new FrameLayout(qpuVar.getContext());
                qpu qpuVar2 = this.f9767a;
                if (qpuVar2 != null) {
                    ((b7d) qpuVar2.getService(b7d.class)).getView().addView(this.f, new FrameLayout.LayoutParams(-1, -2));
                } else {
                    ckf.y("engineContext");
                    throw null;
                }
            } else {
                ckf.y("engineContext");
                throw null;
            }
        }
        FrameLayout frameLayout = this.f;
        ckf.d(frameLayout);
        return frameLayout;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f9767a = qpuVar;
        ((byb) qpuVar.getService(byb.class)).r(this);
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
        ((q2c) qpuVar.getService(q2c.class)).r(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ((byb) qpuVar.getService(byb.class)).T0(this);
        ((b7d) qpuVar.getService(b7d.class)).T0(this);
        ((q2c) qpuVar.getService(q2c.class)).x(this);
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
            return;
        }
        U0();
        LiveMsgBoxManager liveMsgBoxManager = this.e;
        if (liveMsgBoxManager != null) {
            liveMsgBoxManager.o();
        }
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
            return;
        }
        M1();
        LiveMsgBoxManager liveMsgBoxManager = this.e;
        if (liveMsgBoxManager != null) {
            LiveMsgBoxManager.n(liveMsgBoxManager, 0L, 1, null);
        }
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        }
    }

    @Override // tb.o2c
    public void onReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1a118b", new Object[]{this});
        }
    }

    @Override // tb.rlc
    public void r(cgm cgmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ee2ec9", new Object[]{this, cgmVar});
            return;
        }
        ckf.g(cgmVar, "msg");
        L1(PopMsgService$onLiveMsgBox$1.INSTANCE);
        K1(cgmVar);
    }

    @Override // tb.eyb
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e1d39a", new Object[]{this});
        }
    }

    @Override // tb.o2c
    public void onStateChanged(EngineState engineState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a0b34", new Object[]{this, engineState});
            return;
        }
        ckf.g(engineState, "state");
        if (engineState == EngineState.INTERACTIVE) {
            tpu.a.b(tpu.Companion, TAG, "引擎可交互, 初始化直播消息盒子", null, 4, null);
            qpu qpuVar = this.f9767a;
            if (qpuVar != null) {
                this.e = new LiveMsgBoxManager(qpuVar, this);
                M1();
                LiveMsgBoxManager liveMsgBoxManager = this.e;
                ckf.d(liveMsgBoxManager);
                LiveMsgBoxManager.n(liveMsgBoxManager, 0L, 1, null);
                return;
            }
            ckf.y("engineContext");
            throw null;
        }
    }

    public boolean M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("220c501b", new Object[]{this})).booleanValue();
        }
        if (((ArrayList) this.b).isEmpty()) {
            tpu.a.b(tpu.Companion, TAG, "popQueue is empty", null, 4, null);
            return false;
        } else if (this.d != null) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, TAG, "currentPop is showing, " + this.d, null, 4, null);
            return false;
        } else if (!g1()) {
            tpu.a.b(tpu.Companion, TAG, "page is not resumed", null, 4, null);
            return false;
        } else {
            N1((cgm) ((ArrayList) this.b).remove(0));
            return true;
        }
    }
}
