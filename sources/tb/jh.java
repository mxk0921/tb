package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740424);
    }

    public static void a(nbb nbbVar, Event event, AURARenderComponent aURARenderComponent, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf179d6", new Object[]{nbbVar, event, aURARenderComponent, map});
            return;
        }
        qi qiVar = new qi();
        qiVar.p(event.getId());
        qiVar.r(map);
        qiVar.t(aURARenderComponent);
        qiVar.n(event.getFields());
        pi.b(nbbVar, event.getType(), qiVar);
    }
}
