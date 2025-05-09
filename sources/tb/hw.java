package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class hw extends nv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809439);
    }

    public hw(fdc fdcVar) {
        super(fdcVar);
    }

    public static /* synthetic */ Object ipc$super(hw hwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/AbsMultiTabController");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b13f965", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
