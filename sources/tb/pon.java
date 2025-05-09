package tb;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pon extends stg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView b;

    static {
        t2o.a(713031892);
    }

    public pon(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(pon ponVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/search/ui/holder/itemholder/RecommendShopTipsHolder");
    }

    @Override // tb.uya
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return R.layout.babel_search_recommend_tips_holder;
    }

    @Override // tb.uya
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
        } else if (view != null) {
            this.b = (TextView) view.findViewById(R.id.recommend_tips_tv);
        }
    }

    @Override // tb.stg
    public void d(ka4 ka4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a066f9f5", new Object[]{this, ka4Var});
        } else if (ka4Var != null && (ka4Var instanceof oon)) {
            this.b.setText(((oon) ka4Var).f25529a);
        }
    }
}
