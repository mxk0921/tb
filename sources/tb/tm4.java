package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IOrderListPrefetchService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model.UiRefreshActionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tm4 implements vqb, MtopPrefetch.IPrefetchCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f28795a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public List<IContainerDataService.c> c;
    public List<IContainerDataService.e> d;
    public List<IContainerDataService.a> e;
    public ws7 f;
    public List<IContainerDataService.b> g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IContainerService f28796a;
        public final /* synthetic */ AwesomeGetContainerData b;
        public final /* synthetic */ UiRefreshActionModel c;

        public a(IContainerService iContainerService, AwesomeGetContainerData awesomeGetContainerData, UiRefreshActionModel uiRefreshActionModel) {
            this.f28796a = iContainerService;
            this.b = awesomeGetContainerData;
            this.c = uiRefreshActionModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f28796a.uiRefresh(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wit f28797a;

        public b(tm4 tm4Var, wit witVar) {
            this.f28797a = witVar;
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                this.f28797a.onSuccess();
            }
        }
    }

    static {
        t2o.a(491782783);
        t2o.a(487587952);
        t2o.a(589299954);
    }

    public tm4(cfc cfcVar) {
        this.f28795a = cfcVar;
    }

    @Override // tb.vqb
    public void a(JSONObject jSONObject, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ff08b9", new Object[]{this, jSONObject, str, str2});
            return;
        }
        w1e b2 = o5a.b(jSONObject);
        if (this.c != null) {
            if (jSONObject == null) {
                str3 = "unknown";
            } else {
                str3 = jSONObject.getString("requestType");
            }
            Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((IContainerDataService.c) it.next()).b(b2, str, str2, str3);
            }
        }
    }

    @Override // tb.vqb
    public void b(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac267cd", new Object[]{this, jSONObject});
            return;
        }
        w1e b2 = o5a.b(jSONObject);
        List<IContainerDataService.c> list = this.c;
        if (list != null) {
            if (jSONObject == null) {
                str = "unknown";
            } else {
                str = jSONObject.getString("requestType");
            }
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((IContainerDataService.c) it.next()).c(b2, str);
            }
        }
    }

    @Override // tb.vqb
    public void c(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f418b4c", new Object[]{this, awesomeGetContainerData, jSONObject});
            return;
        }
        fve.f("ProcessProviderImpl", "uIRefresh");
        w1e b2 = o5a.b(jSONObject);
        UiRefreshActionModel uiRefreshActionModel = (UiRefreshActionModel) JSON.toJavaObject(jSONObject, UiRefreshActionModel.class);
        n(b2, awesomeGetContainerData);
        IContainerService iContainerService = (IContainerService) this.f28795a.a(IContainerService.class);
        if (iContainerService != null) {
            this.b.post(new a(iContainerService, awesomeGetContainerData, uiRefreshActionModel));
        }
    }

    @Override // tb.vqb
    public void d(List<SectionModel> list, wit witVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33328aa4", new Object[]{this, list, witVar});
            return;
        }
        fve.f("ProcessProviderImpl", "downloadTemplate");
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) this.f28795a.a(IDxItemRenderService.class);
        if (iDxItemRenderService == null) {
            fve.e("ProcessProviderImpl", "IDxItemRenderService is null");
        } else {
            iDxItemRenderService.downloadTemplate(list, new b(this, witVar));
        }
    }

    @Override // tb.vqb
    public void e(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e734f63f", new Object[]{this, awesomeGetContainerData, jSONObject});
            return;
        }
        fve.f("ProcessProviderImpl", "customDataProcess");
        w1e b2 = o5a.b(jSONObject);
        p(b2);
        o(b2, awesomeGetContainerData);
    }

    @Override // tb.vqb
    public AwesomeGetContainerParams f(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("3f32cbc0", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        fve.f("ProcessProviderImpl", "getRequestParams");
        if (this.f == null) {
            this.f = new ws7(this.f28795a);
        }
        AwesomeGetContainerParams a2 = this.f.a(awesomeGetContainerData, jSONObject);
        if (a2 == null) {
            return null;
        }
        if (o5a.b(jSONObject) == null) {
            o5a.a(jSONObject, new sve(a2.getRequestType() + SystemClock.uptimeMillis()));
        }
        List<IContainerDataService.e> list = this.d;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                Map<String, String> a3 = ((IContainerDataService.e) it.next()).a(null, a2.getRequestType());
                if (a3 != null) {
                    a2.getBizParams().putAll(a3);
                }
            }
        }
        return a2;
    }

    @Override // tb.vqb
    public void g(IBizDataModel<AwesomeGetContainerData> iBizDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e596", new Object[]{this, iBizDataModel});
            return;
        }
        IOrderListPrefetchService iOrderListPrefetchService = (IOrderListPrefetchService) this.f28795a.a(IOrderListPrefetchService.class);
        if (iOrderListPrefetchService != null) {
            iOrderListPrefetchService.savePrefetchData(iBizDataModel);
        }
    }

    @Override // tb.vqb
    public void h(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0105722", new Object[]{this, jSONObject, awesomeGetContainerData});
            return;
        }
        w1e b2 = o5a.b(jSONObject);
        if (this.c != null) {
            if (jSONObject == null) {
                str = "unknown";
            } else {
                str = jSONObject.getString("requestType");
            }
            Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((IContainerDataService.c) it.next()).a(b2, awesomeGetContainerData, str);
            }
        }
    }

    public void i(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ca5d8d", new Object[]{this, aVar});
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArrayList();
        }
        this.e.add(aVar);
    }

    public void j(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7aa018", new Object[]{this, bVar});
            return;
        }
        if (this.g == null) {
            this.g = new CopyOnWriteArrayList();
        }
        this.g.add(bVar);
    }

    public void k(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3333bc", new Object[]{this, eVar});
            return;
        }
        if (this.d == null) {
            this.d = new CopyOnWriteArrayList();
        }
        this.d.add(eVar);
    }

    public void l(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8184fd39", new Object[]{this, cVar});
            return;
        }
        if (this.c == null) {
            this.c = new CopyOnWriteArrayList();
        }
        this.c.add(cVar);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<IContainerDataService.c> list = this.c;
        if (list != null) {
            list.clear();
        }
        this.c = null;
        List<IContainerDataService.e> list2 = this.d;
        if (list2 != null) {
            list2.clear();
        }
        this.d = null;
        List<IContainerDataService.a> list3 = this.e;
        if (list3 != null) {
            list3.clear();
        }
        this.e = null;
        List<IContainerDataService.b> list4 = this.g;
        if (list4 != null) {
            list4.clear();
        }
        this.g = null;
    }

    public final void n(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0ae7d0", new Object[]{this, w1eVar, iContainerDataModel});
            return;
        }
        List<IContainerDataService.a> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((IContainerDataService.a) it.next()).m(w1eVar, iContainerDataModel);
            }
        }
    }

    public final void o(w1e w1eVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae0d816", new Object[]{this, w1eVar, iContainerDataModel});
            return;
        }
        List<IContainerDataService.a> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((IContainerDataService.a) it.next()).l(w1eVar, iContainerDataModel);
            }
        }
    }

    @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
    public void onPrefetch(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
        } else {
            q(str, hashMap);
        }
    }

    public final void p(w1e w1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1e33f2", new Object[]{this, w1eVar});
            return;
        }
        List<IContainerDataService.a> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((IContainerDataService.a) it.next()).j(w1eVar);
            }
        }
    }

    public final void q(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3efc143", new Object[]{this, str, hashMap});
            return;
        }
        List<IContainerDataService.b> list = this.g;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((IContainerDataService.b) it.next()).onPrefetch(str, hashMap);
            }
        }
    }

    public void r(IContainerDataService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52179d30", new Object[]{this, aVar});
            return;
        }
        List<IContainerDataService.a> list = this.e;
        if (list != null) {
            list.remove(aVar);
        }
    }

    public void s(IContainerDataService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c2ae55", new Object[]{this, bVar});
            return;
        }
        List<IContainerDataService.b> list = this.g;
        if (list != null) {
            list.remove(bVar);
        }
    }

    public void t(IContainerDataService.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5feced1f", new Object[]{this, eVar});
            return;
        }
        List<IContainerDataService.e> list = this.d;
        if (list != null) {
            list.remove(eVar);
        }
    }

    public void u(IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f18fdc", new Object[]{this, cVar});
            return;
        }
        List<IContainerDataService.c> list = this.c;
        if (list != null) {
            list.remove(cVar);
        }
    }
}
