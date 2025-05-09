package com.taobao.android.dressup.common.service.dresslist;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dressup.base.infoflow.IDressUpHostService;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;
import kotlin.Metadata;
import tb.b7d;
import tb.ckf;
import tb.e1c;
import tb.g1c;
import tb.p6d;
import tb.qpu;
import tb.t2o;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/taobao/android/dressup/common/service/dresslist/DressListService;", "Ltb/g1c;", "Ltb/p6d;", "<init>", "()V", "Lcom/taobao/android/dressup/base/infoflow/IDressUpHostService;", "getDressHostService", "()Lcom/taobao/android/dressup/base/infoflow/IDressUpHostService;", "", "Lcom/taobao/infoflow/protocol/subservice/ISubService;", "getInfoFlowHostServices", "()Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView;", OrderConfigs.RECYCLERVIEW, "Ltb/xhv;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Ltb/qpu;", "context", "onCreateService", "(Ltb/qpu;)V", "onDestroyService", "Ltb/e1c;", DataReceiveMonitor.CB_LISTENER, "addDressListListener", "(Ltb/e1c;)V", "removeDressListListener", "onPageCreate", "onPageStart", "onPageResume", "onPagePause", "onPageStop", "onPageDestroy", "turboEngineContext", "Ltb/qpu;", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpHostService;", "dressUpHostService", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpHostService;", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpPresentServiceImpl;", "dressUpPresentServiceImpl", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpPresentServiceImpl;", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpThemeServiceImpl;", "dressUpThemeServiceImpl", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpThemeServiceImpl;", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpConfigInvokeServiceImpl;", "dressUpConfigServiceImpl", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpConfigInvokeServiceImpl;", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressListService implements g1c, p6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private qpu turboEngineContext;
    private final DressUpHostService dressUpHostService = new DressUpHostService();
    private final DressUpPresentServiceImpl dressUpPresentServiceImpl = new DressUpPresentServiceImpl();
    private final DressUpThemeServiceImpl dressUpThemeServiceImpl = new DressUpThemeServiceImpl();
    private final DressUpConfigInvokeServiceImpl dressUpConfigServiceImpl = new DressUpConfigInvokeServiceImpl();

    static {
        t2o.a(918552694);
        t2o.a(918552594);
        t2o.a(919601322);
    }

    @Override // tb.f1c
    public void addDressListListener(e1c e1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a753e550", new Object[]{this, e1cVar});
            return;
        }
        ckf.g(e1cVar, DataReceiveMonitor.CB_LISTENER);
        this.dressUpHostService.addDressListListener(e1cVar);
    }

    @Override // tb.g1c
    public IDressUpHostService getDressHostService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDressUpHostService) ipChange.ipc$dispatch("f3869e73", new Object[]{this});
        }
        return this.dressUpHostService;
    }

    @Override // tb.g1c
    public List<ISubService> getInfoFlowHostServices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5d9c7828", new Object[]{this});
        }
        return yz3.l(this.dressUpHostService, this.dressUpPresentServiceImpl, this.dressUpThemeServiceImpl, this.dressUpConfigServiceImpl);
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.turboEngineContext = qpuVar;
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
        this.dressUpHostService.init(qpuVar);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ((b7d) qpuVar.getService(b7d.class)).T0(this);
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
        } else {
            this.dressUpHostService.onComponentsDestroy();
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else {
            this.dressUpHostService.onComponentsDisAppear();
        }
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
        } else {
            this.dressUpHostService.onComponentsAppear();
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

    public void removeDressListListener(e1c e1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ee2ccd", new Object[]{this, e1cVar});
            return;
        }
        ckf.g(e1cVar, DataReceiveMonitor.CB_LISTENER);
        this.dressUpHostService.removeDressListListener(e1cVar);
    }

    @Override // tb.g1c
    public void setRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
            return;
        }
        ckf.g(recyclerView, OrderConfigs.RECYCLERVIEW);
        this.dressUpHostService.setRecyclerView(recyclerView);
    }
}
