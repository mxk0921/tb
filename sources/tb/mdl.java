package tb;

import android.app.Activity;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.order.bundle.OrderListFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mdl implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrderListFragment f23972a;

    public mdl(OrderListFragment orderListFragment) {
        this.f23972a = orderListFragment;
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        guk.a(this, activity, i, configuration);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        OrderListFragment.r2(this.f23972a);
        OrderListFragment.s2(this.f23972a);
    }
}
