package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ai.api.IAfterBuyAiApi;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.Map;
import tb.cmn;
import tb.eh0;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final eh0 f19984a;
    public IAfterBuyAiApi b;
    public final eh0.d c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements eh0.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.eh0.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            fve.e("AfterBuyAi", "远程化加载失败，errorMsg ： " + str);
            gh0.b(gh0.this);
            gh0.c(gh0.this, str);
        }

        @Override // tb.eh0.d
        public void b(IAfterBuyAiApi iAfterBuyAiApi) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94b70fd2", new Object[]{this, iAfterBuyAiApi});
                return;
            }
            fve.e("AfterBuyAi", "远程化加载成功");
            gh0.a(gh0.this, iAfterBuyAiApi);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final gh0 f19986a = new gh0(null);

        static {
            t2o.a(727711753);
        }

        public static /* synthetic */ gh0 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gh0) ipChange.ipc$dispatch("af3ffa1c", new Object[0]);
            }
            return f19986a;
        }
    }

    static {
        t2o.a(727711751);
    }

    public /* synthetic */ gh0(a aVar) {
        this();
    }

    public static /* synthetic */ IAfterBuyAiApi a(gh0 gh0Var, IAfterBuyAiApi iAfterBuyAiApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAfterBuyAiApi) ipChange.ipc$dispatch("b1a657bd", new Object[]{gh0Var, iAfterBuyAiApi});
        }
        gh0Var.b = iAfterBuyAiApi;
        return iAfterBuyAiApi;
    }

    public static /* synthetic */ void b(gh0 gh0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11229b3a", new Object[]{gh0Var});
        } else {
            gh0Var.o();
        }
    }

    public static /* synthetic */ void c(gh0 gh0Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b60b2a3", new Object[]{gh0Var, str});
        } else {
            gh0Var.i(str);
        }
    }

    public static gh0 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gh0) ipChange.ipc$dispatch("8a6d2e76", new Object[0]);
        }
        return b.a();
    }

    public void d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dcb3d8", new Object[]{this, str, map});
            return;
        }
        fve.e("AfterBuyAi", "addAISolutionBizParam ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.addAISolutionBizParam(str, map);
        }
    }

    public void e(String str, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42a889a", new Object[]{this, str, recyclerView});
            return;
        }
        fve.e("AfterBuyAi", "aiRefreshInsert ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.aiRefreshInsert(str, recyclerView);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793eadf1", new Object[]{this});
            return;
        }
        fve.e("AfterBuyAi", "checkConfig ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.checkConfig();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d56632", new Object[]{this});
            return;
        }
        fve.e("AfterBuyAi", "clearBufferList ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.clearBufferList();
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46d5edd", new Object[]{this, str});
            return;
        }
        fve.e("AfterBuyAi", "clearMemoryBufferList ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.clearMemoryBufferList(str);
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd9de74", new Object[]{this, str});
        } else {
            AppMonitor.Stat.commit("AfterBuyAi", "afterbuyai_remote_bundle", DimensionValueSet.create().setValue("stat", "loading").setValue("success", "false").setValue("errorCode", "-1").setValue("errorMsg", str), MeasureValueSet.create().setValue("cost", vu3.b.GEO_NOT_SUPPORT));
        }
    }

    public void k(com.taobao.tao.recommend4.manager.a aVar, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8577af", new Object[]{this, aVar, imnVar});
            return;
        }
        fve.e("AfterBuyAi", "init ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.init(aVar, imnVar);
        } else {
            this.f19984a.g(Globals.getApplication());
        }
    }

    public void l(boolean z, String str, cmn.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fba7cfb", new Object[]{this, new Boolean(z), str, cVar});
            return;
        }
        fve.e("AfterBuyAi", "initDiskBufferListToMemory ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.initDiskBufferListToMemory(z, str, cVar);
        }
    }

    public void m(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75030d6d", new Object[]{this, str, awesomeGetContainerData});
            return;
        }
        fve.e("AfterBuyAi", "preloadModel ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.preloadModel(str, awesomeGetContainerData);
        } else {
            this.f19984a.g(Globals.getApplication());
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2738fa0", new Object[]{this});
            return;
        }
        fve.e("AfterBuyAi", "registerBehavirSolution ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.registerBehavirSolution();
        } else {
            this.f19984a.g(Globals.getApplication());
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af50a3e", new Object[]{this});
        } else {
            AppMonitor.register("AfterBuyAi", "afterbuyai_remote_bundle", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5aa7aef", new Object[]{this, str});
            return;
        }
        fve.e("AfterBuyAi", "resetAiRefreshDeltaData ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.resetAiRefreshDeltaData(str);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a61147", new Object[]{this});
            return;
        }
        fve.e("AfterBuyAi", "unRegisterBehavirSolution ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.unRegisterBehavirSolution();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7207ee3f", new Object[]{this});
            return;
        }
        fve.e("AfterBuyAi", "updateContainer ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.updateContainer();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62f1899", new Object[]{this});
            return;
        }
        fve.e("AfterBuyAi", "updateContainerType ");
        IAfterBuyAiApi iAfterBuyAiApi = this.b;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.updateContainerType();
        }
    }

    public gh0() {
        eh0 eh0Var = new eh0(new a());
        this.f19984a = eh0Var;
        eh0Var.g(Globals.getApplication());
    }
}
