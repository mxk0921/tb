package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.ICacheReqBizParamsService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ce2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IContainerDataService<?> f17008a;
    public IContainerDataService.c b;
    public IContainerDataService.e c;
    public final Map<String, tx> d = new ConcurrentHashMap(2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.e
        public Map<String, String> a(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("54f7099b", new Object[]{this, w1eVar, str});
            }
            HashMap hashMap = new HashMap(2);
            for (tx txVar : ce2.a(ce2.this).values()) {
                Map<String, String> c = txVar.c();
                if (c != null) {
                    hashMap.putAll(c);
                }
            }
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IContainerDataService.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void a(w1e w1eVar, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7da8ef0", new Object[]{this, w1eVar, iContainerDataModel, str});
                return;
            }
            for (tx txVar : ce2.a(ce2.this).values()) {
                txVar.h();
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void b(w1e w1eVar, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77a97ec", new Object[]{this, w1eVar, str, str2, str3});
                return;
            }
            for (tx txVar : ce2.a(ce2.this).values()) {
                txVar.f();
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
        public void c(w1e w1eVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d49a26c0", new Object[]{this, w1eVar, str});
                return;
            }
            for (tx txVar : ce2.a(ce2.this).values()) {
                txVar.g();
            }
        }
    }

    static {
        t2o.a(491782286);
    }

    public ce2(cfc cfcVar) {
        IContainerDataService<?> iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        this.f17008a = iContainerDataService;
        if (iContainerDataService == null) {
            fve.e("BizParamCache", "IContainerDataService is null");
            return;
        }
        g(iContainerDataService);
        e(cfcVar.getContainerType().getContainerId());
    }

    public static /* synthetic */ Map a(ce2 ce2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c746e9cf", new Object[]{ce2Var});
        }
        return ce2Var.d;
    }

    public final IContainerDataService.e b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.e) ipChange.ipc$dispatch("9c9cb41", new Object[]{this});
        }
        return new a();
    }

    public final IContainerDataService.c c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.c) ipChange.ipc$dispatch("2a3a89a0", new Object[]{this});
        }
        return new b();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.f17008a;
        if (iContainerDataService != null) {
            i(iContainerDataService);
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd888d3", new Object[]{this, str});
            return;
        }
        ((ConcurrentHashMap) this.d).put(ICacheReqBizParamsService.SaveMode.DISK_NOT_ERASED, new jq7(str));
        ((ConcurrentHashMap) this.d).put(ICacheReqBizParamsService.SaveMode.DISK_AUTO_ERASED, new xp7(str));
    }

    public String f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20ba8059", new Object[]{this, str, str2, str3});
        }
        tx txVar = (tx) ((ConcurrentHashMap) this.d).get(str3);
        if (txVar != null) {
            return txVar.i(str, str2);
        }
        fve.e("BizParamCache", "未找到处理者： " + str3);
        return str2;
    }

    public final void g(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22b24b8", new Object[]{this, iContainerDataService});
            return;
        }
        IContainerDataService.c c = c();
        this.b = c;
        iContainerDataService.addRequestListener(c);
        IContainerDataService.e b2 = b();
        this.c = b2;
        iContainerDataService.addRequestBizParamsCreator(b2);
    }

    public void h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b6efa0", new Object[]{this, str, str2, str3});
            return;
        }
        tx txVar = (tx) ((ConcurrentHashMap) this.d).get(str3);
        if (txVar == null) {
            fve.e("BizParamCache", "未找到处理者： " + str3);
            return;
        }
        txVar.j(str, str2);
    }

    public final void i(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a2f79f", new Object[]{this, iContainerDataService});
            return;
        }
        iContainerDataService.removeRequestListener(this.b);
        iContainerDataService.removeRequestBizParamsCreator(this.c);
    }
}
