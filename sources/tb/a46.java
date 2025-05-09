package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a46 extends yl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597996);
    }

    public a46() {
    }

    public static /* synthetic */ Object ipc$super(a46 a46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/DXMapVariable");
    }

    @Override // tb.yl6
    public yl6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("4570ddbd", new Object[]{this});
        }
        a46 a46Var = new a46();
        a(a46Var);
        return a46Var;
    }

    public a46(Map<String, Object> map) {
        p((short) 9);
        this.f32163a = new bm6(map, (short) 9);
    }
}
