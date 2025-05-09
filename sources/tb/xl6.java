package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xl6 extends dm6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float b;

    static {
        t2o.a(444598008);
    }

    public xl6(float f) {
        this.b = f;
        this.f17914a = (short) 17;
    }

    public static /* synthetic */ Object ipc$super(xl6 xl6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dxv4common/model/variable/result/DXVariableFloatResult");
    }

    @Override // tb.dm6
    public dm6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dm6) ipChange.ipc$dispatch("ca2a3f3c", new Object[]{this});
        }
        return new xl6(this.b);
    }

    @Override // tb.dm6
    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47eea762", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    @Override // tb.dm6
    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d63f592", new Object[]{this, obj});
        } else if (obj != null) {
            this.b = Float.parseFloat(obj.toString());
        }
    }
}
