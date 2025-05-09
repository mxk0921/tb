package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k6t extends j2n<o5l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699201);
    }

    public static /* synthetic */ Object ipc$super(k6t k6tVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/events/TaoLiveOpenUrlSubscriber");
    }

    /* renamed from: B */
    public o5l A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o5l) ipChange.ipc$dispatch("c1c7017c", new Object[]{this});
        }
        return new o5l();
    }
}
