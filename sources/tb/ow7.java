package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ow7 extends lh3<uw7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151179);
    }

    public ow7(lh3 lh3Var) {
        super(lh3Var);
    }

    public static /* synthetic */ Object ipc$super(ow7 ow7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/operate/chain/mix/DragMixHeaderSwapHandler");
    }

    /* renamed from: c */
    public boolean b(uw7 uw7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f91afe02", new Object[]{this, uw7Var})).booleanValue();
        }
        if (!kw7.q(uw7Var.a())) {
            return a(uw7Var);
        }
        IDMComponent d = uw7Var.d();
        IDMComponent i = kw7.i(uw7Var.e(), uw7Var.b(), uw7Var.c());
        if (i == null || !TextUtils.equals(kw7.f(d), kw7.f(i))) {
            return true;
        }
        return a(uw7Var);
    }
}
