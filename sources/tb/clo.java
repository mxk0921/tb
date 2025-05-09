package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class clo extends ux9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public fgv T;

    static {
        t2o.a(806356061);
    }

    public static /* synthetic */ Object ipc$super(clo cloVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/core/SDKFrameContext");
    }

    public fgv t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fgv) ipChange.ipc$dispatch("907f4e9c", new Object[]{this});
        }
        return this.T;
    }

    public void u0(fgv fgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd862862", new Object[]{this, fgvVar});
        } else {
            this.T = fgvVar;
        }
    }
}
