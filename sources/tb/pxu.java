package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740762);
    }

    @Deprecated
    public static Map<String, Object> a(txu txuVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d28eddba", new Object[]{txuVar, aURARenderComponent});
        }
        if (txuVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(hn.KEY_USER_CONTEXT_RENDER_COMPONENT, aURARenderComponent);
        hashMap.put(hn.KEY_USER_CONTEXT_UMF_RUNTIME_CONTEXT, txuVar);
        return hashMap;
    }
}
