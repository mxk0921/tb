package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eya extends stg implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<TextView> b;
    public View c;

    static {
        t2o.a(713031887);
    }

    public eya(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(eya eyaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/search/ui/holder/itemholder/HistoryHolder");
    }

    @Override // tb.uya
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return R.layout.babel_search_history_holder;
    }

    @Override // tb.uya
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
        } else if (view != null && (view instanceof ViewGroup)) {
            this.b = new ArrayList();
            this.c = view.findViewById(R.id.history_ll_two);
            e((ViewGroup) view, this.b);
        }
    }

    @Override // tb.stg
    public void d(ka4 ka4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a066f9f5", new Object[]{this, ka4Var});
        } else if (ka4Var != null && (ka4Var instanceof dya)) {
            dya dyaVar = (dya) ka4Var;
        }
    }

    public final void e(ViewGroup viewGroup, List<TextView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32cb6d0c", new Object[]{this, viewGroup, list});
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    ViewProxy.setOnClickListener(childAt, this);
                    list.add((TextView) childAt);
                } else if (childAt instanceof ViewGroup) {
                    e((ViewGroup) childAt, list);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view instanceof TextView) {
            a.c("SearchHistory", null);
            String charSequence = ((TextView) view).getText().toString();
            dpj.e(this.f29672a, charSequence, null);
            if (!TextUtils.isEmpty(charSequence)) {
                hya c = hya.c(this.f29672a);
                if (charSequence.length() > 4) {
                    charSequence = charSequence.substring(0, 4);
                }
                c.g(charSequence.trim());
            }
            if (!TBDeviceUtils.G(this.f29672a)) {
                this.f29672a.finish();
            }
        }
    }
}
