package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.detail2.core.framework.view.feeds.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y3w extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322115);
    }

    public y3w(dh7 dh7Var, cxj cxjVar, VerticalAbsViewHolder verticalAbsViewHolder) {
        super(dh7Var, cxjVar, verticalAbsViewHolder);
    }

    public static /* synthetic */ Object ipc$super(y3w y3wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/nonfullscreenbiz/VerticalNonFullScreenHandler");
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cb8d091", new Object[]{this})).floatValue();
        }
        return z3w.b(this.b);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d08ba44", new Object[]{this})).floatValue();
        }
        return z3w.c(this.b);
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c92b244c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public boolean i(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8fbce50", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.view.feeds.b
    public void q(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97404b28", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
    }
}
