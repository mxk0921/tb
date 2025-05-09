package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gy8 extends x7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Integer e;
    public final String f;

    static {
        t2o.a(481297338);
    }

    public gy8(String str, Integer num, String str2) {
        super(str, -1);
        this.e = num;
        this.f = str2;
    }

    public static /* synthetic */ Object ipc$super(gy8 gy8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/event/FailureEvent");
    }

    public final Integer g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a5caf00d", new Object[]{this});
        }
        return this.e;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.f;
    }
}
