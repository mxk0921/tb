package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class j1l extends l1l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536538);
    }

    public j1l(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(j1l j1lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/observe/biz/OpenArchObservableStateLifeCycle");
    }

    @Override // tb.l1l, tb.i3d
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "LifeCycle";
    }
}
