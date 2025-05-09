package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vl6 extends dm6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;

    static {
        t2o.a(444598006);
    }

    public vl6(boolean z) {
        this.b = z;
        this.f17914a = (short) 15;
    }

    public static /* synthetic */ Object ipc$super(vl6 vl6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/result/DXVariableBooleanResult");
    }

    @Override // tb.dm6
    public dm6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dm6) ipChange.ipc$dispatch("ca2a3f3c", new Object[]{this});
        }
        return new vl6(this.b);
    }

    @Override // tb.dm6
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49703dfc", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.dm6
    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, obj});
        } else if (obj != null) {
            this.b = Boolean.parseBoolean(obj.toString());
        }
    }
}
