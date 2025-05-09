package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k16 extends yl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597992);
    }

    public k16() {
    }

    public static /* synthetic */ Object ipc$super(k16 k16Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/DXIntWrapVariable");
    }

    @Override // tb.yl6
    public yl6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("4570ddbd", new Object[]{this});
        }
        k16 k16Var = new k16();
        a(k16Var);
        return k16Var;
    }

    public k16(Integer num) {
        p((short) 11);
        this.f32163a = new bm6(num, (short) 11);
    }
}
