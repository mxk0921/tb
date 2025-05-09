package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.TBOrderListFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class orr implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TBOrderListFragment f25602a;

    public orr(TBOrderListFragment tBOrderListFragment) {
        this.f25602a = tBOrderListFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            bel.b();
        } catch (Throwable th) {
            hav.d("OrderList", "processRecPreRequest: " + th.toString());
        }
    }
}
