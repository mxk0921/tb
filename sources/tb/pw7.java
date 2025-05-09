package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pw7 extends lh3<uw7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151180);
    }

    public pw7(lh3 lh3Var) {
        super(lh3Var);
    }

    public static /* synthetic */ Object ipc$super(pw7 pw7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/operate/chain/mix/DragMixItemSwapHandler");
    }

    /* renamed from: c */
    public boolean b(uw7 uw7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f91afe02", new Object[]{this, uw7Var})).booleanValue();
        }
        IDMComponent a2 = uw7Var.a();
        if (!kw7.x(a2)) {
            return a(uw7Var);
        }
        int b = uw7Var.b();
        int c = uw7Var.c();
        List<IDMComponent> e = uw7Var.e();
        IDMComponent d = uw7Var.d();
        IDMComponent i = kw7.i(e, b, c);
        if (i == null || !kw7.z(d, i)) {
            return true;
        }
        if (!kw7.A(d)) {
            return d(uw7Var);
        }
        if (kw7.z(a2, d)) {
            return d(uw7Var);
        }
        return false;
    }

    public final boolean d(uw7 uw7Var) {
        IDMComponent i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b348c6ce", new Object[]{this, uw7Var})).booleanValue();
        }
        int b = uw7Var.b();
        int c = uw7Var.c();
        List<IDMComponent> e = uw7Var.e();
        IDMComponent d = uw7Var.d();
        if (kw7.s(d) && (i = kw7.i(e, b, c)) != null && kw7.w(d, i)) {
            return false;
        }
        return true;
    }
}
