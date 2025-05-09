package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j16 extends yl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597991);
    }

    public j16() {
    }

    public static /* synthetic */ Object ipc$super(j16 j16Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/DXIntVariable");
    }

    @Override // tb.yl6
    public yl6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("4570ddbd", new Object[]{this});
        }
        j16 j16Var = new j16();
        a(j16Var);
        return j16Var;
    }

    public j16(int i) {
        p((short) 1);
        this.f32163a = new zl6(i);
    }
}
