package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u0g extends q0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public g1a<? super a1g, xhv> b;

    static {
        t2o.a(1002438925);
    }

    public static /* synthetic */ Object ipc$super(u0g u0gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSPowerMsgRequestTopicUsersExtParams");
    }

    public final g1a<a1g, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("15609e67", new Object[]{this});
        }
        return this.b;
    }

    public final void d(g1a<? super a1g, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a23427", new Object[]{this, g1aVar});
        } else {
            this.b = g1aVar;
        }
    }
}
