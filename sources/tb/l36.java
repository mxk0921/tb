package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l36 extends yl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597995);
    }

    public l36() {
    }

    public static /* synthetic */ Object ipc$super(l36 l36Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/DXLongWrapVariable");
    }

    @Override // tb.yl6
    public yl6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("4570ddbd", new Object[]{this});
        }
        l36 l36Var = new l36();
        a(l36Var);
        return l36Var;
    }

    public l36(Long l) {
        p((short) 12);
        this.f32163a = new bm6(l, (short) 12);
    }
}
