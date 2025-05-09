package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface tpd extends sod {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601336);
        }

        public static /* synthetic */ void a(tpd tpdVar, JSONObject jSONObject, gli gliVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f1a50c0", new Object[]{tpdVar, jSONObject, gliVar, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    gliVar = null;
                }
                tpdVar.p1(jSONObject, gliVar);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: share");
            }
        }
    }

    void p1(JSONObject jSONObject, gli gliVar);
}
