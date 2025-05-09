package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jd6 extends yl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597998);
    }

    public jd6() {
    }

    public static /* synthetic */ Object ipc$super(jd6 jd6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/DXStringVariable");
    }

    /* renamed from: q */
    public jd6 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jd6) ipChange.ipc$dispatch("ca45ceba", new Object[]{this});
        }
        jd6 jd6Var = new jd6();
        a(jd6Var);
        return jd6Var;
    }

    public jd6(String str) {
        p((short) 4);
        this.f32163a = new bm6(str, (short) 4);
    }
}
