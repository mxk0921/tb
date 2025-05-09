package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class xt1 extends cz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(916455577);
    }

    public static /* synthetic */ Object ipc$super(xt1 xt1Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            throw null;
        } else if (hashCode != 1300596012) {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/turbo/service/pop/BaseDialogPop");
        } else {
            qpu qpuVar = (qpu) objArr[0];
            cgm cgmVar = (cgm) objArr[1];
            d1a d1aVar = (d1a) objArr[2];
            throw null;
        }
    }

    public static final /* synthetic */ pcm j(xt1 xt1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pcm) ipChange.ipc$dispatch("cc06c8c4", new Object[]{xt1Var});
        }
        throw null;
    }
}
