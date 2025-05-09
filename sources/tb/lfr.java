package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class lfr extends jfr<xfr> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(804257794);
    }

    public static /* synthetic */ Object ipc$super(lfr lfrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/TBIDefaultContext");
    }

    @Override // tb.jfr
    public kfr<xfr> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kfr) ipChange.ipc$dispatch("aa2b961b", new Object[]{this});
        }
        return new mfr();
    }
}
