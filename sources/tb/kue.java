package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import tb.kue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IContainerService<?> f22929a;
    public IContainerService.a b;
    public final String c;
    public final yp6 d = new yp6();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(final IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            String requestType = iUiRefreshActionModel.getRequestType();
            if (TextUtils.isEmpty(requestType)) {
                fve.e("InfoFlowCacheDataValidator", "requestType is null");
                return;
            }
            requestType.hashCode();
            if (requestType.equals(s0j.MTS_SUB_STAGE_LOAD_CACHE)) {
                fve.e("InfoFlowCacheDataValidator", s0j.MTS_SUB_STAGE_LOAD_CACHE);
                kue.b(kue.this).k(kue.a(kue.this), iUiRefreshActionModel.getContainerModel());
            } else if (requestType.equals("coldStart")) {
                get.a().e(new Runnable() { // from class: tb.jue
                    @Override // java.lang.Runnable
                    public final void run() {
                        kue.a.this.d(iUiRefreshActionModel);
                    }
                });
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
            }
        }

        public final /* synthetic */ void d(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18e51fa6", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            fve.e("InfoFlowCacheDataValidator", "coldStart");
            kue.b(kue.this).a(kue.a(kue.this), iUiRefreshActionModel.getContainerModel(), 2);
        }
    }

    static {
        t2o.a(491782534);
    }

    public kue(cfc cfcVar) {
        this.f22929a = (IContainerService) cfcVar.a(IContainerService.class);
        this.c = cfcVar.getContainerType().getContainerId();
        e();
    }

    public static /* synthetic */ String a(kue kueVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd28bb6", new Object[]{kueVar});
        }
        return kueVar.c;
    }

    public static /* synthetic */ yp6 b(kue kueVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yp6) ipChange.ipc$dispatch("8ea842fe", new Object[]{kueVar});
        }
        return kueVar.d;
    }

    public final IContainerService.a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService.a) ipChange.ipc$dispatch("c4ddacd6", new Object[]{this});
        }
        return new a();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        f();
        this.d.b();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        IContainerService.a c = c();
        this.b = c;
        this.f22929a.addUiRefreshListener(c);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IContainerService.a aVar = this.b;
        if (aVar != null) {
            this.f22929a.removeUiRefreshListener(aVar);
        }
    }
}
