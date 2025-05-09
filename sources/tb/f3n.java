package tb;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f3n extends u2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103781);
    }

    public static /* synthetic */ Object ipc$super(f3n f3nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/titlebar/action/PubLoadingMoreAction");
    }

    @Override // tb.btc
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470eead7", new Object[]{this});
        }
    }

    @Override // tb.a90
    public View l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ed25ea8", new Object[]{this, context});
        }
        ckf.g(context, "context");
        u(context);
        if (s() == null) {
            View inflate = View.inflate(context, R.layout.tms_tb_more_view, null);
            if (inflate != null) {
                TBActionView tBActionView = (TBActionView) inflate;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xcs.a(context, 45.0f), xcs.a(context, 48.0f));
                layoutParams.gravity = 17;
                tBActionView.setLayoutParams(layoutParams);
                v(tBActionView);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.actionbar.TBActionView");
            }
        }
        return s();
    }
}
