package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.information.ai.api.IInformationFlowAiApi;
import tb.awe;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bwe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IInformationFlowAiApi f16680a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements awe.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public awe.d f16681a;
        public final bwe b;

        static {
            t2o.a(327155720);
            t2o.a(327155717);
        }

        public b(awe.d dVar, bwe bweVar) {
            this.f16681a = dVar;
            this.b = bweVar;
        }

        @Override // tb.awe.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            fve.e("InfromationAI", "远程化加载失败，errorMsg ： " + str);
            bwe.b();
            bwe.c(str);
            awe.d dVar = this.f16681a;
            if (dVar != null) {
                dVar.a(str);
            }
            this.f16681a = null;
        }

        @Override // tb.awe.d
        public void b(IInformationFlowAiApi iInformationFlowAiApi) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63969fbb", new Object[]{this, iInformationFlowAiApi});
                return;
            }
            fve.e("InfromationAI", "远程化加载成功");
            bwe.a(this.b, iInformationFlowAiApi);
            awe.d dVar = this.f16681a;
            if (dVar != null) {
                dVar.b(iInformationFlowAiApi);
            }
            this.f16681a = null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final bwe f16682a = new bwe();

        static {
            t2o.a(327155721);
        }

        public static /* synthetic */ bwe a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bwe) ipChange.ipc$dispatch("6408743d", new Object[0]);
            }
            return f16682a;
        }
    }

    static {
        t2o.a(327155718);
    }

    public static /* synthetic */ IInformationFlowAiApi a(bwe bweVar, IInformationFlowAiApi iInformationFlowAiApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInformationFlowAiApi) ipChange.ipc$dispatch("d7bcb762", new Object[]{bweVar, iInformationFlowAiApi});
        }
        bweVar.f16680a = iInformationFlowAiApi;
        return iInformationFlowAiApi;
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            g();
        }
    }

    public static /* synthetic */ void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bc1585", new Object[]{str});
        } else {
            d(str);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd9de74", new Object[]{str});
        } else {
            AppMonitor.Stat.commit("InfromationAI", "infromationai_remote_bundle", DimensionValueSet.create().setValue("stat", "loading").setValue("success", "false").setValue("errorCode", "-1").setValue("errorMsg", str), MeasureValueSet.create().setValue("cost", vu3.b.GEO_NOT_SUPPORT));
        }
    }

    public static bwe f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwe) ipChange.ipc$dispatch("1794c0a3", new Object[0]);
        }
        return c.a();
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af50a3e", new Object[0]);
            return;
        }
        AppMonitor.register("InfromationAI", "infromationai_remote_bundle", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
    }

    public synchronized void e(awe.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b8c2d3", new Object[]{this, dVar});
            return;
        }
        fve.e("InfromationAI", "create ");
        new awe(new b(dVar, this)).g();
    }

    public bwe() {
    }
}
