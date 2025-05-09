package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class tes extends x8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(851443748);
    }

    public tes(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
    }

    public static /* synthetic */ Object ipc$super(tes tesVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/weex/solution/TMSWeexDowngradeToWebExtension");
    }

    @Override // tb.j0c
    public boolean j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("928969df", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
