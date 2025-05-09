package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<TMSSolutionType, Class<? extends TMSBaseSolution>> f16996a = new ConcurrentHashMap();

    static {
        t2o.a(839909941);
    }

    public static TMSBaseSolution a(bbs bbsVar, TMSSolutionType tMSSolutionType) {
        if (tMSSolutionType == null) {
            tMSSolutionType = TMSSolutionType.getType(bbsVar);
        }
        try {
            return (TMSBaseSolution) b(tMSSolutionType).getConstructor(bbs.class).newInstance(bbsVar);
        } catch (Throwable th) {
            TMSLogger.c("TMSSolutionFactory", th.getMessage(), th);
            return null;
        }
    }

    public static Class<? extends TMSBaseSolution> b(TMSSolutionType tMSSolutionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("31a8f4f2", new Object[]{tMSSolutionType});
        }
        if (tMSSolutionType == null) {
            return null;
        }
        return (Class) ((ConcurrentHashMap) f16996a).get(tMSSolutionType);
    }

    public static void c(TMSSolutionType tMSSolutionType, Class<? extends TMSBaseSolution> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a0ae32", new Object[]{tMSSolutionType, cls});
        } else {
            ((ConcurrentHashMap) f16996a).put(tMSSolutionType, cls);
        }
    }
}
