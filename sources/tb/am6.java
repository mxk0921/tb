package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class am6 extends dm6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long b;

    static {
        t2o.a(444598010);
    }

    public am6(long j) {
        this.b = j;
        this.f17914a = (short) 2;
    }

    public static /* synthetic */ Object ipc$super(am6 am6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/result/DXVariableLongResult");
    }

    @Override // tb.dm6
    public dm6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dm6) ipChange.ipc$dispatch("ca2a3f3c", new Object[]{this});
        }
        return new am6(this.b);
    }

    @Override // tb.dm6
    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, obj});
        } else if (obj != null) {
            this.b = Long.parseLong(obj.toString());
        }
    }
}
