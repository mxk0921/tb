package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ck9 extends sw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bk9 n = bk9.mDefaultAdjuster;

    static {
        t2o.a(156237986);
    }

    public static /* synthetic */ Object ipc$super(ck9 ck9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/FixAreaLayoutHelper");
    }

    public void f0(bk9 bk9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c44a82c", new Object[]{this, bk9Var});
        } else {
            this.n = bk9Var;
        }
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a143a0", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
