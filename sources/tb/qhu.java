package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.triver.pha_engine.megabridge.middleware.ITriverMtopMiddle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qhu implements pdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.pdb
    public ExecuteResult invoke(String str, String str2, kdb kdbVar, Map<String, ?> map, s2d s2dVar, ndb ndbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("589945a3", new Object[]{this, str, str2, kdbVar, map, s2dVar, ndbVar});
        }
        try {
            if (RVProxy.get((Class<Object>) ITriverMtopMiddle.class, true) == null) {
                return ndbVar.a(str, str2, kdbVar, map, s2dVar);
            }
            return ((ITriverMtopMiddle) RVProxy.get(ITriverMtopMiddle.class)).invoke(str, str2, kdbVar, map, s2dVar, ndbVar);
        } catch (Throwable th) {
            RVLogger.e("TriverMtopConfigMiddleware", th);
            return ndbVar.a(str, str2, kdbVar, map, s2dVar);
        }
    }
}
