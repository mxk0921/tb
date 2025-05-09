package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.android.order.bundle.search.ui.pojo.RecommendShop;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class non extends stg implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<ViewGroup> b;

    static {
        t2o.a(713031891);
    }

    public non(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(non nonVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/search/ui/holder/itemholder/RecommendShopHolder");
    }

    @Override // tb.uya
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return R.layout.babel_search_recommend_shop_holder;
    }

    @Override // tb.uya
    public void b(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
        } else if (view != null && (view instanceof ViewGroup)) {
            this.b = new ArrayList();
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    if (viewGroup.getChildAt(i) instanceof LinearLayout) {
                        this.b.add((ViewGroup) viewGroup.getChildAt(i));
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // tb.stg
    public void d(ka4 ka4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a066f9f5", new Object[]{this, ka4Var});
        } else if (ka4Var != null && (ka4Var instanceof mon)) {
            mon monVar = (mon) ka4Var;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view != null && (tag = view.getTag()) != null && (tag instanceof RecommendShop)) {
            dpj.f(this.f29672a, ((RecommendShop) tag).shopId);
            a.c("RepurchaseSeller", null);
        }
    }
}
