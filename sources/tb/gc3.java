package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gc3 extends yb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814124);
    }

    public static /* synthetic */ Object ipc$super(gc3 gc3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/cart/processor/CartNavProcessorNodeComponentFilterItem0");
    }

    @Override // tb.yb4, tb.xb4
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f15c09d0", new Object[]{this, str})).booleanValue();
        }
        return str.equals("com.taobao.android.trade.cart.CartActivity");
    }

    @Override // tb.yb4, tb.xb4
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8cdc9e", new Object[]{this, str})).booleanValue();
        }
        return str.equals("com.taobao.taobao");
    }
}
