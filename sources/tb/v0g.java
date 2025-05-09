package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class v0g extends q0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public g1a<? super w0g, xhv> b;

    static {
        t2o.a(1002438926);
    }

    public static /* synthetic */ Object ipc$super(v0g v0gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSPowerMsgSendMessageExtParams");
    }

    public final g1a<w0g, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("bb2d9d19", new Object[]{this});
        }
        return this.b;
    }

    public final void d(g1a<? super w0g, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a971b5", new Object[]{this, g1aVar});
        } else {
            this.b = g1aVar;
        }
    }
}
