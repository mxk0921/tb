package tb;

import android.view.LayoutInflater;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class drr extends h10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View c;

    static {
        t2o.a(713032006);
    }

    public drr(TBOrderBaseActivity tBOrderBaseActivity) {
        super(tBOrderBaseActivity);
    }

    public static /* synthetic */ Object ipc$super(drr drrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/holder/impl/TBOdSkeletonHolder");
    }

    @Override // tb.h10
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b1e6b000", new Object[]{this});
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.layout_order_detail_skeleton, this.f20355a, true);
        this.c = inflate;
        return inflate;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("929499c4", new Object[]{this});
        }
        return this.c;
    }
}
