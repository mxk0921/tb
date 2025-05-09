package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class s07 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_EVENT_PARAM = "defaultEventParamEventModel";

    static {
        t2o.a(614465543);
    }

    public static /* synthetic */ Object ipc$super(s07 s07Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/DefaultEventV2Subscriber");
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
        } else if (b8vVar != null) {
            String h = b8vVar.h();
            if (!sj8.g(b8vVar, h)) {
                uj8.a("DefaultEventV2Subscriber", uj8.ERROR_CODE_EVENT_CHAIN_NOT_FOUND, "not found eventchain = " + h);
            }
        }
    }
}
