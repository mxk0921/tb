package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nnn extends stg implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<TUrlImageView> b;
    public List<ViewGroup> c;
    public List<TextView> d;
    public View e;

    static {
        t2o.a(713031889);
    }

    public nnn(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(nnn nnnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/search/ui/holder/itemholder/RecommendGoodsHolder");
    }

    @Override // tb.uya
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return R.layout.babel_search_recommend_holder;
    }

    @Override // tb.uya
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
        } else if (view != null) {
            this.e = view;
            this.b = new ArrayList();
            this.c = new ArrayList();
            e((ViewGroup) view, this.b, this.c, new ArrayList());
        }
    }

    @Override // tb.stg
    public void d(ka4 ka4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a066f9f5", new Object[]{this, ka4Var});
        } else if (ka4Var != null && (ka4Var instanceof mnn)) {
            mnn mnnVar = (mnn) ka4Var;
        }
    }

    public final void e(ViewGroup viewGroup, List<TUrlImageView> list, List<ViewGroup> list2, List<TextView> list3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972354ee", new Object[]{this, viewGroup, list, list2, list3});
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TUrlImageView) {
                    TUrlImageView tUrlImageView = (TUrlImageView) childAt;
                    tUrlImageView.setPlaceHoldImageResId(R.drawable.babel_order_default_goods_bg);
                    tUrlImageView.setStrategyConfig(ype.a());
                    list.add(tUrlImageView);
                } else if (childAt instanceof TextView) {
                    list3.add((TextView) childAt);
                } else if (childAt instanceof RelativeLayout) {
                    list2.add((RelativeLayout) childAt);
                    ViewProxy.setOnClickListener(childAt, this);
                    e((ViewGroup) childAt, list, list2, list3);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if ((view instanceof RelativeLayout) && view.getTag() != null && (view.getTag() instanceof String)) {
            a.c("RepurchaseDetail", null);
            Nav.from(this.f29672a).toUri((String) view.getTag());
        }
    }
}
