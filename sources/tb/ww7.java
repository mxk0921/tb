package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ww7 extends lh3<uw7> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151178);
    }

    public ww7(lh3 lh3Var) {
        super(lh3Var);
    }

    public static /* synthetic */ Object ipc$super(ww7 ww7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/operate/chain/DragVerifySwapHandler");
    }

    /* renamed from: c */
    public boolean b(uw7 uw7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f91afe02", new Object[]{this, uw7Var})).booleanValue();
        }
        int c = uw7Var.c();
        int b = uw7Var.b();
        List<IDMComponent> e = uw7Var.e();
        if (c >= 0 && c < e.size()) {
            return a(uw7Var);
        }
        UnifyLog.e("DragVerifySwapHandler", "canSwap pos error|fromAdapterPos", String.valueOf(b), "|tryTargetAdapterPos|", String.valueOf(c), "|voList|", String.valueOf(e.size()));
        return false;
    }
}
