package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x4n extends y4n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809608);
    }

    public x4n(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(x4n x4nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/scene/homemainland/invoker/PullDownRefreshInvoker");
    }

    @Override // tb.y4n, tb.hed
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
