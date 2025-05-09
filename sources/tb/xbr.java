package tb;

import android.view.LayoutInflater;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xbr extends h10 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View c;

    static {
        t2o.a(713032005);
    }

    public xbr(TBOrderBaseActivity tBOrderBaseActivity) {
        super(tBOrderBaseActivity);
    }

    public static /* synthetic */ Object ipc$super(xbr xbrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/holder/impl/TBErrorHolder");
    }

    @Override // tb.h10
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b1e6b000", new Object[]{this});
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.layout_order_error_view, this.f20355a, true);
        this.c = inflate;
        return inflate;
    }
}
