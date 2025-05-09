package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.ultron.performence.model.UltronPerformanceFlowModel;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import com.taobao.falco.m;
import java.util.List;
import tb.bav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class lc3 extends bav.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f23247a;
        public final /* synthetic */ long b;

        public a(lc3 lc3Var, long j, long j2) {
            this.f23247a = j;
            this.b = j2;
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (mVar == null) {
                hav.d(c9x.CART_BIZ_NAME, "reportToRUM, span is null");
            } else {
                try {
                    mVar.u0(Long.valueOf(this.f23247a));
                    mVar.h(Long.valueOf(this.b));
                    hav.d("CartPerformanceUploadInterceptor", "reportToRum:" + this.f23247a + "," + this.b);
                } catch (Throwable th) {
                    hav.g(c9x.CART_BIZ_NAME, "falco exception:", th.getMessage());
                }
            }
        }
    }

    static {
        t2o.a(478150829);
    }

    public static boolean d(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3ac455e", new Object[]{ultronPerformanceFlowModel})).booleanValue();
        }
        return Boolean.parseBoolean(ultronPerformanceFlowModel.getCommonArg("isColdStart"));
    }

    public static /* synthetic */ Object ipc$super(lc3 lc3Var, String str, Object... objArr) {
        if (str.hashCode() == -552603597) {
            return new Boolean(super.c((UltronPerformanceFlowModel) objArr[0], (pwl) objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/performance/CartPerformanceUploadInterceptor");
    }

    public final void e(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d97442", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            tz8Var.j(new a(this, j, j2));
        }
    }

    @Override // tb.bav.a
    public boolean c(UltronPerformanceFlowModel ultronPerformanceFlowModel, pwl pwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df0ff033", new Object[]{this, ultronPerformanceFlowModel, pwlVar})).booleanValue();
        }
        if (ultronPerformanceFlowModel.mChildStages == null) {
            return true;
        }
        if (d(ultronPerformanceFlowModel)) {
            for (UltronPerformanceStageModel ultronPerformanceStageModel : ultronPerformanceFlowModel.mChildStages) {
                if ("navStage".equals(ultronPerformanceStageModel.getStageCode()) && ultronPerformanceStageModel.getDurationMills() <= 0) {
                    return true;
                }
            }
        }
        if (scv.b()) {
            pwlVar.sampling(1.0f);
        } else if ("mtop.trade.query.bag".equals(ultronPerformanceFlowModel.mFlowCode)) {
            pwlVar.sampling(0.2f);
        } else {
            pwlVar.sampling(0.01f);
        }
        return super.c(ultronPerformanceFlowModel, pwlVar);
    }

    @Override // tb.bav.a
    public boolean a(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        List<UltronPerformanceStageModel> childStages;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce8d4acc", new Object[]{this, ultronPerformanceFlowModel})).booleanValue();
        }
        if (d(ultronPerformanceFlowModel) || vav.b(c9x.CART_BIZ_NAME, "forceReportToRum", false, true)) {
            e(ultronPerformanceFlowModel.getStartMills(), ultronPerformanceFlowModel.getEndMills());
        }
        return ultronPerformanceFlowModel.mDurationMills >= ((long) vav.e(c9x.CART_BIZ_NAME, "maxDurationOfUploadPerformance", 20000)) || (childStages = ultronPerformanceFlowModel.getChildStages()) == null || childStages.isEmpty() || !aav.c(ultronPerformanceFlowModel);
    }
}
