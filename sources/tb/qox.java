package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qox extends esh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792310);
    }

    public static /* synthetic */ Object ipc$super(qox qoxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/rcmd/XslStateView");
    }

    @Override // tb.esh
    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66490a14", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
