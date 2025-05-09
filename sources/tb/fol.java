package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.component.mediabrowser.ZoomMediaBrowserComponent;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.page.BasePageService;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class fol extends BasePageService implements eyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public qpu i;
    public ViewGroup j;

    static {
        t2o.a(918552772);
        t2o.a(919601268);
    }

    public static /* synthetic */ Object ipc$super(fol folVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1950700062:
                super.onPageResume();
                return null;
            case -1205577093:
                super.onPageStart();
                return null;
            case -105714795:
                super.onCreateService((qpu) objArr[0]);
                return null;
            case -24410319:
                super.onPageCreate();
                return null;
            case 1753141775:
                super.onPagePause();
                return null;
            case 1882001079:
                super.onPageStop();
                return null;
            case 2095795603:
                super.onPageDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/page/PageService");
        }
    }

    @Override // tb.eyb
    public void B(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0098e0", new Object[]{this, obj});
        }
    }

    public final ViewGroup a2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9dd8a4b9", new Object[]{this});
        }
        qpu qpuVar = this.i;
        if (qpuVar != null) {
            return (ViewGroup) ((vjc) qpuVar.getService(vjc.class)).I().createView();
        }
        ckf.y("turboEngineContext");
        throw null;
    }

    public final void b2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2299cc59", new Object[]{this, str});
            return;
        }
        qpu qpuVar = this.i;
        if (qpuVar != null) {
            ((d2e) qpuVar.getService(d2e.class)).p(str);
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    @Override // tb.b7d
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    @Override // tb.b7d
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        ViewGroup viewGroup = this.j;
        ckf.d(viewGroup);
        return viewGroup;
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        super.onCreateService(qpuVar);
        this.i = qpuVar;
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        } else if (L1(5)) {
            N1();
            super.onPageDestroy();
            qpu qpuVar = this.i;
            if (qpuVar != null) {
                ((byb) qpuVar.getService(byb.class)).T0(this);
                T1();
                return;
            }
            ckf.y("turboEngineContext");
            throw null;
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageDestroy... can not move to DESTROYED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else if (L1(3)) {
            O1();
            super.onPagePause();
            U1();
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPagePause... can not move to PAUSED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
        } else if (L1(2)) {
            P1();
            super.onPageResume();
            V1();
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageResume... can not move to RESUMED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        } else if (L1(4)) {
            R1();
            super.onPageStop();
            X1();
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageStop... can not move to STOPPED", null, 4, null);
        }
    }

    @Override // tb.b7d
    public void u(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0cdf87", new Object[]{this, bVar});
        } else {
            ckf.g(bVar, "message");
        }
    }

    @Override // tb.eyb
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e1d39a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        } else if (L1(0)) {
            M1();
            super.onPageCreate();
            qpu qpuVar = this.i;
            if (qpuVar != null) {
                String k = qpuVar.a().k();
                if (k != null) {
                    b2(k);
                }
                qpu qpuVar2 = this.i;
                if (qpuVar2 != null) {
                    byb bybVar = (byb) qpuVar2.getService(byb.class);
                    bybVar.r(this);
                    qpu qpuVar3 = this.i;
                    if (qpuVar3 != null) {
                        fwa I = ((vjc) qpuVar3.getService(vjc.class)).I();
                        if (I != null) {
                            I.onCreate(bybVar.s(), IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                            this.j = a2();
                            S1();
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.core.component.HierarchyComponent<kotlin.Any, android.widget.FrameLayout>");
                    }
                    ckf.y("turboEngineContext");
                    throw null;
                }
                ckf.y("turboEngineContext");
                throw null;
            }
            ckf.y("turboEngineContext");
            throw null;
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageCreate... can not move to CREATED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.BasePageService, tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        } else if (L1(1)) {
            Q1();
            super.onPageStart();
            W1();
        } else {
            tpu.a.b(tpu.Companion, BasePageService.TAG, "onPageStart... can not move to STARTED", null, 4, null);
        }
    }

    @Override // com.taobao.android.turbo.core.service.page.IPageBackLifecycle
    public boolean U0(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eadbf05", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        qpu qpuVar = this.i;
        if (qpuVar != null) {
            vjc vjcVar = (vjc) qpuVar.getService(vjc.class);
            fwa<?, ?> l = vjcVar.I().l(ZoomMediaBrowserComponent.ID);
            if (!(l instanceof ZoomMediaBrowserComponent)) {
                return false;
            }
            ((ZoomMediaBrowserComponent) l).R();
            vjcVar.I().p(l);
            return true;
        }
        ckf.y("turboEngineContext");
        throw null;
    }
}
