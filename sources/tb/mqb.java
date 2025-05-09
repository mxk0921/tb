package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import tb.bbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface mqb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(835715075);
        }

        public static /* synthetic */ bbs a(mqb mqbVar, String str, JSONObject jSONObject, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bbs) ipChange.ipc$dispatch("e9327780", new Object[]{mqbVar, str, jSONObject, new Integer(i), obj});
            }
            if (obj == null) {
                if ((i & 2) != 0) {
                    jSONObject = null;
                }
                return mqbVar.b(str, jSONObject);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }

        public static /* synthetic */ void b(mqb mqbVar, TMSSolutionType tMSSolutionType, bbs.d dVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14f1b5c0", new Object[]{mqbVar, tMSSolutionType, dVar, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 1) != 0) {
                    tMSSolutionType = null;
                }
                if ((i & 2) != 0) {
                    dVar = null;
                }
                mqbVar.a(tMSSolutionType, dVar);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
            }
        }
    }

    void a(TMSSolutionType tMSSolutionType, bbs.d dVar);

    bbs b(String str, JSONObject jSONObject);

    TMSContainerType getContainerType();
}
