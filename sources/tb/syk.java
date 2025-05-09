package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.jzk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class syk extends oyk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536519);
    }

    public syk(fyk fykVar) {
        super(fykVar);
    }

    public static /* synthetic */ Object ipc$super(syk sykVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/entity/watch/OpenArchEntityPublicWatch");
    }

    @Override // tb.oyk
    public Map<s2g, mic<kzk>> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("564c3c39", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jzk.a aVar = jzk.Companion;
        linkedHashMap.put(aVar.u(), new m2l());
        linkedHashMap.put(aVar.w(), new o2l());
        linkedHashMap.put(aVar.x(), new p2l());
        linkedHashMap.put(aVar.v(), new n2l());
        linkedHashMap.put(aVar.B(), new q2l());
        linkedHashMap.put(aVar.C(), new r2l());
        return linkedHashMap;
    }
}
