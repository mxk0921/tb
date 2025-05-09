package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class jc3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199570);
    }

    public static void a(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2db12d5", new Object[]{context, new Long(j)});
            return;
        }
        z9v u = z9v.u(context);
        UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("apmClientNetwork");
        ultronPerformanceStageModel.setStartMills(j);
        ultronPerformanceStageModel.setEndMills(System.currentTimeMillis());
        ultronPerformanceStageModel.setFreeStage(true);
        u.h(ultronPerformanceStageModel, null, false);
        u.D("apmClientAfterNetworkLogicProcess", null);
        u.e("isLoadFromCache", "true");
        UltronPerformanceStageModel ultronPerformanceStageModel2 = new UltronPerformanceStageModel("apmClientUltronProcess");
        ultronPerformanceStageModel2.setStartMills(0L);
        ultronPerformanceStageModel2.setEndMills(0L);
        ultronPerformanceStageModel2.setFreeStage(true);
        u.h(ultronPerformanceStageModel2, "apmClientAfterNetworkLogicProcess", false);
        UltronPerformanceStageModel ultronPerformanceStageModel3 = new UltronPerformanceStageModel("apmBizServerProcess");
        ultronPerformanceStageModel3.setStartMills(0L);
        ultronPerformanceStageModel3.setEndMills(0L);
        ultronPerformanceStageModel3.setFreeStage(true);
        u.h(ultronPerformanceStageModel3, "apmClientNetwork", false);
    }
}
