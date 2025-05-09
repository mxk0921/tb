package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ln extends lnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int t;
    public final boolean u;

    static {
        t2o.a(80740618);
    }

    public ln(boolean z) {
        super(z);
        this.u = z;
    }

    public static /* synthetic */ Object ipc$super(ln lnVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1183401753) {
            super.l0(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -436477098) {
            lnVar.m0(((Boolean) objArr[0]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AURAStickyLayoutHelper");
        }
    }

    @Override // tb.lnq
    public void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b976b8e7", new Object[]{this, new Integer(i)});
            return;
        }
        this.t = i;
        super.l0(i);
    }

    public int n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
        }
        return this.t;
    }

    public boolean o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d08bd7a", new Object[]{this})).booleanValue();
        }
        return this.u;
    }
}
