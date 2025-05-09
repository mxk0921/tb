package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b8 extends c8<a8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean b;

    static {
        t2o.a(336592904);
    }

    public b8(a8 a8Var) {
        super(a8Var);
    }

    public static /* synthetic */ Object ipc$super(b8 b8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/AKAbilityErrorResult");
    }

    @Override // tb.c8
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.c8
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b77c2064", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public b8(a8 a8Var, boolean z) {
        super(a8Var);
        this.b = z;
    }
}
