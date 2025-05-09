package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lx5 extends yl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597989);
    }

    public lx5() {
        p((short) 17);
    }

    public static /* synthetic */ Object ipc$super(lx5 lx5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/DXFloatVariable");
    }

    @Override // tb.yl6
    public yl6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("4570ddbd", new Object[]{this});
        }
        lx5 lx5Var = new lx5();
        a(lx5Var);
        return lx5Var;
    }

    public lx5(float f) {
        p((short) 17);
        this.f32163a = new xl6(f);
    }
}
