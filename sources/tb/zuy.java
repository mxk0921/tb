package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zuy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f33031a;
    public final nxy b;
    public final IContainerDataService.c c = b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            String c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
            } else if (iContainerDataModel != null && (c = zuy.a(zuy.this).c()) != null) {
                zuy.a(zuy.this).a(iContainerDataModel.getBase(), c);
                zuy.a(zuy.this).a(iContainerDataModel.getDelta(), c);
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
            }
        }
    }

    static {
        t2o.a(491782637);
    }

    public zuy(cfc cfcVar) {
        this.f33031a = cfcVar;
        this.b = new nxy(cfcVar);
    }

    public static /* synthetic */ nxy a(zuy zuyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nxy) ipChange.ipc$dispatch("e50ef210", new Object[]{zuyVar});
        }
        return zuyVar.b;
    }

    public final IContainerDataService.c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff3b0c8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f33031a.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.addRequestListener(this.c);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8507c461", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f33031a.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            iContainerDataService.removeRequestListener(this.c);
        }
    }
}
