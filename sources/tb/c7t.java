package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c7t extends j2n<n74> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699202);
    }

    public static /* synthetic */ Object ipc$super(c7t c7tVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/events/TaoLiveToastSubscriber");
    }

    /* renamed from: B */
    public n74 A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n74) ipChange.ipc$dispatch("4ad615e5", new Object[]{this});
        }
        return new n74();
    }
}
