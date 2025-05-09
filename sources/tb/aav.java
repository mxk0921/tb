package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.performence.model.UltronPerformanceFlowModel;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class aav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Comparator<UltronPerformanceStageModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(UltronPerformanceStageModel ultronPerformanceStageModel, UltronPerformanceStageModel ultronPerformanceStageModel2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2e488c3f", new Object[]{this, ultronPerformanceStageModel, ultronPerformanceStageModel2})).intValue();
            }
            return Long.compare(ultronPerformanceStageModel.getStartMills(), ultronPerformanceStageModel2.getStartMills());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Comparator<UltronPerformanceStageModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(UltronPerformanceStageModel ultronPerformanceStageModel, UltronPerformanceStageModel ultronPerformanceStageModel2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2e488c3f", new Object[]{this, ultronPerformanceStageModel, ultronPerformanceStageModel2})).intValue();
            }
            return Long.compare(ultronPerformanceStageModel.getStartMills(), ultronPerformanceStageModel2.getStartMills());
        }
    }

    static {
        t2o.a(83886265);
    }

    @Deprecated
    public static void a(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba458d2", new Object[]{ultronPerformanceFlowModel});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ultronPerformanceFlowModel.mFlowCode);
        sb.append("\n总耗时：");
        sb.append(ultronPerformanceFlowModel.mDurationMills);
        sb.append(" => [");
        sb.append(ultronPerformanceFlowModel.getStartMills());
        sb.append(",");
        sb.append(ultronPerformanceFlowModel.getEndMills());
        sb.append("]\n");
        List<UltronPerformanceStageModel> childStages = ultronPerformanceFlowModel.getChildStages();
        if (childStages != null) {
            Collections.sort(childStages, new b());
            int e = e(childStages);
            for (UltronPerformanceStageModel ultronPerformanceStageModel : childStages) {
                b(sb, ultronPerformanceStageModel, e, 1);
            }
        }
    }

    public static String d(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c74abb0e", new Object[]{new Integer(i), str});
        }
        int length = str.length();
        if (length == i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i2 = 0; i2 < i - length; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static int e(List<UltronPerformanceStageModel> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("683b2d31", new Object[]{list})).intValue();
        }
        for (UltronPerformanceStageModel ultronPerformanceStageModel : list) {
            i = Math.max(ultronPerformanceStageModel.getStageCode().length(), i);
        }
        return i;
    }

    public static String f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dc38fdd", new Object[]{new Integer(i)});
        }
        if (1 == i) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < (i - 1) * 3; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void b(StringBuilder sb, UltronPerformanceStageModel ultronPerformanceStageModel, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df30843", new Object[]{sb, ultronPerformanceStageModel, new Integer(i), new Integer(i2)});
            return;
        }
        sb.append(f(i2));
        sb.append("|");
        sb.append(d(i, ultronPerformanceStageModel.getStageCode()));
        sb.append(" => ");
        sb.append("[");
        sb.append(ultronPerformanceStageModel.getStartMills());
        sb.append(",");
        sb.append(ultronPerformanceStageModel.getEndMills());
        sb.append("],耗时：");
        sb.append(ultronPerformanceStageModel.getDurationMills());
        sb.append("\n");
        List<UltronPerformanceStageModel> childStages = ultronPerformanceStageModel.getChildStages();
        if (!(childStages == null || childStages.isEmpty())) {
            int e = e(childStages);
            int i3 = i2 + 1;
            for (UltronPerformanceStageModel ultronPerformanceStageModel2 : childStages) {
                b(sb, ultronPerformanceStageModel2, e, i3);
            }
        }
    }

    public static boolean c(UltronPerformanceFlowModel ultronPerformanceFlowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcbd7554", new Object[]{ultronPerformanceFlowModel})).booleanValue();
        }
        String str = ultronPerformanceFlowModel.mBizCode;
        boolean a2 = vav.a(str, "enablePerformanceInvalidGapCheck", false);
        List<UltronPerformanceStageModel> childStages = ultronPerformanceFlowModel.getChildStages();
        if (childStages == null || childStages.isEmpty()) {
            return !a2;
        }
        Collections.sort(childStages, new a());
        long startMills = ultronPerformanceFlowModel.getStartMills();
        long j = 0;
        for (UltronPerformanceStageModel ultronPerformanceStageModel : childStages) {
            if (!ultronPerformanceStageModel.isFreeStage()) {
                long abs = Math.abs(ultronPerformanceStageModel.getStartMills() - startMills);
                int e = vav.e(str, "ultronPerformanceInvalidGapMills", 10);
                if (abs >= e) {
                    hav.i("性能数据分析", "性能数据异常：阶段【" + ultronPerformanceStageModel.getStageCode() + "】和上一个阶段的结束时间相差:" + abs + ",超过" + e + "ms");
                    return !a2;
                }
                startMills = ultronPerformanceStageModel.getEndMills();
                j += ultronPerformanceStageModel.getDurationMills();
            }
        }
        return Math.abs(j - ultronPerformanceFlowModel.mDurationMills) <= ((long) vav.e(str, "tolerableDeltaDurationOfPerformance", 100));
    }
}
