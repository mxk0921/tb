package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.topmultitab.service.data.HomeDataServiceImpl;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dzh extends r00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18174a;
    public final czh b;
    public final zyh c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ imn f18175a;
        public final /* synthetic */ JSONObject b;

        public a(imn imnVar, JSONObject jSONObject) {
            this.f18175a = imnVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
            if (iHomeDataService instanceof HomeDataServiceImpl) {
                ((HomeDataServiceImpl) iHomeDataService).notifyUiRefreshStart(this.f18175a, this.b, dzh.i(dzh.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ imn f18176a;
        public final /* synthetic */ JSONObject b;

        public b(imn imnVar, JSONObject jSONObject) {
            this.f18176a = imnVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
            if (iHomeDataService instanceof HomeDataServiceImpl) {
                ((HomeDataServiceImpl) iHomeDataService).notifyUiRefreshFinish(this.f18176a, this.b, dzh.i(dzh.this));
            }
        }
    }

    static {
        t2o.a(729809830);
    }

    public dzh(String str) {
        this.f18174a = str;
        this.b = new czh(str);
        this.c = new zyh(str);
    }

    public static /* synthetic */ String i(dzh dzhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbc046a3", new Object[]{dzhVar});
        }
        return dzhVar.f18174a;
    }

    public static /* synthetic */ Object ipc$super(dzh dzhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/newface/maincontainer/MainContainerProcessProvider");
    }

    @Override // tb.uqb
    public void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ff08b9", new Object[]{this, jSONObject, str, str2});
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService instanceof HomeDataServiceImpl) {
            ((HomeDataServiceImpl) iHomeDataService).notifyRequestFailure(jSONObject, str, str2);
        }
    }

    @Override // tb.uqb
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac267cd", new Object[]{this, jSONObject});
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService instanceof HomeDataServiceImpl) {
            ((HomeDataServiceImpl) iHomeDataService).notifyRequestStart(jSONObject);
        }
    }

    @Override // tb.uqb
    public AwesomeGetContainerParams c(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("d30472a6", new Object[]{this, imnVar, jSONObject});
        }
        return this.b.d(imnVar, jSONObject);
    }

    @Override // tb.uqb
    public void d(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11889302", new Object[]{this, imnVar, jSONObject});
        } else {
            m5a.a().i(new b(imnVar, jSONObject));
        }
    }

    @Override // tb.uqb
    public boolean downloadTemplate(List<SectionModel> list, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19d8702a", new Object[]{this, list, bVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.r00, tb.uqb
    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d17cd72", new Object[]{this, jSONObject});
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService instanceof HomeDataServiceImpl) {
            ((HomeDataServiceImpl) iHomeDataService).notifyDataProcessStart(jSONObject, this.f18174a);
        }
    }

    @Override // tb.uqb
    public void f(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2228dc8", new Object[]{this, jSONObject, awesomeGetContainerData});
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService instanceof HomeDataServiceImpl) {
            ((HomeDataServiceImpl) iHomeDataService).notifyRequestSuccess(jSONObject, awesomeGetContainerData);
        }
    }

    @Override // tb.uqb
    public void g(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f853cf", new Object[]{this, imnVar, jSONObject});
            return;
        }
        this.c.f(imnVar, jSONObject);
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService instanceof HomeDataServiceImpl) {
            ((HomeDataServiceImpl) iHomeDataService).notifyDataProcessFinish(jSONObject, imnVar.u(this.f18174a), this.f18174a);
        }
    }

    @Override // tb.r00, tb.uqb
    public void h(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d97629b", new Object[]{this, imnVar, jSONObject});
        } else {
            m5a.a().i(new a(imnVar, jSONObject));
        }
    }
}
