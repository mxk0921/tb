package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tu5 extends yl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c;

    static {
        t2o.a(444597985);
    }

    public tu5() {
    }

    public static /* synthetic */ Object ipc$super(tu5 tu5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/DXDynamicVariable");
    }

    @Override // tb.yl6
    public yl6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("4570ddbd", new Object[]{this});
        }
        tu5 tu5Var = new tu5();
        tu5Var.c = this.c;
        a(tu5Var);
        return tu5Var;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aee05ddc", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public tu5(int i, short s) {
        this.c = i;
        p(s);
        n((byte) 2);
    }
}
